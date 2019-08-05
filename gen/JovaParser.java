// Generated from /home/glouwa/Uni/CC/cc16/Jova.g4 by ANTLR 4.5.1

	package at.tugraz.ist.cc.antlr.gen;
    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JovaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, WS=7, KEY_CLASS=8, KEY_IF=9, 
		KEY_ELSE=10, KEY_WHILE=11, KEY_RETURN=12, KEY_NEW=13, KEY_NIX=14, ASSIGN=15, 
		RELOP=16, MULOP=17, AND=18, OR=19, SIGN=20, NOT=21, DOTOP=22, INT=23, 
		BOOL=24, AMOD=25, PRIMITIVE_TYPE=26, CLASS_TYPE=27, ID=28, LITERAL=29;
	public static final int
		RULE_program = 0, RULE_type = 1, RULE_id_list = 2, RULE_class_decls = 3, 
		RULE_class_decl = 4, RULE_class_head = 5, RULE_class_body = 6, RULE_member_decls_ = 7, 
		RULE_method_decls_ = 8, RULE_member_decls = 9, RULE_member_decl = 10, 
		RULE_method_decls = 11, RULE_method_decl = 12, RULE_method_head = 13, 
		RULE_params = 14, RULE_param_list = 15, RULE_method_body = 16, RULE_declaration = 17, 
		RULE_stmt = 18, RULE_assignment = 19, RULE_ret_stmt = 20, RULE_if_stmt = 21, 
		RULE_while_stmt = 22, RULE_member_access = 23, RULE_object_alloc = 24, 
		RULE_compound_stmt = 25, RULE_expr = 26, RULE_operand = 27, RULE_id_operand = 28, 
		RULE_arg_list = 29, RULE_args = 30;
	public static final String[] ruleNames = {
		"program", "type", "id_list", "class_decls", "class_decl", "class_head", 
		"class_body", "member_decls_", "method_decls_", "member_decls", "member_decl", 
		"method_decls", "method_decl", "method_head", "params", "param_list", 
		"method_body", "declaration", "stmt", "assignment", "ret_stmt", "if_stmt", 
		"while_stmt", "member_access", "object_alloc", "compound_stmt", "expr", 
		"operand", "id_operand", "arg_list", "args"
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

	@Override
	public String getGrammarFileName() { return "Jova.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JovaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Class_declsContext class_decls() {
			return getRuleContext(Class_declsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JovaParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			class_decls(0);
			setState(63);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode PRIMITIVE_TYPE() { return getToken(JovaParser.PRIMITIVE_TYPE, 0); }
		public TerminalNode CLASS_TYPE() { return getToken(JovaParser.CLASS_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !(_la==PRIMITIVE_TYPE || _la==CLASS_TYPE) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Id_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JovaParser.ID, 0); }
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public Id_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterId_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitId_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitId_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_listContext id_list() throws RecognitionException {
		return id_list(0);
	}

	private Id_listContext id_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Id_listContext _localctx = new Id_listContext(_ctx, _parentState);
		Id_listContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_id_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(68);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Id_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_id_list);
					setState(70);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(71);
					match(T__0);
					setState(72);
					match(ID);
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class Class_declsContext extends ParserRuleContext {
		public Class_declsContext class_decls() {
			return getRuleContext(Class_declsContext.class,0);
		}
		public Class_declContext class_decl() {
			return getRuleContext(Class_declContext.class,0);
		}
		public Class_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterClass_decls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitClass_decls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitClass_decls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declsContext class_decls() throws RecognitionException {
		return class_decls(0);
	}

	private Class_declsContext class_decls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Class_declsContext _localctx = new Class_declsContext(_ctx, _parentState);
		Class_declsContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_class_decls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Class_declsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_class_decls);
					setState(79);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(80);
					class_decl();
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class Class_declContext extends ParserRuleContext {
		public Class_headContext class_head() {
			return getRuleContext(Class_headContext.class,0);
		}
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public Class_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterClass_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitClass_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitClass_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declContext class_decl() throws RecognitionException {
		Class_declContext _localctx = new Class_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_class_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			class_head();
			setState(87);
			class_body();
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

	public static class Class_headContext extends ParserRuleContext {
		public TerminalNode KEY_CLASS() { return getToken(JovaParser.KEY_CLASS, 0); }
		public TerminalNode CLASS_TYPE() { return getToken(JovaParser.CLASS_TYPE, 0); }
		public Class_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterClass_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitClass_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitClass_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_headContext class_head() throws RecognitionException {
		Class_headContext _localctx = new Class_headContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_class_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(KEY_CLASS);
			setState(90);
			match(CLASS_TYPE);
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

	public static class Class_bodyContext extends ParserRuleContext {
		public Member_decls_Context member_decls_() {
			return getRuleContext(Member_decls_Context.class,0);
		}
		public Method_decls_Context method_decls_() {
			return getRuleContext(Method_decls_Context.class,0);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_class_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__1);
			setState(93);
			member_decls_();
			setState(94);
			method_decls_();
			setState(95);
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

	public static class Member_decls_Context extends ParserRuleContext {
		public Member_decls_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_decls_; }
	 
		public Member_decls_Context() { }
		public void copyFrom(Member_decls_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MEMBER_DECLContext extends Member_decls_Context {
		public Member_declsContext member_decls() {
			return getRuleContext(Member_declsContext.class,0);
		}
		public MEMBER_DECLContext(Member_decls_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterMEMBER_DECL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitMEMBER_DECL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitMEMBER_DECL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_decls_Context member_decls_() throws RecognitionException {
		Member_decls_Context _localctx = new Member_decls_Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_member_decls_);
		try {
			_localctx = new MEMBER_DECLContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			member_decls(0);
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

	public static class Method_decls_Context extends ParserRuleContext {
		public Method_decls_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decls_; }
	 
		public Method_decls_Context() { }
		public void copyFrom(Method_decls_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class METHOD_DECLContext extends Method_decls_Context {
		public Method_declsContext method_decls() {
			return getRuleContext(Method_declsContext.class,0);
		}
		public METHOD_DECLContext(Method_decls_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterMETHOD_DECL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitMETHOD_DECL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitMETHOD_DECL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_decls_Context method_decls_() throws RecognitionException {
		Method_decls_Context _localctx = new Method_decls_Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_method_decls_);
		try {
			_localctx = new METHOD_DECLContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			method_decls(0);
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

	public static class Member_declsContext extends ParserRuleContext {
		public Member_declsContext member_decls() {
			return getRuleContext(Member_declsContext.class,0);
		}
		public Member_declContext member_decl() {
			return getRuleContext(Member_declContext.class,0);
		}
		public Member_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterMember_decls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitMember_decls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitMember_decls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_declsContext member_decls() throws RecognitionException {
		return member_decls(0);
	}

	private Member_declsContext member_decls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Member_declsContext _localctx = new Member_declsContext(_ctx, _parentState);
		Member_declsContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_member_decls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Member_declsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_member_decls);
					setState(102);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(103);
					member_decl();
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class Member_declContext extends ParserRuleContext {
		public Member_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_decl; }
	 
		public Member_declContext() { }
		public void copyFrom(Member_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MEMBERContext extends Member_declContext {
		public TerminalNode AMOD() { return getToken(JovaParser.AMOD, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public MEMBERContext(Member_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterMEMBER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitMEMBER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitMEMBER(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_declContext member_decl() throws RecognitionException {
		Member_declContext _localctx = new Member_declContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_member_decl);
		try {
			_localctx = new MEMBERContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(AMOD);
			setState(110);
			type();
			setState(111);
			id_list(0);
			setState(112);
			match(T__3);
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

	public static class Method_declsContext extends ParserRuleContext {
		public Method_declsContext method_decls() {
			return getRuleContext(Method_declsContext.class,0);
		}
		public Method_declContext method_decl() {
			return getRuleContext(Method_declContext.class,0);
		}
		public Method_declsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterMethod_decls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitMethod_decls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitMethod_decls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declsContext method_decls() throws RecognitionException {
		return method_decls(0);
	}

	private Method_declsContext method_decls(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Method_declsContext _localctx = new Method_declsContext(_ctx, _parentState);
		Method_declsContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_method_decls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Method_declsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_method_decls);
					setState(115);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(116);
					method_decl();
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class Method_declContext extends ParserRuleContext {
		public Method_headContext method_head() {
			return getRuleContext(Method_headContext.class,0);
		}
		public Method_bodyContext method_body() {
			return getRuleContext(Method_bodyContext.class,0);
		}
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitMethod_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitMethod_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_method_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			method_head();
			setState(123);
			method_body();
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

	public static class Method_headContext extends ParserRuleContext {
		public Method_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_head; }
	 
		public Method_headContext() { }
		public void copyFrom(Method_headContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class METHODContext extends Method_headContext {
		public TerminalNode AMOD() { return getToken(JovaParser.AMOD, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JovaParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public METHODContext(Method_headContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterMETHOD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitMETHOD(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitMETHOD(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_headContext method_head() throws RecognitionException {
		Method_headContext _localctx = new Method_headContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_method_head);
		try {
			_localctx = new METHODContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(AMOD);
			setState(126);
			type();
			setState(127);
			match(ID);
			setState(128);
			params();
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

	public static class ParamsContext extends ParserRuleContext {
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__4);
			setState(132);
			_la = _input.LA(1);
			if (_la==PRIMITIVE_TYPE || _la==CLASS_TYPE) {
				{
				setState(131);
				param_list();
				}
			}

			setState(134);
			match(T__5);
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

	public static class Param_listContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(JovaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JovaParser.ID, i);
		}
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterParam_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitParam_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitParam_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		Param_listContext _localctx = new Param_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_param_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			type();
			setState(137);
			match(ID);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(138);
				match(T__0);
				setState(139);
				type();
				setState(140);
				match(ID);
				}
				}
				setState(146);
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

	public static class Method_bodyContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Ret_stmtContext ret_stmt() {
			return getRuleContext(Ret_stmtContext.class,0);
		}
		public Method_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterMethod_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitMethod_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitMethod_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_bodyContext method_body() throws RecognitionException {
		Method_bodyContext _localctx = new Method_bodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_method_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__1);
			setState(148);
			declaration(0);
			setState(149);
			stmt(0);
			setState(150);
			ret_stmt();
			setState(151);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		return declaration(0);
	}

	private DeclarationContext declaration(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationContext _localctx = new DeclarationContext(_ctx, _parentState);
		DeclarationContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_declaration, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(154);
				type();
				setState(155);
				id_list(0);
				setState(156);
				match(T__3);
				}
				break;
			case 2:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declaration);
					setState(161);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(162);
					type();
					setState(163);
					id_list(0);
					setState(164);
					match(T__3);
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		return stmt(0);
	}

	private StmtContext stmt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StmtContext _localctx = new StmtContext(_ctx, _parentState);
		StmtContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_stmt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(180);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new StmtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(172);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(173);
						if_stmt();
						}
						break;
					case 2:
						{
						_localctx = new StmtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(174);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(175);
						while_stmt();
						}
						break;
					case 3:
						{
						_localctx = new StmtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(176);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(177);
						assignment();
						setState(178);
						match(T__3);
						}
						break;
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class AssignmentContext extends ParserRuleContext {
		public Member_accessContext member_access() {
			return getRuleContext(Member_accessContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JovaParser.ASSIGN, 0); }
		public Object_allocContext object_alloc() {
			return getRuleContext(Object_allocContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			member_access();
			setState(186);
			match(ASSIGN);
			setState(189);
			switch (_input.LA(1)) {
			case KEY_NEW:
				{
				setState(187);
				object_alloc();
				}
				break;
			case T__4:
			case KEY_NIX:
			case SIGN:
			case NOT:
			case INT:
			case BOOL:
			case ID:
			case LITERAL:
				{
				setState(188);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Ret_stmtContext extends ParserRuleContext {
		public TerminalNode KEY_RETURN() { return getToken(JovaParser.KEY_RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Ret_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterRet_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitRet_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitRet_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ret_stmtContext ret_stmt() throws RecognitionException {
		Ret_stmtContext _localctx = new Ret_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ret_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(KEY_RETURN);
			setState(192);
			expr(0);
			setState(193);
			match(T__3);
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode KEY_IF() { return getToken(JovaParser.KEY_IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Compound_stmtContext> compound_stmt() {
			return getRuleContexts(Compound_stmtContext.class);
		}
		public Compound_stmtContext compound_stmt(int i) {
			return getRuleContext(Compound_stmtContext.class,i);
		}
		public TerminalNode KEY_ELSE() { return getToken(JovaParser.KEY_ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_if_stmt);
		try {
			setState(209);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(KEY_IF);
				setState(196);
				match(T__4);
				setState(197);
				expr(0);
				setState(198);
				match(T__5);
				setState(199);
				compound_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(KEY_IF);
				setState(202);
				match(T__4);
				setState(203);
				expr(0);
				setState(204);
				match(T__5);
				setState(205);
				compound_stmt();
				setState(206);
				match(KEY_ELSE);
				setState(207);
				compound_stmt();
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

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode KEY_WHILE() { return getToken(JovaParser.KEY_WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(KEY_WHILE);
			setState(212);
			match(T__4);
			setState(213);
			expr(0);
			setState(214);
			match(T__5);
			setState(215);
			compound_stmt();
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

	public static class Member_accessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JovaParser.ID, 0); }
		public TerminalNode DOTOP() { return getToken(JovaParser.DOTOP, 0); }
		public Member_accessContext member_access() {
			return getRuleContext(Member_accessContext.class,0);
		}
		public Member_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterMember_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitMember_access(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitMember_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_accessContext member_access() throws RecognitionException {
		Member_accessContext _localctx = new Member_accessContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_member_access);
		try {
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(ID);
				setState(218);
				match(DOTOP);
				setState(219);
				member_access();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(ID);
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

	public static class Object_allocContext extends ParserRuleContext {
		public TerminalNode KEY_NEW() { return getToken(JovaParser.KEY_NEW, 0); }
		public TerminalNode CLASS_TYPE() { return getToken(JovaParser.CLASS_TYPE, 0); }
		public Object_allocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object_alloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterObject_alloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitObject_alloc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitObject_alloc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object_allocContext object_alloc() throws RecognitionException {
		Object_allocContext _localctx = new Object_allocContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_object_alloc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(KEY_NEW);
			setState(224);
			match(CLASS_TYPE);
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

	public static class Compound_stmtContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitCompound_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitCompound_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_compound_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__1);
			setState(227);
			stmt(0);
			setState(228);
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

	public static class ExprContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MULOP() { return getToken(JovaParser.MULOP, 0); }
		public TerminalNode SIGN() { return getToken(JovaParser.SIGN, 0); }
		public TerminalNode RELOP() { return getToken(JovaParser.RELOP, 0); }
		public TerminalNode OR() { return getToken(JovaParser.OR, 0); }
		public TerminalNode AND() { return getToken(JovaParser.AND, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(231);
			operand();
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(248);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(234);
						match(MULOP);
						setState(235);
						operand();
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(237);
						match(SIGN);
						setState(238);
						operand();
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(240);
						match(RELOP);
						setState(241);
						operand();
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(243);
						match(OR);
						setState(244);
						operand();
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(246);
						match(AND);
						setState(247);
						operand();
						}
						break;
					}
					} 
				}
				setState(252);
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

	public static class OperandContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JovaParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(JovaParser.BOOL, 0); }
		public TerminalNode LITERAL() { return getToken(JovaParser.LITERAL, 0); }
		public TerminalNode KEY_NIX() { return getToken(JovaParser.KEY_NIX, 0); }
		public TerminalNode NOT() { return getToken(JovaParser.NOT, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode SIGN() { return getToken(JovaParser.SIGN, 0); }
		public Id_operandContext id_operand() {
			return getRuleContext(Id_operandContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operand);
		try {
			setState(266);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(INT);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(BOOL);
				}
				break;
			case LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				match(LITERAL);
				}
				break;
			case KEY_NIX:
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				match(KEY_NIX);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				match(NOT);
				setState(258);
				operand();
				}
				break;
			case SIGN:
				enterOuterAlt(_localctx, 6);
				{
				setState(259);
				match(SIGN);
				setState(260);
				operand();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(261);
				id_operand();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 8);
				{
				setState(262);
				match(T__4);
				setState(263);
				expr(0);
				setState(264);
				match(T__5);
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

	public static class Id_operandContext extends ParserRuleContext {
		public Member_accessContext member_access() {
			return getRuleContext(Member_accessContext.class,0);
		}
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public Id_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterId_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitId_operand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitId_operand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_operandContext id_operand() throws RecognitionException {
		Id_operandContext _localctx = new Id_operandContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_id_operand);
		try {
			setState(274);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				member_access();
				setState(269);
				match(T__4);
				setState(270);
				arg_list();
				setState(271);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				member_access();
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

	public static class Arg_listContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterArg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitArg_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitArg_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_arg_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << KEY_NIX) | (1L << SIGN) | (1L << NOT) | (1L << INT) | (1L << BOOL) | (1L << ID) | (1L << LITERAL))) != 0)) {
				{
				setState(276);
				args(0);
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

	public static class ArgsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		return args(0);
	}

	private ArgsContext args(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgsContext _localctx = new ArgsContext(_ctx, _parentState);
		ArgsContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_args, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(280);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_args);
					setState(282);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(283);
					match(T__0);
					setState(284);
					expr(0);
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return id_list_sempred((Id_listContext)_localctx, predIndex);
		case 3:
			return class_decls_sempred((Class_declsContext)_localctx, predIndex);
		case 9:
			return member_decls_sempred((Member_declsContext)_localctx, predIndex);
		case 11:
			return method_decls_sempred((Method_declsContext)_localctx, predIndex);
		case 17:
			return declaration_sempred((DeclarationContext)_localctx, predIndex);
		case 18:
			return stmt_sempred((StmtContext)_localctx, predIndex);
		case 26:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 30:
			return args_sempred((ArgsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean id_list_sempred(Id_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean class_decls_sempred(Class_declsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean member_decls_sempred(Member_declsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean method_decls_sempred(Method_declsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean declaration_sempred(DeclarationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean stmt_sempred(StmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean args_sempred(ArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u0125\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\5\3"+
		"\5\3\5\7\5T\n\5\f\5\16\5W\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\7\13k\n\13\f\13\16\13n\13\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\7\rx\n\r\f\r\16\r{\13\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\5\20\u0087\n\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u0091\n\21\f\21\16\21\u0094\13\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00a2\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u00a9\n\23\f\23\16\23\u00ac\13\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00b7\n\24\f\24\16\24\u00ba\13\24"+
		"\3\25\3\25\3\25\3\25\5\25\u00c0\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00d4\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u00e0\n\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u00fb\n\34\f\34"+
		"\16\34\u00fe\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\5\35\u010d\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0115"+
		"\n\36\3\37\5\37\u0118\n\37\3 \3 \3 \3 \3 \3 \7 \u0120\n \f \16 \u0123"+
		"\13 \3 \2\n\6\b\24\30$&\66>!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>\2\3\3\2\34\35\u0122\2@\3\2\2\2\4C\3\2\2\2\6E\3"+
		"\2\2\2\bP\3\2\2\2\nX\3\2\2\2\f[\3\2\2\2\16^\3\2\2\2\20c\3\2\2\2\22e\3"+
		"\2\2\2\24g\3\2\2\2\26o\3\2\2\2\30t\3\2\2\2\32|\3\2\2\2\34\177\3\2\2\2"+
		"\36\u0084\3\2\2\2 \u008a\3\2\2\2\"\u0095\3\2\2\2$\u00a1\3\2\2\2&\u00ad"+
		"\3\2\2\2(\u00bb\3\2\2\2*\u00c1\3\2\2\2,\u00d3\3\2\2\2.\u00d5\3\2\2\2\60"+
		"\u00df\3\2\2\2\62\u00e1\3\2\2\2\64\u00e4\3\2\2\2\66\u00e8\3\2\2\28\u010c"+
		"\3\2\2\2:\u0114\3\2\2\2<\u0117\3\2\2\2>\u0119\3\2\2\2@A\5\b\5\2AB\7\2"+
		"\2\3B\3\3\2\2\2CD\t\2\2\2D\5\3\2\2\2EF\b\4\1\2FG\7\36\2\2GM\3\2\2\2HI"+
		"\f\3\2\2IJ\7\3\2\2JL\7\36\2\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2"+
		"N\7\3\2\2\2OM\3\2\2\2PU\b\5\1\2QR\f\4\2\2RT\5\n\6\2SQ\3\2\2\2TW\3\2\2"+
		"\2US\3\2\2\2UV\3\2\2\2V\t\3\2\2\2WU\3\2\2\2XY\5\f\7\2YZ\5\16\b\2Z\13\3"+
		"\2\2\2[\\\7\n\2\2\\]\7\35\2\2]\r\3\2\2\2^_\7\4\2\2_`\5\20\t\2`a\5\22\n"+
		"\2ab\7\5\2\2b\17\3\2\2\2cd\5\24\13\2d\21\3\2\2\2ef\5\30\r\2f\23\3\2\2"+
		"\2gl\b\13\1\2hi\f\4\2\2ik\5\26\f\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2"+
		"\2\2m\25\3\2\2\2nl\3\2\2\2op\7\33\2\2pq\5\4\3\2qr\5\6\4\2rs\7\6\2\2s\27"+
		"\3\2\2\2ty\b\r\1\2uv\f\4\2\2vx\5\32\16\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2"+
		"yz\3\2\2\2z\31\3\2\2\2{y\3\2\2\2|}\5\34\17\2}~\5\"\22\2~\33\3\2\2\2\177"+
		"\u0080\7\33\2\2\u0080\u0081\5\4\3\2\u0081\u0082\7\36\2\2\u0082\u0083\5"+
		"\36\20\2\u0083\35\3\2\2\2\u0084\u0086\7\7\2\2\u0085\u0087\5 \21\2\u0086"+
		"\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\b"+
		"\2\2\u0089\37\3\2\2\2\u008a\u008b\5\4\3\2\u008b\u0092\7\36\2\2\u008c\u008d"+
		"\7\3\2\2\u008d\u008e\5\4\3\2\u008e\u008f\7\36\2\2\u008f\u0091\3\2\2\2"+
		"\u0090\u008c\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093!\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7\4\2\2\u0096"+
		"\u0097\5$\23\2\u0097\u0098\5&\24\2\u0098\u0099\5*\26\2\u0099\u009a\7\5"+
		"\2\2\u009a#\3\2\2\2\u009b\u009c\b\23\1\2\u009c\u009d\5\4\3\2\u009d\u009e"+
		"\5\6\4\2\u009e\u009f\7\6\2\2\u009f\u00a2\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u009b\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00aa\3\2\2\2\u00a3\u00a4\f\4"+
		"\2\2\u00a4\u00a5\5\4\3\2\u00a5\u00a6\5\6\4\2\u00a6\u00a7\7\6\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab%\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b8"+
		"\b\24\1\2\u00ae\u00af\f\6\2\2\u00af\u00b7\5,\27\2\u00b0\u00b1\f\5\2\2"+
		"\u00b1\u00b7\5.\30\2\u00b2\u00b3\f\4\2\2\u00b3\u00b4\5(\25\2\u00b4\u00b5"+
		"\7\6\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6"+
		"\u00b2\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\'\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\5\60\31\2\u00bc\u00bf"+
		"\7\21\2\2\u00bd\u00c0\5\62\32\2\u00be\u00c0\5\66\34\2\u00bf\u00bd\3\2"+
		"\2\2\u00bf\u00be\3\2\2\2\u00c0)\3\2\2\2\u00c1\u00c2\7\16\2\2\u00c2\u00c3"+
		"\5\66\34\2\u00c3\u00c4\7\6\2\2\u00c4+\3\2\2\2\u00c5\u00c6\7\13\2\2\u00c6"+
		"\u00c7\7\7\2\2\u00c7\u00c8\5\66\34\2\u00c8\u00c9\7\b\2\2\u00c9\u00ca\5"+
		"\64\33\2\u00ca\u00d4\3\2\2\2\u00cb\u00cc\7\13\2\2\u00cc\u00cd\7\7\2\2"+
		"\u00cd\u00ce\5\66\34\2\u00ce\u00cf\7\b\2\2\u00cf\u00d0\5\64\33\2\u00d0"+
		"\u00d1\7\f\2\2\u00d1\u00d2\5\64\33\2\u00d2\u00d4\3\2\2\2\u00d3\u00c5\3"+
		"\2\2\2\u00d3\u00cb\3\2\2\2\u00d4-\3\2\2\2\u00d5\u00d6\7\r\2\2\u00d6\u00d7"+
		"\7\7\2\2\u00d7\u00d8\5\66\34\2\u00d8\u00d9\7\b\2\2\u00d9\u00da\5\64\33"+
		"\2\u00da/\3\2\2\2\u00db\u00dc\7\36\2\2\u00dc\u00dd\7\30\2\2\u00dd\u00e0"+
		"\5\60\31\2\u00de\u00e0\7\36\2\2\u00df\u00db\3\2\2\2\u00df\u00de\3\2\2"+
		"\2\u00e0\61\3\2\2\2\u00e1\u00e2\7\17\2\2\u00e2\u00e3\7\35\2\2\u00e3\63"+
		"\3\2\2\2\u00e4\u00e5\7\4\2\2\u00e5\u00e6\5&\24\2\u00e6\u00e7\7\5\2\2\u00e7"+
		"\65\3\2\2\2\u00e8\u00e9\b\34\1\2\u00e9\u00ea\58\35\2\u00ea\u00fc\3\2\2"+
		"\2\u00eb\u00ec\f\b\2\2\u00ec\u00ed\7\23\2\2\u00ed\u00fb\58\35\2\u00ee"+
		"\u00ef\f\7\2\2\u00ef\u00f0\7\26\2\2\u00f0\u00fb\58\35\2\u00f1\u00f2\f"+
		"\6\2\2\u00f2\u00f3\7\22\2\2\u00f3\u00fb\58\35\2\u00f4\u00f5\f\5\2\2\u00f5"+
		"\u00f6\7\25\2\2\u00f6\u00fb\58\35\2\u00f7\u00f8\f\4\2\2\u00f8\u00f9\7"+
		"\24\2\2\u00f9\u00fb\58\35\2\u00fa\u00eb\3\2\2\2\u00fa\u00ee\3\2\2\2\u00fa"+
		"\u00f1\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fb\u00fe\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\67\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00ff\u010d\7\31\2\2\u0100\u010d\7\32\2\2\u0101\u010d\7\37\2"+
		"\2\u0102\u010d\7\20\2\2\u0103\u0104\7\27\2\2\u0104\u010d\58\35\2\u0105"+
		"\u0106\7\26\2\2\u0106\u010d\58\35\2\u0107\u010d\5:\36\2\u0108\u0109\7"+
		"\7\2\2\u0109\u010a\5\66\34\2\u010a\u010b\7\b\2\2\u010b\u010d\3\2\2\2\u010c"+
		"\u00ff\3\2\2\2\u010c\u0100\3\2\2\2\u010c\u0101\3\2\2\2\u010c\u0102\3\2"+
		"\2\2\u010c\u0103\3\2\2\2\u010c\u0105\3\2\2\2\u010c\u0107\3\2\2\2\u010c"+
		"\u0108\3\2\2\2\u010d9\3\2\2\2\u010e\u010f\5\60\31\2\u010f\u0110\7\7\2"+
		"\2\u0110\u0111\5<\37\2\u0111\u0112\7\b\2\2\u0112\u0115\3\2\2\2\u0113\u0115"+
		"\5\60\31\2\u0114\u010e\3\2\2\2\u0114\u0113\3\2\2\2\u0115;\3\2\2\2\u0116"+
		"\u0118\5> \2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118=\3\2\2\2\u0119"+
		"\u011a\b \1\2\u011a\u011b\5\66\34\2\u011b\u0121\3\2\2\2\u011c\u011d\f"+
		"\3\2\2\u011d\u011e\7\3\2\2\u011e\u0120\5\66\34\2\u011f\u011c\3\2\2\2\u0120"+
		"\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122?\3\2\2\2"+
		"\u0123\u0121\3\2\2\2\25MUly\u0086\u0092\u00a1\u00aa\u00b6\u00b8\u00bf"+
		"\u00d3\u00df\u00fa\u00fc\u010c\u0114\u0117\u0121";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}