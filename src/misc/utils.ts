import path from "path";
import { Variable, FunctionValue, VariableType, Function } from "./types.js";
import { ParserRuleContext, RuleContext } from "antlr4";
import { MissingParameterError } from "./errors.js";
import chalk from "chalk";

class Utils {
    public static IsFilePath(value: string): boolean {
        const regex = /^[A-Z]:\\(?:[^\\\s]+\\)*[^\\\s]+$/i;
        return regex.test(value);
    }
    public static IsValidDSFile(value: string): boolean {
        const regex = /^[A-Z]:\\(?:[^\\\s]+\\)*[^\\\s]+\.ds$/i;
        if (!this.IsFilePath(value)) return false;
        return regex.test(value);
    }

    public static IsValidJSONFile(value: string): boolean {
        const regex = /^[A-Z]:\\(?:[^\\\s]+\\)*[^\\\s]+\.json$/i;
        if (!this.IsFilePath(value)) return false;
        return regex.test(value);
    }

    public static BoolFromText(value: string): boolean {
        if (value == "true") return true;
        if (value == "false") return false;
        return (parseInt(value) | 0) ? true : false;
    }

    public static TrimString(value: string): string {
        return value.substring(1, value.length - 1);
    }

    public static IsString(value: string): boolean {
        if (value.startsWith('"') && value.endsWith('"')) return true;
        return false;
    }

    public static IsFloat(value: string): boolean {
        return parseFloat(value) ? true : false;
    }

    public static IsInt(value: string): boolean {
        return parseFloat(value) ? true : false;
    }

    public static IsBool(value: string): boolean {
        return value.toLocaleLowerCase() == "true" || value.toLocaleLowerCase() == "false";
    }

    public static ArrayHas(array: any[], value: any): boolean {
        return array.find(v => v == value) ? true : false;
    }

    public static ArrayFind(array: any[], value: any): any {
        return array.find(v => v == value);
    }

    public static HasVariable(array: Variable[], id: string): boolean {
        return array.find(v => v.id == id) ? true : false;
    }

    public static FindVariableById(array: Variable[], id: string): (Variable | false) {
        return array.find(v => v.id == id) ?? false;
    }

    public static FindVariable(array: Variable[], value: FunctionValue): (Variable | FunctionValue) {
        return array.find(v => v.id == value.value) ?? value;
    }

    public static ArrayGetIndex(array: any[], value: any): number {
        return array.indexOf(value);
    }

    public static StartsWith(value: string, start: string): boolean {
        return value.startsWith(start);
    }

    public static GetFileName(filePath: string): string {
        return path.basename(filePath, path.extname(filePath));
    }

    public static Replace(string: string, toReplace: string, replacement: string) {
        return string.replaceAll(toReplace, replacement);
    }

    public static ListEnum(_enum: any): string {
        return Object.values(_enum).join(", ");
    }

    public static HasEnum(_enum: any, value: string): boolean {
        return Object.values(_enum).includes(value);
    }

    public static HasEnumKeys(_enum: any, value: string): boolean {
        return Object.keys(_enum).includes(value);
    }

    public static GetFromEnum(_enum: any, value: string): string {
        return Object.values(_enum).find(c => c == value) as string ?? "null";
    }

    public static GetEnumNameFromValue(_enum: any, value: string): string {
        return Object.keys(_enum).find(c => _enum[c] == value) as string ?? "null";
    }

    public static GetEnumValue(_enum: any, value: string): string {
        return _enum[value] ?? "null";
    }

    public static GetFunctionParam(index: number, ctx: ParserRuleContext): string {
        try {
            if (index == 1) return ctx.getChild(2).getText() ?? "null";
            return ctx.getChild(index + index).getText() ?? "null";
        }
        catch (err) {
            throw new MissingParameterError(`Missing parameter(s) at "${this.Overline(ctx.getText())}"`);
        }
    }

    public static ArrayLast(array: any[]): any {
        return array[array.length - 1];
    }

    public static Capitalize(word: string): string {
        return word.charAt(0).toUpperCase() + word.slice(1);
    }


    public static IsValidVariable(_value: VariableType, _type: VariableType): boolean {
        return this.GetEnumValue(VariableType, _value) == _type;
    }

    public static IsVariableDefinedInJson(json: string, variable: string): boolean {
        let jsonData = JSON.parse(json);
        let [objName, propName] = variable.split('.');
        return jsonData.hasOwnProperty(objName) && jsonData[objName].hasOwnProperty(propName);
    }
    
    public static Overline(value: string): string {
        return chalk.blueBright(value);
    }

    public static GetValuesFromFunction (functions: any[], functionIndex: number): any[] {
        (functions[functionIndex] as Function).values.forEach(v => {
            console.log(this.IsVariable(v));
        })
        return [];
    }

    public static IsVariable (variable: any): variable is Variable {
        return 'num' in variable;
    }

    public static IsFunction (_function: any): _function is Function {
        return 'function' in _function;
    }

    public static GetLine (ctx: any): number {
        return ctx.start.line;
    }
}

export default Utils;