export enum Sources {
    Interpreter = "SDG Interpreter",
    Builder = "SDG Builder",
    Debug = "SDG Debug",
    Utils = "SDG Utils",
    Visitor = "SDG Visitor",
    Core = "SDG Core"
}

export enum VariableType {
    BOOL_TYPE = "bool",
    INT_TYPE = "int",
    STRING_TYPE = "string",
    JSONFILE_TYPE = "jsonfile",
    PATH_TYPE = "path",
    MUTATOR_TYPE = "mutator",
    INTERFACE_TYPE = "interface",
    FLOAT_TYPE = "float",
    ARRAY_TYPE = "array",
    undefined = "undefined",
    variable_name = "variable_name",
    function = "function",
    identifier = "identifier",
    array = "array",
    any = "any"
}

export enum VariableError {
    undefined,
    InvalidJsonPath,
    InvalidPath,
    NotANumber,
    InvalidBool,
    NotAFloat
}

export interface Variable {
    type: VariableType,
    id: string,
    value: any | VariableError | undefined,
    num: number
}
    

export enum DefaultFunctions {
    CREATE_INTERFACE = "createInterface",
    CREATE_MUTATOR = "createMutator",
    CREATE_WEIGHTED_MUTATOR = "createWeightedMutator",
    GENERATE = "generate",
    GENERATE_WITH_MUTATORS = "generateWithMutators",
    REQUIRE_PLUGIN = "requirePlugin",
    SET_DEFAULT = "setDefault",
    CREATE_RANGE_MUTATOR = "createRangeMutator"
}

export interface Function {
    function: DefaultFunctions,
    values: (FunctionValue|Variable|FunctionVariable)[]
}

export interface FunctionValue {
    type: VariableType,
    value: any
}

export interface FunctionVariable extends Variable {
    index: number
}

export interface MutatorVariable extends FunctionVariable {
    path: string
}

export enum KeyType {
    enum = "enum",
    string = "string",
    int = "number",
    array = "[]",
    bool = "boolean",
    float = "number",
    any = "any"
}

export enum AvailablePlugins {
    faker = "@faker-js/faker"
}