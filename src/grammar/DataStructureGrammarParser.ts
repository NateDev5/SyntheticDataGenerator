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
	public static readonly ARRAY_TYPE = 9;
	public static readonly IF = 10;
	public static readonly ELSE = 11;
	public static readonly WHILE = 12;
	public static readonly PRINT = 13;
	public static readonly FUNCTION = 14;
	public static readonly BOOL = 15;
	public static readonly TRUE = 16;
	public static readonly FALSE = 17;
	public static readonly CREATE_INTERFACE = 18;
	public static readonly REQUIRE_PLUGIN = 19;
	public static readonly CREATE_MUTATOR = 20;
	public static readonly CREATE_WEIGHTED_MUTATOR = 21;
	public static readonly GENERATE = 22;
	public static readonly GENERATE_WITH_MUTATORS = 23;
	public static readonly SET_DEFAULT = 24;
	public static readonly CREATE_RANGE_MUTATOR = 25;
	public static readonly ID = 26;
	public static readonly INT = 27;
	public static readonly FLOAT = 28;
	public static readonly STRING = 29;
	public static readonly SET = 30;
	public static readonly PLUS = 31;
	public static readonly MINUS = 32;
	public static readonly TIMES = 33;
	public static readonly DIVIDE = 34;
	public static readonly GT = 35;
	public static readonly GE = 36;
	public static readonly LT = 37;
	public static readonly LE = 38;
	public static readonly EQ = 39;
	public static readonly COMMA = 40;
	public static readonly NE = 41;
	public static readonly ASSIGN = 42;
	public static readonly LPAREN = 43;
	public static readonly RPAREN = 44;
	public static readonly LBRACE = 45;
	public static readonly RBRACE = 46;
	public static readonly LSQRBRAKET = 47;
	public static readonly RSQRBRAKET = 48;
	public static readonly SEMICOLON = 49;
	public static readonly COLON = 50;
	public static readonly DOUBLEQUOTE = 51;
	public static readonly COMMENT = 52;
	public static readonly WS = 53;
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
	public static readonly RULE_createRangeMutator = 10;
	public static readonly RULE_createWeightedMutator = 11;
	public static readonly RULE_generate = 12;
	public static readonly RULE_generateWithMutators = 13;
	public static readonly RULE_requirePlugin = 14;
	public static readonly RULE_setDefault = 15;
	public static readonly literalNames: (string | null)[] = [ null, "'bool'", 
                                                            "'int'", "'string'", 
                                                            "'jsonfile'", 
                                                            "'path'", "'mutator'", 
                                                            "'interface'", 
                                                            "'float'", "'array'", 
                                                            "'if'", "'else'", 
                                                            "'while'", "'print'", 
                                                            "'func'", null, 
                                                            null, null, 
                                                            "'CREATE_INTERFACE'", 
                                                            "'REQUIRE_PLUGIN'", 
                                                            "'CREATE_MUTATOR'", 
                                                            "'CREATE_WEIGHTED_MUTATOR'", 
                                                            "'GENERATE'", 
                                                            "'GENERATE_WITH_MUTATORS'", 
                                                            "'SET_DEFAULT'", 
                                                            "'CREATE_RANGE_MUTATOR'", 
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
                                                             "ARRAY_TYPE", 
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
                                                             "SET_DEFAULT", 
                                                             "CREATE_RANGE_MUTATOR", 
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
		"any", "variables", "createInterface", "createMutator", "createRangeMutator", 
		"createWeightedMutator", "generate", "generateWithMutators", "requirePlugin", 
		"setDefault",
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
			this.state = 33;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			do {
				{
				{
				this.state = 32;
				this.syntax();
				}
				}
				this.state = 35;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
			} while ((((_la) & ~0x1F) === 0 && ((1 << _la) & 66847742) !== 0));
			this.state = 37;
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
			this.state = 39;
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
			this.state = 43;
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
			case 9:
				{
				this.state = 41;
				this.variables();
				}
				break;
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
				{
				this.state = 42;
				this.statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			this.state = 45;
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
			this.state = 47;
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
			this.state = 57;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 18:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 49;
				this.createInterface();
				}
				break;
			case 19:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 50;
				this.requirePlugin();
				}
				break;
			case 20:
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 51;
				this.createMutator();
				}
				break;
			case 21:
				this.enterOuterAlt(localctx, 4);
				{
				this.state = 52;
				this.createWeightedMutator();
				}
				break;
			case 22:
				this.enterOuterAlt(localctx, 5);
				{
				this.state = 53;
				this.generate();
				}
				break;
			case 23:
				this.enterOuterAlt(localctx, 6);
				{
				this.state = 54;
				this.generateWithMutators();
				}
				break;
			case 24:
				this.enterOuterAlt(localctx, 7);
				{
				this.state = 55;
				this.setDefault();
				}
				break;
			case 25:
				this.enterOuterAlt(localctx, 8);
				{
				this.state = 56;
				this.createRangeMutator();
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
			this.state = 59;
			this.match(DataStructureGrammarParser.LSQRBRAKET);
			this.state = 68;
			this._errHandler.sync(this);
			_la = this._input.LA(1);
			if ((((_la) & ~0x1F) === 0 && ((1 << _la) & 1006665728) !== 0)) {
				{
				this.state = 60;
				this.any_();
				this.state = 65;
				this._errHandler.sync(this);
				_la = this._input.LA(1);
				while (_la===40) {
					{
					{
					this.state = 61;
					this.match(DataStructureGrammarParser.COMMA);
					this.state = 62;
					this.any_();
					}
					}
					this.state = 67;
					this._errHandler.sync(this);
					_la = this._input.LA(1);
				}
				}
			}

			this.state = 70;
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
			this.state = 72;
			_la = this._input.LA(1);
			if(!((((_la) & ~0x1F) === 0 && ((1 << _la) & 1006665728) !== 0))) {
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
			this.state = 114;
			this._errHandler.sync(this);
			switch (this._input.LA(1)) {
			case 3:
				this.enterOuterAlt(localctx, 1);
				{
				this.state = 74;
				this.match(DataStructureGrammarParser.STRING_TYPE);
				this.state = 75;
				this.match(DataStructureGrammarParser.ID);
				this.state = 76;
				this.match(DataStructureGrammarParser.SET);
				this.state = 77;
				this.match(DataStructureGrammarParser.STRING);
				}
				break;
			case 2:
				this.enterOuterAlt(localctx, 2);
				{
				this.state = 78;
				this.match(DataStructureGrammarParser.INT_TYPE);
				this.state = 79;
				this.match(DataStructureGrammarParser.ID);
				this.state = 80;
				this.match(DataStructureGrammarParser.SET);
				this.state = 81;
				this.match(DataStructureGrammarParser.INT);
				}
				break;
			case 1:
				this.enterOuterAlt(localctx, 3);
				{
				this.state = 82;
				this.match(DataStructureGrammarParser.BOOL_TYPE);
				this.state = 83;
				this.match(DataStructureGrammarParser.ID);
				this.state = 84;
				this.match(DataStructureGrammarParser.SET);
				this.state = 85;
				this.match(DataStructureGrammarParser.BOOL);
				}
				break;
			case 5:
				this.enterOuterAlt(localctx, 4);
				{
				this.state = 86;
				this.match(DataStructureGrammarParser.PATH_TYPE);
				this.state = 87;
				this.match(DataStructureGrammarParser.ID);
				this.state = 88;
				this.match(DataStructureGrammarParser.SET);
				this.state = 89;
				this.match(DataStructureGrammarParser.STRING);
				}
				break;
			case 4:
				this.enterOuterAlt(localctx, 5);
				{
				this.state = 90;
				this.match(DataStructureGrammarParser.JSONFILE_TYPE);
				this.state = 91;
				this.match(DataStructureGrammarParser.ID);
				this.state = 92;
				this.match(DataStructureGrammarParser.SET);
				this.state = 93;
				this.match(DataStructureGrammarParser.STRING);
				}
				break;
			case 8:
				this.enterOuterAlt(localctx, 6);
				{
				this.state = 94;
				this.match(DataStructureGrammarParser.FLOAT_TYPE);
				this.state = 95;
				this.match(DataStructureGrammarParser.ID);
				this.state = 96;
				this.match(DataStructureGrammarParser.SET);
				this.state = 97;
				this.match(DataStructureGrammarParser.FLOAT);
				}
				break;
			case 6:
				this.enterOuterAlt(localctx, 7);
				{
				this.state = 98;
				this.match(DataStructureGrammarParser.MUTATOR_TYPE);
				this.state = 99;
				this.match(DataStructureGrammarParser.ID);
				this.state = 100;
				this.match(DataStructureGrammarParser.SET);
				this.state = 104;
				this._errHandler.sync(this);
				switch (this._input.LA(1)) {
				case 20:
					{
					this.state = 101;
					this.createMutator();
					}
					break;
				case 21:
					{
					this.state = 102;
					this.createWeightedMutator();
					}
					break;
				case 25:
					{
					this.state = 103;
					this.createRangeMutator();
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
				this.state = 106;
				this.match(DataStructureGrammarParser.INTERFACE_TYPE);
				this.state = 107;
				this.match(DataStructureGrammarParser.ID);
				this.state = 108;
				this.match(DataStructureGrammarParser.SET);
				{
				this.state = 109;
				this.createInterface();
				}
				}
				break;
			case 9:
				this.enterOuterAlt(localctx, 9);
				{
				this.state = 110;
				this.match(DataStructureGrammarParser.ARRAY_TYPE);
				this.state = 111;
				this.match(DataStructureGrammarParser.ID);
				this.state = 112;
				this.match(DataStructureGrammarParser.SET);
				this.state = 113;
				this.array();
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
			this.state = 116;
			this.match(DataStructureGrammarParser.CREATE_INTERFACE);
			this.state = 117;
			this.match(DataStructureGrammarParser.LPAREN);
			this.state = 118;
			this.match(DataStructureGrammarParser.STRING);
			this.state = 119;
			this.match(DataStructureGrammarParser.COMMA);
			this.state = 120;
			_la = this._input.LA(1);
			if(!(_la===26 || _la===29)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 121;
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
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 123;
			this.match(DataStructureGrammarParser.CREATE_MUTATOR);
			this.state = 124;
			this.match(DataStructureGrammarParser.LPAREN);
			this.state = 125;
			this.match(DataStructureGrammarParser.STRING);
			this.state = 126;
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
	public createRangeMutator(): CreateRangeMutatorContext {
		let localctx: CreateRangeMutatorContext = new CreateRangeMutatorContext(this, this._ctx, this.state);
		this.enterRule(localctx, 20, DataStructureGrammarParser.RULE_createRangeMutator);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 128;
			this.match(DataStructureGrammarParser.CREATE_RANGE_MUTATOR);
			this.state = 129;
			this.match(DataStructureGrammarParser.LPAREN);
			this.state = 130;
			this.match(DataStructureGrammarParser.STRING);
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
	public createWeightedMutator(): CreateWeightedMutatorContext {
		let localctx: CreateWeightedMutatorContext = new CreateWeightedMutatorContext(this, this._ctx, this.state);
		this.enterRule(localctx, 22, DataStructureGrammarParser.RULE_createWeightedMutator);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 133;
			this.match(DataStructureGrammarParser.CREATE_WEIGHTED_MUTATOR);
			this.state = 134;
			this.match(DataStructureGrammarParser.LPAREN);
			this.state = 135;
			this.match(DataStructureGrammarParser.STRING);
			this.state = 136;
			this.match(DataStructureGrammarParser.COMMA);
			this.state = 137;
			_la = this._input.LA(1);
			if(!(_la===26 || _la===28)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 138;
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
		this.enterRule(localctx, 24, DataStructureGrammarParser.RULE_generate);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 140;
			this.match(DataStructureGrammarParser.GENERATE);
			this.state = 141;
			this.match(DataStructureGrammarParser.LPAREN);
			this.state = 142;
			_la = this._input.LA(1);
			if(!(_la===26 || _la===29)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 143;
			this.match(DataStructureGrammarParser.COMMA);
			this.state = 144;
			this.match(DataStructureGrammarParser.INT);
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
	// @RuleVersion(0)
	public generateWithMutators(): GenerateWithMutatorsContext {
		let localctx: GenerateWithMutatorsContext = new GenerateWithMutatorsContext(this, this._ctx, this.state);
		this.enterRule(localctx, 26, DataStructureGrammarParser.RULE_generateWithMutators);
		let _la: number;
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 147;
			this.match(DataStructureGrammarParser.GENERATE_WITH_MUTATORS);
			this.state = 148;
			this.match(DataStructureGrammarParser.LPAREN);
			this.state = 149;
			_la = this._input.LA(1);
			if(!(_la===26 || _la===29)) {
			this._errHandler.recoverInline(this);
			}
			else {
				this._errHandler.reportMatch(this);
			    this.consume();
			}
			this.state = 150;
			this.match(DataStructureGrammarParser.COMMA);
			this.state = 151;
			this.array();
			this.state = 152;
			this.match(DataStructureGrammarParser.COMMA);
			this.state = 153;
			this.match(DataStructureGrammarParser.INT);
			this.state = 154;
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
		this.enterRule(localctx, 28, DataStructureGrammarParser.RULE_requirePlugin);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 156;
			this.match(DataStructureGrammarParser.REQUIRE_PLUGIN);
			this.state = 157;
			this.match(DataStructureGrammarParser.LPAREN);
			this.state = 158;
			this.match(DataStructureGrammarParser.STRING);
			this.state = 159;
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
	public setDefault(): SetDefaultContext {
		let localctx: SetDefaultContext = new SetDefaultContext(this, this._ctx, this.state);
		this.enterRule(localctx, 30, DataStructureGrammarParser.RULE_setDefault);
		try {
			this.enterOuterAlt(localctx, 1);
			{
			this.state = 161;
			this.match(DataStructureGrammarParser.SET_DEFAULT);
			this.state = 162;
			this.match(DataStructureGrammarParser.LPAREN);
			this.state = 163;
			this.match(DataStructureGrammarParser.STRING);
			this.state = 164;
			this.match(DataStructureGrammarParser.COMMA);
			this.state = 165;
			this.array();
			this.state = 166;
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

	public static readonly _serializedATN: number[] = [4,1,53,169,2,0,7,0,2,
	1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,
	10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,2,14,7,14,2,15,7,15,1,0,4,0,34,8,
	0,11,0,12,0,35,1,0,1,0,1,1,1,1,1,2,1,2,3,2,44,8,2,1,2,1,2,1,3,1,3,1,4,1,
	4,1,4,1,4,1,4,1,4,1,4,1,4,3,4,58,8,4,1,5,1,5,1,5,1,5,5,5,64,8,5,10,5,12,
	5,67,9,5,3,5,69,8,5,1,5,1,5,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,
	1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,
	1,7,1,7,1,7,3,7,105,8,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,3,7,115,8,7,1,8,
	1,8,1,8,1,8,1,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,10,1,10,1,10,1,10,1,10,1,
	11,1,11,1,11,1,11,1,11,1,11,1,11,1,12,1,12,1,12,1,12,1,12,1,12,1,12,1,13,
	1,13,1,13,1,13,1,13,1,13,1,13,1,13,1,13,1,14,1,14,1,14,1,14,1,14,1,15,1,
	15,1,15,1,15,1,15,1,15,1,15,1,15,0,0,16,0,2,4,6,8,10,12,14,16,18,20,22,
	24,26,28,30,0,3,2,0,15,15,26,29,2,0,26,26,29,29,2,0,26,26,28,28,173,0,33,
	1,0,0,0,2,39,1,0,0,0,4,43,1,0,0,0,6,47,1,0,0,0,8,57,1,0,0,0,10,59,1,0,0,
	0,12,72,1,0,0,0,14,114,1,0,0,0,16,116,1,0,0,0,18,123,1,0,0,0,20,128,1,0,
	0,0,22,133,1,0,0,0,24,140,1,0,0,0,26,147,1,0,0,0,28,156,1,0,0,0,30,161,
	1,0,0,0,32,34,3,2,1,0,33,32,1,0,0,0,34,35,1,0,0,0,35,33,1,0,0,0,35,36,1,
	0,0,0,36,37,1,0,0,0,37,38,5,0,0,1,38,1,1,0,0,0,39,40,3,4,2,0,40,3,1,0,0,
	0,41,44,3,14,7,0,42,44,3,6,3,0,43,41,1,0,0,0,43,42,1,0,0,0,44,45,1,0,0,
	0,45,46,5,49,0,0,46,5,1,0,0,0,47,48,3,8,4,0,48,7,1,0,0,0,49,58,3,16,8,0,
	50,58,3,28,14,0,51,58,3,18,9,0,52,58,3,22,11,0,53,58,3,24,12,0,54,58,3,
	26,13,0,55,58,3,30,15,0,56,58,3,20,10,0,57,49,1,0,0,0,57,50,1,0,0,0,57,
	51,1,0,0,0,57,52,1,0,0,0,57,53,1,0,0,0,57,54,1,0,0,0,57,55,1,0,0,0,57,56,
	1,0,0,0,58,9,1,0,0,0,59,68,5,47,0,0,60,65,3,12,6,0,61,62,5,40,0,0,62,64,
	3,12,6,0,63,61,1,0,0,0,64,67,1,0,0,0,65,63,1,0,0,0,65,66,1,0,0,0,66,69,
	1,0,0,0,67,65,1,0,0,0,68,60,1,0,0,0,68,69,1,0,0,0,69,70,1,0,0,0,70,71,5,
	48,0,0,71,11,1,0,0,0,72,73,7,0,0,0,73,13,1,0,0,0,74,75,5,3,0,0,75,76,5,
	26,0,0,76,77,5,30,0,0,77,115,5,29,0,0,78,79,5,2,0,0,79,80,5,26,0,0,80,81,
	5,30,0,0,81,115,5,27,0,0,82,83,5,1,0,0,83,84,5,26,0,0,84,85,5,30,0,0,85,
	115,5,15,0,0,86,87,5,5,0,0,87,88,5,26,0,0,88,89,5,30,0,0,89,115,5,29,0,
	0,90,91,5,4,0,0,91,92,5,26,0,0,92,93,5,30,0,0,93,115,5,29,0,0,94,95,5,8,
	0,0,95,96,5,26,0,0,96,97,5,30,0,0,97,115,5,28,0,0,98,99,5,6,0,0,99,100,
	5,26,0,0,100,104,5,30,0,0,101,105,3,18,9,0,102,105,3,22,11,0,103,105,3,
	20,10,0,104,101,1,0,0,0,104,102,1,0,0,0,104,103,1,0,0,0,105,115,1,0,0,0,
	106,107,5,7,0,0,107,108,5,26,0,0,108,109,5,30,0,0,109,115,3,16,8,0,110,
	111,5,9,0,0,111,112,5,26,0,0,112,113,5,30,0,0,113,115,3,10,5,0,114,74,1,
	0,0,0,114,78,1,0,0,0,114,82,1,0,0,0,114,86,1,0,0,0,114,90,1,0,0,0,114,94,
	1,0,0,0,114,98,1,0,0,0,114,106,1,0,0,0,114,110,1,0,0,0,115,15,1,0,0,0,116,
	117,5,18,0,0,117,118,5,43,0,0,118,119,5,29,0,0,119,120,5,40,0,0,120,121,
	7,1,0,0,121,122,5,44,0,0,122,17,1,0,0,0,123,124,5,20,0,0,124,125,5,43,0,
	0,125,126,5,29,0,0,126,127,5,44,0,0,127,19,1,0,0,0,128,129,5,25,0,0,129,
	130,5,43,0,0,130,131,5,29,0,0,131,132,5,44,0,0,132,21,1,0,0,0,133,134,5,
	21,0,0,134,135,5,43,0,0,135,136,5,29,0,0,136,137,5,40,0,0,137,138,7,2,0,
	0,138,139,5,44,0,0,139,23,1,0,0,0,140,141,5,22,0,0,141,142,5,43,0,0,142,
	143,7,1,0,0,143,144,5,40,0,0,144,145,5,27,0,0,145,146,5,44,0,0,146,25,1,
	0,0,0,147,148,5,23,0,0,148,149,5,43,0,0,149,150,7,1,0,0,150,151,5,40,0,
	0,151,152,3,10,5,0,152,153,5,40,0,0,153,154,5,27,0,0,154,155,5,44,0,0,155,
	27,1,0,0,0,156,157,5,19,0,0,157,158,5,43,0,0,158,159,5,29,0,0,159,160,5,
	44,0,0,160,29,1,0,0,0,161,162,5,24,0,0,162,163,5,43,0,0,163,164,5,29,0,
	0,164,165,5,40,0,0,165,166,3,10,5,0,166,167,5,44,0,0,167,31,1,0,0,0,7,35,
	43,57,65,68,104,114];

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
	public setDefault(): SetDefaultContext {
		return this.getTypedRuleContext(SetDefaultContext, 0) as SetDefaultContext;
	}
	public createRangeMutator(): CreateRangeMutatorContext {
		return this.getTypedRuleContext(CreateRangeMutatorContext, 0) as CreateRangeMutatorContext;
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
	public createRangeMutator(): CreateRangeMutatorContext {
		return this.getTypedRuleContext(CreateRangeMutatorContext, 0) as CreateRangeMutatorContext;
	}
	public INTERFACE_TYPE(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.INTERFACE_TYPE, 0);
	}
	public createInterface(): CreateInterfaceContext {
		return this.getTypedRuleContext(CreateInterfaceContext, 0) as CreateInterfaceContext;
	}
	public ARRAY_TYPE(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.ARRAY_TYPE, 0);
	}
	public array(): ArrayContext {
		return this.getTypedRuleContext(ArrayContext, 0) as ArrayContext;
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
	public RPAREN(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.RPAREN, 0);
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


export class CreateRangeMutatorContext extends ParserRuleContext {
	constructor(parser?: DataStructureGrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public CREATE_RANGE_MUTATOR(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.CREATE_RANGE_MUTATOR, 0);
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
    	return DataStructureGrammarParser.RULE_createRangeMutator;
	}
	// @Override
	public accept<Result>(visitor: DataStructureGrammarParserVisitor<Result>): Result {
		if (visitor.visitCreateRangeMutator) {
			return visitor.visitCreateRangeMutator(this);
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


export class SetDefaultContext extends ParserRuleContext {
	constructor(parser?: DataStructureGrammarParser, parent?: ParserRuleContext, invokingState?: number) {
		super(parent, invokingState);
    	this.parser = parser;
	}
	public SET_DEFAULT(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.SET_DEFAULT, 0);
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
	public array(): ArrayContext {
		return this.getTypedRuleContext(ArrayContext, 0) as ArrayContext;
	}
	public RPAREN(): TerminalNode {
		return this.getToken(DataStructureGrammarParser.RPAREN, 0);
	}
    public get ruleIndex(): number {
    	return DataStructureGrammarParser.RULE_setDefault;
	}
	// @Override
	public accept<Result>(visitor: DataStructureGrammarParserVisitor<Result>): Result {
		if (visitor.visitSetDefault) {
			return visitor.visitSetDefault(this);
		} else {
			return visitor.visitChildren(this);
		}
	}
}
