import { Parser, ParserRuleContext, RecognitionException } from "antlr4";
import { AnyContext, ArrayContext, CreateInterfaceContext, CreateMutatorContext, CreateRangeMutatorContext, CreateWeightedMutatorContext, DeclarationContext, FunctionsContext, GenerateContext, GenerateWithMutatorsContext, ProgramContext, RequirePluginContext, SetDefaultContext, StatementsContext, SyntaxContext, VariablesContext } from "../grammar/DataStructureGrammarParser.js";
import DataStructureGrammarParserVisitor from "../grammar/DataStructureGrammarParserVisitor.js";
import Utils from "../misc/utils.js";
import { Debug, Severity } from "../misc/debug.js";
import DataStructureGrammarLexer from "../grammar/DataStructureGrammarLexer.js";
import { Variable, VariableError, VariableType, DefaultFunctions, Function, FunctionValue, FunctionVariable, Sources } from "../misc/types.js";
import chalk from "chalk";

class DsVisitor extends DataStructureGrammarParserVisitor<any> {
    public errors: RecognitionException[];
    public variables: Variable[];
    public functions: Function[];
    private verbose: boolean;

    constructor(verbose: boolean) {
        super();
        this.errors = [];
        this.variables = [];
        this.functions = [];
        this.verbose = verbose;
    }

    private visitNext(ctx: ParserRuleContext) {
        for (let i = 0; i < ctx.getChildCount(); i++) this.visit(ctx.getChild(i))
    }

    private convertValue(_value: any, type: VariableType, others?: VariableType[], id?: boolean | undefined): any {
        this.logVerbose("Converting value " + _value)

        if(others == null) others = [];
        if(id == undefined || id) others.push(VariableType.identifier);
        others.push(type);

        let index = this.functions.length;

        let result: (Variable | FunctionValue) = { type: VariableType.undefined, value: _value, index: index };

        others.forEach(_type => {
            switch (_type) {
                case VariableType.STRING_TYPE:
                    if (Utils.IsString(_value))
                        result = ({ type: VariableType.STRING_TYPE, value: Utils.TrimString(_value), index: index })
                    break;
                case VariableType.JSONFILE_TYPE:
                    if (Utils.IsString(_value) && Utils.IsValidJSONFile(_value))
                        result = { type: VariableType.JSONFILE_TYPE, value: Utils.TrimString(_value), index: index }
                    break;
                case VariableType.INT_TYPE:
                    if(Utils.IsInt(_value))
                        result = { type: VariableType.INT_TYPE, value: parseInt(_value), index: index }
                    break;
                case VariableType.FLOAT_TYPE:
                    if (Utils.IsFloat(_value))
                        result = ({ type: VariableType.FLOAT_TYPE, value: parseFloat(_value), index: index })
                    break;
                case VariableType.BOOL_TYPE:
                    if(Utils.IsBool(_value))
                        result = ({ type: VariableType.BOOL_TYPE, value: Utils.BoolFromText(_value), index: index })
                    break;
                case VariableType.identifier:
                    if (Utils.HasVariable(this.variables, _value)) {
                        let _var: (Variable | FunctionValue | false) = Utils.FindVariableById(this.variables, _value);
                        if (_var == false) _var = { type: VariableType.variable_name, value: _value, index: index }
                        else (_var as FunctionVariable).index = Utils.ArrayGetIndex(this.variables, _var);
                        result = _var;
                    }
                    break;
                default:
                    break;
            }
        })

        return result;
    }

    private log(msg: any) {
        Debug.WriteLine(msg, Severity.Info, Sources.Visitor);
    }
    
    private logVerbose(msg: any) {
        if (this.verbose) Debug.WriteLine(msg, Severity.Verbose, Sources.Visitor);
    }

    private Overline (value: string): string {
        return chalk.blueBright(value);
    }

    visitProgram: (ctx: ProgramContext) => any = (ctx: ProgramContext) => {
        this.logVerbose("Visiting program")
        if (ctx.exception) this.errors.push(ctx.exception);
        this.visitNext(ctx);
    }

    visitSyntax: (ctx: SyntaxContext) => any = (ctx: SyntaxContext) => {
        this.logVerbose("Visiting syntax")
        if (ctx.exception) this.errors.push(ctx.exception);
        this.visitNext(ctx);
    }

    visitDeclaration: (ctx: DeclarationContext) => any = (ctx: DeclarationContext) => {
        this.logVerbose("Visiting declaration")
        if (ctx.exception) this.errors.push(ctx.exception);
        this.visitNext(ctx);
    }

