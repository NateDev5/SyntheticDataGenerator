// Generated from d:\Nate\Nodejs\SyntheticDataGenerator\src\grammar\DataStructureGrammarParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DataStructureGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL_TYPE=1, INT_TYPE=2, STRING_TYPE=3, JSONFILE_TYPE=4, PATH_TYPE=5, 
		MUTATOR_TYPE=6, INTERFACE_TYPE=7, FLOAT_TYPE=8, ARRAY_TYPE=9, IF=10, ELSE=11, 
		WHILE=12, PRINT=13, FUNCTION=14, BOOL=15, TRUE=16, FALSE=17, CREATE_INTERFACE=18, 
		REQUIRE_PLUGIN=19, CREATE_MUTATOR=20, CREATE_WEIGHTED_MUTATOR=21, GENERATE=22, 
		GENERATE_WITH_MUTATORS=23, SET_DEFAULT=24, CREATE_RANGE_MUTATOR=25, ID=26, 
		INT=27, FLOAT=28, STRING=29, SET=30, PLUS=31, MINUS=32, TIMES=33, DIVIDE=34, 
		GT=35, GE=36, LT=37, LE=38, EQ=39, COMMA=40, NE=41, ASSIGN=42, LPAREN=43, 
		RPAREN=44, LBRACE=45, RBRACE=46, LSQRBRAKET=47, RSQRBRAKET=48, SEMICOLON=49, 
		COLON=50, DOUBLEQUOTE=51, COMMENT=52, WS=53;
	public static final int
		RULE_program = 0, RULE_syntax = 1, RULE_declaration = 2, RULE_statements = 3, 
		RULE_functions = 4, RULE_array = 5, RULE_any = 6, RULE_variables = 7, 
		RULE_createInterface = 8, RULE_createMutator = 9, RULE_createRangeMutator = 10, 
		RULE_createWeightedMutator = 11, RULE_generate = 12, RULE_generateWithMutators = 13, 
		RULE_requirePlugin = 14, RULE_setDefault = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "syntax", "declaration", "statements", "functions", "array", 
			"any", "variables", "createInterface", "createMutator", "createRangeMutator", 
			"createWeightedMutator", "generate", "generateWithMutators", "requirePlugin", 
			"setDefault"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bool'", "'int'", "'string'", "'jsonfile'", "'path'", "'mutator'", 
			"'interface'", "'float'", "'array'", "'if'", "'else'", "'while'", "'print'", 
			"'func'", null, null, null, "'CREATE_INTERFACE'", "'REQUIRE_PLUGIN'", 
			"'CREATE_MUTATOR'", "'CREATE_WEIGHTED_MUTATOR'", "'GENERATE'", "'GENERATE_WITH_MUTATORS'", 
			"'SET_DEFAULT'", "'CREATE_RANGE_MUTATOR'", null, null, null, null, "'->'", 
			"'+'", "'-'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", "'=='", "','", 
			"'!='", "'='", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "':'", 
			"'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOL_TYPE", "INT_TYPE", "STRING_TYPE", "JSONFILE_TYPE", "PATH_TYPE", 
			"MUTATOR_TYPE", "INTERFACE_TYPE", "FLOAT_TYPE", "ARRAY_TYPE", "IF", "ELSE", 
			"WHILE", "PRINT", "FUNCTION", "BOOL", "TRUE", "FALSE", "CREATE_INTERFACE", 
			"REQUIRE_PLUGIN", "CREATE_MUTATOR", "CREATE_WEIGHTED_MUTATOR", "GENERATE", 
			"GENERATE_WITH_MUTATORS", "SET_DEFAULT", "CREATE_RANGE_MUTATOR", "ID", 
			"INT", "FLOAT", "STRING", "SET", "PLUS", "MINUS", "TIMES", "DIVIDE", 
			"GT", "GE", "LT", "LE", "EQ", "COMMA", "NE", "ASSIGN", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LSQRBRAKET", "RSQRBRAKET", "SEMICOLON", "COLON", 
			"DOUBLEQUOTE", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DataStructureGrammarParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DataStructureGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DataStructureGrammarParser.EOF, 0); }
		public List<SyntaxContext> syntax() {
			return getRuleContexts(SyntaxContext.class);
		}
		public SyntaxContext syntax(int i) {
			return getRuleContext(SyntaxContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				syntax();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_TYPE) | (1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << JSONFILE_TYPE) | (1L << PATH_TYPE) | (1L << MUTATOR_TYPE) | (1L << INTERFACE_TYPE) | (1L << FLOAT_TYPE) | (1L << ARRAY_TYPE) | (1L << CREATE_INTERFACE) | (1L << REQUIRE_PLUGIN) | (1L << CREATE_MUTATOR) | (1L << CREATE_WEIGHTED_MUTATOR) | (1L << GENERATE) | (1L << GENERATE_WITH_MUTATORS) | (1L << SET_DEFAULT) | (1L << CREATE_RANGE_MUTATOR))) != 0) );
			setState(37);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SyntaxContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public SyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax; }
	}

	public final SyntaxContext syntax() throws RecognitionException {
		SyntaxContext _localctx = new SyntaxContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_syntax);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(DataStructureGrammarParser.SEMICOLON, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL_TYPE:
			case INT_TYPE:
			case STRING_TYPE:
			case JSONFILE_TYPE:
			case PATH_TYPE:
			case MUTATOR_TYPE:
			case INTERFACE_TYPE:
			case FLOAT_TYPE:
			case ARRAY_TYPE:
				{
				setState(41);
				variables();
				}
				break;
			case CREATE_INTERFACE:
			case REQUIRE_PLUGIN:
			case CREATE_MUTATOR:
			case CREATE_WEIGHTED_MUTATOR:
			case GENERATE:
			case GENERATE_WITH_MUTATORS:
			case SET_DEFAULT:
			case CREATE_RANGE_MUTATOR:
				{
				setState(42);
				statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(45);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			functions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionsContext extends ParserRuleContext {
		public CreateInterfaceContext createInterface() {
			return getRuleContext(CreateInterfaceContext.class,0);
		}
		public RequirePluginContext requirePlugin() {
			return getRuleContext(RequirePluginContext.class,0);
		}
		public CreateMutatorContext createMutator() {
			return getRuleContext(CreateMutatorContext.class,0);
		}
		public CreateWeightedMutatorContext createWeightedMutator() {
			return getRuleContext(CreateWeightedMutatorContext.class,0);
		}
		public GenerateContext generate() {
			return getRuleContext(GenerateContext.class,0);
		}
		public GenerateWithMutatorsContext generateWithMutators() {
			return getRuleContext(GenerateWithMutatorsContext.class,0);
		}
		public SetDefaultContext setDefault() {
			return getRuleContext(SetDefaultContext.class,0);
		}
		public CreateRangeMutatorContext createRangeMutator() {
			return getRuleContext(CreateRangeMutatorContext.class,0);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functions);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE_INTERFACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				createInterface();
				}
				break;
			case REQUIRE_PLUGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				requirePlugin();
				}
				break;
			case CREATE_MUTATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				createMutator();
				}
				break;
			case CREATE_WEIGHTED_MUTATOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				createWeightedMutator();
				}
				break;
			case GENERATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				generate();
				}
				break;
			case GENERATE_WITH_MUTATORS:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				generateWithMutators();
				}
				break;
			case SET_DEFAULT:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				setDefault();
				}
				break;
			case CREATE_RANGE_MUTATOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				createRangeMutator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LSQRBRAKET() { return getToken(DataStructureGrammarParser.LSQRBRAKET, 0); }
		public TerminalNode RSQRBRAKET() { return getToken(DataStructureGrammarParser.RSQRBRAKET, 0); }
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DataStructureGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DataStructureGrammarParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(LSQRBRAKET);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(60);
				any();
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(61);
					match(COMMA);
					setState(62);
					any();
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(70);
			match(RSQRBRAKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DataStructureGrammarParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(DataStructureGrammarParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(DataStructureGrammarParser.INT, 0); }
		public TerminalNode ID() { return getToken(DataStructureGrammarParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(DataStructureGrammarParser.BOOL, 0); }
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_any);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode STRING_TYPE() { return getToken(DataStructureGrammarParser.STRING_TYPE, 0); }
		public TerminalNode ID() { return getToken(DataStructureGrammarParser.ID, 0); }
		public TerminalNode SET() { return getToken(DataStructureGrammarParser.SET, 0); }
		public TerminalNode STRING() { return getToken(DataStructureGrammarParser.STRING, 0); }
		public TerminalNode INT_TYPE() { return getToken(DataStructureGrammarParser.INT_TYPE, 0); }
		public TerminalNode INT() { return getToken(DataStructureGrammarParser.INT, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(DataStructureGrammarParser.BOOL_TYPE, 0); }
		public TerminalNode BOOL() { return getToken(DataStructureGrammarParser.BOOL, 0); }
		public TerminalNode PATH_TYPE() { return getToken(DataStructureGrammarParser.PATH_TYPE, 0); }
		public TerminalNode JSONFILE_TYPE() { return getToken(DataStructureGrammarParser.JSONFILE_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(DataStructureGrammarParser.FLOAT_TYPE, 0); }
		public TerminalNode FLOAT() { return getToken(DataStructureGrammarParser.FLOAT, 0); }
		public TerminalNode MUTATOR_TYPE() { return getToken(DataStructureGrammarParser.MUTATOR_TYPE, 0); }
		public CreateMutatorContext createMutator() {
			return getRuleContext(CreateMutatorContext.class,0);
		}
		public CreateWeightedMutatorContext createWeightedMutator() {
			return getRuleContext(CreateWeightedMutatorContext.class,0);
		}
		public CreateRangeMutatorContext createRangeMutator() {
			return getRuleContext(CreateRangeMutatorContext.class,0);
		}
		public TerminalNode INTERFACE_TYPE() { return getToken(DataStructureGrammarParser.INTERFACE_TYPE, 0); }
		public CreateInterfaceContext createInterface() {
			return getRuleContext(CreateInterfaceContext.class,0);
		}
		public TerminalNode ARRAY_TYPE() { return getToken(DataStructureGrammarParser.ARRAY_TYPE, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variables);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(STRING_TYPE);
				setState(75);
				match(ID);
				setState(76);
				match(SET);
				setState(77);
				match(STRING);
				}
				break;
			case INT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(INT_TYPE);
				setState(79);
				match(ID);
				setState(80);
				match(SET);
				setState(81);
				match(INT);
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(BOOL_TYPE);
				setState(83);
				match(ID);
				setState(84);
				match(SET);
				setState(85);
				match(BOOL);
				}
				break;
			case PATH_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				match(PATH_TYPE);
				setState(87);
				match(ID);
				setState(88);
				match(SET);
				setState(89);
				match(STRING);
				}
				break;
			case JSONFILE_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				match(JSONFILE_TYPE);
				setState(91);
				match(ID);
				setState(92);
				match(SET);
				setState(93);
				match(STRING);
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				match(FLOAT_TYPE);
				setState(95);
				match(ID);
				setState(96);
				match(SET);
				setState(97);
				match(FLOAT);
				}
				break;
			case MUTATOR_TYPE:
				enterOuterAlt(_localctx, 7);
				{
				setState(98);
				match(MUTATOR_TYPE);
				setState(99);
				match(ID);
				setState(100);
				match(SET);
				setState(104);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CREATE_MUTATOR:
					{
					setState(101);
					createMutator();
					}
					break;
				case CREATE_WEIGHTED_MUTATOR:
					{
					setState(102);
					createWeightedMutator();
					}
					break;
				case CREATE_RANGE_MUTATOR:
					{
					setState(103);
					createRangeMutator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case INTERFACE_TYPE:
				enterOuterAlt(_localctx, 8);
				{
				setState(106);
				match(INTERFACE_TYPE);
				setState(107);
				match(ID);
				setState(108);
				match(SET);
				{
				setState(109);
				createInterface();
				}
				}
				break;
			case ARRAY_TYPE:
				enterOuterAlt(_localctx, 9);
				{
				setState(110);
				match(ARRAY_TYPE);
				setState(111);
				match(ID);
				setState(112);
				match(SET);
				setState(113);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateInterfaceContext extends ParserRuleContext {
		public TerminalNode CREATE_INTERFACE() { return getToken(DataStructureGrammarParser.CREATE_INTERFACE, 0); }
		public TerminalNode LPAREN() { return getToken(DataStructureGrammarParser.LPAREN, 0); }
		public List<TerminalNode> STRING() { return getTokens(DataStructureGrammarParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(DataStructureGrammarParser.STRING, i);
		}
		public TerminalNode COMMA() { return getToken(DataStructureGrammarParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(DataStructureGrammarParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(DataStructureGrammarParser.ID, 0); }
		public CreateInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createInterface; }
	}

	public final CreateInterfaceContext createInterface() throws RecognitionException {
		CreateInterfaceContext _localctx = new CreateInterfaceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_createInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(CREATE_INTERFACE);
			setState(117);
			match(LPAREN);
			setState(118);
			match(STRING);
			setState(119);
			match(COMMA);
			setState(120);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(121);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateMutatorContext extends ParserRuleContext {
		public TerminalNode CREATE_MUTATOR() { return getToken(DataStructureGrammarParser.CREATE_MUTATOR, 0); }
		public TerminalNode LPAREN() { return getToken(DataStructureGrammarParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(DataStructureGrammarParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(DataStructureGrammarParser.RPAREN, 0); }
		public CreateMutatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createMutator; }
	}

	public final CreateMutatorContext createMutator() throws RecognitionException {
		CreateMutatorContext _localctx = new CreateMutatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_createMutator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(CREATE_MUTATOR);
			setState(124);
			match(LPAREN);
			setState(125);
			match(STRING);
			setState(126);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateRangeMutatorContext extends ParserRuleContext {
		public TerminalNode CREATE_RANGE_MUTATOR() { return getToken(DataStructureGrammarParser.CREATE_RANGE_MUTATOR, 0); }
		public TerminalNode LPAREN() { return getToken(DataStructureGrammarParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(DataStructureGrammarParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(DataStructureGrammarParser.RPAREN, 0); }
		public CreateRangeMutatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createRangeMutator; }
	}

	public final CreateRangeMutatorContext createRangeMutator() throws RecognitionException {
		CreateRangeMutatorContext _localctx = new CreateRangeMutatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_createRangeMutator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(CREATE_RANGE_MUTATOR);
			setState(129);
			match(LPAREN);
			setState(130);
			match(STRING);
			setState(131);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateWeightedMutatorContext extends ParserRuleContext {
		public TerminalNode CREATE_WEIGHTED_MUTATOR() { return getToken(DataStructureGrammarParser.CREATE_WEIGHTED_MUTATOR, 0); }
		public TerminalNode LPAREN() { return getToken(DataStructureGrammarParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(DataStructureGrammarParser.STRING, 0); }
		public TerminalNode COMMA() { return getToken(DataStructureGrammarParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(DataStructureGrammarParser.RPAREN, 0); }
		public TerminalNode FLOAT() { return getToken(DataStructureGrammarParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(DataStructureGrammarParser.ID, 0); }
		public CreateWeightedMutatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createWeightedMutator; }
	}

	public final CreateWeightedMutatorContext createWeightedMutator() throws RecognitionException {
		CreateWeightedMutatorContext _localctx = new CreateWeightedMutatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_createWeightedMutator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(CREATE_WEIGHTED_MUTATOR);
			setState(134);
			match(LPAREN);
			setState(135);
			match(STRING);
			setState(136);
			match(COMMA);
			setState(137);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(138);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenerateContext extends ParserRuleContext {
		public TerminalNode GENERATE() { return getToken(DataStructureGrammarParser.GENERATE, 0); }
		public TerminalNode LPAREN() { return getToken(DataStructureGrammarParser.LPAREN, 0); }
		public TerminalNode COMMA() { return getToken(DataStructureGrammarParser.COMMA, 0); }
		public TerminalNode INT() { return getToken(DataStructureGrammarParser.INT, 0); }
		public TerminalNode RPAREN() { return getToken(DataStructureGrammarParser.RPAREN, 0); }
		public TerminalNode STRING() { return getToken(DataStructureGrammarParser.STRING, 0); }
		public TerminalNode ID() { return getToken(DataStructureGrammarParser.ID, 0); }
		public GenerateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generate; }
	}

	public final GenerateContext generate() throws RecognitionException {
		GenerateContext _localctx = new GenerateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_generate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(GENERATE);
			setState(141);
			match(LPAREN);
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(143);
			match(COMMA);
			setState(144);
			match(INT);
			setState(145);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenerateWithMutatorsContext extends ParserRuleContext {
		public TerminalNode GENERATE_WITH_MUTATORS() { return getToken(DataStructureGrammarParser.GENERATE_WITH_MUTATORS, 0); }
		public TerminalNode LPAREN() { return getToken(DataStructureGrammarParser.LPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DataStructureGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DataStructureGrammarParser.COMMA, i);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(DataStructureGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(DataStructureGrammarParser.INT, i);
		}
		public TerminalNode RPAREN() { return getToken(DataStructureGrammarParser.RPAREN, 0); }
		public TerminalNode STRING() { return getToken(DataStructureGrammarParser.STRING, 0); }
		public TerminalNode ID() { return getToken(DataStructureGrammarParser.ID, 0); }
		public GenerateWithMutatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generateWithMutators; }
	}

	public final GenerateWithMutatorsContext generateWithMutators() throws RecognitionException {
		GenerateWithMutatorsContext _localctx = new GenerateWithMutatorsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_generateWithMutators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(GENERATE_WITH_MUTATORS);
			setState(148);
			match(LPAREN);
			setState(149);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(150);
			match(COMMA);
			setState(151);
			array();
			setState(152);
			match(COMMA);
			setState(153);
			match(INT);
			setState(154);
			match(COMMA);
			setState(155);
			match(INT);
			setState(156);
			match(COMMA);
			setState(157);
			match(INT);
			setState(158);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequirePluginContext extends ParserRuleContext {
		public TerminalNode REQUIRE_PLUGIN() { return getToken(DataStructureGrammarParser.REQUIRE_PLUGIN, 0); }
		public TerminalNode LPAREN() { return getToken(DataStructureGrammarParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(DataStructureGrammarParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(DataStructureGrammarParser.RPAREN, 0); }
		public RequirePluginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirePlugin; }
	}

	public final RequirePluginContext requirePlugin() throws RecognitionException {
		RequirePluginContext _localctx = new RequirePluginContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_requirePlugin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(REQUIRE_PLUGIN);
			setState(161);
			match(LPAREN);
			setState(162);
			match(STRING);
			setState(163);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetDefaultContext extends ParserRuleContext {
		public TerminalNode SET_DEFAULT() { return getToken(DataStructureGrammarParser.SET_DEFAULT, 0); }
		public TerminalNode LPAREN() { return getToken(DataStructureGrammarParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(DataStructureGrammarParser.STRING, 0); }
		public TerminalNode COMMA() { return getToken(DataStructureGrammarParser.COMMA, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DataStructureGrammarParser.RPAREN, 0); }
		public SetDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setDefault; }
	}

	public final SetDefaultContext setDefault() throws RecognitionException {
		SetDefaultContext _localctx = new SetDefaultContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_setDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(SET_DEFAULT);
			setState(166);
			match(LPAREN);
			setState(167);
			match(STRING);
			setState(168);
			match(COMMA);
			setState(169);
			array();
			setState(170);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u00af\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2"+
		"$\n\2\r\2\16\2%\3\2\3\2\3\3\3\3\3\4\3\4\5\4.\n\4\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6<\n\6\3\7\3\7\3\7\3\7\7\7B\n\7\f\7\16\7"+
		"E\13\7\5\7G\n\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\tk\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tu\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \2\5\4\2\21\21\34\37\4\2\34\34\37\37\4\2\34"+
		"\34\36\36\2\u00b3\2#\3\2\2\2\4)\3\2\2\2\6-\3\2\2\2\b\61\3\2\2\2\n;\3\2"+
		"\2\2\f=\3\2\2\2\16J\3\2\2\2\20t\3\2\2\2\22v\3\2\2\2\24}\3\2\2\2\26\u0082"+
		"\3\2\2\2\30\u0087\3\2\2\2\32\u008e\3\2\2\2\34\u0095\3\2\2\2\36\u00a2\3"+
		"\2\2\2 \u00a7\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2"+
		"\2\2&\'\3\2\2\2\'(\7\2\2\3(\3\3\2\2\2)*\5\6\4\2*\5\3\2\2\2+.\5\20\t\2"+
		",.\5\b\5\2-+\3\2\2\2-,\3\2\2\2./\3\2\2\2/\60\7\63\2\2\60\7\3\2\2\2\61"+
		"\62\5\n\6\2\62\t\3\2\2\2\63<\5\22\n\2\64<\5\36\20\2\65<\5\24\13\2\66<"+
		"\5\30\r\2\67<\5\32\16\28<\5\34\17\29<\5 \21\2:<\5\26\f\2;\63\3\2\2\2;"+
		"\64\3\2\2\2;\65\3\2\2\2;\66\3\2\2\2;\67\3\2\2\2;8\3\2\2\2;9\3\2\2\2;:"+
		"\3\2\2\2<\13\3\2\2\2=F\7\61\2\2>C\5\16\b\2?@\7*\2\2@B\5\16\b\2A?\3\2\2"+
		"\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DG\3\2\2\2EC\3\2\2\2F>\3\2\2\2FG\3\2\2"+
		"\2GH\3\2\2\2HI\7\62\2\2I\r\3\2\2\2JK\t\2\2\2K\17\3\2\2\2LM\7\5\2\2MN\7"+
		"\34\2\2NO\7 \2\2Ou\7\37\2\2PQ\7\4\2\2QR\7\34\2\2RS\7 \2\2Su\7\35\2\2T"+
		"U\7\3\2\2UV\7\34\2\2VW\7 \2\2Wu\7\21\2\2XY\7\7\2\2YZ\7\34\2\2Z[\7 \2\2"+
		"[u\7\37\2\2\\]\7\6\2\2]^\7\34\2\2^_\7 \2\2_u\7\37\2\2`a\7\n\2\2ab\7\34"+
		"\2\2bc\7 \2\2cu\7\36\2\2de\7\b\2\2ef\7\34\2\2fj\7 \2\2gk\5\24\13\2hk\5"+
		"\30\r\2ik\5\26\f\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2ku\3\2\2\2lm\7\t\2\2m"+
		"n\7\34\2\2no\7 \2\2ou\5\22\n\2pq\7\13\2\2qr\7\34\2\2rs\7 \2\2su\5\f\7"+
		"\2tL\3\2\2\2tP\3\2\2\2tT\3\2\2\2tX\3\2\2\2t\\\3\2\2\2t`\3\2\2\2td\3\2"+
		"\2\2tl\3\2\2\2tp\3\2\2\2u\21\3\2\2\2vw\7\24\2\2wx\7-\2\2xy\7\37\2\2yz"+
		"\7*\2\2z{\t\3\2\2{|\7.\2\2|\23\3\2\2\2}~\7\26\2\2~\177\7-\2\2\177\u0080"+
		"\7\37\2\2\u0080\u0081\7.\2\2\u0081\25\3\2\2\2\u0082\u0083\7\33\2\2\u0083"+
		"\u0084\7-\2\2\u0084\u0085\7\37\2\2\u0085\u0086\7.\2\2\u0086\27\3\2\2\2"+
		"\u0087\u0088\7\27\2\2\u0088\u0089\7-\2\2\u0089\u008a\7\37\2\2\u008a\u008b"+
		"\7*\2\2\u008b\u008c\t\4\2\2\u008c\u008d\7.\2\2\u008d\31\3\2\2\2\u008e"+
		"\u008f\7\30\2\2\u008f\u0090\7-\2\2\u0090\u0091\t\3\2\2\u0091\u0092\7*"+
		"\2\2\u0092\u0093\7\35\2\2\u0093\u0094\7.\2\2\u0094\33\3\2\2\2\u0095\u0096"+
		"\7\31\2\2\u0096\u0097\7-\2\2\u0097\u0098\t\3\2\2\u0098\u0099\7*\2\2\u0099"+
		"\u009a\5\f\7\2\u009a\u009b\7*\2\2\u009b\u009c\7\35\2\2\u009c\u009d\7*"+
		"\2\2\u009d\u009e\7\35\2\2\u009e\u009f\7*\2\2\u009f\u00a0\7\35\2\2\u00a0"+
		"\u00a1\7.\2\2\u00a1\35\3\2\2\2\u00a2\u00a3\7\25\2\2\u00a3\u00a4\7-\2\2"+
		"\u00a4\u00a5\7\37\2\2\u00a5\u00a6\7.\2\2\u00a6\37\3\2\2\2\u00a7\u00a8"+
		"\7\32\2\2\u00a8\u00a9\7-\2\2\u00a9\u00aa\7\37\2\2\u00aa\u00ab\7*\2\2\u00ab"+
		"\u00ac\5\f\7\2\u00ac\u00ad\7.\2\2\u00ad!\3\2\2\2\t%-;CFjt";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}