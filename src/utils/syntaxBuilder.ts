import { FunctionValue, KeyType } from "../misc/types.js";
import Utils from "../misc/utils.js";
import { Mutator, ParamTag, RangeMutator, Tags, WeightedMutator } from "./template.js";

export class SyntaxBuilder {
    public static BuildInterface(name: string, data: Map<string, KeyType>): string {
        let _data: string[] = [];
        data.forEach((k: (KeyType|string), s: string) => {
            if(k == KeyType.enum) k = `${name}_${s}_enum`;
            _data.push(`${s}: ${k}`);
        })
        return `export interface ${name} extends Interface { ${_data.join(",")} }`;
    }

    public static BuildEnum(name: string, data: string[]): string {
        return `export enum ${name} { ${data.join(",")} }`;
    }

    public static AddImport (name: string, _import: string): string {
        return `import * as ${name} from "${_import}";`;
    }

    public static BuildMutator (path:string): string {
        let out = Mutator.content;
        out = Utils.Replace(out, Tags.name, `${path.split(".").join("")}_mutator`)
        out = Utils.Replace(out, ParamTag(1), `"${path}"`)
        return out;
        //return `const ${path.split(".").join("")}_mutator: Mutator = { path: "${path}", threshold: ${threshold} };`;
    } 

    public static BuildRangeMutator (path:string): string {
        let out = RangeMutator.content;
        out = Utils.Replace(out, Tags.name, `${path.split(".").join("")}_mutator`)
        out = Utils.Replace(out, ParamTag(1), `"${path}"`)
        return out;
        //return `const ${path.split(".").join("")}_mutator: Mutator = { path: "${path}", threshold: ${threshold} };`;
    } 

    public static BuildWeightedMutator (path:string, threshold: number, _enum: string): string {
        let out = WeightedMutator.content;
        out = Utils.Replace(out, Tags.name, `${path.split(".").join("")}_mutator`)
        out = Utils.Replace(out, ParamTag(1), `"${path}"`)
        out = Utils.Replace(out, ParamTag(2), threshold.toString())
        out = Utils.Replace(out, ParamTag(3), _enum)
        return out;
        //return `const ${path.split(".").join("")}_mutator: Mutator = { path: "${path}", threshold: ${threshold} };`;
    } 

    public static SetDefault (name: string, values: any[]): string {
        return `const ${name}_default: any[] = [${values.join(",")}];`
    }

    public static AddConstructor (name: string, value: any, type: string, values: string): string {
        return `private ${name}: ${type} = ${values}`;
    }
}