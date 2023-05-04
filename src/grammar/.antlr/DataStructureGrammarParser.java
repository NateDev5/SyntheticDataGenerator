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
		MUTATOR_TYPE=6, INTERFACE_TYPE=7, FLOAT_TYPE=8, IF=9, ELSE=10, WHILE=11, 
		PRINT=12, FUNCTION=13, BOOL=14, TRUE=15, FALSE=16, CREATE_INTERFACE=17, 
		REQUIRE_PLUGIN=18, CREATE_MUTATOR=19, CREATE_WEIGHTED_MUTATOR=20, GENERATE=21, 
		GENERATE_WITH_MUTATORS=22, ID=23, INT=24, FLOAT=25, STRING=26, SET=27, 
		PLUS=28, MINUS=29, TIMES=30, DIVIDE=31, GT=32, GE=33, LT=34, LE=35, EQ=36, 
		COMMA=37, NE=38, ASSIGN=39, LPAREN=40, RPAREN=41, LBRACE=42, RBRACE=43, 
		LSQRBRAKET=44, RSQRBRAKET=45, SEMICOLON=46, COLON=47, DOUBLEQUOTE=48, 
		COMMENT=49, WS=50, ARRAY_TYPE=51;
	public static final int
		RULE_program = 0, RULE_syntax = 1, RULE_declaration = 2, RULE_statements = 3, 
		RULE_functions = 4, RULE_array = 5, RULE_any = 6, RULE_variables = 7, 
		RULE_createInterface = 8, RULE_createMutator = 9, RULE_createWeightedMutator = 10, 
		RULE_generate = 11, RULE_generateWithMutators = 12, RULE_requirePlugin = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "syntax", "declaration", "statements", "functions", "array", 
			"any", "variables", "createInterface", "createMutator", "createWeightedMutator", 
			"generate", "generateWithMutators", "requirePlugin"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bool'", "'int'", "'string'", "'jsonfile'", "'path'", "'mutator'", 
			"'interface'", "'float'", "'if'", "'else'", "'while'", "'print'", "'func'", 
			null, null, null, "'CREATE_INTERFACE'", "'REQUIRE_PLUGIN'", "'CREATE_MUTATOR'", 
			"'CREATE_WEIGHTED_MUTATOR'", "'GENERATE'", "'GENERATE_WITH_MUTATORS'", 
			null, null, null, null, "'->'", "'+'", "'-'", "'*'", "'/'", "'>'", "'>='", 
			"'<'", "'<='", "'=='", "','", "'!='", "'='", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "';'", "':'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOL_TYPE", "INT_TYPE", "STRING_TYPE", "JSONFILE_TYPE", "PATH_TYPE", 
			"MUTATOR_TYPE", "INTERFACE_TYPE", "FLOAT_TYPE", "IF", "ELSE", "WHILE", 
			"PRINT", "FUNCTION", "BOOL", "TRUE", "FALSE", "CREATE_INTERFACE", "REQUIRE_PLUGIN", 
			"CREATE_MUTATOR", "CREATE_WEIGHTED_MUTATOR", "GENERATE", "GENERATE_WITH_MUTATORS", 
			"ID", "INT", "FLOAT", "STRING", "SET", "PLUS", "MINUS", "TIMES", "DIVIDE", 
			"GT", "GE", "LT", "LE", "EQ", "COMMA", "NE", "ASSIGN", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LSQRBRAKET", "RSQRBRAKET", "SEMICOLON", "COLON", 
			"DOUBLEQUOTE", "COMMENT", "WS", "ARRAY_TYPE"
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
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				syntax();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL_TYPE) | (1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << JSONFILE_TYPE) | (1L << PATH_TYPE) | (1L << MUTATOR_TYPE) | (1L << INTERFACE_TYPE) | (1L << FLOAT_TYPE) | (1L << CREATE_INTERFACE) | (1L << REQUIRE_PLUGIN) | (1L << CREATE_MUTATOR) | (1L << CREATE_WEIGHTED_MUTATOR) | (1L << GENERATE) | (1L << GENERATE_WITH_MUTATORS) | (1L << ARRAY_TYPE))) != 0) );
			setState(33);
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
			setState(35);
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
			setState(39);
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
				setState(37);
				variables();
				}
				break;
			case CREATE_INTERFACE:
			case REQUIRE_PLUGIN:
			case CREATE_MUTATOR:
			case CREATE_WEIGHTED_MUTATOR:
			case GENERATE:
			case GENERATE_WITH_MUTATORS:
				{
				setState(38);
				statements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(41);
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
			setState(43);
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
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functions);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE_INTERFACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				createInterface();
				}
				break;
			case REQUIRE_PLUGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				requirePlugin();
				}
				break;
			case CREATE_MUTATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				createMutator();
				}
				break;
			case CREATE_WEIGHTED_MUTATOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				createWeightedMutator();
				}
				break;
			case GENERATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				generate();
				}
				break;
			case GENERATE_WITH_MUTATORS:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				generateWithMutators();
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
			setState(53);
			match(LSQRBRAKET);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(54);
				any();
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(55);
					match(COMMA);
					setState(56);
					any();
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(64);
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
			setState(66);
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
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(STRING_TYPE);
				setState(69);
				match(ID);
				setState(70);
				match(SET);
				setState(71);
				match(STRING);
				}
				break;
			case INT_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(INT_TYPE);
				setState(73);
				match(ID);
				setState(74);
				match(SET);
				setState(75);
				match(INT);
				}
				break;
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(BOOL_TYPE);
				setState(77);
				match(ID);
				setState(78);
				match(SET);
				setState(79);
				match(BOOL);
				}
				break;
			case PATH_TYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				match(PATH_TYPE);
				setState(81);
				match(ID);
				setState(82);
				match(SET);
				setState(83);
				match(STRING);
				}
				break;
			case JSONFILE_TYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				match(JSONFILE_TYPE);
				setState(85);
				match(ID);
				setState(86);
				match(SET);
				setState(87);
				match(STRING);
				}
				break;
			case FLOAT_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				match(FLOAT_TYPE);
				setState(89);
				match(ID);
				setState(90);
				match(SET);
				setState(91);
				match(FLOAT);
				}
				break;
			case MUTATOR_TYPE:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				match(MUTATOR_TYPE);
				setState(93);
				match(ID);
				setState(94);
				match(SET);
				setState(97);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CREATE_MUTATOR:
					{
					setState(95);
					createMutator();
					}
					break;
				case CREATE_WEIGHTED_MUTATOR:
					{
					setState(96);
					createWeightedMutator();
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
				setState(99);
				match(INTERFACE_TYPE);
				setState(100);
				match(ID);
				setState(101);
				match(SET);
				{
				setState(102);
				createInterface();
				}
				}
				break;
			case ARRAY_TYPE:
				enterOuterAlt(_localctx, 9);
				{
				setState(103);
				match(ARRAY_TYPE);
				setState(104);
				match(ID);
				setState(105);
				match(SET);
				setState(106);
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
			setState(109);
			match(CREATE_INTERFACE);
			setState(110);
			match(LPAREN);
			setState(111);
			match(STRING);
			setState(112);
			match(COMMA);
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(114);
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
		public TerminalNode COMMA() { return getToken(DataStructureGrammarParser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(DataStructureGrammarParser.RPAREN, 0); }
		public TerminalNode FLOAT() { return getToken(DataStructureGrammarParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(DataStructureGrammarParser.ID, 0); }
		public CreateMutatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createMutator; }
	}

	public final CreateMutatorContext createMutator() throws RecognitionException {
		CreateMutatorContext _localctx = new CreateMutatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_createMutator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(CREATE_MUTATOR);
			setState(117);
			match(LPAREN);
			setState(118);
			match(STRING);
			setState(119);
			match(COMMA);
			setState(120);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==FLOAT) ) {
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
		enterRule(_localctx, 20, RULE_createWeightedMutator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(CREATE_WEIGHTED_MUTATOR);
			setState(124);
			match(LPAREN);
			setState(125);
			match(STRING);
			setState(126);
			match(COMMA);
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(128);
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
		enterRule(_localctx, 22, RULE_generate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(GENERATE);
			setState(131);
			match(LPAREN);
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(133);
			match(COMMA);
			setState(134);
			match(INT);
			setState(135);
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
		public TerminalNode INT() { return getToken(DataStructureGrammarParser.INT, 0); }
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
		enterRule(_localctx, 24, RULE_generateWithMutators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(GENERATE_WITH_MUTATORS);
			setState(138);
			match(LPAREN);
			setState(139);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(140);
			match(COMMA);
			setState(141);
			array();
			setState(142);
			match(COMMA);
			setState(143);
			match(INT);
			setState(144);
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
		enterRule(_localctx, 26, RULE_requirePlugin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(REQUIRE_PLUGIN);
			setState(147);
			match(LPAREN);
			setState(148);
			match(STRING);
			setState(149);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u009a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\5\4*\n\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\66\n\6\3\7\3\7\3\7\3\7\7\7<\n\7\f\7\16\7?\13\7\5\7A\n\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\td\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\tn\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\5\4\2"+
		"\20\20\31\34\4\2\31\31\34\34\4\2\31\31\33\33\2\u009d\2\37\3\2\2\2\4%\3"+
		"\2\2\2\6)\3\2\2\2\b-\3\2\2\2\n\65\3\2\2\2\f\67\3\2\2\2\16D\3\2\2\2\20"+
		"m\3\2\2\2\22o\3\2\2\2\24v\3\2\2\2\26}\3\2\2\2\30\u0084\3\2\2\2\32\u008b"+
		"\3\2\2\2\34\u0094\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2"+
		"\2\2!\"\3\2\2\2\"#\3\2\2\2#$\7\2\2\3$\3\3\2\2\2%&\5\6\4\2&\5\3\2\2\2\'"+
		"*\5\20\t\2(*\5\b\5\2)\'\3\2\2\2)(\3\2\2\2*+\3\2\2\2+,\7\60\2\2,\7\3\2"+
		"\2\2-.\5\n\6\2.\t\3\2\2\2/\66\5\22\n\2\60\66\5\34\17\2\61\66\5\24\13\2"+
		"\62\66\5\26\f\2\63\66\5\30\r\2\64\66\5\32\16\2\65/\3\2\2\2\65\60\3\2\2"+
		"\2\65\61\3\2\2\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\13\3\2\2"+
		"\2\67@\7.\2\28=\5\16\b\29:\7\'\2\2:<\5\16\b\2;9\3\2\2\2<?\3\2\2\2=;\3"+
		"\2\2\2=>\3\2\2\2>A\3\2\2\2?=\3\2\2\2@8\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7"+
		"/\2\2C\r\3\2\2\2DE\t\2\2\2E\17\3\2\2\2FG\7\5\2\2GH\7\31\2\2HI\7\35\2\2"+
		"In\7\34\2\2JK\7\4\2\2KL\7\31\2\2LM\7\35\2\2Mn\7\32\2\2NO\7\3\2\2OP\7\31"+
		"\2\2PQ\7\35\2\2Qn\7\20\2\2RS\7\7\2\2ST\7\31\2\2TU\7\35\2\2Un\7\34\2\2"+
		"VW\7\6\2\2WX\7\31\2\2XY\7\35\2\2Yn\7\34\2\2Z[\7\n\2\2[\\\7\31\2\2\\]\7"+
		"\35\2\2]n\7\33\2\2^_\7\b\2\2_`\7\31\2\2`c\7\35\2\2ad\5\24\13\2bd\5\26"+
		"\f\2ca\3\2\2\2cb\3\2\2\2dn\3\2\2\2ef\7\t\2\2fg\7\31\2\2gh\7\35\2\2hn\5"+
		"\22\n\2ij\7\65\2\2jk\7\31\2\2kl\7\35\2\2ln\5\f\7\2mF\3\2\2\2mJ\3\2\2\2"+
		"mN\3\2\2\2mR\3\2\2\2mV\3\2\2\2mZ\3\2\2\2m^\3\2\2\2me\3\2\2\2mi\3\2\2\2"+
		"n\21\3\2\2\2op\7\23\2\2pq\7*\2\2qr\7\34\2\2rs\7\'\2\2st\t\3\2\2tu\7+\2"+
		"\2u\23\3\2\2\2vw\7\25\2\2wx\7*\2\2xy\7\34\2\2yz\7\'\2\2z{\t\4\2\2{|\7"+
		"+\2\2|\25\3\2\2\2}~\7\26\2\2~\177\7*\2\2\177\u0080\7\34\2\2\u0080\u0081"+
		"\7\'\2\2\u0081\u0082\t\4\2\2\u0082\u0083\7+\2\2\u0083\27\3\2\2\2\u0084"+
		"\u0085\7\27\2\2\u0085\u0086\7*\2\2\u0086\u0087\t\3\2\2\u0087\u0088\7\'"+
		"\2\2\u0088\u0089\7\32\2\2\u0089\u008a\7+\2\2\u008a\31\3\2\2\2\u008b\u008c"+
		"\7\30\2\2\u008c\u008d\7*\2\2\u008d\u008e\t\3\2\2\u008e\u008f\7\'\2\2\u008f"+
		"\u0090\5\f\7\2\u0090\u0091\7\'\2\2\u0091\u0092\7\32\2\2\u0092\u0093\7"+
		"+\2\2\u0093\33\3\2\2\2\u0094\u0095\7\24\2\2\u0095\u0096\7*\2\2\u0096\u0097"+
		"\7\34\2\2\u0097\u0098\7+\2\2\u0098\35\3\2\2\2\t!)\65=@cm";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}