// Generated from d:\Nate\Nodejs\SyntheticDataGenerator\src\grammar\DataStructureGrammarLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DataStructureGrammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NOT", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
			"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "LETTERS", 
			"DIGITS", "JSON", "BOOL_TYPE", "INT_TYPE", "STRING_TYPE", "JSONFILE_TYPE", 
			"PATH_TYPE", "MUTATOR_TYPE", "INTERFACE_TYPE", "FLOAT_TYPE", "ARRAY_TYPE", 
			"IF", "ELSE", "WHILE", "PRINT", "FUNCTION", "BOOL", "TRUE", "FALSE", 
			"CREATE_INTERFACE", "REQUIRE_PLUGIN", "CREATE_MUTATOR", "CREATE_WEIGHTED_MUTATOR", 
			"GENERATE", "GENERATE_WITH_MUTATORS", "SET_DEFAULT", "CREATE_RANGE_MUTATOR", 
			"ID", "INT", "FLOAT", "STRING", "SET", "PLUS", "MINUS", "TIMES", "DIVIDE", 
			"GT", "GE", "LT", "LE", "EQ", "COMMA", "NE", "ASSIGN", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LSQRBRAKET", "RSQRBRAKET", "SEMICOLON", "COLON", 
			"DOUBLEQUOTE", "COMMENT", "WS"
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


	public DataStructureGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DataStructureGrammarLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u0245\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3("+
		"\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-"+
		"\3-\3-\3-\3-\3.\3.\5.\u0141\n.\3/\3/\3/\3/\3/\5/\u0148\n/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\5\60\u0150\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\39\39\79\u01dc\n9\f9\169\u01df"+
		"\139\3:\5:\u01e2\n:\3:\6:\u01e5\n:\r:\16:\u01e6\3;\5;\u01ea\n;\3;\7;\u01ed"+
		"\n;\f;\16;\u01f0\13;\3;\3;\6;\u01f4\n;\r;\16;\u01f5\3<\3<\3<\3<\3<\3<"+
		"\7<\u01fe\n<\f<\16<\u0201\13<\3<\3<\3=\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3"+
		"B\3B\3C\3C\3C\3D\3D\3E\3E\3E\3F\3F\3F\3G\3G\3H\3H\3H\3I\3I\3J\3J\3K\3"+
		"K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\7S\u0238\nS\fS\16S\u023b"+
		"\13S\3S\3S\3T\6T\u0240\nT\rT\16T\u0241\3T\3T\2\2U\3\2\5\2\7\2\t\2\13\2"+
		"\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-"+
		"\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\3A\4C\5E\6G\7I\bK\tM\nO\13Q\fS\rU"+
		"\16W\17Y\20[\21]\22_\23a\24c\25e\26g\27i\30k\31m\32o\33q\34s\35u\36w\37"+
		"y {!}\"\177#\u0081$\u0083%\u0085&\u0087\'\u0089(\u008b)\u008d*\u008f+"+
		"\u0091,\u0093-\u0095.\u0097/\u0099\60\u009b\61\u009d\62\u009f\63\u00a1"+
		"\64\u00a3\65\u00a5\66\u00a7\67\3\2\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4"+
		"\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOo"+
		"o\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2"+
		"XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2C\\c|\3\2\62;\6\2\62;C\\aac"+
		"|\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\16\17\"\"\2\u0233\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s"+
		"\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\3\u00a9\3\2\2\2\5\u00ab\3\2\2"+
		"\2\7\u00ad\3\2\2\2\t\u00af\3\2\2\2\13\u00b1\3\2\2\2\r\u00b3\3\2\2\2\17"+
		"\u00b5\3\2\2\2\21\u00b7\3\2\2\2\23\u00b9\3\2\2\2\25\u00bb\3\2\2\2\27\u00bd"+
		"\3\2\2\2\31\u00bf\3\2\2\2\33\u00c1\3\2\2\2\35\u00c3\3\2\2\2\37\u00c5\3"+
		"\2\2\2!\u00c7\3\2\2\2#\u00c9\3\2\2\2%\u00cb\3\2\2\2\'\u00cd\3\2\2\2)\u00cf"+
		"\3\2\2\2+\u00d1\3\2\2\2-\u00d3\3\2\2\2/\u00d5\3\2\2\2\61\u00d7\3\2\2\2"+
		"\63\u00d9\3\2\2\2\65\u00db\3\2\2\2\67\u00dd\3\2\2\29\u00df\3\2\2\2;\u00e1"+
		"\3\2\2\2=\u00e3\3\2\2\2?\u00e9\3\2\2\2A\u00ee\3\2\2\2C\u00f2\3\2\2\2E"+
		"\u00f9\3\2\2\2G\u0102\3\2\2\2I\u0107\3\2\2\2K\u010f\3\2\2\2M\u0119\3\2"+
		"\2\2O\u011f\3\2\2\2Q\u0125\3\2\2\2S\u0128\3\2\2\2U\u012d\3\2\2\2W\u0133"+
		"\3\2\2\2Y\u0139\3\2\2\2[\u0140\3\2\2\2]\u0147\3\2\2\2_\u014f\3\2\2\2a"+
		"\u0151\3\2\2\2c\u0162\3\2\2\2e\u0171\3\2\2\2g\u0180\3\2\2\2i\u0198\3\2"+
		"\2\2k\u01a1\3\2\2\2m\u01b8\3\2\2\2o\u01c4\3\2\2\2q\u01d9\3\2\2\2s\u01e1"+
		"\3\2\2\2u\u01e9\3\2\2\2w\u01f7\3\2\2\2y\u0204\3\2\2\2{\u0207\3\2\2\2}"+
		"\u0209\3\2\2\2\177\u020b\3\2\2\2\u0081\u020d\3\2\2\2\u0083\u020f\3\2\2"+
		"\2\u0085\u0211\3\2\2\2\u0087\u0214\3\2\2\2\u0089\u0216\3\2\2\2\u008b\u0219"+
		"\3\2\2\2\u008d\u021c\3\2\2\2\u008f\u021e\3\2\2\2\u0091\u0221\3\2\2\2\u0093"+
		"\u0223\3\2\2\2\u0095\u0225\3\2\2\2\u0097\u0227\3\2\2\2\u0099\u0229\3\2"+
		"\2\2\u009b\u022b\3\2\2\2\u009d\u022d\3\2\2\2\u009f\u022f\3\2\2\2\u00a1"+
		"\u0231\3\2\2\2\u00a3\u0233\3\2\2\2\u00a5\u0235\3\2\2\2\u00a7\u023f\3\2"+
		"\2\2\u00a9\u00aa\7#\2\2\u00aa\4\3\2\2\2\u00ab\u00ac\t\2\2\2\u00ac\6\3"+
		"\2\2\2\u00ad\u00ae\t\3\2\2\u00ae\b\3\2\2\2\u00af\u00b0\t\4\2\2\u00b0\n"+
		"\3\2\2\2\u00b1\u00b2\t\5\2\2\u00b2\f\3\2\2\2\u00b3\u00b4\t\6\2\2\u00b4"+
		"\16\3\2\2\2\u00b5\u00b6\t\7\2\2\u00b6\20\3\2\2\2\u00b7\u00b8\t\b\2\2\u00b8"+
		"\22\3\2\2\2\u00b9\u00ba\t\t\2\2\u00ba\24\3\2\2\2\u00bb\u00bc\t\n\2\2\u00bc"+
		"\26\3\2\2\2\u00bd\u00be\t\13\2\2\u00be\30\3\2\2\2\u00bf\u00c0\t\f\2\2"+
		"\u00c0\32\3\2\2\2\u00c1\u00c2\t\r\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\t\16"+
		"\2\2\u00c4\36\3\2\2\2\u00c5\u00c6\t\17\2\2\u00c6 \3\2\2\2\u00c7\u00c8"+
		"\t\20\2\2\u00c8\"\3\2\2\2\u00c9\u00ca\t\21\2\2\u00ca$\3\2\2\2\u00cb\u00cc"+
		"\t\22\2\2\u00cc&\3\2\2\2\u00cd\u00ce\t\23\2\2\u00ce(\3\2\2\2\u00cf\u00d0"+
		"\t\24\2\2\u00d0*\3\2\2\2\u00d1\u00d2\t\25\2\2\u00d2,\3\2\2\2\u00d3\u00d4"+
		"\t\26\2\2\u00d4.\3\2\2\2\u00d5\u00d6\t\27\2\2\u00d6\60\3\2\2\2\u00d7\u00d8"+
		"\t\30\2\2\u00d8\62\3\2\2\2\u00d9\u00da\t\31\2\2\u00da\64\3\2\2\2\u00db"+
		"\u00dc\t\32\2\2\u00dc\66\3\2\2\2\u00dd\u00de\t\33\2\2\u00de8\3\2\2\2\u00df"+
		"\u00e0\t\34\2\2\u00e0:\3\2\2\2\u00e1\u00e2\t\35\2\2\u00e2<\3\2\2\2\u00e3"+
		"\u00e4\7\60\2\2\u00e4\u00e5\7l\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7q\2"+
		"\2\u00e7\u00e8\7p\2\2\u00e8>\3\2\2\2\u00e9\u00ea\7d\2\2\u00ea\u00eb\7"+
		"q\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7n\2\2\u00ed@\3\2\2\2\u00ee\u00ef"+
		"\7k\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7v\2\2\u00f1B\3\2\2\2\u00f2\u00f3"+
		"\7u\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7k\2\2\u00f6"+
		"\u00f7\7p\2\2\u00f7\u00f8\7i\2\2\u00f8D\3\2\2\2\u00f9\u00fa\7l\2\2\u00fa"+
		"\u00fb\7u\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7h\2\2"+
		"\u00fe\u00ff\7k\2\2\u00ff\u0100\7n\2\2\u0100\u0101\7g\2\2\u0101F\3\2\2"+
		"\2\u0102\u0103\7r\2\2\u0103\u0104\7c\2\2\u0104\u0105\7v\2\2\u0105\u0106"+
		"\7j\2\2\u0106H\3\2\2\2\u0107\u0108\7o\2\2\u0108\u0109\7w\2\2\u0109\u010a"+
		"\7v\2\2\u010a\u010b\7c\2\2\u010b\u010c\7v\2\2\u010c\u010d\7q\2\2\u010d"+
		"\u010e\7t\2\2\u010eJ\3\2\2\2\u010f\u0110\7k\2\2\u0110\u0111\7p\2\2\u0111"+
		"\u0112\7v\2\2\u0112\u0113\7g\2\2\u0113\u0114\7t\2\2\u0114\u0115\7h\2\2"+
		"\u0115\u0116\7c\2\2\u0116\u0117\7e\2\2\u0117\u0118\7g\2\2\u0118L\3\2\2"+
		"\2\u0119\u011a\7h\2\2\u011a\u011b\7n\2\2\u011b\u011c\7q\2\2\u011c\u011d"+
		"\7c\2\2\u011d\u011e\7v\2\2\u011eN\3\2\2\2\u011f\u0120\7c\2\2\u0120\u0121"+
		"\7t\2\2\u0121\u0122\7t\2\2\u0122\u0123\7c\2\2\u0123\u0124\7{\2\2\u0124"+
		"P\3\2\2\2\u0125\u0126\7k\2\2\u0126\u0127\7h\2\2\u0127R\3\2\2\2\u0128\u0129"+
		"\7g\2\2\u0129\u012a\7n\2\2\u012a\u012b\7u\2\2\u012b\u012c\7g\2\2\u012c"+
		"T\3\2\2\2\u012d\u012e\7y\2\2\u012e\u012f\7j\2\2\u012f\u0130\7k\2\2\u0130"+
		"\u0131\7n\2\2\u0131\u0132\7g\2\2\u0132V\3\2\2\2\u0133\u0134\7r\2\2\u0134"+
		"\u0135\7t\2\2\u0135\u0136\7k\2\2\u0136\u0137\7p\2\2\u0137\u0138\7v\2\2"+
		"\u0138X\3\2\2\2\u0139\u013a\7h\2\2\u013a\u013b\7w\2\2\u013b\u013c\7p\2"+
		"\2\u013c\u013d\7e\2\2\u013dZ\3\2\2\2\u013e\u0141\5]/\2\u013f\u0141\5_"+
		"\60\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141\\\3\2\2\2\u0142\u0143"+
		"\7v\2\2\u0143\u0144\7t\2\2\u0144\u0145\7w\2\2\u0145\u0148\7g\2\2\u0146"+
		"\u0148\7\62\2\2\u0147\u0142\3\2\2\2\u0147\u0146\3\2\2\2\u0148^\3\2\2\2"+
		"\u0149\u014a\7h\2\2\u014a\u014b\7c\2\2\u014b\u014c\7n\2\2\u014c\u014d"+
		"\7u\2\2\u014d\u0150\7g\2\2\u014e\u0150\7\63\2\2\u014f\u0149\3\2\2\2\u014f"+
		"\u014e\3\2\2\2\u0150`\3\2\2\2\u0151\u0152\7E\2\2\u0152\u0153\7T\2\2\u0153"+
		"\u0154\7G\2\2\u0154\u0155\7C\2\2\u0155\u0156\7V\2\2\u0156\u0157\7G\2\2"+
		"\u0157\u0158\7a\2\2\u0158\u0159\7K\2\2\u0159\u015a\7P\2\2\u015a\u015b"+
		"\7V\2\2\u015b\u015c\7G\2\2\u015c\u015d\7T\2\2\u015d\u015e\7H\2\2\u015e"+
		"\u015f\7C\2\2\u015f\u0160\7E\2\2\u0160\u0161\7G\2\2\u0161b\3\2\2\2\u0162"+
		"\u0163\7T\2\2\u0163\u0164\7G\2\2\u0164\u0165\7S\2\2\u0165\u0166\7W\2\2"+
		"\u0166\u0167\7K\2\2\u0167\u0168\7T\2\2\u0168\u0169\7G\2\2\u0169\u016a"+
		"\7a\2\2\u016a\u016b\7R\2\2\u016b\u016c\7N\2\2\u016c\u016d\7W\2\2\u016d"+
		"\u016e\7I\2\2\u016e\u016f\7K\2\2\u016f\u0170\7P\2\2\u0170d\3\2\2\2\u0171"+
		"\u0172\7E\2\2\u0172\u0173\7T\2\2\u0173\u0174\7G\2\2\u0174\u0175\7C\2\2"+
		"\u0175\u0176\7V\2\2\u0176\u0177\7G\2\2\u0177\u0178\7a\2\2\u0178\u0179"+
		"\7O\2\2\u0179\u017a\7W\2\2\u017a\u017b\7V\2\2\u017b\u017c\7C\2\2\u017c"+
		"\u017d\7V\2\2\u017d\u017e\7Q\2\2\u017e\u017f\7T\2\2\u017ff\3\2\2\2\u0180"+
		"\u0181\7E\2\2\u0181\u0182\7T\2\2\u0182\u0183\7G\2\2\u0183\u0184\7C\2\2"+
		"\u0184\u0185\7V\2\2\u0185\u0186\7G\2\2\u0186\u0187\7a\2\2\u0187\u0188"+
		"\7Y\2\2\u0188\u0189\7G\2\2\u0189\u018a\7K\2\2\u018a\u018b\7I\2\2\u018b"+
		"\u018c\7J\2\2\u018c\u018d\7V\2\2\u018d\u018e\7G\2\2\u018e\u018f\7F\2\2"+
		"\u018f\u0190\7a\2\2\u0190\u0191\7O\2\2\u0191\u0192\7W\2\2\u0192\u0193"+
		"\7V\2\2\u0193\u0194\7C\2\2\u0194\u0195\7V\2\2\u0195\u0196\7Q\2\2\u0196"+
		"\u0197\7T\2\2\u0197h\3\2\2\2\u0198\u0199\7I\2\2\u0199\u019a\7G\2\2\u019a"+
		"\u019b\7P\2\2\u019b\u019c\7G\2\2\u019c\u019d\7T\2\2\u019d\u019e\7C\2\2"+
		"\u019e\u019f\7V\2\2\u019f\u01a0\7G\2\2\u01a0j\3\2\2\2\u01a1\u01a2\7I\2"+
		"\2\u01a2\u01a3\7G\2\2\u01a3\u01a4\7P\2\2\u01a4\u01a5\7G\2\2\u01a5\u01a6"+
		"\7T\2\2\u01a6\u01a7\7C\2\2\u01a7\u01a8\7V\2\2\u01a8\u01a9\7G\2\2\u01a9"+
		"\u01aa\7a\2\2\u01aa\u01ab\7Y\2\2\u01ab\u01ac\7K\2\2\u01ac\u01ad\7V\2\2"+
		"\u01ad\u01ae\7J\2\2\u01ae\u01af\7a\2\2\u01af\u01b0\7O\2\2\u01b0\u01b1"+
		"\7W\2\2\u01b1\u01b2\7V\2\2\u01b2\u01b3\7C\2\2\u01b3\u01b4\7V\2\2\u01b4"+
		"\u01b5\7Q\2\2\u01b5\u01b6\7T\2\2\u01b6\u01b7\7U\2\2\u01b7l\3\2\2\2\u01b8"+
		"\u01b9\7U\2\2\u01b9\u01ba\7G\2\2\u01ba\u01bb\7V\2\2\u01bb\u01bc\7a\2\2"+
		"\u01bc\u01bd\7F\2\2\u01bd\u01be\7G\2\2\u01be\u01bf\7H\2\2\u01bf\u01c0"+
		"\7C\2\2\u01c0\u01c1\7W\2\2\u01c1\u01c2\7N\2\2\u01c2\u01c3\7V\2\2\u01c3"+
		"n\3\2\2\2\u01c4\u01c5\7E\2\2\u01c5\u01c6\7T\2\2\u01c6\u01c7\7G\2\2\u01c7"+
		"\u01c8\7C\2\2\u01c8\u01c9\7V\2\2\u01c9\u01ca\7G\2\2\u01ca\u01cb\7a\2\2"+
		"\u01cb\u01cc\7T\2\2\u01cc\u01cd\7C\2\2\u01cd\u01ce\7P\2\2\u01ce\u01cf"+
		"\7I\2\2\u01cf\u01d0\7G\2\2\u01d0\u01d1\7a\2\2\u01d1\u01d2\7O\2\2\u01d2"+
		"\u01d3\7W\2\2\u01d3\u01d4\7V\2\2\u01d4\u01d5\7C\2\2\u01d5\u01d6\7V\2\2"+
		"\u01d6\u01d7\7Q\2\2\u01d7\u01d8\7T\2\2\u01d8p\3\2\2\2\u01d9\u01dd\t\34"+
		"\2\2\u01da\u01dc\t\36\2\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01der\3\2\2\2\u01df\u01dd\3\2\2\2"+
		"\u01e0\u01e2\7/\2\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4"+
		"\3\2\2\2\u01e3\u01e5\5;\36\2\u01e4\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7t\3\2\2\2\u01e8\u01ea\7/\2\2\u01e9"+
		"\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ee\3\2\2\2\u01eb\u01ed\5;"+
		"\36\2\u01ec\u01eb\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f3\7\60"+
		"\2\2\u01f2\u01f4\5;\36\2\u01f3\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6v\3\2\2\2\u01f7\u01ff\5\u00a3"+
		"R\2\u01f8\u01fe\n\37\2\2\u01f9\u01fa\7^\2\2\u01fa\u01fb\7^\2\2\u01fb\u01fc"+
		"\3\2\2\2\u01fc\u01fe\13\2\2\2\u01fd\u01f8\3\2\2\2\u01fd\u01f9\3\2\2\2"+
		"\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0202"+
		"\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0203\5\u00a3R\2\u0203x\3\2\2\2\u0204"+
		"\u0205\7/\2\2\u0205\u0206\7@\2\2\u0206z\3\2\2\2\u0207\u0208\7-\2\2\u0208"+
		"|\3\2\2\2\u0209\u020a\7/\2\2\u020a~\3\2\2\2\u020b\u020c\7,\2\2\u020c\u0080"+
		"\3\2\2\2\u020d\u020e\7\61\2\2\u020e\u0082\3\2\2\2\u020f\u0210\7@\2\2\u0210"+
		"\u0084\3\2\2\2\u0211\u0212\7@\2\2\u0212\u0213\7?\2\2\u0213\u0086\3\2\2"+
		"\2\u0214\u0215\7>\2\2\u0215\u0088\3\2\2\2\u0216\u0217\7>\2\2\u0217\u0218"+
		"\7?\2\2\u0218\u008a\3\2\2\2\u0219\u021a\7?\2\2\u021a\u021b\7?\2\2\u021b"+
		"\u008c\3\2\2\2\u021c\u021d\7.\2\2\u021d\u008e\3\2\2\2\u021e\u021f\7#\2"+
		"\2\u021f\u0220\7?\2\2\u0220\u0090\3\2\2\2\u0221\u0222\7?\2\2\u0222\u0092"+
		"\3\2\2\2\u0223\u0224\7*\2\2\u0224\u0094\3\2\2\2\u0225\u0226\7+\2\2\u0226"+
		"\u0096\3\2\2\2\u0227\u0228\7}\2\2\u0228\u0098\3\2\2\2\u0229\u022a\7\177"+
		"\2\2\u022a\u009a\3\2\2\2\u022b\u022c\7]\2\2\u022c\u009c\3\2\2\2\u022d"+
		"\u022e\7_\2\2\u022e\u009e\3\2\2\2\u022f\u0230\7=\2\2\u0230\u00a0\3\2\2"+
		"\2\u0231\u0232\7<\2\2\u0232\u00a2\3\2\2\2\u0233\u0234\7$\2\2\u0234\u00a4"+
		"\3\2\2\2\u0235\u0239\7%\2\2\u0236\u0238\n \2\2\u0237\u0236\3\2\2\2\u0238"+
		"\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\3\2"+
		"\2\2\u023b\u0239\3\2\2\2\u023c\u023d\bS\2\2\u023d\u00a6\3\2\2\2\u023e"+
		"\u0240\t!\2\2\u023f\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u023f\3\2"+
		"\2\2\u0241\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\bT\2\2\u0244"+
		"\u00a8\3\2\2\2\20\2\u0140\u0147\u014f\u01dd\u01e1\u01e6\u01e9\u01ee\u01f5"+
		"\u01fd\u01ff\u0239\u0241\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}