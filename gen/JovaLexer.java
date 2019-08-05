// Generated from /home/glouwa/Uni/CC/cc16/Jova.g4 by ANTLR 4.5.1

	package at.tugraz.ist.cc.antlr.gen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JovaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, WS=7, KEY_CLASS=8, KEY_IF=9, 
		KEY_ELSE=10, KEY_WHILE=11, KEY_RETURN=12, KEY_NEW=13, KEY_NIX=14, ASSIGN=15, 
		RELOP=16, MULOP=17, AND=18, OR=19, SIGN=20, NOT=21, DOTOP=22, INT=23, 
		BOOL=24, AMOD=25, PRIMITIVE_TYPE=26, CLASS_TYPE=27, ID=28, LITERAL=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "WS", "KEY_CLASS", "KEY_IF", 
		"KEY_ELSE", "KEY_WHILE", "KEY_RETURN", "KEY_NEW", "KEY_NIX", "ASSIGN", 
		"RELOP", "MULOP", "AND", "OR", "SIGN", "NOT", "DOTOP", "INT", "DIGIT", 
		"DIGIT0", "BOOL", "AMOD", "PRIMITIVE_TYPE", "CLASS_TYPE", "ID", "LETTER", 
		"LITERAL", "PUNCT", "OPERATORS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'{'", "'}'", "';'", "'('", "')'", null, "'class'", "'if'", 
		"'else'", "'while'", "'return'", "'new'", "'nix'", "'='", null, null, 
		"'&&'", "'||'", null, "'!'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "WS", "KEY_CLASS", "KEY_IF", 
		"KEY_ELSE", "KEY_WHILE", "KEY_RETURN", "KEY_NEW", "KEY_NIX", "ASSIGN", 
		"RELOP", "MULOP", "AND", "OR", "SIGN", "NOT", "DOTOP", "INT", "BOOL", 
		"AMOD", "PRIMITIVE_TYPE", "CLASS_TYPE", "ID", "LITERAL"
	};
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


	public JovaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Jova.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00f1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0087\n\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\7\30\u009a\n\30\f\30"+
		"\16\30\u009d\13\30\5\30\u009f\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00ae\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00bd\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00cc\n\35\3\36"+
		"\3\36\3\36\3\36\7\36\u00d2\n\36\f\36\16\36\u00d5\13\36\3\37\3\37\3\37"+
		"\3\37\7\37\u00db\n\37\f\37\16\37\u00de\13\37\3 \3 \3!\3!\3!\3!\3!\7!\u00e7"+
		"\n!\f!\16!\u00ea\13!\3!\3!\3\"\3\"\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\2\63\2\65\32\67\339\34;\35=\36?\2A\37C\2E\2\3\2\r\5\2"+
		"\13\f\17\17\"\"\5\2\'\',,\61\61\4\2--//\3\2\63;\3\2\62;\3\2C\\\3\2c|\4"+
		"\2C\\c|\7\2\62;C\\^^aac|\7\2##..\60\60<=AA\b\2\'(,-//\61\61>@~~\u0100"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2A\3\2\2"+
		"\2\3G\3\2\2\2\5I\3\2\2\2\7K\3\2\2\2\tM\3\2\2\2\13O\3\2\2\2\rQ\3\2\2\2"+
		"\17S\3\2\2\2\21W\3\2\2\2\23]\3\2\2\2\25`\3\2\2\2\27e\3\2\2\2\31k\3\2\2"+
		"\2\33r\3\2\2\2\35v\3\2\2\2\37z\3\2\2\2!\u0086\3\2\2\2#\u0088\3\2\2\2%"+
		"\u008a\3\2\2\2\'\u008d\3\2\2\2)\u0090\3\2\2\2+\u0092\3\2\2\2-\u0094\3"+
		"\2\2\2/\u009e\3\2\2\2\61\u00a0\3\2\2\2\63\u00a2\3\2\2\2\65\u00ad\3\2\2"+
		"\2\67\u00bc\3\2\2\29\u00cb\3\2\2\2;\u00cd\3\2\2\2=\u00d6\3\2\2\2?\u00df"+
		"\3\2\2\2A\u00e1\3\2\2\2C\u00ed\3\2\2\2E\u00ef\3\2\2\2GH\7.\2\2H\4\3\2"+
		"\2\2IJ\7}\2\2J\6\3\2\2\2KL\7\177\2\2L\b\3\2\2\2MN\7=\2\2N\n\3\2\2\2OP"+
		"\7*\2\2P\f\3\2\2\2QR\7+\2\2R\16\3\2\2\2ST\t\2\2\2TU\3\2\2\2UV\b\b\2\2"+
		"V\20\3\2\2\2WX\7e\2\2XY\7n\2\2YZ\7c\2\2Z[\7u\2\2[\\\7u\2\2\\\22\3\2\2"+
		"\2]^\7k\2\2^_\7h\2\2_\24\3\2\2\2`a\7g\2\2ab\7n\2\2bc\7u\2\2cd\7g\2\2d"+
		"\26\3\2\2\2ef\7y\2\2fg\7j\2\2gh\7k\2\2hi\7n\2\2ij\7g\2\2j\30\3\2\2\2k"+
		"l\7t\2\2lm\7g\2\2mn\7v\2\2no\7w\2\2op\7t\2\2pq\7p\2\2q\32\3\2\2\2rs\7"+
		"p\2\2st\7g\2\2tu\7y\2\2u\34\3\2\2\2vw\7p\2\2wx\7k\2\2xy\7z\2\2y\36\3\2"+
		"\2\2z{\7?\2\2{ \3\2\2\2|}\7>\2\2}\u0087\7?\2\2~\u0087\7>\2\2\177\u0080"+
		"\7@\2\2\u0080\u0087\7?\2\2\u0081\u0087\7@\2\2\u0082\u0083\7?\2\2\u0083"+
		"\u0087\7?\2\2\u0084\u0085\7#\2\2\u0085\u0087\7?\2\2\u0086|\3\2\2\2\u0086"+
		"~\3\2\2\2\u0086\177\3\2\2\2\u0086\u0081\3\2\2\2\u0086\u0082\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\"\3\2\2\2\u0088\u0089\t\3\2\2\u0089$\3\2\2\2\u008a"+
		"\u008b\7(\2\2\u008b\u008c\7(\2\2\u008c&\3\2\2\2\u008d\u008e\7~\2\2\u008e"+
		"\u008f\7~\2\2\u008f(\3\2\2\2\u0090\u0091\t\4\2\2\u0091*\3\2\2\2\u0092"+
		"\u0093\7#\2\2\u0093,\3\2\2\2\u0094\u0095\7\60\2\2\u0095.\3\2\2\2\u0096"+
		"\u009f\7\62\2\2\u0097\u009b\5\61\31\2\u0098\u009a\5\63\32\2\u0099\u0098"+
		"\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u0096\3\2\2\2\u009e\u0097\3\2"+
		"\2\2\u009f\60\3\2\2\2\u00a0\u00a1\t\5\2\2\u00a1\62\3\2\2\2\u00a2\u00a3"+
		"\t\6\2\2\u00a3\64\3\2\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7t\2\2\u00a6"+
		"\u00a7\7w\2\2\u00a7\u00ae\7g\2\2\u00a8\u00a9\7h\2\2\u00a9\u00aa\7c\2\2"+
		"\u00aa\u00ab\7n\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ae\7g\2\2\u00ad\u00a4"+
		"\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ae\66\3\2\2\2\u00af\u00b0\7r\2\2\u00b0"+
		"\u00b1\7t\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7x\2\2\u00b3\u00b4\7c\2\2"+
		"\u00b4\u00b5\7v\2\2\u00b5\u00bd\7g\2\2\u00b6\u00b7\7r\2\2\u00b7\u00b8"+
		"\7w\2\2\u00b8\u00b9\7d\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7k\2\2\u00bb"+
		"\u00bd\7e\2\2\u00bc\u00af\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bd8\3\2\2\2\u00be"+
		"\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0\u00cc\7v\2\2\u00c1\u00c2\7U\2\2"+
		"\u00c2\u00c3\7v\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6"+
		"\7p\2\2\u00c6\u00cc\7i\2\2\u00c7\u00c8\7d\2\2\u00c8\u00c9\7q\2\2\u00c9"+
		"\u00ca\7q\2\2\u00ca\u00cc\7n\2\2\u00cb\u00be\3\2\2\2\u00cb\u00c1\3\2\2"+
		"\2\u00cb\u00c7\3\2\2\2\u00cc:\3\2\2\2\u00cd\u00d3\t\7\2\2\u00ce\u00d2"+
		"\5? \2\u00cf\u00d2\5\63\32\2\u00d0\u00d2\7a\2\2\u00d1\u00ce\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4<\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00dc"+
		"\t\b\2\2\u00d7\u00db\5? \2\u00d8\u00db\5\63\32\2\u00d9\u00db\7a\2\2\u00da"+
		"\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd>\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00df\u00e0\t\t\2\2\u00e0@\3\2\2\2\u00e1\u00e8\7$\2\2\u00e2\u00e7"+
		"\t\n\2\2\u00e3\u00e7\5E#\2\u00e4\u00e7\5C\"\2\u00e5\u00e7\7\"\2\2\u00e6"+
		"\u00e2\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2"+
		"\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\7$\2\2\u00ecB\3\2\2\2\u00ed"+
		"\u00ee\t\13\2\2\u00eeD\3\2\2\2\u00ef\u00f0\t\f\2\2\u00f0F\3\2\2\2\17\2"+
		"\u0086\u009b\u009e\u00ad\u00bc\u00cb\u00d1\u00d3\u00da\u00dc\u00e6\u00e8"+
		"\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}