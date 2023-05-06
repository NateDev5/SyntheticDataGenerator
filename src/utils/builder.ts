import { existsSync, mkdirSync, read, readFileSync, writeFileSync } from "fs";
import { Debug, Severity } from "../misc/debug.js";
import { InterpreterResult, Interpreter } from "./interpreter.js";
import { AvailablePlugins, DefaultFunctions, FunctionValue, KeyType, Sources, Variable, VariableType } from "../misc/types.js";
import Utils from "../misc/utils.js";
import { SyntaxBuilder } from "./syntaxBuilder.js";
import { BaseTemplate, Tags, ParamTag, GenerateTemplate, GenerateWithMutatorsTemplate } from "./template.js";
import path from "path";
import moment from "moment";
import chalk from "chalk";
import { Interface } from "../data_generator/SyntheticDataGenerator.js";

const exportPath = "./dist/bin"

export class Builder {
    private filePath: string;
    private out: string;
    private headers: string[];
    private plugins: string[];
    private functions: string[];
    private constructors: string[];
    private declarations: string[];

    private interfaces: Interface[];
    private enums: Map<string, string>;

    private failed: boolean;
    private verbose: boolean;

    constructor(filePath: string, verbose: boolean) {
        this.filePath = filePath;
        this.out = "";
        this.headers = [];
        this.plugins = [];
        this.functions = [];
        this.constructors = [];
        this.declarations = [];

        this.interfaces = [];
        this.enums = new Map();

        this.failed = false;

        this.verbose = verbose;
    }

    public Build() {
        try {
            if (!existsSync(exportPath)) mkdirSync(exportPath);
            //if(!existsSync(template)) throw new Error("Missing template file");
            if (!Utils.IsValidDSFile(this.filePath)) throw new Error(`"${this.Overline(this.filePath)}" is not a valid .ds file`);
            this.out = BaseTemplate.content;
            this.out = Utils.Replace(this.out, Tags.className, Utils.GetFileName(this.filePath));
            this.out = Utils.Replace(this.out, Tags.packageName, "SyntheticDataGenerator");
            this.out = Utils.Replace(this.out, Tags.version, "1.0.0");
            this.out = Utils.Replace(this.out, Tags.date, moment(new Date()).format("dddd, MMMM Do YYYY, h:mm:ss a"));

            const interpreter: Interpreter = new Interpreter(this.verbose);
            const result: InterpreterResult = interpreter.Interpret(this.filePath);

            let startPoint = result.funcs.find(f => f.function == DefaultFunctions.GENERATE ||
                f.function == DefaultFunctions.GENERATE_WITH_MUTATORS) ?? false;
            if (!startPoint) throw new Error(`Script has no start point try adding "${this.Overline("GENERATE(<STRING | ID>, <INT>))")}" or "${this.Overline("GENERATE_WITH_MUTATORS(<STRING | ID>, <array(mutators)>, <INT>)")}". Nothing will happen if the script has neither of these functions!`)

            for (let i = 0; i < result.funcs.length; i++) {
                switch (result.funcs[i].function) {
                    case DefaultFunctions.CREATE_INTERFACE:
                        this.CreateInterface(result.funcs[i].values[0].value, result.funcs[i].values[1].value);
                        break;
                    case DefaultFunctions.CREATE_MUTATOR:
                        this.CreateMutator();
                        break;
                    case DefaultFunctions.CREATE_WEIGHTED_MUTATOR:
                        this.CreateWeightedMutator(result.funcs[i].values[0].value, result.funcs[i].values[1].value);
                        break;
                    case DefaultFunctions.CREATE_RANGE_MUTATOR:
                        this.CreateRangeMutator(result.funcs[i].values[0].value);
                        break;
                    case DefaultFunctions.GENERATE:
                        this.functions.push(GenerateTemplate.content);
                        break;
                    case DefaultFunctions.GENERATE_WITH_MUTATORS:
                        this.functions.push(GenerateWithMutatorsTemplate.content);
                        break;
                    case DefaultFunctions.REQUIRE_PLUGIN:
                        this.RequirePlugin(result.funcs[i].values[0].value)
                        break;
                    case DefaultFunctions.SET_DEFAULT:
                        this.SetDefault(result.funcs[i].values[0].value, result.funcs[i].values[1].value)
                    default:
                        break;
                }
            }

            this.out = Utils.Replace(this.out, Tags.headers, this.headers.join("\n"));
            this.out = Utils.Replace(this.out, Tags.plugins, this.plugins.join("\n"));
            this.out = Utils.Replace(this.out, Tags.functions, this.functions.join("\n"))
            this.out = Utils.Replace(this.out, Tags.constructors, this.constructors.join("\n"))
            this.out = Utils.Replace(this.out, Tags.declarations, this.declarations.join(",\n"))
            //REDO THIS WHOLE PART
            switch (startPoint.function) {
                case DefaultFunctions.GENERATE:
                    this.out = this.out.replace(Tags.startPoint, `p.Generate`);
                    this.out = this.out.replace(Tags.startPointValues, `"${startPoint.values[0].value}", ${startPoint.values[0].value}`)
                    break;
                case DefaultFunctions.GENERATE_WITH_MUTATORS:
                    let array: string[] = [];
                    let file = startPoint.values[0].value;
                    (startPoint.values[1].value as []).forEach((v: Variable) => {
                        if (!Utils.IsValidVariable(v.type, VariableType.MUTATOR_TYPE))
                            throw new Error(`"${this.Overline(v.id)}" Should be of type "${this.Overline(VariableType.MUTATOR_TYPE)}" and not "${this.Overline(Utils.GetEnumValue(VariableType, v.type))}" at `);
                        array.push(`${file}${Utils.Capitalize(v.id)}_mutator`)
                    })
                    this.out = this.out.replace(Tags.startPoint, `p.GenerateWithMutators`);
                    //${startPoint.values[0].value}${Utils.Capitalize((startPoint.values[1].value as any[])[0].id)}_mutator
                    this.out = this.out.replace(Tags.startPointValues, `"${startPoint.values[0].value}", [${array.join(",")}], ${startPoint.values[2].value}`)
                    break;
            }
        }
        catch (err) {
            console.log(err)
            this.failed = true;
            Debug.WriteLine(err, Severity.Error, Sources.Builder);
            Debug.WriteLine("Building operation aborted", Severity.FatalError, Sources.Builder);
        }
        finally {
            if (!this.failed) {
                const outputPath: string = `${exportPath}/${Utils.GetFileName(this.filePath)}.sdg.ts`;
                writeFileSync(outputPath, this.out);
                this.log("Script successfully built : " + path.resolve(outputPath));
            }
        }
    }