    visitVariables: (ctx: VariablesContext) => void = (ctx: VariablesContext) => {
        this.logVerbose("Visiting variable")
        if (ctx.exception) this.errors.push(ctx.exception);
        let _type: VariableType = Utils.GetFromEnum(VariableType, ctx.start.text) as VariableType;//DataStructureGrammarLexer.symbolicNames[ctx.start.type] as VariableType;
        let _id: string = ctx.getChild(1).getText();
        let _value: any = ctx.getChild(3).getText();
        let duplicateVar: Variable | null = this.variables.find(v => v.id == _id) ?? null;
        if(duplicateVar != null) throw new Error(`Duplicate variable found "${this.Overline(_id)}" of type "${this.Overline(_type)}" and "${this.Overline(duplicateVar.id)}" of type "${this.Overline(duplicateVar.type)}" `)
        switch (_type) {
            case VariableType.BOOL_TYPE:
                _value = Utils.BoolFromText(_value);
                break;
            case VariableType.INT_TYPE:
                _value = parseInt(_value) ?? VariableError[VariableError.NotANumber];
                break;
            case VariableType.STRING_TYPE:
                break;
            case VariableType.JSONFILE_TYPE:
                _value = Utils.IsValidJSONFile(Utils.TrimString(_value)) ? _value : VariableError[VariableError.InvalidJsonPath];
                break;
            case VariableType.PATH_TYPE:
                _value = Utils.IsFilePath(Utils.TrimString(_value)) ? _value : VariableError[VariableError.InvalidPath];
                break;
            case VariableType.INTERFACE_TYPE:
                _value = { type: VariableType.function, value: _value.split("(")[0], index: this.functions.length } as FunctionValue;
                break;
            case VariableType.MUTATOR_TYPE:
                _value = { type: VariableType.function, value: _value.split("(")[0], index: this.functions.length } as FunctionValue;
                break;
            case VariableType.FLOAT_TYPE:
                _value = parseFloat(_value) ?? VariableError[VariableError.NotAFloat];
                break;
            case VariableType.function:
                break;
            case VariableType.variable_name:
                break;
            case VariableType.undefined:
                _value = VariableError[VariableError.InvalidPath];
                break;
            default:
                break;
        }
        this.variables.push({ type: Utils.GetEnumNameFromValue(VariableType, _type) as VariableType, id: _id, num: ctx.ruleIndex, value: _value });
        this.logVerbose("Variable pushed " + _type + " " + _id)
        this.visitNext(ctx);
    }

    visitStatements: (ctx: StatementsContext) => any = (ctx: StatementsContext) => {
        this.logVerbose("Visiting statement")
        if (ctx.exception) this.errors.push(ctx.exception);
        this.visitNext(ctx);
    }

    visitFunctions: (ctx: FunctionsContext) => any = (ctx: FunctionsContext) => {
        this.logVerbose("Visiting functions")
        if (ctx.exception) this.errors.push(ctx.exception);
        this.visitNext(ctx);
    }

    visitCreateInterface: (ctx: CreateInterfaceContext) => any = (ctx: CreateInterfaceContext) => {
        this.logVerbose("Visiting Function")
        this.visitNext(ctx);
        const _function: DefaultFunctions = DefaultFunctions.CREATE_INTERFACE;
        let _values: (FunctionValue | Variable)[] = [];
        let _param1: string = Utils.GetFunctionParam(1, ctx);
        let _param2: string = Utils.GetFunctionParam(2, ctx);
        _values.push(this.convertValue(_param1, VariableType.STRING_TYPE));
        _values.push(this.convertValue(_param2, VariableType.JSONFILE_TYPE));
        this.functions.push({ function: _function, values: _values });
        this.logVerbose("Function pushed " + _function)
    }

    visitRequirePlugin: (ctx: RequirePluginContext) => any = (ctx: RequirePluginContext) => {
        this.logVerbose("Visiting Function")
        this.visitNext(ctx);
        const _function: DefaultFunctions = DefaultFunctions.REQUIRE_PLUGIN;
        let _values: (FunctionValue | Variable)[] = [];
        let _param1: string = Utils.GetFunctionParam(1, ctx);
        _values.push(this.convertValue(_param1, VariableType.STRING_TYPE));
        this.functions.push({ function: _function, values: _values });
        this.logVerbose("Function pushed " + _function)
    }

    visitCreateMutator: (ctx: CreateMutatorContext) => any = (ctx: CreateMutatorContext) => {
        this.logVerbose("Visiting Function")
        this.visitNext(ctx);
        const _function: DefaultFunctions = DefaultFunctions.CREATE_MUTATOR;
        let _values: (FunctionValue | Variable)[] = [];
        let _param1: string = Utils.GetFunctionParam(1, ctx);
        let _param2: string = Utils.GetFunctionParam(2, ctx);
        _values.push(this.convertValue(_param1, VariableType.STRING_TYPE));
        _values.push(this.convertValue(_param2, VariableType.FLOAT_TYPE));
        this.functions.push({ function: _function, values: _values });
        this.logVerbose("Function pushed " + _function)
    }
    visitCreateWeightedMutator: ((ctx: CreateWeightedMutatorContext) => any) = (ctx: CreateWeightedMutatorContext) => {
        this.logVerbose("Visiting Function")
        this.visitNext(ctx);
        const _function: DefaultFunctions = DefaultFunctions.CREATE_WEIGHTED_MUTATOR;
        let _values: (FunctionValue | Variable)[] = [];
        let _param1: string = Utils.GetFunctionParam(1, ctx);
        let _param2: string = Utils.GetFunctionParam(2, ctx);
        _values.push(this.convertValue(_param1, VariableType.STRING_TYPE));
        _values.push(this.convertValue(_param2, VariableType.FLOAT_TYPE));
        this.functions.push({ function: _function, values: _values });
        this.logVerbose("Function pushed " + _function)
    }

