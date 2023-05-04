// Generated from ./src/grammar/DataStructureGrammarParser.g4 by ANTLR 4.12.0
// noinspection ES6UnusedImports,JSUnusedGlobalSymbols,JSUnusedLocalSymbols

import {
	ATN,
	ATNDeserializer, DecisionState, DFA, FailedPredicateException,
	RecognitionException, NoViableAltException, BailErrorStrategy,
	Parser, ParserATNSimulator,
	RuleContext, ParserRuleContext, PredictionMode, PredictionContextCache,
	TerminalNode, RuleNode,
	Token, TokenStream,
	Interval, IntervalSet
} from 'antlr4';
import DataStructureGrammarParserVisitor from "./DataStructureGrammarParserVisitor.js";

// for running tests with parameters, TODO: discuss strategy for typed parameters in CI
// eslint-disable-next-line no-unused-vars
type int = number;

export default class DataStructureGrammarParser extends Parser {
	public static readonly BOOL_TYPE = 1;
	public static readonly INT_TYPE = 2;
	public static readonly STRING_TYPE = 3;
	public static readonly JSONFILE_TYPE = 4;
	public static readonly PATH_TYPE = 5;
	public static readonly MUTATOR_TYPE = 6;
	public static readonly INTERFACE_TYPE = 7;
	public static readonly FLOAT_TYPE = 8;
	public static readonly IF = 9;
	public static readonly ELSE = 10;
	public static readonly WHILE = 11;
	public static readonly PRINT = 12;
	public static readonly FUNCTION = 13;
	public static readonly BOOL = 14;
	public static readonly TRUE = 15;
	public static readonly FALSE = 16;
	public static readonly CREATE_INTERFACE = 17;
	public static readonly REQUIRE_PLUGIN = 18;
	public static readonly CREATE_MUTATOR = 19;
	public static readonly CREATE_WEIGHTED_MUTATOR = 20;
	public static readonly GENERATE = 21;
	public static readonly GENERATE_WITH_MUTATORS = 22;
	public static readonly ID = 23;
	public static readonly INT = 24;
	public static readonly FLOAT = 25;
	public static readonly STRING = 26;
	public static readonly SET = 27;
	public static readonly PLUS = 28;
	public static readonly MINUS = 29;
	public static readonly TIMES = 30;
	public static readonly DIVIDE = 31;
	public static readonly GT = 32;
	public static readonly GE = 33;
	public static readonly LT = 34;
	public static readonly LE = 35;
	public static readonly EQ = 36;
	public static readonly COMMA = 37;
	public static readonly NE = 38;
	public static readonly ASSIGN = 39;
	public static readonly LPAREN = 40;
	public static readonly RPAREN = 41;
	public static readonly LBRACE = 42;
	public static readonly RBRACE = 43;
	public static readonly LSQRBRAKET = 44;
	public static readonly RSQRBRAKET = 45;
	public static readonly SEMICOLON = 46;
	public static readonly COLON = 47;
	public static readonly DOUBLEQUOTE = 48;
	public static readonly COMMENT = 49;
	public static readonly WS = 50;
	public static readonly EOF = Token.EOF;
	public static readonly RULE_program = 0;
	public static readonly RULE_syntax = 1;
	public static readonly RULE_declaration = 2;
	public static readonly RULE_statements = 3;
	public static readonly RULE_functions = 4;
	public static readonly RULE_array = 5;
	public static readonly RULE_any = 6;
	public static readonly RULE_variables = 7;
	public static readonly RULE_createInterface = 8;
	public static readonly RULE_createMutator = 9;
	public static readonly RULE_createWeightedMutator = 10;
	public static readonly RULE_generate = 11;
	public static readonly RULE_generateWithMutators = 12;
	public static readonly RULE_requirePlugin = 13;
	public static readonly literalNames: (string | null)[] = [ null, "'bool'", 
                                                            "'int'", "'string'", 
                                                            "'jsonfile'", 
                                                            "'path'", "'mutator'", 
                                                            "'interface'", 
                                                            "'float'", "'if'", 
                                                            "'else'", "'while'", 
                                                            "'print'", "'func'", 
                                                            null, null, 
                                                            null, "'CREATE_INTERFACE'", 
                                                            "'REQUIRE_PLUGIN'", 
                                                            "'CREATE_MUTATOR'", 
                                                            "'CREATE_WEIGHTED_MUTATOR'", 
                                                            "'GENERATE'", 
                                                            "'GENERATE_WITH_MUTATORS'", 
                                                            null, null, 
                                                            null, null, 
                                                            "'->'", "'+'", 
                                                            "'-'", "'*'", 
                                                            "'/'", "'>'", 
                                                            "'>='", "'<'", 
                                                            "'<='", "'=='", 
                                                            "','", "'!='", 
                                                            "'='", "'('", 
                                                            "')'", "'{'", 
                                                            "'}'", "'['", 
                                                            "']'", "';'", 
                                                            "':'", "'\"'" ];
	public static readonly symbolicNames: (string | null)[] = [ null, "BOOL_TYPE", 
                                                             "INT_TYPE", 
                                                             "STRING_TYPE", 
                                                             "JSONFILE_TYPE", 
                                                             "PATH_TYPE", 
                                                             "MUTATOR_TYPE", 
                                                             "INTERFACE_TYPE", 
                                                             "FLOAT_TYPE", 
                                                             "IF", "ELSE", 
                                                             "WHILE", "PRINT", 
                                                             "FUNCTION", 
                                                             "BOOL", "TRUE", 
                                                             "FALSE", "CREATE_INTERFACE", 
                                                             "REQUIRE_PLUGIN", 
                                                             "CREATE_MUTATOR", 
                                                             "CREATE_WEIGHTED_MUTATOR", 
                                                             "GENERATE", 
                                                             "GENERATE_WITH_MUTATORS", 
                                                             "ID", "INT", 
                                                             "FLOAT", "STRING", 
                                                             "SET", "PLUS", 
                                                             "MINUS", "TIMES", 
                                                             "DIVIDE", "GT", 
                                                             "GE", "LT", 
                                                             "LE", "EQ", 
                                                             "COMMA", "NE", 
                                                             "ASSIGN", "LPAREN", 
                                                             "RPAREN", "LBRACE", 
                                                             "RBRACE", "LSQRBRAKET", 
                                                             "RSQRBRAKET", 
                                                             "SEMICOLON", 
                                                             "COLON", "DOUBLEQUOTE", 
                                                             "COMMENT", 
                                                             "WS" ];
	// tslint:disable:no-trailing-whitespace
	public static readonly ruleNames: string[] = [
		"program", "syntax", "declaration", "statements", "functions", "array", 
		"any", "variables", "createInterface", "createMutator", "createWeightedMutator", 
		"generate", "generateWithMutators", "requirePlugin",
	];
	public get grammarFileName(): string { return "DataStructureGrammarParser.g4"; }
	public get literalNames(): (string | null)[] { return DataStructureGrammarParser.literalNames; }
	public get symbolicNames(): (string | null)[] { return DataStructureGrammarParser.symbolicNames; }
	public get ruleNames(): string[] { return DataStructureGrammarParser.ruleNames; }
	public get serializedATN(): number[] { return DataStructureGrammarParser._serializedATN; }