    private CreateInterface(name: string, jsonFile: string) {
        this.logVerbose(`Creating interface (${name})`)

        if (Utils.IsString(jsonFile)) jsonFile = Utils.TrimString(jsonFile);
        if (!Utils.IsValidJSONFile(jsonFile) || !existsSync(jsonFile)) throw new Error(`"${this.Overline(jsonFile)}" is not a valid json file`);
        let json = JSON.parse(readFileSync(jsonFile, "utf-8"));
        let values: Map<string, KeyType> = new Map();
        for (const key in json) {
            let type: KeyType = this.ParseKeyType(json[key]);
            values.set(key, this.ParseKeyType(json[key]));
            if (type == KeyType.enum) {
                this.enums.set(`${name}.${key}`, `${name}_${key}_enum`);
                this.headers.push(SyntaxBuilder.BuildEnum(`${name}_${key}_enum`, this.ParseEnum(json[key])));
            }
        }
        this.headers.push(SyntaxBuilder.BuildInterface(name, values));
    }

    private CreateMutator() {

    }

    private CreateWeightedMutator(path: string, threshold: number) {
        this.logVerbose(`Creating weighted mutator (${path})`)
        this.headers.push(SyntaxBuilder.BuildWeightedMutator(path, threshold, this.enums.get(path) ?? "undefined"));
    }

    private CreateRangeMutator(path: string) {
        this.logVerbose(`Creating range mutator (${path})`)
        this.headers.push(SyntaxBuilder.BuildRangeMutator(path));
    }

    private RequirePlugin(name: string) {
        this.logVerbose(`Requiring package (${name})`)
        if (!Utils.HasEnumKeys(AvailablePlugins, name)) throw new Error(`"${this.Overline(name)}" is not a recognized plugin. You can find a list of available plugins with the command "${this.Overline("plugins")}"`)
        this.plugins.push(SyntaxBuilder.AddImport(name, Utils.GetEnumValue(AvailablePlugins, name)));
    }

    private ParseKeyType(key: string): KeyType {
        this.logVerbose(`Parsing key type (${key})`)

        if (key.startsWith("enum")) return KeyType.enum;
        switch (key) {
            case "bool":
                return KeyType.bool;
            case "int":
                return KeyType.int;
            case "string":
                return KeyType.string;
            default:
                return KeyType.any;
        }
    }

    private SetDefault(name: string, values: (Variable | FunctionValue)[]) {
        this.logVerbose(`Setting default (${name})`)
        values = values.map(v => v.value);
        this.headers.push(SyntaxBuilder.SetDefault(name.split(".").join(""), values))
    }

    private ParseEnum(value: string): string[] {
        this.logVerbose(`Parsing enum (${value})`)

        const regex: RegExp = /enum\(([^,\)]+(?:,[^,\)]+)*)\)/;
        const invalid: RegExp = /[^(),\w]/g;
        if (!regex.test(value) || !value.includes(",") || invalid.test(value))
            throw new Error(`"${this.Overline(value)}" is not a valid enum the correct syntax is : enum(option1,option2,option3)`);

        const match = regex.exec(value);
        let out: string[] = [];
        if (match != null) out = match[1].split(",");
        else throw new Error(`Something went wrong while parsing enum (${this.Overline(value)})`);

        return out;
    }

    private log(msg: any) {
        Debug.WriteLine(msg, Severity.Info, Sources.Builder);
    }

    private logVerbose(msg: any) {
        if (this.verbose) Debug.WriteLine(msg, Severity.Verbose, Sources.Builder);
    }

    private Overline(value: string): string {
        return chalk.blueBright(value);
    }
}