    visitGenerate: ((ctx: GenerateContext) => any) = (ctx: GenerateContext) => {
        this.logVerbose("Visiting Function")
        this.visitNext(ctx);
        const _function: DefaultFunctions = DefaultFunctions.GENERATE;
        let _values: (FunctionValue | Variable)[] = [];
        let _param1: string = Utils.GetFunctionParam(1, ctx);
        let _param2: string = Utils.GetFunctionParam(2, ctx);
        _values.push(this.convertValue(_param1, VariableType.STRING_TYPE));
        _values.push(this.convertValue(_param2, VariableType.INT_TYPE));
        this.functions.push({ function: _function, values: _values });
        this.logVerbose("Function pushed " + _function)
    }

    visitGenerateWithMutators: ((ctx: GenerateWithMutatorsContext) => any) = (ctx: GenerateWithMutatorsContext) => {
        this.logVerbose("Visiting Function")
        this.visitNext(ctx);
        const _function: DefaultFunctions = DefaultFunctions.GENERATE_WITH_MUTATORS;
        let _values: (FunctionValue | Variable)[] = [];
        let _param1: string = Utils.GetFunctionParam(1, ctx);
        let _param2: string = Utils.GetFunctionParam(2, ctx);
        let _param3: string = Utils.GetFunctionParam(3, ctx);
        let _param4: string = Utils.GetFunctionParam(4, ctx);
        let _param5: string = Utils.GetFunctionParam(5, ctx);
        _values.push(this.convertValue(_param1, VariableType.STRING_TYPE));
        _values.push(this.convertValue(`array_${_param2
        .replaceAll(('['), '')
        .replaceAll((']'), '')
        .split(",")[0]}`, VariableType.array));
        _values.push(this.convertValue(_param3, VariableType.INT_TYPE));
        _values.push(this.convertValue(_param4, VariableType.INT_TYPE));
        _values.push(this.convertValue(_param5, VariableType.INT_TYPE));
        this.functions.push({ function: _function, values: _values });
        this.logVerbose("Function pushed " + _function)
    }

    visitSetDefault: (ctx: SetDefaultContext) => any = (ctx: SetDefaultContext) => {
        this.logVerbose("Visiting Function")
        this.visitNext(ctx);
        const _function: DefaultFunctions = DefaultFunctions.SET_DEFAULT;
        let _values: (FunctionValue | Variable)[] = [];
        let _param1: string = Utils.GetFunctionParam(1, ctx);
        let _param2: string = Utils.GetFunctionParam(2, ctx);
        _values.push(this.convertValue(_param1, VariableType.STRING_TYPE));
        _values.push(this.convertValue(`array_${_param2
        .replaceAll(('['), '')
        .replaceAll((']'), '')
        .split(",")[0]}`, VariableType.array));
        this.functions.push({ function: _function, values: _values });
        this.logVerbose("Function pushed " + _function)
    }

    visitCreateRangeMutator: (ctx: CreateRangeMutatorContext) => any = (ctx: CreateRangeMutatorContext) => {
        this.logVerbose("Visiting Function")
        this.visitNext(ctx);
        const _function: DefaultFunctions = DefaultFunctions.CREATE_RANGE_MUTATOR;
        let _values: (FunctionValue | Variable)[] = [];
        let _param1: string = Utils.GetFunctionParam(1, ctx);
        _values.push(this.convertValue(_param1, VariableType.STRING_TYPE));
        this.functions.push({ function: _function, values: _values });
        this.logVerbose("Function pushed " + _function)
    }

    visitAny: ((ctx: AnyContext) => any) = (ctx: AnyContext) => {
        this.logVerbose("Visiting Any")
        this.visitNext(ctx);
    }

    // This is gonna cause problem in the future
    // If a variable of any type is declared with the same name as the first index of this array it will cause an error
    /**
     * @deprecated
     */
    visitArray: ((ctx: ArrayContext) => any) = (ctx: ArrayContext) => {
        this.logVerbose("Visiting Array")
        let _content = ctx.any__list().map(c => c.getText());
        let _id: string = ctx.getChild(1).getText();
        let _values: Variable[] = [];
        _content.forEach(c => {
            // Need to implement error handling if a function is provided instead of a variable
            _values.push(this.convertValue(c, VariableType.any, Object.values(VariableType)))
        })
        this.variables.push({ type: VariableType.array, id: `array_${_id}`, num: ctx.ruleIndex, value: _values });
        this.logVerbose("Variable pushed " + _id + " " + _values)
    }
}

export default DsVisitor;