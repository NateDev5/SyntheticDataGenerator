// Generated from ./src/grammar/DataStructureGrammarParser.g4 by ANTLR 4.12.0

import {ParseTreeVisitor} from 'antlr4';


import { ProgramContext } from "./DataStructureGrammarParser";
import { SyntaxContext } from "./DataStructureGrammarParser";
import { DeclarationContext } from "./DataStructureGrammarParser";
import { StatementsContext } from "./DataStructureGrammarParser";
import { FunctionsContext } from "./DataStructureGrammarParser";
import { ArrayContext } from "./DataStructureGrammarParser";
import { AnyContext } from "./DataStructureGrammarParser";
import { VariablesContext } from "./DataStructureGrammarParser";
import { CreateInterfaceContext } from "./DataStructureGrammarParser";
import { CreateMutatorContext } from "./DataStructureGrammarParser";
import { CreateWeightedMutatorContext } from "./DataStructureGrammarParser";
import { GenerateContext } from "./DataStructureGrammarParser";
import { GenerateWithMutatorsContext } from "./DataStructureGrammarParser";
import { RequirePluginContext } from "./DataStructureGrammarParser";


/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by `DataStructureGrammarParser`.
 *
 * @param <Result> The return type of the visit operation. Use `void` for
 * operations with no return type.
 */
export default class DataStructureGrammarParserVisitor<Result> extends ParseTreeVisitor<Result> {
	/**
	 * Visit a parse tree produced by `DataStructureGrammarParser.program`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitProgram?: (ctx: ProgramContext) => Result;
	/**
	 * Visit a parse tree produced by `DataStructureGrammarParser.syntax`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitSyntax?: (ctx: SyntaxContext) => Result;
	/**
	 * Visit a parse tree produced by `DataStructureGrammarParser.declaration`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitDeclaration?: (ctx: DeclarationContext) => Result;
	/**
	 * Visit a parse tree produced by `DataStructureGrammarParser.statements`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitStatements?: (ctx: StatementsContext) => Result;
	/**
	 * Visit a parse tree produced by `DataStructureGrammarParser.functions`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitFunctions?: (ctx: FunctionsContext) => Result;
	/**
	 * Visit a parse tree produced by `DataStructureGrammarParser.array`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitArray?: (ctx: ArrayContext) => Result;
	/**
	 * Visit a parse tree produced by `DataStructureGrammarParser.any`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitAny?: (ctx: AnyContext) => Result;
	/**
	 * Visit a parse tree produced by `DataStructureGrammarParser.variables`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitVariables?: (ctx: VariablesContext) => Result;
	/**
	 * Visit a parse tree produced by `DataStructureGrammarParser.createInterface`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCreateInterface?: (ctx: CreateInterfaceContext) => Result;
	/**
	 * Visit a parse tree produced by `DataStructureGrammarParser.createMutator`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCreateMutator?: (ctx: CreateMutatorContext) => Result;
	/**
	 * Visit a parse tree produced by `DataStructureGrammarParser.createWeightedMutator`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitCreateWeightedMutator?: (ctx: CreateWeightedMutatorContext) => Result;
	/**
	 * Visit a parse tree produced by `DataStructureGrammarParser.generate`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGenerate?: (ctx: GenerateContext) => Result;
	/**
	 * Visit a parse tree produced by `DataStructureGrammarParser.generateWithMutators`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitGenerateWithMutators?: (ctx: GenerateWithMutatorsContext) => Result;
	/**
	 * Visit a parse tree produced by `DataStructureGrammarParser.requirePlugin`.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	visitRequirePlugin?: (ctx: RequirePluginContext) => Result;
}

