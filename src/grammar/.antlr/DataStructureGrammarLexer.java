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
		GENERATE_WITH_MUTATORS=23, ID=24, INT=25, FLOAT=26, STRING=27, SET=28, 
		PLUS=29, MINUS=30, TIMES=31, DIVIDE=32, GT=33, GE=34, LT=35, LE=36, EQ=37, 
		COMMA=38, NE=39, ASSIGN=40, LPAREN=41, RPAREN=42, LBRACE=43, RBRACE=44, 
		LSQRBRAKET=45, RSQRBRAKET=46, SEMICOLON=47, COLON=48, DOUBLEQUOTE=49, 
		COMMENT=50, WS=51;
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
			"GENERATE", "GENERATE_WITH_MUTATORS", "ID", "INT", "FLOAT", "STRING", 
			"SET", "PLUS", "MINUS", "TIMES", "DIVIDE", "GT", "GE", "LT", "LE", "EQ", 
			"COMMA", "NE", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LSQRBRAKET", 
			"RSQRBRAKET", "SEMICOLON", "COLON", "DOUBLEQUOTE", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bool'", "'int'", "'string'", "'jsonfile'", "'path'", "'mutator'", 
			"'interface'", "'float'", "'array'", "'if'", "'else'", "'while'", "'print'", 
			"'func'", null, null, null, "'CREATE_INTERFACE'", "'REQUIRE_PLUGIN'", 
			"'CREATE_MUTATOR'", "'CREATE_WEIGHTED_MUTATOR'", "'GENERATE'", "'GENERATE_WITH_MUTATORS'", 
			null, null, null, null, "'->'", "'+'", "'-'", "'*'", "'/'", "'>'", "'>='", 
			"'<'", "'<='", "'=='", "','", "'!='", "'='", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "';'", "':'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOL_TYPE", "INT_TYPE", "STRING_TYPE", "JSONFILE_TYPE", "PATH_TYPE", 
			"MUTATOR_TYPE", "INTERFACE_TYPE", "FLOAT_TYPE", "ARRAY_TYPE", "IF", "ELSE", 
			"WHILE", "PRINT", "FUNCTION", "BOOL", "TRUE", "FALSE", "CREATE_INTERFACE", 
			"REQUIRE_PLUGIN", "CREATE_MUTATOR", "CREATE_WEIGHTED_MUTATOR", "GENERATE", 
			"GENERATE_WITH_MUTATORS", "ID", "INT", "FLOAT", "STRING", "SET", "PLUS", 
			"MINUS", "TIMES", "DIVIDE", "GT", "GE", "LT", "LE", "EQ", "COMMA", "NE", 
			"ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LSQRBRAKET", "RSQRBRAKET", 
			"SEMICOLON", "COLON", "DOUBLEQUOTE", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0220\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)"+
		"\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3."+
		"\3.\5.\u013d\n.\3/\3/\3/\3/\3/\5/\u0144\n/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\5\60\u014c\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\7\67\u01b7\n\67"+
		"\f\67\16\67\u01ba\13\67\38\58\u01bd\n8\38\68\u01c0\n8\r8\168\u01c1\39"+
		"\59\u01c5\n9\39\79\u01c8\n9\f9\169\u01cb\139\39\39\69\u01cf\n9\r9\169"+
		"\u01d0\3:\3:\3:\3:\3:\3:\7:\u01d9\n:\f:\16:\u01dc\13:\3:\3:\3;\3;\3;\3"+
		"<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\3B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3"+
		"F\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3"+
		"Q\3Q\7Q\u0213\nQ\fQ\16Q\u0216\13Q\3Q\3Q\3R\6R\u021b\nR\rR\16R\u021c\3"+
		"R\3R\2\2S\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2"+
		"\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\3A\4"+
		"C\5E\6G\7I\bK\tM\nO\13Q\fS\rU\16W\17Y\20[\21]\22_\23a\24c\25e\26g\27i"+
		"\30k\31m\32o\33q\34s\35u\36w\37y {!}\"\177#\u0081$\u0083%\u0085&\u0087"+
		"\'\u0089(\u008b)\u008d*\u008f+\u0091,\u0093-\u0095.\u0097/\u0099\60\u009b"+
		"\61\u009d\62\u009f\63\u00a1\64\u00a3\65\3\2\"\4\2CCcc\4\2DDdd\4\2EEee"+
		"\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2N"+
		"Nnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4"+
		"\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2C\\c|\3\2\62;\6\2"+
		"\62;C\\aac|\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\16\17\"\"\2\u020e\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\3\u00a5\3\2\2\2\5\u00a7\3\2\2\2\7\u00a9\3\2\2\2\t\u00ab"+
		"\3\2\2\2\13\u00ad\3\2\2\2\r\u00af\3\2\2\2\17\u00b1\3\2\2\2\21\u00b3\3"+
		"\2\2\2\23\u00b5\3\2\2\2\25\u00b7\3\2\2\2\27\u00b9\3\2\2\2\31\u00bb\3\2"+
		"\2\2\33\u00bd\3\2\2\2\35\u00bf\3\2\2\2\37\u00c1\3\2\2\2!\u00c3\3\2\2\2"+
		"#\u00c5\3\2\2\2%\u00c7\3\2\2\2\'\u00c9\3\2\2\2)\u00cb\3\2\2\2+\u00cd\3"+
		"\2\2\2-\u00cf\3\2\2\2/\u00d1\3\2\2\2\61\u00d3\3\2\2\2\63\u00d5\3\2\2\2"+
		"\65\u00d7\3\2\2\2\67\u00d9\3\2\2\29\u00db\3\2\2\2;\u00dd\3\2\2\2=\u00df"+
		"\3\2\2\2?\u00e5\3\2\2\2A\u00ea\3\2\2\2C\u00ee\3\2\2\2E\u00f5\3\2\2\2G"+
		"\u00fe\3\2\2\2I\u0103\3\2\2\2K\u010b\3\2\2\2M\u0115\3\2\2\2O\u011b\3\2"+
		"\2\2Q\u0121\3\2\2\2S\u0124\3\2\2\2U\u0129\3\2\2\2W\u012f\3\2\2\2Y\u0135"+
		"\3\2\2\2[\u013c\3\2\2\2]\u0143\3\2\2\2_\u014b\3\2\2\2a\u014d\3\2\2\2c"+
		"\u015e\3\2\2\2e\u016d\3\2\2\2g\u017c\3\2\2\2i\u0194\3\2\2\2k\u019d\3\2"+
		"\2\2m\u01b4\3\2\2\2o\u01bc\3\2\2\2q\u01c4\3\2\2\2s\u01d2\3\2\2\2u\u01df"+
		"\3\2\2\2w\u01e2\3\2\2\2y\u01e4\3\2\2\2{\u01e6\3\2\2\2}\u01e8\3\2\2\2\177"+
		"\u01ea\3\2\2\2\u0081\u01ec\3\2\2\2\u0083\u01ef\3\2\2\2\u0085\u01f1\3\2"+
		"\2\2\u0087\u01f4\3\2\2\2\u0089\u01f7\3\2\2\2\u008b\u01f9\3\2\2\2\u008d"+
		"\u01fc\3\2\2\2\u008f\u01fe\3\2\2\2\u0091\u0200\3\2\2\2\u0093\u0202\3\2"+
		"\2\2\u0095\u0204\3\2\2\2\u0097\u0206\3\2\2\2\u0099\u0208\3\2\2\2\u009b"+
		"\u020a\3\2\2\2\u009d\u020c\3\2\2\2\u009f\u020e\3\2\2\2\u00a1\u0210\3\2"+
		"\2\2\u00a3\u021a\3\2\2\2\u00a5\u00a6\7#\2\2\u00a6\4\3\2\2\2\u00a7\u00a8"+
		"\t\2\2\2\u00a8\6\3\2\2\2\u00a9\u00aa\t\3\2\2\u00aa\b\3\2\2\2\u00ab\u00ac"+
		"\t\4\2\2\u00ac\n\3\2\2\2\u00ad\u00ae\t\5\2\2\u00ae\f\3\2\2\2\u00af\u00b0"+
		"\t\6\2\2\u00b0\16\3\2\2\2\u00b1\u00b2\t\7\2\2\u00b2\20\3\2\2\2\u00b3\u00b4"+
		"\t\b\2\2\u00b4\22\3\2\2\2\u00b5\u00b6\t\t\2\2\u00b6\24\3\2\2\2\u00b7\u00b8"+
		"\t\n\2\2\u00b8\26\3\2\2\2\u00b9\u00ba\t\13\2\2\u00ba\30\3\2\2\2\u00bb"+
		"\u00bc\t\f\2\2\u00bc\32\3\2\2\2\u00bd\u00be\t\r\2\2\u00be\34\3\2\2\2\u00bf"+
		"\u00c0\t\16\2\2\u00c0\36\3\2\2\2\u00c1\u00c2\t\17\2\2\u00c2 \3\2\2\2\u00c3"+
		"\u00c4\t\20\2\2\u00c4\"\3\2\2\2\u00c5\u00c6\t\21\2\2\u00c6$\3\2\2\2\u00c7"+
		"\u00c8\t\22\2\2\u00c8&\3\2\2\2\u00c9\u00ca\t\23\2\2\u00ca(\3\2\2\2\u00cb"+
		"\u00cc\t\24\2\2\u00cc*\3\2\2\2\u00cd\u00ce\t\25\2\2\u00ce,\3\2\2\2\u00cf"+
		"\u00d0\t\26\2\2\u00d0.\3\2\2\2\u00d1\u00d2\t\27\2\2\u00d2\60\3\2\2\2\u00d3"+
		"\u00d4\t\30\2\2\u00d4\62\3\2\2\2\u00d5\u00d6\t\31\2\2\u00d6\64\3\2\2\2"+
		"\u00d7\u00d8\t\32\2\2\u00d8\66\3\2\2\2\u00d9\u00da\t\33\2\2\u00da8\3\2"+
		"\2\2\u00db\u00dc\t\34\2\2\u00dc:\3\2\2\2\u00dd\u00de\t\35\2\2\u00de<\3"+
		"\2\2\2\u00df\u00e0\7\60\2\2\u00e0\u00e1\7l\2\2\u00e1\u00e2\7u\2\2\u00e2"+
		"\u00e3\7q\2\2\u00e3\u00e4\7p\2\2\u00e4>\3\2\2\2\u00e5\u00e6\7d\2\2\u00e6"+
		"\u00e7\7q\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7n\2\2\u00e9@\3\2\2\2\u00ea"+
		"\u00eb\7k\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7v\2\2\u00edB\3\2\2\2\u00ee"+
		"\u00ef\7u\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7k\2\2"+
		"\u00f2\u00f3\7p\2\2\u00f3\u00f4\7i\2\2\u00f4D\3\2\2\2\u00f5\u00f6\7l\2"+
		"\2\u00f6\u00f7\7u\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa"+
		"\7h\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd\7g\2\2\u00fd"+
		"F\3\2\2\2\u00fe\u00ff\7r\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7v\2\2\u0101"+
		"\u0102\7j\2\2\u0102H\3\2\2\2\u0103\u0104\7o\2\2\u0104\u0105\7w\2\2\u0105"+
		"\u0106\7v\2\2\u0106\u0107\7c\2\2\u0107\u0108\7v\2\2\u0108\u0109\7q\2\2"+
		"\u0109\u010a\7t\2\2\u010aJ\3\2\2\2\u010b\u010c\7k\2\2\u010c\u010d\7p\2"+
		"\2\u010d\u010e\7v\2\2\u010e\u010f\7g\2\2\u010f\u0110\7t\2\2\u0110\u0111"+
		"\7h\2\2\u0111\u0112\7c\2\2\u0112\u0113\7e\2\2\u0113\u0114\7g\2\2\u0114"+
		"L\3\2\2\2\u0115\u0116\7h\2\2\u0116\u0117\7n\2\2\u0117\u0118\7q\2\2\u0118"+
		"\u0119\7c\2\2\u0119\u011a\7v\2\2\u011aN\3\2\2\2\u011b\u011c\7c\2\2\u011c"+
		"\u011d\7t\2\2\u011d\u011e\7t\2\2\u011e\u011f\7c\2\2\u011f\u0120\7{\2\2"+
		"\u0120P\3\2\2\2\u0121\u0122\7k\2\2\u0122\u0123\7h\2\2\u0123R\3\2\2\2\u0124"+
		"\u0125\7g\2\2\u0125\u0126\7n\2\2\u0126\u0127\7u\2\2\u0127\u0128\7g\2\2"+
		"\u0128T\3\2\2\2\u0129\u012a\7y\2\2\u012a\u012b\7j\2\2\u012b\u012c\7k\2"+
		"\2\u012c\u012d\7n\2\2\u012d\u012e\7g\2\2\u012eV\3\2\2\2\u012f\u0130\7"+
		"r\2\2\u0130\u0131\7t\2\2\u0131\u0132\7k\2\2\u0132\u0133\7p\2\2\u0133\u0134"+
		"\7v\2\2\u0134X\3\2\2\2\u0135\u0136\7h\2\2\u0136\u0137\7w\2\2\u0137\u0138"+
		"\7p\2\2\u0138\u0139\7e\2\2\u0139Z\3\2\2\2\u013a\u013d\5]/\2\u013b\u013d"+
		"\5_\60\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d\\\3\2\2\2\u013e"+
		"\u013f\7v\2\2\u013f\u0140\7t\2\2\u0140\u0141\7w\2\2\u0141\u0144\7g\2\2"+
		"\u0142\u0144\7\62\2\2\u0143\u013e\3\2\2\2\u0143\u0142\3\2\2\2\u0144^\3"+
		"\2\2\2\u0145\u0146\7h\2\2\u0146\u0147\7c\2\2\u0147\u0148\7n\2\2\u0148"+
		"\u0149\7u\2\2\u0149\u014c\7g\2\2\u014a\u014c\7\63\2\2\u014b\u0145\3\2"+
		"\2\2\u014b\u014a\3\2\2\2\u014c`\3\2\2\2\u014d\u014e\7E\2\2\u014e\u014f"+
		"\7T\2\2\u014f\u0150\7G\2\2\u0150\u0151\7C\2\2\u0151\u0152\7V\2\2\u0152"+
		"\u0153\7G\2\2\u0153\u0154\7a\2\2\u0154\u0155\7K\2\2\u0155\u0156\7P\2\2"+
		"\u0156\u0157\7V\2\2\u0157\u0158\7G\2\2\u0158\u0159\7T\2\2\u0159\u015a"+
		"\7H\2\2\u015a\u015b\7C\2\2\u015b\u015c\7E\2\2\u015c\u015d\7G\2\2\u015d"+
		"b\3\2\2\2\u015e\u015f\7T\2\2\u015f\u0160\7G\2\2\u0160\u0161\7S\2\2\u0161"+
		"\u0162\7W\2\2\u0162\u0163\7K\2\2\u0163\u0164\7T\2\2\u0164\u0165\7G\2\2"+
		"\u0165\u0166\7a\2\2\u0166\u0167\7R\2\2\u0167\u0168\7N\2\2\u0168\u0169"+
		"\7W\2\2\u0169\u016a\7I\2\2\u016a\u016b\7K\2\2\u016b\u016c\7P\2\2\u016c"+
		"d\3\2\2\2\u016d\u016e\7E\2\2\u016e\u016f\7T\2\2\u016f\u0170\7G\2\2\u0170"+
		"\u0171\7C\2\2\u0171\u0172\7V\2\2\u0172\u0173\7G\2\2\u0173\u0174\7a\2\2"+
		"\u0174\u0175\7O\2\2\u0175\u0176\7W\2\2\u0176\u0177\7V\2\2\u0177\u0178"+
		"\7C\2\2\u0178\u0179\7V\2\2\u0179\u017a\7Q\2\2\u017a\u017b\7T\2\2\u017b"+
		"f\3\2\2\2\u017c\u017d\7E\2\2\u017d\u017e\7T\2\2\u017e\u017f\7G\2\2\u017f"+
		"\u0180\7C\2\2\u0180\u0181\7V\2\2\u0181\u0182\7G\2\2\u0182\u0183\7a\2\2"+
		"\u0183\u0184\7Y\2\2\u0184\u0185\7G\2\2\u0185\u0186\7K\2\2\u0186\u0187"+
		"\7I\2\2\u0187\u0188\7J\2\2\u0188\u0189\7V\2\2\u0189\u018a\7G\2\2\u018a"+
		"\u018b\7F\2\2\u018b\u018c\7a\2\2\u018c\u018d\7O\2\2\u018d\u018e\7W\2\2"+
		"\u018e\u018f\7V\2\2\u018f\u0190\7C\2\2\u0190\u0191\7V\2\2\u0191\u0192"+
		"\7Q\2\2\u0192\u0193\7T\2\2\u0193h\3\2\2\2\u0194\u0195\7I\2\2\u0195\u0196"+
		"\7G\2\2\u0196\u0197\7P\2\2\u0197\u0198\7G\2\2\u0198\u0199\7T\2\2\u0199"+
		"\u019a\7C\2\2\u019a\u019b\7V\2\2\u019b\u019c\7G\2\2\u019cj\3\2\2\2\u019d"+
		"\u019e\7I\2\2\u019e\u019f\7G\2\2\u019f\u01a0\7P\2\2\u01a0\u01a1\7G\2\2"+
		"\u01a1\u01a2\7T\2\2\u01a2\u01a3\7C\2\2\u01a3\u01a4\7V\2\2\u01a4\u01a5"+
		"\7G\2\2\u01a5\u01a6\7a\2\2\u01a6\u01a7\7Y\2\2\u01a7\u01a8\7K\2\2\u01a8"+
		"\u01a9\7V\2\2\u01a9\u01aa\7J\2\2\u01aa\u01ab\7a\2\2\u01ab\u01ac\7O\2\2"+
		"\u01ac\u01ad\7W\2\2\u01ad\u01ae\7V\2\2\u01ae\u01af\7C\2\2\u01af\u01b0"+
		"\7V\2\2\u01b0\u01b1\7Q\2\2\u01b1\u01b2\7T\2\2\u01b2\u01b3\7U\2\2\u01b3"+
		"l\3\2\2\2\u01b4\u01b8\t\34\2\2\u01b5\u01b7\t\36\2\2\u01b6\u01b5\3\2\2"+
		"\2\u01b7\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9n"+
		"\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bd\7/\2\2\u01bc\u01bb\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01bf\3\2\2\2\u01be\u01c0\5;\36\2\u01bf\u01be\3\2"+
		"\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"p\3\2\2\2\u01c3\u01c5\7/\2\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"\u01c9\3\2\2\2\u01c6\u01c8\5;\36\2\u01c7\u01c6\3\2\2\2\u01c8\u01cb\3\2"+
		"\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cc\u01ce\7\60\2\2\u01cd\u01cf\5;\36\2\u01ce\u01cd\3"+
		"\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"r\3\2\2\2\u01d2\u01da\5\u009fP\2\u01d3\u01d9\n\37\2\2\u01d4\u01d5\7^\2"+
		"\2\u01d5\u01d6\7^\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\13\2\2\2\u01d8\u01d3"+
		"\3\2\2\2\u01d8\u01d4\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01de\5\u009f"+
		"P\2\u01det\3\2\2\2\u01df\u01e0\7/\2\2\u01e0\u01e1\7@\2\2\u01e1v\3\2\2"+
		"\2\u01e2\u01e3\7-\2\2\u01e3x\3\2\2\2\u01e4\u01e5\7/\2\2\u01e5z\3\2\2\2"+
		"\u01e6\u01e7\7,\2\2\u01e7|\3\2\2\2\u01e8\u01e9\7\61\2\2\u01e9~\3\2\2\2"+
		"\u01ea\u01eb\7@\2\2\u01eb\u0080\3\2\2\2\u01ec\u01ed\7@\2\2\u01ed\u01ee"+
		"\7?\2\2\u01ee\u0082\3\2\2\2\u01ef\u01f0\7>\2\2\u01f0\u0084\3\2\2\2\u01f1"+
		"\u01f2\7>\2\2\u01f2\u01f3\7?\2\2\u01f3\u0086\3\2\2\2\u01f4\u01f5\7?\2"+
		"\2\u01f5\u01f6\7?\2\2\u01f6\u0088\3\2\2\2\u01f7\u01f8\7.\2\2\u01f8\u008a"+
		"\3\2\2\2\u01f9\u01fa\7#\2\2\u01fa\u01fb\7?\2\2\u01fb\u008c\3\2\2\2\u01fc"+
		"\u01fd\7?\2\2\u01fd\u008e\3\2\2\2\u01fe\u01ff\7*\2\2\u01ff\u0090\3\2\2"+
		"\2\u0200\u0201\7+\2\2\u0201\u0092\3\2\2\2\u0202\u0203\7}\2\2\u0203\u0094"+
		"\3\2\2\2\u0204\u0205\7\177\2\2\u0205\u0096\3\2\2\2\u0206\u0207\7]\2\2"+
		"\u0207\u0098\3\2\2\2\u0208\u0209\7_\2\2\u0209\u009a\3\2\2\2\u020a\u020b"+
		"\7=\2\2\u020b\u009c\3\2\2\2\u020c\u020d\7<\2\2\u020d\u009e\3\2\2\2\u020e"+
		"\u020f\7$\2\2\u020f\u00a0\3\2\2\2\u0210\u0214\7%\2\2\u0211\u0213\n \2"+
		"\2\u0212\u0211\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215"+
		"\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0218\bQ\2\2\u0218"+
		"\u00a2\3\2\2\2\u0219\u021b\t!\2\2\u021a\u0219\3\2\2\2\u021b\u021c\3\2"+
		"\2\2\u021c\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u021f\bR\2\2\u021f\u00a4\3\2\2\2\20\2\u013c\u0143\u014b\u01b8\u01bc\u01c1"+
		"\u01c4\u01c9\u01d0\u01d8\u01da\u0214\u021c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}