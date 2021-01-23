package com.sky.antlr.gen;// Generated from /Users/zhouff/code/jcc/jcc.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jccLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, LINE_COMMENT=40, COMMENT=41, INTEGER=42, BOOLEAN=43, CHAR=44, 
		STRING=45, SC=46, IDENTIFIER=47, WS=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "LINE_COMMENT", 
			"COMMENT", "INTEGER", "BOOLEAN", "CHAR", "STRING", "SC", "IDENTIFIER", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'public'", "'static'", "'void'", "'main'", 
			"'('", "'String'", "'['", "']'", "')'", "'while'", "'do'", "'if'", "'else'", 
			"'='", "'System.out.println'", "'break'", "'continue'", "'return'", "','", 
			"'.'", "'length'", "'charAt'", "'-'", "'new'", "'int'", "'*'", "'/'", 
			"'+'", "'<'", "'=='", "'&&'", "'||'", "'!'", "'this'", "'char'", "'boolean'", 
			null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "LINE_COMMENT", "COMMENT", "INTEGER", "BOOLEAN", 
			"CHAR", "STRING", "SC", "IDENTIFIER", "WS"
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


	public jccLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "jcc.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0157\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\7)\u0116\n)\f)"+
		"\16)\u0119\13)\3)\3)\3*\3*\3*\3*\7*\u0121\n*\f*\16*\u0124\13*\3*\3*\3"+
		"*\3*\3*\3+\6+\u012c\n+\r+\16+\u012d\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0139"+
		"\n,\3-\3-\3-\3-\3.\3.\7.\u0141\n.\f.\16.\u0144\13.\3.\3.\3/\3/\3\60\3"+
		"\60\7\60\u014c\n\60\f\60\16\60\u014f\13\60\3\61\6\61\u0152\n\61\r\61\16"+
		"\61\u0153\3\61\3\61\3\u0122\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62\3\2\7\4\2\f\f\17\17\4\2$$^^\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f"+
		"\17\17\"\"\2\u015d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5i\3\2\2\2\7k\3\2\2\2\tm\3\2\2\2\13"+
		"t\3\2\2\2\r{\3\2\2\2\17\u0080\3\2\2\2\21\u0085\3\2\2\2\23\u0087\3\2\2"+
		"\2\25\u008e\3\2\2\2\27\u0090\3\2\2\2\31\u0092\3\2\2\2\33\u0094\3\2\2\2"+
		"\35\u009a\3\2\2\2\37\u009d\3\2\2\2!\u00a0\3\2\2\2#\u00a5\3\2\2\2%\u00a7"+
		"\3\2\2\2\'\u00ba\3\2\2\2)\u00c0\3\2\2\2+\u00c9\3\2\2\2-\u00d0\3\2\2\2"+
		"/\u00d2\3\2\2\2\61\u00d4\3\2\2\2\63\u00db\3\2\2\2\65\u00e2\3\2\2\2\67"+
		"\u00e4\3\2\2\29\u00e8\3\2\2\2;\u00ec\3\2\2\2=\u00ee\3\2\2\2?\u00f0\3\2"+
		"\2\2A\u00f2\3\2\2\2C\u00f4\3\2\2\2E\u00f7\3\2\2\2G\u00fa\3\2\2\2I\u00fd"+
		"\3\2\2\2K\u00ff\3\2\2\2M\u0104\3\2\2\2O\u0109\3\2\2\2Q\u0111\3\2\2\2S"+
		"\u011c\3\2\2\2U\u012b\3\2\2\2W\u0138\3\2\2\2Y\u013a\3\2\2\2[\u013e\3\2"+
		"\2\2]\u0147\3\2\2\2_\u0149\3\2\2\2a\u0151\3\2\2\2cd\7e\2\2de\7n\2\2ef"+
		"\7c\2\2fg\7u\2\2gh\7u\2\2h\4\3\2\2\2ij\7}\2\2j\6\3\2\2\2kl\7\177\2\2l"+
		"\b\3\2\2\2mn\7r\2\2no\7w\2\2op\7d\2\2pq\7n\2\2qr\7k\2\2rs\7e\2\2s\n\3"+
		"\2\2\2tu\7u\2\2uv\7v\2\2vw\7c\2\2wx\7v\2\2xy\7k\2\2yz\7e\2\2z\f\3\2\2"+
		"\2{|\7x\2\2|}\7q\2\2}~\7k\2\2~\177\7f\2\2\177\16\3\2\2\2\u0080\u0081\7"+
		"o\2\2\u0081\u0082\7c\2\2\u0082\u0083\7k\2\2\u0083\u0084\7p\2\2\u0084\20"+
		"\3\2\2\2\u0085\u0086\7*\2\2\u0086\22\3\2\2\2\u0087\u0088\7U\2\2\u0088"+
		"\u0089\7v\2\2\u0089\u008a\7t\2\2\u008a\u008b\7k\2\2\u008b\u008c\7p\2\2"+
		"\u008c\u008d\7i\2\2\u008d\24\3\2\2\2\u008e\u008f\7]\2\2\u008f\26\3\2\2"+
		"\2\u0090\u0091\7_\2\2\u0091\30\3\2\2\2\u0092\u0093\7+\2\2\u0093\32\3\2"+
		"\2\2\u0094\u0095\7y\2\2\u0095\u0096\7j\2\2\u0096\u0097\7k\2\2\u0097\u0098"+
		"\7n\2\2\u0098\u0099\7g\2\2\u0099\34\3\2\2\2\u009a\u009b\7f\2\2\u009b\u009c"+
		"\7q\2\2\u009c\36\3\2\2\2\u009d\u009e\7k\2\2\u009e\u009f\7h\2\2\u009f "+
		"\3\2\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7u\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\7?\2\2\u00a6$\3\2\2\2\u00a7"+
		"\u00a8\7U\2\2\u00a8\u00a9\7{\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7v\2\2"+
		"\u00ab\u00ac\7g\2\2\u00ac\u00ad\7o\2\2\u00ad\u00ae\7\60\2\2\u00ae\u00af"+
		"\7q\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7\60\2\2\u00b2"+
		"\u00b3\7r\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7p\2\2"+
		"\u00b6\u00b7\7v\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7p\2\2\u00b9&\3\2\2"+
		"\2\u00ba\u00bb\7d\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be"+
		"\7c\2\2\u00be\u00bf\7m\2\2\u00bf(\3\2\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2"+
		"\7q\2\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7k\2\2\u00c5"+
		"\u00c6\7p\2\2\u00c6\u00c7\7w\2\2\u00c7\u00c8\7g\2\2\u00c8*\3\2\2\2\u00c9"+
		"\u00ca\7t\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7w\2\2"+
		"\u00cd\u00ce\7t\2\2\u00ce\u00cf\7p\2\2\u00cf,\3\2\2\2\u00d0\u00d1\7.\2"+
		"\2\u00d1.\3\2\2\2\u00d2\u00d3\7\60\2\2\u00d3\60\3\2\2\2\u00d4\u00d5\7"+
		"n\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7i\2\2\u00d8\u00d9"+
		"\7v\2\2\u00d9\u00da\7j\2\2\u00da\62\3\2\2\2\u00db\u00dc\7e\2\2\u00dc\u00dd"+
		"\7j\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7t\2\2\u00df\u00e0\7C\2\2\u00e0"+
		"\u00e1\7v\2\2\u00e1\64\3\2\2\2\u00e2\u00e3\7/\2\2\u00e3\66\3\2\2\2\u00e4"+
		"\u00e5\7p\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7y\2\2\u00e78\3\2\2\2\u00e8"+
		"\u00e9\7k\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7v\2\2\u00eb:\3\2\2\2\u00ec"+
		"\u00ed\7,\2\2\u00ed<\3\2\2\2\u00ee\u00ef\7\61\2\2\u00ef>\3\2\2\2\u00f0"+
		"\u00f1\7-\2\2\u00f1@\3\2\2\2\u00f2\u00f3\7>\2\2\u00f3B\3\2\2\2\u00f4\u00f5"+
		"\7?\2\2\u00f5\u00f6\7?\2\2\u00f6D\3\2\2\2\u00f7\u00f8\7(\2\2\u00f8\u00f9"+
		"\7(\2\2\u00f9F\3\2\2\2\u00fa\u00fb\7~\2\2\u00fb\u00fc\7~\2\2\u00fcH\3"+
		"\2\2\2\u00fd\u00fe\7#\2\2\u00feJ\3\2\2\2\u00ff\u0100\7v\2\2\u0100\u0101"+
		"\7j\2\2\u0101\u0102\7k\2\2\u0102\u0103\7u\2\2\u0103L\3\2\2\2\u0104\u0105"+
		"\7e\2\2\u0105\u0106\7j\2\2\u0106\u0107\7c\2\2\u0107\u0108\7t\2\2\u0108"+
		"N\3\2\2\2\u0109\u010a\7d\2\2\u010a\u010b\7q\2\2\u010b\u010c\7q\2\2\u010c"+
		"\u010d\7n\2\2\u010d\u010e\7g\2\2\u010e\u010f\7c\2\2\u010f\u0110\7p\2\2"+
		"\u0110P\3\2\2\2\u0111\u0112\7\61\2\2\u0112\u0113\7\61\2\2\u0113\u0117"+
		"\3\2\2\2\u0114\u0116\n\2\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u011a\u011b\b)\2\2\u011bR\3\2\2\2\u011c\u011d\7\61\2\2\u011d\u011e"+
		"\7,\2\2\u011e\u0122\3\2\2\2\u011f\u0121\13\2\2\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0124\3\2\2\2\u0122\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0125\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7,\2\2\u0126\u0127\7\61\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u0129\b*\2\2\u0129T\3\2\2\2\u012a\u012c\4\62;\2\u012b"+
		"\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012eV\3\2\2\2\u012f\u0130\7v\2\2\u0130\u0131\7t\2\2\u0131\u0132"+
		"\7w\2\2\u0132\u0139\7g\2\2\u0133\u0134\7h\2\2\u0134\u0135\7c\2\2\u0135"+
		"\u0136\7n\2\2\u0136\u0137\7u\2\2\u0137\u0139\7g\2\2\u0138\u012f\3\2\2"+
		"\2\u0138\u0133\3\2\2\2\u0139X\3\2\2\2\u013a\u013b\7)\2\2\u013b\u013c\13"+
		"\2\2\2\u013c\u013d\7)\2\2\u013dZ\3\2\2\2\u013e\u0142\7$\2\2\u013f\u0141"+
		"\n\3\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7$"+
		"\2\2\u0146\\\3\2\2\2\u0147\u0148\7=\2\2\u0148^\3\2\2\2\u0149\u014d\t\4"+
		"\2\2\u014a\u014c\t\5\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e`\3\2\2\2\u014f\u014d\3\2\2\2"+
		"\u0150\u0152\t\6\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\b\61\2\2"+
		"\u0156b\3\2\2\2\n\2\u0117\u0122\u012d\u0138\u0142\u014d\u0153\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}