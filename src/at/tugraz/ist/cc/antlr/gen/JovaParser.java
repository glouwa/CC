// Generated from Jova.g4 by ANTLR 4.5

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
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, WS=7, KEY_CLASS=8, KEY_IF=9, 
		KEY_ELSE=10, KEY_WHILE=11, KEY_RETURN=12, KEY_NEW=13, KEY_NIX=14, ASSIGN=15, 
		RELOP=16, MULOP=17, AND=18, OR=19, SIGN=20, NOT=21, DOTOP=22, INT=23, 
		BOOL=24, AMOD=25, PRIMITIVE_TYPE=26, CLASS_TYPE=27, ID=28, LITERAL=29;
	public static final int
		RULE_program = 0, RULE_type = 1, RULE_class_decls = 2, RULE_class_decl = 3, 
		RULE_class_head = 4, RULE_class_body = 5, RULE_member_decls = 6, RULE_member_decl = 7, 
		RULE_method_decls = 8, RULE_method_decl = 9, RULE_method_head = 10, RULE_method_params = 11, 
		RULE_param_list = 12, RULE_param = 13, RULE_method_body = 14, RULE_declarations = 15, 
		RULE_declaration = 16, RULE_id_list = 17, RULE_stmt = 18, RULE_assignment = 19, 
		RULE_ret_stmt = 20, RULE_if_stmt = 21, RULE_while_stmt = 22, RULE_member_access = 23, 
		RULE_object_alloc = 24, RULE_compound_stmt = 25, RULE_expr = 26, RULE_operand = 27, 
		RULE_id_operand = 28, RULE_arg_list = 29, RULE_args = 30;
	public static final String[] ruleNames = {
		"program", "type", "class_decls", "class_decl", "class_head", "class_body", 
		"member_decls", "member_decl", "method_decls", "method_decl", "method_head", 
		"method_params", "param_list", "param", "method_body", "declarations", 
		"declaration", "id_list", "stmt", "assignment", "ret_stmt", "if_stmt", 
		"while_stmt", "member_access", "object_alloc", "compound_stmt", "expr", 
		"operand", "id_operand", "arg_list", "args"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'('", "')'", "','", "';'", null, "'class'", "'if'", 
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
			class_decls();
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

	public static class Class_declsContext extends ParserRuleContext {
		public List<Class_declContext> class_decl() {
			return getRuleContexts(Class_declContext.class);
		}
		public Class_declContext class_decl(int i) {
			return getRuleContext(Class_declContext.class,i);
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
		Class_declsContext _localctx = new Class_declsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_decls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				class_decl();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KEY_CLASS );
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
		enterRule(_localctx, 6, RULE_class_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			class_head();
			setState(73);
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
		enterRule(_localctx, 8, RULE_class_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(KEY_CLASS);
			setState(76);
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
		public Member_declsContext member_decls() {
			return getRuleContext(Member_declsContext.class,0);
		}
		public Method_declsContext method_decls() {
			return getRuleContext(Method_declsContext.class,0);
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
		enterRule(_localctx, 10, RULE_class_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__0);
			setState(79);
			member_decls(0);
			setState(80);
			method_decls(0);
			setState(81);
			match(T__1);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_member_decls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Member_declsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_member_decls);
					setState(84);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(85);
					member_decl();
					}
					} 
				}
				setState(90);
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

	public static class Member_declContext extends ParserRuleContext {
		public TerminalNode AMOD() { return getToken(JovaParser.AMOD, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Member_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterMember_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitMember_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitMember_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_declContext member_decl() throws RecognitionException {
		Member_declContext _localctx = new Member_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_member_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(AMOD);
			setState(92);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_method_decls, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Method_declsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_method_decls);
					setState(95);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(96);
					method_decl();
					}
					} 
				}
				setState(101);
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
		enterRule(_localctx, 18, RULE_method_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			method_head();
			setState(103);
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
		public TerminalNode AMOD() { return getToken(JovaParser.AMOD, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JovaParser.ID, 0); }
		public Method_paramsContext method_params() {
			return getRuleContext(Method_paramsContext.class,0);
		}
		public Method_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterMethod_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitMethod_head(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitMethod_head(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_headContext method_head() throws RecognitionException {
		Method_headContext _localctx = new Method_headContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_method_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(AMOD);
			setState(106);
			type();
			setState(107);
			match(ID);
			setState(108);
			method_params();
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

	public static class Method_paramsContext extends ParserRuleContext {
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public Method_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterMethod_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitMethod_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitMethod_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_paramsContext method_params() throws RecognitionException {
		Method_paramsContext _localctx = new Method_paramsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_method_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__2);
			setState(112);
			_la = _input.LA(1);
			if (_la==PRIMITIVE_TYPE || _la==CLASS_TYPE) {
				{
				setState(111);
				param_list(0);
				}
			}

			setState(114);
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

	public static class Param_listContext extends ParserRuleContext {
		public Param_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_list; }
	 
		public Param_listContext() { }
		public void copyFrom(Param_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Param_list_elementContext extends Param_listContext {
		public Param_listContext param_list() {
			return getRuleContext(Param_listContext.class,0);
		}
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Param_list_elementContext(Param_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterParam_list_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitParam_list_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitParam_list_element(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Param_list_element_firstContext extends Param_listContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public Param_list_element_firstContext(Param_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterParam_list_element_first(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitParam_list_element_first(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitParam_list_element_first(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_listContext param_list() throws RecognitionException {
		return param_list(0);
	}

	private Param_listContext param_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Param_listContext _localctx = new Param_listContext(_ctx, _parentState);
		Param_listContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_param_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Param_list_element_firstContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(117);
			param();
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Param_list_elementContext(new Param_listContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_param_list);
					setState(119);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(120);
					match(T__4);
					setState(121);
					param();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(JovaParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			type();
			setState(128);
			match(ID);
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
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
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
		enterRule(_localctx, 28, RULE_method_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__0);
			setState(131);
			declarations();
			setState(132);
			stmt(0);
			setState(133);
			ret_stmt();
			setState(134);
			match(T__1);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(136);
					declaration();
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Id_listContext id_list() {
			return getRuleContext(Id_listContext.class,0);
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
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			type();
			setState(143);
			id_list(0);
			setState(144);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_id_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(147);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Id_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_id_list);
					setState(149);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(150);
					match(T__4);
					setState(151);
					match(ID);
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(166);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new StmtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(158);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(159);
						if_stmt();
						}
						break;
					case 2:
						{
						_localctx = new StmtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(160);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(161);
						while_stmt();
						}
						break;
					case 3:
						{
						_localctx = new StmtContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_stmt);
						setState(162);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(163);
						assignment();
						setState(164);
						match(T__5);
						}
						break;
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
			setState(171);
			member_access();
			setState(172);
			match(ASSIGN);
			setState(175);
			switch (_input.LA(1)) {
			case KEY_NEW:
				{
				setState(173);
				object_alloc();
				}
				break;
			case T__2:
			case KEY_NIX:
			case SIGN:
			case NOT:
			case INT:
			case BOOL:
			case ID:
			case LITERAL:
				{
				setState(174);
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
			setState(177);
			match(KEY_RETURN);
			setState(178);
			expr(0);
			setState(179);
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

	public static class If_stmtContext extends ParserRuleContext {
		public Compound_stmtContext ifBlock;
		public Compound_stmtContext elseBlock;
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
			setState(195);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(KEY_IF);
				setState(182);
				match(T__2);
				setState(183);
				expr(0);
				setState(184);
				match(T__3);
				setState(185);
				((If_stmtContext)_localctx).ifBlock = compound_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(KEY_IF);
				setState(188);
				match(T__2);
				setState(189);
				expr(0);
				setState(190);
				match(T__3);
				setState(191);
				((If_stmtContext)_localctx).ifBlock = compound_stmt();
				setState(192);
				match(KEY_ELSE);
				setState(193);
				((If_stmtContext)_localctx).elseBlock = compound_stmt();
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
		public Compound_stmtContext wBlock;
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
			setState(197);
			match(KEY_WHILE);
			setState(198);
			match(T__2);
			setState(199);
			expr(0);
			setState(200);
			match(T__3);
			setState(201);
			((While_stmtContext)_localctx).wBlock = compound_stmt();
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
		public Member_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_access; }
	 
		public Member_accessContext() { }
		public void copyFrom(Member_accessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MemberAccessElementContext extends Member_accessContext {
		public TerminalNode ID() { return getToken(JovaParser.ID, 0); }
		public TerminalNode DOTOP() { return getToken(JovaParser.DOTOP, 0); }
		public Member_accessContext member_access() {
			return getRuleContext(Member_accessContext.class,0);
		}
		public MemberAccessElementContext(Member_accessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterMemberAccessElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitMemberAccessElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitMemberAccessElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberAccessLastContext extends Member_accessContext {
		public TerminalNode ID() { return getToken(JovaParser.ID, 0); }
		public MemberAccessLastContext(Member_accessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterMemberAccessLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitMemberAccessLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitMemberAccessLast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Member_accessContext member_access() throws RecognitionException {
		Member_accessContext _localctx = new Member_accessContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_member_access);
		try {
			setState(207);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new MemberAccessElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(ID);
				setState(204);
				match(DOTOP);
				setState(205);
				member_access();
				}
				break;
			case 2:
				_localctx = new MemberAccessLastContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
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
			setState(209);
			match(KEY_NEW);
			setState(210);
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
			setState(212);
			match(T__0);
			setState(213);
			stmt(0);
			setState(214);
			match(T__1);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpOpAndContext extends ExprContext {
		public ExprContext lhs;
		public ExprContext rhs;
		public TerminalNode AND() { return getToken(JovaParser.AND, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExpOpAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterExpOpAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitExpOpAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitExpOpAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpOpSignContext extends ExprContext {
		public ExprContext lhs;
		public ExprContext rhs;
		public TerminalNode SIGN() { return getToken(JovaParser.SIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExpOpSignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterExpOpSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitExpOpSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitExpOpSign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpOpRelContext extends ExprContext {
		public ExprContext lhs;
		public ExprContext rhs;
		public TerminalNode RELOP() { return getToken(JovaParser.RELOP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExpOpRelContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterExpOpRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitExpOpRel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitExpOpRel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpOpOrContext extends ExprContext {
		public ExprContext lhs;
		public ExprContext rhs;
		public TerminalNode OR() { return getToken(JovaParser.OR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExpOpOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterExpOpOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitExpOpOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitExpOpOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpOperandContext extends ExprContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ExpOperandContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterExpOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitExpOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitExpOperand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpOpMulContext extends ExprContext {
		public ExprContext lhs;
		public ExprContext rhs;
		public TerminalNode MULOP() { return getToken(JovaParser.MULOP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExpOpMulContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterExpOpMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitExpOpMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitExpOpMul(this);
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
			_localctx = new ExpOperandContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(217);
			operand();
			}
			_ctx.stop = _input.LT(-1);
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(234);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpOpMulContext(new ExprContext(_parentctx, _parentState));
						((ExpOpMulContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(219);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(220);
						match(MULOP);
						setState(221);
						((ExpOpMulContext)_localctx).rhs = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpOpSignContext(new ExprContext(_parentctx, _parentState));
						((ExpOpSignContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(223);
						match(SIGN);
						setState(224);
						((ExpOpSignContext)_localctx).rhs = expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpOpRelContext(new ExprContext(_parentctx, _parentState));
						((ExpOpRelContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(226);
						match(RELOP);
						setState(227);
						((ExpOpRelContext)_localctx).rhs = expr(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpOpOrContext(new ExprContext(_parentctx, _parentState));
						((ExpOpOrContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(229);
						match(OR);
						setState(230);
						((ExpOpOrContext)_localctx).rhs = expr(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpOpAndContext(new ExprContext(_parentctx, _parentState));
						((ExpOpAndContext)_localctx).lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(231);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(232);
						match(AND);
						setState(233);
						((ExpOpAndContext)_localctx).rhs = expr(2);
						}
						break;
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	 
		public OperandContext() { }
		public void copyFrom(OperandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpNixContext extends OperandContext {
		public TerminalNode KEY_NIX() { return getToken(JovaParser.KEY_NIX, 0); }
		public OpNixContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterOpNix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitOpNix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitOpNix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpExpContext extends OperandContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OpExpContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterOpExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitOpExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitOpExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpIntContext extends OperandContext {
		public TerminalNode INT() { return getToken(JovaParser.INT, 0); }
		public OpIntContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterOpInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitOpInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitOpInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpBoolContext extends OperandContext {
		public TerminalNode BOOL() { return getToken(JovaParser.BOOL, 0); }
		public OpBoolContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterOpBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitOpBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitOpBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpLiteralContext extends OperandContext {
		public TerminalNode LITERAL() { return getToken(JovaParser.LITERAL, 0); }
		public OpLiteralContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterOpLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitOpLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitOpLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpIdContext extends OperandContext {
		public Id_operandContext id_operand() {
			return getRuleContext(Id_operandContext.class,0);
		}
		public OpIdContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterOpId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitOpId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitOpId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpSignContext extends OperandContext {
		public TerminalNode SIGN() { return getToken(JovaParser.SIGN, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public OpSignContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterOpSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitOpSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitOpSign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpNotContext extends OperandContext {
		public TerminalNode NOT() { return getToken(JovaParser.NOT, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public OpNotContext(OperandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterOpNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitOpNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitOpNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operand);
		try {
			setState(252);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new OpIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(INT);
				}
				break;
			case BOOL:
				_localctx = new OpBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(BOOL);
				}
				break;
			case LITERAL:
				_localctx = new OpLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(LITERAL);
				}
				break;
			case KEY_NIX:
				_localctx = new OpNixContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(KEY_NIX);
				}
				break;
			case NOT:
				_localctx = new OpNotContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				match(NOT);
				setState(244);
				operand();
				}
				break;
			case SIGN:
				_localctx = new OpSignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(245);
				match(SIGN);
				setState(246);
				operand();
				}
				break;
			case ID:
				_localctx = new OpIdContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(247);
				id_operand();
				}
				break;
			case T__2:
				_localctx = new OpExpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(248);
				match(T__2);
				setState(249);
				expr(0);
				setState(250);
				match(T__3);
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
		public Id_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_operand; }
	 
		public Id_operandContext() { }
		public void copyFrom(Id_operandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdOperandCallableContext extends Id_operandContext {
		public Member_accessContext member_access() {
			return getRuleContext(Member_accessContext.class,0);
		}
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public IdOperandCallableContext(Id_operandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterIdOperandCallable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitIdOperandCallable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitIdOperandCallable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdOperandVariableContext extends Id_operandContext {
		public Member_accessContext member_access() {
			return getRuleContext(Member_accessContext.class,0);
		}
		public IdOperandVariableContext(Id_operandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).enterIdOperandVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JovaListener ) ((JovaListener)listener).exitIdOperandVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JovaVisitor ) return ((JovaVisitor<? extends T>)visitor).visitIdOperandVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_operandContext id_operand() throws RecognitionException {
		Id_operandContext _localctx = new Id_operandContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_id_operand);
		try {
			setState(260);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new IdOperandCallableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				member_access();
				setState(255);
				match(T__2);
				setState(256);
				arg_list();
				setState(257);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new IdOperandVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
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
			setState(263);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << KEY_NIX) | (1L << SIGN) | (1L << NOT) | (1L << INT) | (1L << BOOL) | (1L << ID) | (1L << LITERAL))) != 0)) {
				{
				setState(262);
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
			setState(266);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_args);
					setState(268);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(269);
					match(T__4);
					setState(270);
					expr(0);
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		case 6:
			return member_decls_sempred((Member_declsContext)_localctx, predIndex);
		case 8:
			return method_decls_sempred((Method_declsContext)_localctx, predIndex);
		case 12:
			return param_list_sempred((Param_listContext)_localctx, predIndex);
		case 17:
			return id_list_sempred((Id_listContext)_localctx, predIndex);
		case 18:
			return stmt_sempred((StmtContext)_localctx, predIndex);
		case 26:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 30:
			return args_sempred((ArgsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean member_decls_sempred(Member_declsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean method_decls_sempred(Method_declsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean param_list_sempred(Param_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean id_list_sempred(Id_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean stmt_sempred(StmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean args_sempred(ArgsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u0117\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\3\3\3\3\4\6\4G\n\4\r\4\16\4H\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bY\n\b\f\b\16\b\\\13\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\7\nd\n\n\f\n\16\ng\13\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\5\rs\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16}\n\16\f\16\16"+
		"\16\u0080\13\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\7\21"+
		"\u008c\n\21\f\21\16\21\u008f\13\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u009b\n\23\f\23\16\23\u009e\13\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00a9\n\24\f\24\16\24\u00ac\13\24"+
		"\3\25\3\25\3\25\3\25\5\25\u00b2\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00c6\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u00d2\n\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u00ed\n\34\f\34"+
		"\16\34\u00f0\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\5\35\u00ff\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0107"+
		"\n\36\3\37\5\37\u010a\n\37\3 \3 \3 \3 \3 \3 \7 \u0112\n \f \16 \u0115"+
		"\13 \3 \2\t\16\22\32$&\66>!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>\2\3\3\2\34\35\u0113\2@\3\2\2\2\4C\3\2\2\2\6F\3"+
		"\2\2\2\bJ\3\2\2\2\nM\3\2\2\2\fP\3\2\2\2\16U\3\2\2\2\20]\3\2\2\2\22`\3"+
		"\2\2\2\24h\3\2\2\2\26k\3\2\2\2\30p\3\2\2\2\32v\3\2\2\2\34\u0081\3\2\2"+
		"\2\36\u0084\3\2\2\2 \u008d\3\2\2\2\"\u0090\3\2\2\2$\u0094\3\2\2\2&\u009f"+
		"\3\2\2\2(\u00ad\3\2\2\2*\u00b3\3\2\2\2,\u00c5\3\2\2\2.\u00c7\3\2\2\2\60"+
		"\u00d1\3\2\2\2\62\u00d3\3\2\2\2\64\u00d6\3\2\2\2\66\u00da\3\2\2\28\u00fe"+
		"\3\2\2\2:\u0106\3\2\2\2<\u0109\3\2\2\2>\u010b\3\2\2\2@A\5\6\4\2AB\7\2"+
		"\2\3B\3\3\2\2\2CD\t\2\2\2D\5\3\2\2\2EG\5\b\5\2FE\3\2\2\2GH\3\2\2\2HF\3"+
		"\2\2\2HI\3\2\2\2I\7\3\2\2\2JK\5\n\6\2KL\5\f\7\2L\t\3\2\2\2MN\7\n\2\2N"+
		"O\7\35\2\2O\13\3\2\2\2PQ\7\3\2\2QR\5\16\b\2RS\5\22\n\2ST\7\4\2\2T\r\3"+
		"\2\2\2UZ\b\b\1\2VW\f\4\2\2WY\5\20\t\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z"+
		"[\3\2\2\2[\17\3\2\2\2\\Z\3\2\2\2]^\7\33\2\2^_\5\"\22\2_\21\3\2\2\2`e\b"+
		"\n\1\2ab\f\4\2\2bd\5\24\13\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f"+
		"\23\3\2\2\2ge\3\2\2\2hi\5\26\f\2ij\5\36\20\2j\25\3\2\2\2kl\7\33\2\2lm"+
		"\5\4\3\2mn\7\36\2\2no\5\30\r\2o\27\3\2\2\2pr\7\5\2\2qs\5\32\16\2rq\3\2"+
		"\2\2rs\3\2\2\2st\3\2\2\2tu\7\6\2\2u\31\3\2\2\2vw\b\16\1\2wx\5\34\17\2"+
		"x~\3\2\2\2yz\f\3\2\2z{\7\7\2\2{}\5\34\17\2|y\3\2\2\2}\u0080\3\2\2\2~|"+
		"\3\2\2\2~\177\3\2\2\2\177\33\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\5\4\3"+
		"\2\u0082\u0083\7\36\2\2\u0083\35\3\2\2\2\u0084\u0085\7\3\2\2\u0085\u0086"+
		"\5 \21\2\u0086\u0087\5&\24\2\u0087\u0088\5*\26\2\u0088\u0089\7\4\2\2\u0089"+
		"\37\3\2\2\2\u008a\u008c\5\"\22\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2"+
		"\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e!\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u0090\u0091\5\4\3\2\u0091\u0092\5$\23\2\u0092\u0093\7\b\2\2\u0093"+
		"#\3\2\2\2\u0094\u0095\b\23\1\2\u0095\u0096\7\36\2\2\u0096\u009c\3\2\2"+
		"\2\u0097\u0098\f\3\2\2\u0098\u0099\7\7\2\2\u0099\u009b\7\36\2\2\u009a"+
		"\u0097\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d%\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00aa\b\24\1\2\u00a0\u00a1"+
		"\f\6\2\2\u00a1\u00a9\5,\27\2\u00a2\u00a3\f\5\2\2\u00a3\u00a9\5.\30\2\u00a4"+
		"\u00a5\f\4\2\2\u00a5\u00a6\5(\25\2\u00a6\u00a7\7\b\2\2\u00a7\u00a9\3\2"+
		"\2\2\u00a8\u00a0\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\'\3\2\2\2"+
		"\u00ac\u00aa\3\2\2\2\u00ad\u00ae\5\60\31\2\u00ae\u00b1\7\21\2\2\u00af"+
		"\u00b2\5\62\32\2\u00b0\u00b2\5\66\34\2\u00b1\u00af\3\2\2\2\u00b1\u00b0"+
		"\3\2\2\2\u00b2)\3\2\2\2\u00b3\u00b4\7\16\2\2\u00b4\u00b5\5\66\34\2\u00b5"+
		"\u00b6\7\b\2\2\u00b6+\3\2\2\2\u00b7\u00b8\7\13\2\2\u00b8\u00b9\7\5\2\2"+
		"\u00b9\u00ba\5\66\34\2\u00ba\u00bb\7\6\2\2\u00bb\u00bc\5\64\33\2\u00bc"+
		"\u00c6\3\2\2\2\u00bd\u00be\7\13\2\2\u00be\u00bf\7\5\2\2\u00bf\u00c0\5"+
		"\66\34\2\u00c0\u00c1\7\6\2\2\u00c1\u00c2\5\64\33\2\u00c2\u00c3\7\f\2\2"+
		"\u00c3\u00c4\5\64\33\2\u00c4\u00c6\3\2\2\2\u00c5\u00b7\3\2\2\2\u00c5\u00bd"+
		"\3\2\2\2\u00c6-\3\2\2\2\u00c7\u00c8\7\r\2\2\u00c8\u00c9\7\5\2\2\u00c9"+
		"\u00ca\5\66\34\2\u00ca\u00cb\7\6\2\2\u00cb\u00cc\5\64\33\2\u00cc/\3\2"+
		"\2\2\u00cd\u00ce\7\36\2\2\u00ce\u00cf\7\30\2\2\u00cf\u00d2\5\60\31\2\u00d0"+
		"\u00d2\7\36\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\61\3\2\2"+
		"\2\u00d3\u00d4\7\17\2\2\u00d4\u00d5\7\35\2\2\u00d5\63\3\2\2\2\u00d6\u00d7"+
		"\7\3\2\2\u00d7\u00d8\5&\24\2\u00d8\u00d9\7\4\2\2\u00d9\65\3\2\2\2\u00da"+
		"\u00db\b\34\1\2\u00db\u00dc\58\35\2\u00dc\u00ee\3\2\2\2\u00dd\u00de\f"+
		"\7\2\2\u00de\u00df\7\23\2\2\u00df\u00ed\5\66\34\b\u00e0\u00e1\f\6\2\2"+
		"\u00e1\u00e2\7\26\2\2\u00e2\u00ed\5\66\34\7\u00e3\u00e4\f\5\2\2\u00e4"+
		"\u00e5\7\22\2\2\u00e5\u00ed\5\66\34\6\u00e6\u00e7\f\4\2\2\u00e7\u00e8"+
		"\7\25\2\2\u00e8\u00ed\5\66\34\5\u00e9\u00ea\f\3\2\2\u00ea\u00eb\7\24\2"+
		"\2\u00eb\u00ed\5\66\34\4\u00ec\u00dd\3\2\2\2\u00ec\u00e0\3\2\2\2\u00ec"+
		"\u00e3\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ed\u00f0\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\67\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f1\u00ff\7\31\2\2\u00f2\u00ff\7\32\2\2\u00f3\u00ff\7\37\2"+
		"\2\u00f4\u00ff\7\20\2\2\u00f5\u00f6\7\27\2\2\u00f6\u00ff\58\35\2\u00f7"+
		"\u00f8\7\26\2\2\u00f8\u00ff\58\35\2\u00f9\u00ff\5:\36\2\u00fa\u00fb\7"+
		"\5\2\2\u00fb\u00fc\5\66\34\2\u00fc\u00fd\7\6\2\2\u00fd\u00ff\3\2\2\2\u00fe"+
		"\u00f1\3\2\2\2\u00fe\u00f2\3\2\2\2\u00fe\u00f3\3\2\2\2\u00fe\u00f4\3\2"+
		"\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00f7\3\2\2\2\u00fe\u00f9\3\2\2\2\u00fe"+
		"\u00fa\3\2\2\2\u00ff9\3\2\2\2\u0100\u0101\5\60\31\2\u0101\u0102\7\5\2"+
		"\2\u0102\u0103\5<\37\2\u0103\u0104\7\6\2\2\u0104\u0107\3\2\2\2\u0105\u0107"+
		"\5\60\31\2\u0106\u0100\3\2\2\2\u0106\u0105\3\2\2\2\u0107;\3\2\2\2\u0108"+
		"\u010a\5> \2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a=\3\2\2\2\u010b"+
		"\u010c\b \1\2\u010c\u010d\5\66\34\2\u010d\u0113\3\2\2\2\u010e\u010f\f"+
		"\3\2\2\u010f\u0110\7\7\2\2\u0110\u0112\5\66\34\2\u0111\u010e\3\2\2\2\u0112"+
		"\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114?\3\2\2\2"+
		"\u0115\u0113\3\2\2\2\24HZer~\u008d\u009c\u00a8\u00aa\u00b1\u00c5\u00d1"+
		"\u00ec\u00ee\u00fe\u0106\u0109\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}