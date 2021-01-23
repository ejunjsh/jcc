package com.sky.antlr.gen;// Generated from /Users/zhouff/code/jcc/jcc.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jccParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_main_class = 1, RULE_main_method = 2, RULE_class_declaration = 3, 
		RULE_class_inner_body = 4, RULE_field_declaration = 5, RULE_method_declaration = 6, 
		RULE_method_inner_body = 7, RULE_statement = 8, RULE_return_statement = 9, 
		RULE_parameter_list = 10, RULE_parameters = 11, RULE_parameter = 12, RULE_expression = 13, 
		RULE_call_a_method = 14, RULE_type_of_variable = 15, RULE_intentifier_type = 16, 
		RULE_int_type = 17, RULE_int_array_type = 18, RULE_char_type = 19, RULE_boolean_type = 20, 
		RULE_string_type = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "main_class", "main_method", "class_declaration", "class_inner_body", 
			"field_declaration", "method_declaration", "method_inner_body", "statement", 
			"return_statement", "parameter_list", "parameters", "parameter", "expression", 
			"call_a_method", "type_of_variable", "intentifier_type", "int_type", 
			"int_array_type", "char_type", "boolean_type", "string_type"
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

	@Override
	public String getGrammarFileName() { return "jcc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public jccParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public Main_classContext main_class() {
			return getRuleContext(Main_classContext.class,0);
		}
		public List<Class_declarationContext> class_declaration() {
			return getRuleContexts(Class_declarationContext.class);
		}
		public Class_declarationContext class_declaration(int i) {
			return getRuleContext(Class_declarationContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			main_class();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(45);
				class_declaration();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Main_classContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(jccParser.IDENTIFIER, 0); }
		public Main_methodContext main_method() {
			return getRuleContext(Main_methodContext.class,0);
		}
		public Main_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterMain_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitMain_class(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitMain_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_classContext main_class() throws RecognitionException {
		Main_classContext _localctx = new Main_classContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__0);
			setState(52);
			match(IDENTIFIER);
			setState(53);
			match(T__1);
			setState(54);
			main_method();
			setState(55);
			match(T__2);
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

	public static class Main_methodContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(jccParser.IDENTIFIER, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Main_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterMain_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitMain_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitMain_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_methodContext main_method() throws RecognitionException {
		Main_methodContext _localctx = new Main_methodContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__3);
			setState(58);
			match(T__4);
			setState(59);
			match(T__5);
			setState(60);
			match(T__6);
			setState(61);
			match(T__7);
			setState(62);
			match(T__8);
			setState(63);
			match(T__9);
			setState(64);
			match(T__10);
			setState(65);
			match(IDENTIFIER);
			setState(66);
			match(T__11);
			setState(67);
			match(T__1);
			setState(68);
			statement();
			setState(69);
			match(T__2);
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

	public static class Class_declarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(jccParser.IDENTIFIER, 0); }
		public Class_inner_bodyContext class_inner_body() {
			return getRuleContext(Class_inner_bodyContext.class,0);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitClass_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitClass_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_class_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__0);
			setState(72);
			match(IDENTIFIER);
			setState(73);
			match(T__1);
			setState(74);
			class_inner_body();
			setState(75);
			match(T__2);
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

	public static class Class_inner_bodyContext extends ParserRuleContext {
		public List<Field_declarationContext> field_declaration() {
			return getRuleContexts(Field_declarationContext.class);
		}
		public Field_declarationContext field_declaration(int i) {
			return getRuleContext(Field_declarationContext.class,i);
		}
		public List<Method_declarationContext> method_declaration() {
			return getRuleContexts(Method_declarationContext.class);
		}
		public Method_declarationContext method_declaration(int i) {
			return getRuleContext(Method_declarationContext.class,i);
		}
		public Class_inner_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_inner_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterClass_inner_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitClass_inner_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitClass_inner_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_inner_bodyContext class_inner_body() throws RecognitionException {
		Class_inner_bodyContext _localctx = new Class_inner_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_class_inner_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(77);
					field_declaration();
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__27) | (1L << T__37) | (1L << T__38) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(83);
				method_declaration();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Field_declarationContext extends ParserRuleContext {
		public Type_of_variableContext type_of_variable() {
			return getRuleContext(Type_of_variableContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(jccParser.IDENTIFIER, 0); }
		public TerminalNode SC() { return getToken(jccParser.SC, 0); }
		public Field_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterField_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitField_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitField_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_declarationContext field_declaration() throws RecognitionException {
		Field_declarationContext _localctx = new Field_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			type_of_variable();
			setState(90);
			match(IDENTIFIER);
			setState(91);
			match(SC);
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

	public static class Method_declarationContext extends ParserRuleContext {
		public Type_of_variableContext type_of_variable() {
			return getRuleContext(Type_of_variableContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(jccParser.IDENTIFIER, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Method_inner_bodyContext method_inner_body() {
			return getRuleContext(Method_inner_bodyContext.class,0);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitMethod_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitMethod_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			type_of_variable();
			setState(94);
			match(IDENTIFIER);
			setState(95);
			match(T__7);
			setState(96);
			parameter_list();
			setState(97);
			match(T__11);
			setState(98);
			match(T__1);
			setState(99);
			method_inner_body();
			setState(100);
			match(T__2);
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

	public static class Method_inner_bodyContext extends ParserRuleContext {
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public List<Field_declarationContext> field_declaration() {
			return getRuleContexts(Field_declarationContext.class);
		}
		public Field_declarationContext field_declaration(int i) {
			return getRuleContext(Field_declarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Method_inner_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_inner_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterMethod_inner_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitMethod_inner_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitMethod_inner_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_inner_bodyContext method_inner_body() throws RecognitionException {
		Method_inner_bodyContext _localctx = new Method_inner_bodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_method_inner_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					field_declaration();
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(108);
				statement();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			return_statement();
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

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SC() { return getToken(jccParser.SC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(jccParser.IDENTIFIER, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(T__1);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(117);
					statement();
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(123);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(T__12);
				setState(125);
				match(T__7);
				setState(126);
				expression(0);
				setState(127);
				match(T__11);
				setState(128);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(T__13);
				setState(131);
				statement();
				setState(132);
				match(T__12);
				setState(133);
				match(T__7);
				setState(134);
				expression(0);
				setState(135);
				match(T__11);
				setState(136);
				match(SC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				match(T__14);
				setState(139);
				match(T__7);
				setState(140);
				expression(0);
				setState(141);
				match(T__11);
				setState(142);
				statement();
				setState(145);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(143);
					match(T__15);
					setState(144);
					statement();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				match(IDENTIFIER);
				setState(148);
				match(T__16);
				setState(149);
				expression(0);
				setState(150);
				match(SC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				match(IDENTIFIER);
				setState(153);
				match(T__9);
				setState(154);
				expression(0);
				setState(155);
				match(T__10);
				setState(156);
				match(T__16);
				setState(157);
				expression(0);
				setState(158);
				match(SC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(160);
				match(T__17);
				setState(161);
				match(T__7);
				setState(162);
				expression(0);
				setState(163);
				match(T__11);
				setState(164);
				match(SC);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(166);
				match(T__18);
				setState(167);
				match(SC);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(168);
				match(T__19);
				setState(169);
				match(SC);
				}
				break;
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

	public static class Return_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SC() { return getToken(jccParser.SC, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__20);
			setState(173);
			expression(0);
			setState(174);
			match(SC);
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

	public static class Parameter_listContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__27) | (1L << T__37) | (1L << T__38) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(176);
				parameters();
				}
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

	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			parameter();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(180);
				match(T__21);
				setState(181);
				parameter();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ParameterContext extends ParserRuleContext {
		public Type_of_variableContext type_of_variable() {
			return getRuleContext(Type_of_variableContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(jccParser.IDENTIFIER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			type_of_variable();
			setState(188);
			match(IDENTIFIER);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IDENTIFIER() { return getToken(jccParser.IDENTIFIER, 0); }
		public TerminalNode INTEGER() { return getToken(jccParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(jccParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(jccParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(jccParser.STRING, 0); }
		public Call_a_methodContext call_a_method() {
			return getRuleContext(Call_a_methodContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(191);
				match(T__25);
				setState(192);
				expression(20);
				}
				break;
			case 2:
				{
				setState(193);
				match(T__26);
				setState(194);
				match(T__27);
				setState(195);
				match(T__9);
				setState(196);
				expression(0);
				setState(197);
				match(T__10);
				}
				break;
			case 3:
				{
				setState(199);
				match(T__26);
				setState(200);
				match(IDENTIFIER);
				setState(201);
				match(T__7);
				setState(202);
				match(T__11);
				}
				break;
			case 4:
				{
				setState(203);
				match(T__35);
				setState(204);
				expression(8);
				}
				break;
			case 5:
				{
				setState(205);
				match(INTEGER);
				}
				break;
			case 6:
				{
				setState(206);
				match(BOOLEAN);
				}
				break;
			case 7:
				{
				setState(207);
				match(CHAR);
				}
				break;
			case 8:
				{
				setState(208);
				match(STRING);
				}
				break;
			case 9:
				{
				setState(209);
				match(IDENTIFIER);
				}
				break;
			case 10:
				{
				setState(210);
				match(T__7);
				setState(211);
				expression(0);
				setState(212);
				match(T__11);
				}
				break;
			case 11:
				{
				setState(214);
				match(T__36);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(263);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(218);
						match(T__28);
						setState(219);
						expression(17);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(221);
						match(T__29);
						setState(222);
						expression(16);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(223);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(224);
						match(T__30);
						setState(225);
						expression(15);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(226);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(227);
						match(T__25);
						setState(228);
						expression(14);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(229);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(230);
						match(T__31);
						setState(231);
						expression(13);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(232);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(233);
						match(T__32);
						setState(234);
						expression(12);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(235);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(236);
						match(T__33);
						setState(237);
						expression(11);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(238);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(239);
						match(T__34);
						setState(240);
						expression(10);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(241);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(242);
						match(T__22);
						setState(252);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__23:
							{
							setState(243);
							match(T__23);
							setState(246);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
							case 1:
								{
								setState(244);
								match(T__7);
								setState(245);
								match(T__11);
								}
								break;
							}
							}
							break;
						case T__24:
							{
							setState(248);
							match(T__24);
							setState(249);
							match(T__7);
							setState(250);
							match(IDENTIFIER);
							setState(251);
							match(T__11);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(254);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(255);
						match(T__22);
						setState(256);
						match(IDENTIFIER);
						setState(257);
						call_a_method();
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(258);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(259);
						match(T__9);
						setState(260);
						expression(0);
						setState(261);
						match(T__10);
						}
						break;
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Call_a_methodContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Call_a_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_a_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterCall_a_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitCall_a_method(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitCall_a_method(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_a_methodContext call_a_method() throws RecognitionException {
		Call_a_methodContext _localctx = new Call_a_methodContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_call_a_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__7);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__25) | (1L << T__26) | (1L << T__35) | (1L << T__36) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << CHAR) | (1L << STRING) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(269);
				expression(0);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(270);
					match(T__21);
					setState(271);
					expression(0);
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(279);
			match(T__11);
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

	public static class Type_of_variableContext extends ParserRuleContext {
		public Intentifier_typeContext intentifier_type() {
			return getRuleContext(Intentifier_typeContext.class,0);
		}
		public Int_typeContext int_type() {
			return getRuleContext(Int_typeContext.class,0);
		}
		public Int_array_typeContext int_array_type() {
			return getRuleContext(Int_array_typeContext.class,0);
		}
		public Char_typeContext char_type() {
			return getRuleContext(Char_typeContext.class,0);
		}
		public Boolean_typeContext boolean_type() {
			return getRuleContext(Boolean_typeContext.class,0);
		}
		public String_typeContext string_type() {
			return getRuleContext(String_typeContext.class,0);
		}
		public Type_of_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_of_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterType_of_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitType_of_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitType_of_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_of_variableContext type_of_variable() throws RecognitionException {
		Type_of_variableContext _localctx = new Type_of_variableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type_of_variable);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				intentifier_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				int_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				int_array_type();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				char_type();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
				boolean_type();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(286);
				string_type();
				}
				break;
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

	public static class Intentifier_typeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(jccParser.IDENTIFIER, 0); }
		public Intentifier_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intentifier_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterIntentifier_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitIntentifier_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitIntentifier_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Intentifier_typeContext intentifier_type() throws RecognitionException {
		Intentifier_typeContext _localctx = new Intentifier_typeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_intentifier_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(IDENTIFIER);
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

	public static class Int_typeContext extends ParserRuleContext {
		public Int_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterInt_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitInt_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitInt_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_typeContext int_type() throws RecognitionException {
		Int_typeContext _localctx = new Int_typeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_int_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__27);
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

	public static class Int_array_typeContext extends ParserRuleContext {
		public Int_array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterInt_array_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitInt_array_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitInt_array_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_array_typeContext int_array_type() throws RecognitionException {
		Int_array_typeContext _localctx = new Int_array_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_int_array_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__27);
			setState(294);
			match(T__9);
			setState(295);
			match(T__10);
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

	public static class Char_typeContext extends ParserRuleContext {
		public Char_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterChar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitChar_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitChar_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_typeContext char_type() throws RecognitionException {
		Char_typeContext _localctx = new Char_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_char_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__37);
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

	public static class Boolean_typeContext extends ParserRuleContext {
		public Boolean_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterBoolean_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitBoolean_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitBoolean_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_typeContext boolean_type() throws RecognitionException {
		Boolean_typeContext _localctx = new Boolean_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_boolean_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__38);
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

	public static class String_typeContext extends ParserRuleContext {
		public String_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).enterString_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jccListener ) ((jccListener)listener).exitString_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jccVisitor ) return ((jccVisitor<? extends T>)visitor).visitString_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_typeContext string_type() throws RecognitionException {
		String_typeContext _localctx = new String_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_string_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__8);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 22);
		case 9:
			return precpred(_ctx, 21);
		case 10:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0132\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\7\2\61\n\2"+
		"\f\2\16\2\64\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\7\6Q\n\6\f\6"+
		"\16\6T\13\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\7\tj\n\t\f\t\16\tm\13\t\3\t\7\tp\n\t\f\t\16"+
		"\ts\13\t\3\t\3\t\3\n\3\n\7\ny\n\n\f\n\16\n|\13\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u0094\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ad\n\n\3\13\3\13\3\13\3\13\3\f"+
		"\5\f\u00b4\n\f\3\r\3\r\3\r\7\r\u00b9\n\r\f\r\16\r\u00bc\13\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00da"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00f9\n\17\3\17\3\17\3\17\3\17\5\17\u00ff\n\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u010a\n\17\f\17\16\17\u010d"+
		"\13\17\3\20\3\20\3\20\3\20\7\20\u0113\n\20\f\20\16\20\u0116\13\20\5\20"+
		"\u0118\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0122\n\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\27\2\3\34\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\2\2\u014a"+
		"\2.\3\2\2\2\4\65\3\2\2\2\6;\3\2\2\2\bI\3\2\2\2\nR\3\2\2\2\f[\3\2\2\2\16"+
		"_\3\2\2\2\20k\3\2\2\2\22\u00ac\3\2\2\2\24\u00ae\3\2\2\2\26\u00b3\3\2\2"+
		"\2\30\u00b5\3\2\2\2\32\u00bd\3\2\2\2\34\u00d9\3\2\2\2\36\u010e\3\2\2\2"+
		" \u0121\3\2\2\2\"\u0123\3\2\2\2$\u0125\3\2\2\2&\u0127\3\2\2\2(\u012b\3"+
		"\2\2\2*\u012d\3\2\2\2,\u012f\3\2\2\2.\62\5\4\3\2/\61\5\b\5\2\60/\3\2\2"+
		"\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\3\3\2\2\2\64\62\3\2\2"+
		"\2\65\66\7\3\2\2\66\67\7\61\2\2\678\7\4\2\289\5\6\4\29:\7\5\2\2:\5\3\2"+
		"\2\2;<\7\6\2\2<=\7\7\2\2=>\7\b\2\2>?\7\t\2\2?@\7\n\2\2@A\7\13\2\2AB\7"+
		"\f\2\2BC\7\r\2\2CD\7\61\2\2DE\7\16\2\2EF\7\4\2\2FG\5\22\n\2GH\7\5\2\2"+
		"H\7\3\2\2\2IJ\7\3\2\2JK\7\61\2\2KL\7\4\2\2LM\5\n\6\2MN\7\5\2\2N\t\3\2"+
		"\2\2OQ\5\f\7\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SX\3\2\2\2TR\3\2"+
		"\2\2UW\5\16\b\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\13\3\2\2\2ZX"+
		"\3\2\2\2[\\\5 \21\2\\]\7\61\2\2]^\7\60\2\2^\r\3\2\2\2_`\5 \21\2`a\7\61"+
		"\2\2ab\7\n\2\2bc\5\26\f\2cd\7\16\2\2de\7\4\2\2ef\5\20\t\2fg\7\5\2\2g\17"+
		"\3\2\2\2hj\5\f\7\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lq\3\2\2\2m"+
		"k\3\2\2\2np\5\22\n\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2"+
		"sq\3\2\2\2tu\5\24\13\2u\21\3\2\2\2vz\7\4\2\2wy\5\22\n\2xw\3\2\2\2y|\3"+
		"\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}\u00ad\7\5\2\2~\177\7\17"+
		"\2\2\177\u0080\7\n\2\2\u0080\u0081\5\34\17\2\u0081\u0082\7\16\2\2\u0082"+
		"\u0083\5\22\n\2\u0083\u00ad\3\2\2\2\u0084\u0085\7\20\2\2\u0085\u0086\5"+
		"\22\n\2\u0086\u0087\7\17\2\2\u0087\u0088\7\n\2\2\u0088\u0089\5\34\17\2"+
		"\u0089\u008a\7\16\2\2\u008a\u008b\7\60\2\2\u008b\u00ad\3\2\2\2\u008c\u008d"+
		"\7\21\2\2\u008d\u008e\7\n\2\2\u008e\u008f\5\34\17\2\u008f\u0090\7\16\2"+
		"\2\u0090\u0093\5\22\n\2\u0091\u0092\7\22\2\2\u0092\u0094\5\22\n\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u00ad\3\2\2\2\u0095\u0096\7\61"+
		"\2\2\u0096\u0097\7\23\2\2\u0097\u0098\5\34\17\2\u0098\u0099\7\60\2\2\u0099"+
		"\u00ad\3\2\2\2\u009a\u009b\7\61\2\2\u009b\u009c\7\f\2\2\u009c\u009d\5"+
		"\34\17\2\u009d\u009e\7\r\2\2\u009e\u009f\7\23\2\2\u009f\u00a0\5\34\17"+
		"\2\u00a0\u00a1\7\60\2\2\u00a1\u00ad\3\2\2\2\u00a2\u00a3\7\24\2\2\u00a3"+
		"\u00a4\7\n\2\2\u00a4\u00a5\5\34\17\2\u00a5\u00a6\7\16\2\2\u00a6\u00a7"+
		"\7\60\2\2\u00a7\u00ad\3\2\2\2\u00a8\u00a9\7\25\2\2\u00a9\u00ad\7\60\2"+
		"\2\u00aa\u00ab\7\26\2\2\u00ab\u00ad\7\60\2\2\u00acv\3\2\2\2\u00ac~\3\2"+
		"\2\2\u00ac\u0084\3\2\2\2\u00ac\u008c\3\2\2\2\u00ac\u0095\3\2\2\2\u00ac"+
		"\u009a\3\2\2\2\u00ac\u00a2\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ad\23\3\2\2\2\u00ae\u00af\7\27\2\2\u00af\u00b0\5\34\17\2\u00b0"+
		"\u00b1\7\60\2\2\u00b1\25\3\2\2\2\u00b2\u00b4\5\30\r\2\u00b3\u00b2\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\27\3\2\2\2\u00b5\u00ba\5\32\16\2\u00b6"+
		"\u00b7\7\30\2\2\u00b7\u00b9\5\32\16\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\31\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00be\5 \21\2\u00be\u00bf\7\61\2\2\u00bf\33\3\2\2"+
		"\2\u00c0\u00c1\b\17\1\2\u00c1\u00c2\7\34\2\2\u00c2\u00da\5\34\17\26\u00c3"+
		"\u00c4\7\35\2\2\u00c4\u00c5\7\36\2\2\u00c5\u00c6\7\f\2\2\u00c6\u00c7\5"+
		"\34\17\2\u00c7\u00c8\7\r\2\2\u00c8\u00da\3\2\2\2\u00c9\u00ca\7\35\2\2"+
		"\u00ca\u00cb\7\61\2\2\u00cb\u00cc\7\n\2\2\u00cc\u00da\7\16\2\2\u00cd\u00ce"+
		"\7&\2\2\u00ce\u00da\5\34\17\n\u00cf\u00da\7,\2\2\u00d0\u00da\7-\2\2\u00d1"+
		"\u00da\7.\2\2\u00d2\u00da\7/\2\2\u00d3\u00da\7\61\2\2\u00d4\u00d5\7\n"+
		"\2\2\u00d5\u00d6\5\34\17\2\u00d6\u00d7\7\16\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00da\7\'\2\2\u00d9\u00c0\3\2\2\2\u00d9\u00c3\3\2\2\2\u00d9\u00c9\3\2"+
		"\2\2\u00d9\u00cd\3\2\2\2\u00d9\u00cf\3\2\2\2\u00d9\u00d0\3\2\2\2\u00d9"+
		"\u00d1\3\2\2\2\u00d9\u00d2\3\2\2\2\u00d9\u00d3\3\2\2\2\u00d9\u00d4\3\2"+
		"\2\2\u00d9\u00d8\3\2\2\2\u00da\u010b\3\2\2\2\u00db\u00dc\f\22\2\2\u00dc"+
		"\u00dd\7\37\2\2\u00dd\u010a\5\34\17\23\u00de\u00df\f\21\2\2\u00df\u00e0"+
		"\7 \2\2\u00e0\u010a\5\34\17\22\u00e1\u00e2\f\20\2\2\u00e2\u00e3\7!\2\2"+
		"\u00e3\u010a\5\34\17\21\u00e4\u00e5\f\17\2\2\u00e5\u00e6\7\34\2\2\u00e6"+
		"\u010a\5\34\17\20\u00e7\u00e8\f\16\2\2\u00e8\u00e9\7\"\2\2\u00e9\u010a"+
		"\5\34\17\17\u00ea\u00eb\f\r\2\2\u00eb\u00ec\7#\2\2\u00ec\u010a\5\34\17"+
		"\16\u00ed\u00ee\f\f\2\2\u00ee\u00ef\7$\2\2\u00ef\u010a\5\34\17\r\u00f0"+
		"\u00f1\f\13\2\2\u00f1\u00f2\7%\2\2\u00f2\u010a\5\34\17\f\u00f3\u00f4\f"+
		"\30\2\2\u00f4\u00fe\7\31\2\2\u00f5\u00f8\7\32\2\2\u00f6\u00f7\7\n\2\2"+
		"\u00f7\u00f9\7\16\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00ff"+
		"\3\2\2\2\u00fa\u00fb\7\33\2\2\u00fb\u00fc\7\n\2\2\u00fc\u00fd\7\61\2\2"+
		"\u00fd\u00ff\7\16\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00fa\3\2\2\2\u00ff\u010a"+
		"\3\2\2\2\u0100\u0101\f\27\2\2\u0101\u0102\7\31\2\2\u0102\u0103\7\61\2"+
		"\2\u0103\u010a\5\36\20\2\u0104\u0105\f\25\2\2\u0105\u0106\7\f\2\2\u0106"+
		"\u0107\5\34\17\2\u0107\u0108\7\r\2\2\u0108\u010a\3\2\2\2\u0109\u00db\3"+
		"\2\2\2\u0109\u00de\3\2\2\2\u0109\u00e1\3\2\2\2\u0109\u00e4\3\2\2\2\u0109"+
		"\u00e7\3\2\2\2\u0109\u00ea\3\2\2\2\u0109\u00ed\3\2\2\2\u0109\u00f0\3\2"+
		"\2\2\u0109\u00f3\3\2\2\2\u0109\u0100\3\2\2\2\u0109\u0104\3\2\2\2\u010a"+
		"\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\35\3\2\2"+
		"\2\u010d\u010b\3\2\2\2\u010e\u0117\7\n\2\2\u010f\u0114\5\34\17\2\u0110"+
		"\u0111\7\30\2\2\u0111\u0113\5\34\17\2\u0112\u0110\3\2\2\2\u0113\u0116"+
		"\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0118\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u010f\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011a\7\16\2\2\u011a\37\3\2\2\2\u011b\u0122\5\"\22\2\u011c"+
		"\u0122\5$\23\2\u011d\u0122\5&\24\2\u011e\u0122\5(\25\2\u011f\u0122\5*"+
		"\26\2\u0120\u0122\5,\27\2\u0121\u011b\3\2\2\2\u0121\u011c\3\2\2\2\u0121"+
		"\u011d\3\2\2\2\u0121\u011e\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2"+
		"\2\2\u0122!\3\2\2\2\u0123\u0124\7\61\2\2\u0124#\3\2\2\2\u0125\u0126\7"+
		"\36\2\2\u0126%\3\2\2\2\u0127\u0128\7\36\2\2\u0128\u0129\7\f\2\2\u0129"+
		"\u012a\7\r\2\2\u012a\'\3\2\2\2\u012b\u012c\7(\2\2\u012c)\3\2\2\2\u012d"+
		"\u012e\7)\2\2\u012e+\3\2\2\2\u012f\u0130\7\13\2\2\u0130-\3\2\2\2\24\62"+
		"RXkqz\u0093\u00ac\u00b3\u00ba\u00d9\u00f8\u00fe\u0109\u010b\u0114\u0117"+
		"\u0121";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}