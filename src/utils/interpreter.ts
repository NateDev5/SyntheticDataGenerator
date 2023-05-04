import Utils from "../misc/utils.js";
import DataStructureGrammarParser, { ProgramContext } from "../grammar/DataStructureGrammarParser.js";
import DataStructureGrammarLexer from "../grammar/DataStructureGrammarLexer.js";
import { CharStreams, CommonTokenStream, Lexer, Parser, TokenStream } from "antlr4";
import { Debug, Severity } from "../misc/debug.js";
import { ParseTreeWalker } from 'antlr4';
import DsVisitor from "./dsVisitor.js";
import { Variable, VariableType, Function, Sources } from "../misc/types.js";
import { writeFileSync } from "fs";
import path from "path";

export type InterpreterResult = {
    vars: Variable[],
    funcs: Function[]
}

export class Interpreter {
    private variables: Variable[];
    private functions: Function[];

    private currentLexer: DataStructureGrammarLexer | null;
    private currentParser: DataStructureGrammarParser | null;
    private currentTokens: TokenStream | null;
    private dsVisitor: DsVisitor | null;

    private verbose: boolean;

    constructor(verbose: boolean) {
        this.variables = [];
        this.functions = [];

        this.currentLexer = null;
        this.currentParser = null;
        this.currentTokens = null;
        this.dsVisitor = null;

        this.verbose = verbose;
    }

    public Interpret(input: string): InterpreterResult {
        let buffer;
        if (Utils.IsValidDSFile(input))
            buffer = CharStreams.fromPathSync(input, "utf8");
        else buffer = CharStreams.fromString(input);

        this.currentLexer = new DataStructureGrammarLexer(buffer);
        this.currentTokens = new CommonTokenStream(this.currentLexer);
        this.currentParser = new DataStructureGrammarParser(this.currentTokens);

        this.currentParser.removeErrorListeners();
        this.currentParser.addErrorListener({
            syntaxError: (recognizer, offendingSymbol, line, column, msg, e) => {
                //throw new Error(`line ${line}:${column} ${msg}`);
                Debug.WriteLine(`line ${line}:${column} ${msg}`, Severity.Error, Sources.Interpreter);
            },
        });

        this.dsVisitor = new DsVisitor(this.verbose);
        this.dsVisitor.visit(this.currentParser.program());
        this.variables = this.dsVisitor.variables;
        this.functions = this.dsVisitor.functions;

        //this.variables.forEach(v => Debug.WriteLine(JSON.stringify(v), Severity.Info, Sources.Interpreter));
        //this.functions.forEach(v => Debug.WriteLine(JSON.stringify(v), Severity.Info, Sources.Interpreter));
        //dsVisitor.errors.forEach(v => Debug.WriteLine(v.message, Severity.Error, "DataStructure Interpreter"));
        if(this.verbose)
            this.Test();
        return { vars: this.variables, funcs: this.functions };
    }

    public Test(): void {
        let json = JSON.stringify({ Variables: this.variables, Functions: this.functions });
        writeFileSync(`./DS_Test_Output.json`, json);
        Debug.WriteLine(`Wrote output to file : ${path.resolve(`./DS_Test_Output.json`)}`, Severity.Info, Sources.Interpreter)
    }
}