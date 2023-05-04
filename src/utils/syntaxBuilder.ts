import { FunctionValue, KeyType } from "../misc/types.js";

export class SyntaxBuilder {
    public static BuildInterface(name: string, data: Map<string, KeyType>): string {
        let _data: string[] = [];
        data.forEach((k: (KeyType|string), s: string) => {
            if(k == KeyType.enum) k = `${name}_${s}_enum`;
            _data.push(`${s}: ${k}`);
        })
        return `export interface ${name} { ${_data.join(",")} }`;
    }

    public static BuildEnum(name: string, data: string[]): string {
        return `export enum ${name} { ${data.join(",")} }`;
    }

    public static AddImport (name: string, _import: string): string {
        return `import * as ${name} from "${_import}";`;
    }

    public static BuildMutator (path:string, threshold: number): string {
        return `const ${path.split(".").join("")}_mutator: Mutator = { path: "${path}", threshold: ${threshold} };`;
    } 

    public static AddConstructor (name: string, value: any, type: string, values: string): string {
        return `private ${name}: ${type} = ${values}`;
    }
}