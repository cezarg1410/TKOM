// Generated from ListLanguage.g4 by ANTLR 4.4

    package antlr_classes;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ListLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, IF=2, THEN=3, ELSE=4, VAR=5, FOREACH=6, IN=7, AT=8, PRINT=9, NUMERICAL_VAR_OP=10, 
		BOOLEAN=11, LIST_VAR_OP=12, ID=13, NUMBER=14, ACTION_OPERATOR=15, LOGICAL_OPERATOR=16, 
		ASSIGN=17, LPAREN=18, RPAREN=19, LBRACE=20, RBRACE=21, COMA=22, SEMI=23, 
		LBRACK=24, RBRACK=25, AND_OPERATOR=26, OR_OPERATOR=27, WS=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'"
	};
	public static final String[] ruleNames = {
		"T__0", "IF", "THEN", "ELSE", "VAR", "FOREACH", "IN", "AT", "PRINT", "NUMERICAL_VAR_OP", 
		"BOOLEAN", "LIST_VAR_OP", "LETTER", "DIGIT", "ID", "NUMBER", "ACTION_OPERATOR", 
		"LOGICAL_OPERATOR", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"COMA", "SEMI", "LBRACK", "RBRACK", "AND_OPERATOR", "OR_OPERATOR", "WS"
	};


	public ListLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ListLanguage.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u00be\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fz\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\6\20\u0086\n\20\r\20\16\20\u0087\3\21\6\21\u008b\n\21\r\21"+
		"\16\21\u008c\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\u009e\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\6\37\u00b9\n\37\r\37\16\37\u00ba\3\37\3\37\2\2 \3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\2\37\17"+
		"!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36"+
		"\3\2\6\5\2C\\c|~~\3\2\62;\4\2,-//\5\2\13\f\17\17\"\"\u00c5\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5E\3\2\2\2"+
		"\7H\3\2\2\2\tM\3\2\2\2\13R\3\2\2\2\rV\3\2\2\2\17^\3\2\2\2\21a\3\2\2\2"+
		"\23c\3\2\2\2\25i\3\2\2\2\27y\3\2\2\2\31{\3\2\2\2\33\u0080\3\2\2\2\35\u0082"+
		"\3\2\2\2\37\u0085\3\2\2\2!\u008a\3\2\2\2#\u008e\3\2\2\2%\u009d\3\2\2\2"+
		"\'\u009f\3\2\2\2)\u00a1\3\2\2\2+\u00a3\3\2\2\2-\u00a5\3\2\2\2/\u00a7\3"+
		"\2\2\2\61\u00a9\3\2\2\2\63\u00ab\3\2\2\2\65\u00ad\3\2\2\2\67\u00af\3\2"+
		"\2\29\u00b1\3\2\2\2;\u00b4\3\2\2\2=\u00b8\3\2\2\2?@\7>\2\2@A\7G\2\2AB"+
		"\7Q\2\2BC\7H\2\2CD\7@\2\2D\4\3\2\2\2EF\7k\2\2FG\7h\2\2G\6\3\2\2\2HI\7"+
		"v\2\2IJ\7j\2\2JK\7g\2\2KL\7p\2\2L\b\3\2\2\2MN\7g\2\2NO\7n\2\2OP\7u\2\2"+
		"PQ\7g\2\2Q\n\3\2\2\2RS\7x\2\2ST\7c\2\2TU\7t\2\2U\f\3\2\2\2VW\7h\2\2WX"+
		"\7q\2\2XY\7t\2\2YZ\7g\2\2Z[\7c\2\2[\\\7e\2\2\\]\7j\2\2]\16\3\2\2\2^_\7"+
		"k\2\2_`\7p\2\2`\20\3\2\2\2ab\7B\2\2b\22\3\2\2\2cd\7r\2\2de\7t\2\2ef\7"+
		"k\2\2fg\7p\2\2gh\7v\2\2h\24\3\2\2\2ij\7p\2\2jk\7w\2\2kl\7o\2\2lm\7d\2"+
		"\2mn\7g\2\2no\7t\2\2o\26\3\2\2\2pq\7v\2\2qr\7t\2\2rs\7w\2\2sz\7g\2\2t"+
		"u\7h\2\2uv\7c\2\2vw\7n\2\2wx\7u\2\2xz\7g\2\2yp\3\2\2\2yt\3\2\2\2z\30\3"+
		"\2\2\2{|\7n\2\2|}\7k\2\2}~\7u\2\2~\177\7v\2\2\177\32\3\2\2\2\u0080\u0081"+
		"\t\2\2\2\u0081\34\3\2\2\2\u0082\u0083\t\3\2\2\u0083\36\3\2\2\2\u0084\u0086"+
		"\5\33\16\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2"+
		"\u0087\u0088\3\2\2\2\u0088 \3\2\2\2\u0089\u008b\5\35\17\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\"\3\2\2\2\u008e\u008f\t\4\2\2\u008f$\3\2\2\2\u0090\u0091\7?\2\2\u0091"+
		"\u0092\7?\2\2\u0092\u009e\7?\2\2\u0093\u0094\7?\2\2\u0094\u009e\7?\2\2"+
		"\u0095\u0096\7#\2\2\u0096\u009e\7?\2\2\u0097\u009e\7@\2\2\u0098\u0099"+
		"\7@\2\2\u0099\u009e\7?\2\2\u009a\u009e\7>\2\2\u009b\u009c\7>\2\2\u009c"+
		"\u009e\7?\2\2\u009d\u0090\3\2\2\2\u009d\u0093\3\2\2\2\u009d\u0095\3\2"+
		"\2\2\u009d\u0097\3\2\2\2\u009d\u0098\3\2\2\2\u009d\u009a\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e&\3\2\2\2\u009f\u00a0\7?\2\2\u00a0(\3\2\2\2\u00a1"+
		"\u00a2\7*\2\2\u00a2*\3\2\2\2\u00a3\u00a4\7+\2\2\u00a4,\3\2\2\2\u00a5\u00a6"+
		"\7}\2\2\u00a6.\3\2\2\2\u00a7\u00a8\7\177\2\2\u00a8\60\3\2\2\2\u00a9\u00aa"+
		"\7.\2\2\u00aa\62\3\2\2\2\u00ab\u00ac\7=\2\2\u00ac\64\3\2\2\2\u00ad\u00ae"+
		"\7]\2\2\u00ae\66\3\2\2\2\u00af\u00b0\7_\2\2\u00b08\3\2\2\2\u00b1\u00b2"+
		"\7(\2\2\u00b2\u00b3\7(\2\2\u00b3:\3\2\2\2\u00b4\u00b5\7~\2\2\u00b5\u00b6"+
		"\7~\2\2\u00b6<\3\2\2\2\u00b7\u00b9\t\5\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\b\37\2\2\u00bd>\3\2\2\2\b\2y\u0087\u008c\u009d\u00ba\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}