	protected createFailedPredicateException(predicate?: string, message?: string): FailedPredicateException {
		return new FailedPredicateException(this, predicate, message);
	}

	constructor(input: TokenStream) {
		super(input);
		this._interp = new ParserATNSimulator(this, DataStructureGrammarParser._ATN, DataStructureGrammarParser.DecisionsToDFA, new PredictionContextCache());
	}
	// @RuleVersion(0)
	public program(): ProgramContext {
		let localctx: ProgramContext = new ProgramContext(this, this._ctx, this.state);
		this.enterRule(localctx, 0, DataStructureGrammarParser.RULE_program);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 29;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				{
				this.state = 28;
				this.syntax();
				}
				}
				this.state = 31;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 8258046) !== 0));
			this.state = 33;
			this.match(DataStructureGrammarParser.EOF);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public syntax(): SyntaxContext {
		let localctx: SyntaxContext = new SyntaxContext(this, this._ctx, this.state);
		this.enterRule(localctx, 2, DataStructureGrammarParser.RULE_syntax);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 35;
			this.declaration();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public declaration(): DeclarationContext {
		let localctx: DeclarationContext = new DeclarationContext(this, this._ctx, this.state);
		this.enterRule(localctx, 4, DataStructureGrammarParser.RULE_declaration);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 39;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
				{
				this.state = 37;
				this.variables();
				}
				break;
			case 17:
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
				{
				this.state = 38;
				this.statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 41;
			this.match(DataStructureGrammarParser.SEMICOLON);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public statements(): StatementsContext {
		let localctx: StatementsContext = new StatementsContext(this, this._ctx, this.state);
		this.enterRule(localctx, 6, DataStructureGrammarParser.RULE_statements);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 43;
			this.functions();
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public functions(): FunctionsContext {
		let localctx: FunctionsContext = new FunctionsContext(this, this._ctx, this.state);
		this.enterRule(localctx, 8, DataStructureGrammarParser.RULE_functions);
		try {
			this.state = 51;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 17:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 45;
				this.createInterface();
				}
				break;
			case 18:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 46;
				this.requirePlugin();
				}
				break;
			case 19:
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 47;
				this.createMutator();
				}
				break;
			case 20:
				this.enterOuterAlt(localctx, 4);
				{
				this.state = 48;
				this.createWeightedMutator();
				}
				break;
			case 21:
				this.enterOuterAlt(localctx, 5);
				{
				this.state = 49;
				this.generate();
				}
				break;
			case 22:
				this.enterOuterAlt(localctx, 6);
				{
				this.state = 50;
				this.generateWithMutators();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public array(): ArrayContext {
		let localctx: ArrayContext = new ArrayContext(this, this._ctx, this.state);
		this.enterRule(localctx, 10, DataStructureGrammarParser.RULE_array);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 53;
			this.match(DataStructureGrammarParser.LSQRBRAKET);
			this.state = 62;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if ((((_la) & ~0x1F) === 0 && ((1 << _la) & 125845504) !== 0)) {
				{
				this.state = 54;
				this.any_();
				this.state = 59;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la===37) {
					{
					{
					this.state = 55;
					this.match(DataStructureGrammarParser.COMMA);
					this.state = 56;
					this.any_();
					}
					}
					this.state = 61;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
			}

			this.state = 64;
			this.match(DataStructureGrammarParser.RSQRBRAKET);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public any_(): AnyContext {
		let localctx: AnyContext = new AnyContext(this, this._ctx, this.state);
		this.enterRule(localctx, 12, DataStructureGrammarParser.RULE_any);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 66;
			_la = this._input.LA(1);
			if(!((((_la) & ~0x1F) === 0 && ((1 << _la) & 125845504) !== 0))) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public variables(): VariablesContext {
		let localctx: VariablesContext = new VariablesContext(this, this._ctx, this.state);
		this.enterRule(localctx, 14, DataStructureGrammarParser.RULE_variables);
		try {
			this.state = 103;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 3:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 68;
				this.match(DataStructureGrammarParser.STRING_TYPE);
				this.state = 69;
				this.match(DataStructureGrammarParser.ID);
				this.state = 70;
				this.match(DataStructureGrammarParser.SET);
				this.state = 71;
				this.match(DataStructureGrammarParser.STRING);
				}
				break;
			case 2:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 72;
				this.match(DataStructureGrammarParser.INT_TYPE);
				this.state = 73;
				this.match(DataStructureGrammarParser.ID);
				this.state = 74;
				this.match(DataStructureGrammarParser.SET);
				this.state = 75;
				this.match(DataStructureGrammarParser.INT);
				}
				break;
			case 1:
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 76;
				this.match(DataStructureGrammarParser.BOOL_TYPE);
				this.state = 77;
				this.match(DataStructureGrammarParser.ID);
				this.state = 78;
				this.match(DataStructureGrammarParser.SET);
				this.state = 79;
				this.match(DataStructureGrammarParser.BOOL);
				}
				break;
			case 5:
				this.enterOuterAlt(localctx, 4);
				{
				this.state = 80;
				this.match(DataStructureGrammarParser.PATH_TYPE);
				this.state = 81;
				this.match(DataStructureGrammarParser.ID);
				this.state = 82;
				this.match(DataStructureGrammarParser.SET);
				this.state = 83;
				this.match(DataStructureGrammarParser.STRING);
				}
				break;
			case 4:
				this.enterOuterAlt(localctx, 5);
				{
				this.state = 84;
				this.match(DataStructureGrammarParser.JSONFILE_TYPE);
				this.state = 85;
				this.match(DataStructureGrammarParser.ID);
				this.state = 86;
				this.match(DataStructureGrammarParser.SET);
				this.state = 87;
				this.match(DataStructureGrammarParser.STRING);
				}
				break;
			case 8:
				this.enterOuterAlt(localctx, 6);
				{
				this.state = 88;
				this.match(DataStructureGrammarParser.FLOAT_TYPE);
				this.state = 89;
				this.match(DataStructureGrammarParser.ID);
				this.state = 90;
				this.match(DataStructureGrammarParser.SET);
				this.state = 91;
				this.match(DataStructureGrammarParser.FLOAT);
				}
				break;
			case 6:
				this.enterOuterAlt(localctx, 7);
				{
				this.state = 92;
				this.match(DataStructureGrammarParser.MUTATOR_TYPE);
				this.state = 93;
				this.match(DataStructureGrammarParser.ID);
				this.state = 94;
				this.match(DataStructureGrammarParser.SET);
				this.state = 97;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case 19:
					{
					this.state = 95;
					this.createMutator();
					}
					break;
				case 20:
					{
					this.state = 96;
					this.createWeightedMutator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 7:
				this.enterOuterAlt(localctx, 8);
				{
				this.state = 99;
				this.match(DataStructureGrammarParser.INTERFACE_TYPE);
				this.state = 100;
				this.match(DataStructureGrammarParser.ID);
				this.state = 101;
				this.match(DataStructureGrammarParser.SET);
				{
				this.state = 102;
				this.createInterface();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public createInterface(): CreateInterfaceContext {
		let localctx: CreateInterfaceContext = new CreateInterfaceContext(this, this._ctx, this.state);
		this.enterRule(localctx, 16, DataStructureGrammarParser.RULE_createInterface);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 105;
			this.match(DataStructureGrammarParser.CREATE_INTERFACE);
			this.state = 106;
			this.match(DataStructureGrammarParser.LPAREN);
			this.state = 107;
			this.match(DataStructureGrammarParser.STRING);
			this.state = 108;
			this.match(DataStructureGrammarParser.COMMA);
			this.state = 109;
			_la = this._input.LA(1);
			if(!(_la===23 || _la===26)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 110;
			this.match(DataStructureGrammarParser.RPAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public createMutator(): CreateMutatorContext {
		let localctx: CreateMutatorContext = new CreateMutatorContext(this, this._ctx, this.state);
		this.enterRule(localctx, 18, DataStructureGrammarParser.RULE_createMutator);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 112;
			this.match(DataStructureGrammarParser.CREATE_MUTATOR);
			this.state = 113;
			this.match(DataStructureGrammarParser.LPAREN);
			this.state = 114;
			this.match(DataStructureGrammarParser.STRING);
			this.state = 115;
			this.match(DataStructureGrammarParser.COMMA);
			this.state = 116;
			_la = this._input.LA(1);
			if(!(_la===23 || _la===25)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 117;
			this.match(DataStructureGrammarParser.RPAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public createWeightedMutator(): CreateWeightedMutatorContext {
		let localctx: CreateWeightedMutatorContext = new CreateWeightedMutatorContext(this, this._ctx, this.state);
		this.enterRule(localctx, 20, DataStructureGrammarParser.RULE_createWeightedMutator);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 119;
			this.match(DataStructureGrammarParser.CREATE_WEIGHTED_MUTATOR);
			this.state = 120;
			this.match(DataStructureGrammarParser.LPAREN);
			this.state = 121;
			this.match(DataStructureGrammarParser.STRING);
			this.state = 122;
			this.match(DataStructureGrammarParser.COMMA);
			this.state = 123;
			_la = this._input.LA(1);
			if(!(_la===23 || _la===25)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 124;
			this.match(DataStructureGrammarParser.RPAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public generate(): GenerateContext {
		let localctx: GenerateContext = new GenerateContext(this, this._ctx, this.state);
		this.enterRule(localctx, 22, DataStructureGrammarParser.RULE_generate);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 126;
			this.match(DataStructureGrammarParser.GENERATE);
			this.state = 127;
			this.match(DataStructureGrammarParser.LPAREN);
			this.state = 128;
			_la = this._input.LA(1);
			if(!(_la===23 || _la===26)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 129;
			this.match(DataStructureGrammarParser.COMMA);
			this.state = 130;
			this.match(DataStructureGrammarParser.INT);
			this.state = 131;
			this.match(DataStructureGrammarParser.RPAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public generateWithMutators(): GenerateWithMutatorsContext {
		let localctx: GenerateWithMutatorsContext = new GenerateWithMutatorsContext(this, this._ctx, this.state);
		this.enterRule(localctx, 24, DataStructureGrammarParser.RULE_generateWithMutators);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 133;
			this.match(DataStructureGrammarParser.GENERATE_WITH_MUTATORS);
			this.state = 134;
			this.match(DataStructureGrammarParser.LPAREN);
			this.state = 135;
			_la = this._input.LA(1);
			if(!(_la===23 || _la===26)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 136;
			this.match(DataStructureGrammarParser.COMMA);
			this.state = 137;
			this.array();
			this.state = 138;
			this.match(DataStructureGrammarParser.COMMA);
			this.state = 139;
			this.match(DataStructureGrammarParser.INT);
			this.state = 140;
			this.match(DataStructureGrammarParser.RPAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}
	// @RuleVersion(0)
	public requirePlugin(): RequirePluginContext {
		let localctx: RequirePluginContext = new RequirePluginContext(this, this._ctx, this.state);
		this.enterRule(localctx, 26, DataStructureGrammarParser.RULE_requirePlugin);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 142;
			this.match(DataStructureGrammarParser.REQUIRE_PLUGIN);
			this.state = 143;
			this.match(DataStructureGrammarParser.LPAREN);
			this.state = 144;
			this.match(DataStructureGrammarParser.STRING);
			this.state = 145;
			this.match(DataStructureGrammarParser.RPAREN);
			}
		}
		catch (re) {
			if (re instanceof RecognitionException) {
				localctx.exception = re;
				this._errHandler.reportError(this, re);
				this._errHandler.recover(this, re);
			} else {
				throw re;
			}
		}
		finally {
			this.exitRule();
		}
		return localctx;
	}

	public static readonly _serializedATN: number[] = [4,1,50,148,2,0,7,0,2,
	1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,
	10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,1,0,4,0,30,8,0,11,0,12,0,31,1,0,1,
	0,1,1,1,1,1,2,1,2,3,2,40,8,2,1,2,1,2,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,4,3,
	4,52,8,4,1,5,1,5,1,5,1,5,5,5,58,8,5,10,5,12,5,61,9,5,3,5,63,8,5,1,5,1,5,
	1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,
	1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,3,7,98,8,7,1,7,1,7,
	1,7,1,7,3,7,104,8,7,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,9,
	1,9,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,11,1,11,1,11,1,11,1,11,1,11,1,
	11,1,12,1,12,1,12,1,12,1,12,1,12,1,12,1,12,1,12,1,13,1,13,1,13,1,13,1,13,
	1,13,0,0,14,0,2,4,6,8,10,12,14,16,18,20,22,24,26,0,3,2,0,14,14,23,26,2,
	0,23,23,26,26,2,0,23,23,25,25,150,0,29,1,0,0,0,2,35,1,0,0,0,4,39,1,0,0,
	0,6,43,1,0,0,0,8,51,1,0,0,0,10,53,1,0,0,0,12,66,1,0,0,0,14,103,1,0,0,0,
	16,105,1,0,0,0,18,112,1,0,0,0,20,119,1,0,0,0,22,126,1,0,0,0,24,133,1,0,
	0,0,26,142,1,0,0,0,28,30,3,2,1,0,29,28,1,0,0,0,30,31,1,0,0,0,31,29,1,0,
	0,0,31,32,1,0,0,0,32,33,1,0,0,0,33,34,5,0,0,1,34,1,1,0,0,0,35,36,3,4,2,
	0,36,3,1,0,0,0,37,40,3,14,7,0,38,40,3,6,3,0,39,37,1,0,0,0,39,38,1,0,0,0,
	40,41,1,0,0,0,41,42,5,46,0,0,42,5,1,0,0,0,43,44,3,8,4,0,44,7,1,0,0,0,45,
	52,3,16,8,0,46,52,3,26,13,0,47,52,3,18,9,0,48,52,3,20,10,0,49,52,3,22,11,
	0,50,52,3,24,12,0,51,45,1,0,0,0,51,46,1,0,0,0,51,47,1,0,0,0,51,48,1,0,0,
	0,51,49,1,0,0,0,51,50,1,0,0,0,52,9,1,0,0,0,53,62,5,44,0,0,54,59,3,12,6,
	0,55,56,5,37,0,0,56,58,3,12,6,0,57,55,1,0,0,0,58,61,1,0,0,0,59,57,1,0,0,
	0,59,60,1,0,0,0,60,63,1,0,0,0,61,59,1,0,0,0,62,54,1,0,0,0,62,63,1,0,0,0,
	63,64,1,0,0,0,64,65,5,45,0,0,65,11,1,0,0,0,66,67,7,0,0,0,67,13,1,0,0,0,
	68,69,5,3,0,0,69,70,5,23,0,0,70,71,5,27,0,0,71,104,5,26,0,0,72,73,5,2,0,
	0,73,74,5,23,0,0,74,75,5,27,0,0,75,104,5,24,0,0,76,77,5,1,0,0,77,78,5,23,
	0,0,78,79,5,27,0,0,79,104,5,14,0,0,80,81,5,5,0,0,81,82,5,23,0,0,82,83,5,
	27,0,0,83,104,5,26,0,0,84,85,5,4,0,0,85,86,5,23,0,0,86,87,5,27,0,0,87,104,
	5,26,0,0,88,89,5,8,0,0,89,90,5,23,0,0,90,91,5,27,0,0,91,104,5,25,0,0,92,
	93,5,6,0,0,93,94,5,23,0,0,94,97,5,27,0,0,95,98,3,18,9,0,96,98,3,20,10,0,
	97,95,1,0,0,0,97,96,1,0,0,0,98,104,1,0,0,0,99,100,5,7,0,0,100,101,5,23,
	0,0,101,102,5,27,0,0,102,104,3,16,8,0,103,68,1,0,0,0,103,72,1,0,0,0,103,
	76,1,0,0,0,103,80,1,0,0,0,103,84,1,0,0,0,103,88,1,0,0,0,103,92,1,0,0,0,
	103,99,1,0,0,0,104,15,1,0,0,0,105,106,5,17,0,0,106,107,5,40,0,0,107,108,
	5,26,0,0,108,109,5,37,0,0,109,110,7,1,0,0,110,111,5,41,0,0,111,17,1,0,0,
	0,112,113,5,19,0,0,113,114,5,40,0,0,114,115,5,26,0,0,115,116,5,37,0,0,116,
	117,7,2,0,0,117,118,5,41,0,0,118,19,1,0,0,0,119,120,5,20,0,0,120,121,5,
	40,0,0,121,122,5,26,0,0,122,123,5,37,0,0,123,124,7,2,0,0,124,125,5,41,0,
	0,125,21,1,0,0,0,126,127,5,21,0,0,127,128,5,40,0,0,128,129,7,1,0,0,129,
	130,5,37,0,0,130,131,5,24,0,0,131,132,5,41,0,0,132,23,1,0,0,0,133,134,5,
	22,0,0,134,135,5,40,0,0,135,136,7,1,0,0,136,137,5,37,0,0,137,138,3,10,5,
	0,138,139,5,37,0,0,139,140,5,24,0,0,140,141,5,41,0,0,141,25,1,0,0,0,142,
	143,5,18,0,0,143,144,5,40,0,0,144,145,5,26,0,0,145,146,5,41,0,0,146,27,
	1,0,0,0,7,31,39,51,59,62,97,103];

	private static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!DataStructureGrammarParser.__ATN) {
			DataStructureGrammarParser.__ATN = new ATNDeserializer().deserialize(DataStructureGrammarParser._serializedATN);
		}

		return DataStructureGrammarParser.__ATN;
	}


	static DecisionsToDFA = DataStructureGrammarParser._ATN.decisionToState.map( (ds: DecisionState, index: number) => new DFA(ds, index) );

}

export class ProgramContext extends ParserRuleContext {
	constructor(parser?: DataStructureGrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public EOF(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.EOF, 0);
	}
	public syntax_list(): SyntaxContext[] {
		return this.getTypedRuleContexts(SyntaxContext) as SyntaxContext[];
	}
	public syntax(i: number): SyntaxContext {
		return this.getTypedRuleContext(SyntaxContext, i) as SyntaxContext;
	}
    public get ruleIndex(): number {
    	return DataStructureGrammarParser.RULE_program;
	}
	// @Override
	public accept<Result>(visitor: DataStructureGrammarParserVisitor<Result>): Result {
		if (visitor.visitProgram) {
			return visitor.visitProgram(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class SyntaxContext extends ParserRuleContext {
	constructor(parser?: DataStructureGrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public declaration(): DeclarationContext {
		return this.getTypedRuleContext(DeclarationContext, 0) as DeclarationContext;
	}
    public get ruleIndex(): number {
    	return DataStructureGrammarParser.RULE_syntax;
	}
	// @Override
	public accept<Result>(visitor: DataStructureGrammarParserVisitor<Result>): Result {
		if (visitor.visitSyntax) {
			return visitor.visitSyntax(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class DeclarationContext extends ParserRuleContext {
	constructor(parser?: DataStructureGrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public SEMICOLON(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.SEMICOLON, 0);
	}
	public variables(): VariablesContext {
		return this.getTypedRuleContext(VariablesContext, 0) as VariablesContext;
	}
	public statements(): StatementsContext {
		return this.getTypedRuleContext(StatementsContext, 0) as StatementsContext;
	}
    public get ruleIndex(): number {
    	return DataStructureGrammarParser.RULE_declaration;
	}
	// @Override
	public accept<Result>(visitor: DataStructureGrammarParserVisitor<Result>): Result {
		if (visitor.visitDeclaration) {
			return visitor.visitDeclaration(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class StatementsContext extends ParserRuleContext {
	constructor(parser?: DataStructureGrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public functions(): FunctionsContext {
		return this.getTypedRuleContext(FunctionsContext, 0) as FunctionsContext;
	}
    public get ruleIndex(): number {
    	return DataStructureGrammarParser.RULE_statements;
	}
	// @Override
	public accept<Result>(visitor: DataStructureGrammarParserVisitor<Result>): Result {
		if (visitor.visitStatements) {
			return visitor.visitStatements(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class FunctionsContext extends ParserRuleContext {
	constructor(parser?: DataStructureGrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public createInterface(): CreateInterfaceContext {
		return this.getTypedRuleContext(CreateInterfaceContext, 0) as CreateInterfaceContext;
	}
	public requirePlugin(): RequirePluginContext {
		return this.getTypedRuleContext(RequirePluginContext, 0) as RequirePluginContext;
	}
	public createMutator(): CreateMutatorContext {
		return this.getTypedRuleContext(CreateMutatorContext, 0) as CreateMutatorContext;
	}
	public createWeightedMutator(): CreateWeightedMutatorContext {
		return this.getTypedRuleContext(CreateWeightedMutatorContext, 0) as CreateWeightedMutatorContext;
	}
	public generate(): GenerateContext {
		return this.getTypedRuleContext(GenerateContext, 0) as GenerateContext;
	}
	public generateWithMutators(): GenerateWithMutatorsContext {
		return this.getTypedRuleContext(GenerateWithMutatorsContext, 0) as GenerateWithMutatorsContext;
	}
    public get ruleIndex(): number {
    	return DataStructureGrammarParser.RULE_functions;
	}
	// @Override
	public accept<Result>(visitor: DataStructureGrammarParserVisitor<Result>): Result {
		if (visitor.visitFunctions) {
			return visitor.visitFunctions(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class ArrayContext extends ParserRuleContext {
	constructor(parser?: DataStructureGrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public LSQRBRAKET(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.LSQRBRAKET, 0);
	}
	public RSQRBRAKET(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.RSQRBRAKET, 0);
	}
	public any__list(): AnyContext[] {
		return this.getTypedRuleContexts(AnyContext) as AnyContext[];
	}
	public any_(i: number): AnyContext {
		return this.getTypedRuleContext(AnyContext, i) as AnyContext;
	}
	public COMMA_list(): TerminalNode[] {
	    	return this.getTokens(DataStructureGrammarParser.COMMA);
	}
	public COMMA(i: number): TerminalNode {
		return this.getToken(DataStructureGrammarParser.COMMA, i);
	}
    public get ruleIndex(): number {
    	return DataStructureGrammarParser.RULE_array;
	}
	// @Override
	public accept<Result>(visitor: DataStructureGrammarParserVisitor<Result>): Result {
		if (visitor.visitArray) {
			return visitor.visitArray(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class AnyContext extends ParserRuleContext {
	constructor(parser?: DataStructureGrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public STRING(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.STRING, 0);
	}
	public FLOAT(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.FLOAT, 0);
	}
	public INT(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.INT, 0);
	}
	public ID(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.ID, 0);
	}
	public BOOL(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.BOOL, 0);
	}
    public get ruleIndex(): number {
    	return DataStructureGrammarParser.RULE_any;
	}
	// @Override
	public accept<Result>(visitor: DataStructureGrammarParserVisitor<Result>): Result {
		if (visitor.visitAny) {
			return visitor.visitAny(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class VariablesContext extends ParserRuleContext {
	constructor(parser?: DataStructureGrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public STRING_TYPE(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.STRING_TYPE, 0);
	}
	public ID(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.ID, 0);
	}
	public SET(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.SET, 0);
	}
	public STRING(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.STRING, 0);
	}
	public INT_TYPE(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.INT_TYPE, 0);
	}
	public INT(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.INT, 0);
	}
	public BOOL_TYPE(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.BOOL_TYPE, 0);
	}
	public BOOL(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.BOOL, 0);
	}
	public PATH_TYPE(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.PATH_TYPE, 0);
	}
	public JSONFILE_TYPE(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.JSONFILE_TYPE, 0);
	}
	public FLOAT_TYPE(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.FLOAT_TYPE, 0);
	}
	public FLOAT(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.FLOAT, 0);
	}
	public MUTATOR_TYPE(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.MUTATOR_TYPE, 0);
	}
	public createMutator(): CreateMutatorContext {
		return this.getTypedRuleContext(CreateMutatorContext, 0) as CreateMutatorContext;
	}
	public createWeightedMutator(): CreateWeightedMutatorContext {
		return this.getTypedRuleContext(CreateWeightedMutatorContext, 0) as CreateWeightedMutatorContext;
	}
	public INTERFACE_TYPE(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.INTERFACE_TYPE, 0);
	}
	public createInterface(): CreateInterfaceContext {
		return this.getTypedRuleContext(CreateInterfaceContext, 0) as CreateInterfaceContext;
	}
    public get ruleIndex(): number {
    	return DataStructureGrammarParser.RULE_variables;
	}
	// @Override
	public accept<Result>(visitor: DataStructureGrammarParserVisitor<Result>): Result {
		if (visitor.visitVariables) {
			return visitor.visitVariables(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class CreateInterfaceContext extends ParserRuleContext {
	constructor(parser?: DataStructureGrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public CREATE_INTERFACE(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.CREATE_INTERFACE, 0);
	}
	public LPAREN(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.LPAREN, 0);
	}
	public STRING_list(): TerminalNode[] {
	    	return this.getTokens(DataStructureGrammarParser.STRING);
	}
	public STRING(i: number): TerminalNode {
		return this.getToken(DataStructureGrammarParser.STRING, i);
	}
	public COMMA(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.COMMA, 0);
	}
	public RPAREN(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.RPAREN, 0);
	}
	public ID(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.ID, 0);
	}
    public get ruleIndex(): number {
    	return DataStructureGrammarParser.RULE_createInterface;
	}
	// @Override
	public accept<Result>(visitor: DataStructureGrammarParserVisitor<Result>): Result {
		if (visitor.visitCreateInterface) {
			return visitor.visitCreateInterface(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class CreateMutatorContext extends ParserRuleContext {
	constructor(parser?: DataStructureGrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public CREATE_MUTATOR(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.CREATE_MUTATOR, 0);
	}
	public LPAREN(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.LPAREN, 0);
	}
	public STRING(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.STRING, 0);
	}
	public COMMA(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.COMMA, 0);
	}
	public RPAREN(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.RPAREN, 0);
	}
	public FLOAT(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.FLOAT, 0);
	}
	public ID(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.ID, 0);
	}
    public get ruleIndex(): number {
    	return DataStructureGrammarParser.RULE_createMutator;
	}
	// @Override
	public accept<Result>(visitor: DataStructureGrammarParserVisitor<Result>): Result {
		if (visitor.visitCreateMutator) {
			return visitor.visitCreateMutator(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class CreateWeightedMutatorContext extends ParserRuleContext {
	constructor(parser?: DataStructureGrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public CREATE_WEIGHTED_MUTATOR(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.CREATE_WEIGHTED_MUTATOR, 0);
	}
	public LPAREN(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.LPAREN, 0);
	}
	public STRING(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.STRING, 0);
	}
	public COMMA(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.COMMA, 0);
	}
	public RPAREN(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.RPAREN, 0);
	}
	public FLOAT(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.FLOAT, 0);
	}
	public ID(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.ID, 0);
	}
    public get ruleIndex(): number {
    	return DataStructureGrammarParser.RULE_createWeightedMutator;
	}
	// @Override
	public accept<Result>(visitor: DataStructureGrammarParserVisitor<Result>): Result {
		if (visitor.visitCreateWeightedMutator) {
			return visitor.visitCreateWeightedMutator(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class GenerateContext extends ParserRuleContext {
	constructor(parser?: DataStructureGrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public GENERATE(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.GENERATE, 0);
	}
	public LPAREN(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.LPAREN, 0);
	}
	public COMMA(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.COMMA, 0);
	}
	public INT(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.INT, 0);
	}
	public RPAREN(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.RPAREN, 0);
	}
	public STRING(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.STRING, 0);
	}
	public ID(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.ID, 0);
	}
    public get ruleIndex(): number {
    	return DataStructureGrammarParser.RULE_generate;
	}
	// @Override
	public accept<Result>(visitor: DataStructureGrammarParserVisitor<Result>): Result {
		if (visitor.visitGenerate) {
			return visitor.visitGenerate(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class GenerateWithMutatorsContext extends ParserRuleContext {
	constructor(parser?: DataStructureGrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public GENERATE_WITH_MUTATORS(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.GENERATE_WITH_MUTATORS, 0);
	}
	public LPAREN(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.LPAREN, 0);
	}
	public COMMA_list(): TerminalNode[] {
	    	return this.getTokens(DataStructureGrammarParser.COMMA);
	}
	public COMMA(i: number): TerminalNode {
		return this.getToken(DataStructureGrammarParser.COMMA, i);
	}
	public array(): ArrayContext {
		return this.getTypedRuleContext(ArrayContext, 0) as ArrayContext;
	}
	public INT(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.INT, 0);
	}
	public RPAREN(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.RPAREN, 0);
	}
	public STRING(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.STRING, 0);
	}
	public ID(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.ID, 0);
	}
    public get ruleIndex(): number {
    	return DataStructureGrammarParser.RULE_generateWithMutators;
	}
	// @Override
	public accept<Result>(visitor: DataStructureGrammarParserVisitor<Result>): Result {
		if (visitor.visitGenerateWithMutators) {
			return visitor.visitGenerateWithMutators(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}


export class RequirePluginContext extends ParserRuleContext {
	constructor(parser?: DataStructureGrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public REQUIRE_PLUGIN(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.REQUIRE_PLUGIN, 0);
	}
	public LPAREN(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.LPAREN, 0);
	}
	public STRING(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.STRING, 0);
	}
	public RPAREN(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.RPAREN, 0);
	}
    public get ruleIndex(): number {
    	return DataStructureGrammarParser.RULE_requirePlugin;
	}
	// @Override
	public accept<Result>(visitor: DataStructureGrammarParserVisitor<Result>): Result {
		if (visitor.visitRequirePlugin) {
			return visitor.visitRequirePlugin(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
