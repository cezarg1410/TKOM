// Generated from ListLanguage.g4 by ANTLR 4.4

    package antlr_classes;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ListLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, IF=2, THEN=3, ELSE=4, VAR=5, FOREACH=6, IN=7, AT=8, PRINT=9, NUMERICAL_VAR_OP=10, 
		BOOLEAN=11, LIST_VAR_OP=12, ID=13, NUMBER=14, ACTION_OPERATOR=15, LOGICAL_OPERATOR=16, 
		ASSIGN=17, LPAREN=18, RPAREN=19, LBRACE=20, RBRACE=21, COMA=22, SEMI=23, 
		LBRACK=24, RBRACK=25, AND_OPERATOR=26, OR_OPERATOR=27, WS=28;
	public static final String[] tokenNames = {
		"<INVALID>", "'<EOF>'", "'if'", "'then'", "'else'", "'var'", "'foreach'", 
		"'in'", "'@'", "'print'", "'number'", "BOOLEAN", "'list'", "ID", "NUMBER", 
		"ACTION_OPERATOR", "LOGICAL_OPERATOR", "'='", "'('", "')'", "'{'", "'}'", 
		"','", "';'", "'['", "']'", "'&&'", "'||'", "WS"
	};
	public static final int
		RULE_compilation_unit = 0, RULE_operation = 1, RULE_numerical_var_dec = 2, 
		RULE_list_var_dec = 3, RULE_list = 4, RULE_list_element = 5, RULE_value = 6, 
		RULE_if_statement = 7, RULE_condition = 8, RULE_elementary_condition = 9, 
		RULE_function_def = 10, RULE_function_call = 11, RULE_loop = 12, RULE_write = 13;
	public static final String[] ruleNames = {
		"compilation_unit", "operation", "numerical_var_dec", "list_var_dec", 
		"list", "list_element", "value", "if_statement", "condition", "elementary_condition", 
		"function_def", "function_call", "loop", "write"
	};

	@Override
	public String getGrammarFileName() { return "ListLanguage.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ListLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Compilation_unitContext extends ParserRuleContext {
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).enterCompilation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).exitCompilation_unit(this);
		}
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << ID))) != 0)) {
				{
				{
				setState(28); operation();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34); match(T__0);
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

	public static class OperationContext extends ParserRuleContext {
		public Numerical_var_decContext numerical_var_dec() {
			return getRuleContext(Numerical_var_decContext.class,0);
		}
		public Function_defContext function_def() {
			return getRuleContext(Function_defContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public List_var_decContext list_var_dec() {
			return getRuleContext(List_var_decContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_operation);
		try {
			setState(42);
			switch (_input.LA(1)) {
			case NUMERICAL_VAR_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(36); numerical_var_dec();
				}
				break;
			case LIST_VAR_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(37); list_var_dec();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(38); function_call();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(39); function_def();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(40); if_statement();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 6);
				{
				setState(41); loop();
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

	public static class Numerical_var_decContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ListLanguageParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public TerminalNode NUMERICAL_VAR_OP() { return getToken(ListLanguageParser.NUMERICAL_VAR_OP, 0); }
		public TerminalNode NUMBER() { return getToken(ListLanguageParser.NUMBER, 0); }
		public Numerical_var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerical_var_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).enterNumerical_var_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).exitNumerical_var_dec(this);
		}
	}

	public final Numerical_var_decContext numerical_var_dec() throws RecognitionException {
		Numerical_var_decContext _localctx = new Numerical_var_decContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_numerical_var_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(NUMERICAL_VAR_OP);
			setState(45); match(ID);
			setState(46); match(ASSIGN);
			setState(47); match(NUMBER);
			setState(48); match(SEMI);
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

	public static class List_var_decContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(ListLanguageParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode LIST_VAR_OP() { return getToken(ListLanguageParser.LIST_VAR_OP, 0); }
		public List_var_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_var_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).enterList_var_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).exitList_var_dec(this);
		}
	}

	public final List_var_decContext list_var_dec() throws RecognitionException {
		List_var_decContext _localctx = new List_var_decContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_list_var_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(LIST_VAR_OP);
			setState(51); match(ID);
			setState(52); match(ASSIGN);
			setState(53); list();
			setState(54); match(SEMI);
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(ListLanguageParser.NUMBER, i);
		}
		public TerminalNode RBRACE() { return getToken(ListLanguageParser.RBRACE, 0); }
		public TerminalNode LBRACE() { return getToken(ListLanguageParser.LBRACE, 0); }
		public TerminalNode COMA(int i) {
			return getToken(ListLanguageParser.COMA, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ListLanguageParser.NUMBER); }
		public List<TerminalNode> COMA() { return getTokens(ListLanguageParser.COMA); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(LBRACE);
			setState(57); match(NUMBER);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(58); match(COMA);
				setState(59); match(NUMBER);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65); match(RBRACE);
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

	public static class List_elementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public TerminalNode NUMBER() { return getToken(ListLanguageParser.NUMBER, 0); }
		public TerminalNode RBRACK() { return getToken(ListLanguageParser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(ListLanguageParser.LBRACK, 0); }
		public List_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).enterList_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).exitList_element(this);
		}
	}

	public final List_elementContext list_element() throws RecognitionException {
		List_elementContext _localctx = new List_elementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_list_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(ID);
			setState(68); match(LBRACK);
			setState(69); match(NUMBER);
			setState(70); match(RBRACK);
			setState(71); match(SEMI);
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

	public static class ValueContext extends ParserRuleContext {
		public List_elementContext list_element() {
			return getRuleContext(List_elementContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ListLanguageParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		try {
			setState(75);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(73); match(NUMBER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(74); list_element();
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode RBRACE(int i) {
			return getToken(ListLanguageParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(ListLanguageParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(ListLanguageParser.IF, 0); }
		public List<TerminalNode> RBRACE() { return getTokens(ListLanguageParser.RBRACE); }
		public List<TerminalNode> LBRACE() { return getTokens(ListLanguageParser.LBRACE); }
		public List<TerminalNode> SEMI() { return getTokens(ListLanguageParser.SEMI); }
		public TerminalNode THEN() { return getToken(ListLanguageParser.THEN, 0); }
		public TerminalNode SEMI(int i) {
			return getToken(ListLanguageParser.SEMI, i);
		}
		public TerminalNode LBRACE(int i) {
			return getToken(ListLanguageParser.LBRACE, i);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(IF);
			setState(78); condition();
			setState(79); match(THEN);
			setState(80); match(LBRACE);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << ID))) != 0)) {
				{
				{
				setState(81); operation();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87); match(RBRACE);
			setState(88); match(SEMI);
			setState(89); match(ELSE);
			setState(90); match(LBRACE);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << ID))) != 0)) {
				{
				{
				setState(91); operation();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97); match(RBRACE);
			setState(98); match(SEMI);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode OR_OPERATOR(int i) {
			return getToken(ListLanguageParser.OR_OPERATOR, i);
		}
		public TerminalNode AND_OPERATOR(int i) {
			return getToken(ListLanguageParser.AND_OPERATOR, i);
		}
		public List<TerminalNode> OR_OPERATOR() { return getTokens(ListLanguageParser.OR_OPERATOR); }
		public TerminalNode LPAREN() { return getToken(ListLanguageParser.LPAREN, 0); }
		public List<TerminalNode> AND_OPERATOR() { return getTokens(ListLanguageParser.AND_OPERATOR); }
		public Elementary_conditionContext elementary_condition(int i) {
			return getRuleContext(Elementary_conditionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ListLanguageParser.RPAREN, 0); }
		public List<Elementary_conditionContext> elementary_condition() {
			return getRuleContexts(Elementary_conditionContext.class);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(LPAREN);
			setState(101); elementary_condition();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OPERATOR || _la==OR_OPERATOR) {
				{
				{
				setState(102);
				_la = _input.LA(1);
				if ( !(_la==AND_OPERATOR || _la==OR_OPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(103); elementary_condition();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109); match(RPAREN);
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

	public static class Elementary_conditionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(ListLanguageParser.NUMBER, 0); }
		public TerminalNode LOGICAL_OPERATOR() { return getToken(ListLanguageParser.LOGICAL_OPERATOR, 0); }
		public Elementary_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementary_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).enterElementary_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).exitElementary_condition(this);
		}
	}

	public final Elementary_conditionContext elementary_condition() throws RecognitionException {
		Elementary_conditionContext _localctx = new Elementary_conditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elementary_condition);
		try {
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(111); value();
				setState(112); match(LOGICAL_OPERATOR);
				setState(113); value();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(115); function_call();
				setState(116); match(LOGICAL_OPERATOR);
				setState(117); value();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(119); value();
				setState(120); match(LOGICAL_OPERATOR);
				setState(121); function_call();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(123); value();
				setState(124); match(LOGICAL_OPERATOR);
				setState(125); match(NUMBER);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(127); match(ID);
				setState(128); match(LOGICAL_OPERATOR);
				setState(129); match(NUMBER);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(130); match(ID);
				setState(131); match(LOGICAL_OPERATOR);
				setState(132); value();
				}
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

	public static class Function_defContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(ListLanguageParser.AT, 0); }
		public TerminalNode LIST_VAR_OP(int i) {
			return getToken(ListLanguageParser.LIST_VAR_OP, i);
		}
		public TerminalNode LBRACE() { return getToken(ListLanguageParser.LBRACE, 0); }
		public List<TerminalNode> NUMERICAL_VAR_OP() { return getTokens(ListLanguageParser.NUMERICAL_VAR_OP); }
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(ListLanguageParser.ID, i);
		}
		public TerminalNode RPAREN() { return getToken(ListLanguageParser.RPAREN, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public List<TerminalNode> COMA() { return getTokens(ListLanguageParser.COMA); }
		public List<TerminalNode> LIST_VAR_OP() { return getTokens(ListLanguageParser.LIST_VAR_OP); }
		public List<TerminalNode> ID() { return getTokens(ListLanguageParser.ID); }
		public TerminalNode RBRACE() { return getToken(ListLanguageParser.RBRACE, 0); }
		public TerminalNode LPAREN() { return getToken(ListLanguageParser.LPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public TerminalNode COMA(int i) {
			return getToken(ListLanguageParser.COMA, i);
		}
		public TerminalNode NUMERICAL_VAR_OP(int i) {
			return getToken(ListLanguageParser.NUMERICAL_VAR_OP, i);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).exitFunction_def(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_def);
		int _la;
		try {
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(135); match(AT);
				setState(136); match(ID);
				setState(137); match(LPAREN);
				setState(142);
				switch (_input.LA(1)) {
				case NUMERICAL_VAR_OP:
					{
					{
					setState(138); match(NUMERICAL_VAR_OP);
					setState(139); match(ID);
					}
					}
					break;
				case LIST_VAR_OP:
					{
					{
					setState(140); match(LIST_VAR_OP);
					setState(141); match(ID);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(144); match(COMA);
					setState(149);
					switch (_input.LA(1)) {
					case NUMERICAL_VAR_OP:
						{
						{
						setState(145); match(NUMERICAL_VAR_OP);
						setState(146); match(ID);
						}
						}
						break;
					case LIST_VAR_OP:
						{
						{
						setState(147); match(LIST_VAR_OP);
						setState(148); match(ID);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(156); match(RPAREN);
				setState(157); match(LBRACE);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << ID))) != 0)) {
					{
					{
					setState(158); operation();
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164); match(RBRACE);
				setState(165); match(SEMI);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(166); match(AT);
				setState(167); match(ID);
				setState(168); match(LPAREN);
				setState(169); match(RPAREN);
				setState(170); match(LBRACE);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << ID))) != 0)) {
					{
					{
					setState(171); operation();
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177); match(RBRACE);
				setState(178); match(SEMI);
				}
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

	public static class Function_callContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ListLanguageParser.ID); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(ListLanguageParser.LPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public TerminalNode COMA(int i) {
			return getToken(ListLanguageParser.COMA, i);
		}
		public TerminalNode ID(int i) {
			return getToken(ListLanguageParser.ID, i);
		}
		public TerminalNode RPAREN() { return getToken(ListLanguageParser.RPAREN, 0); }
		public List<TerminalNode> COMA() { return getTokens(ListLanguageParser.COMA); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_call);
		int _la;
		try {
			setState(203);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); match(ID);
				{
				setState(182); match(LPAREN);
				setState(185);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(183); value();
					}
					break;
				case 2:
					{
					setState(184); match(ID);
					}
					break;
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(187); match(COMA);
					setState(190);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(188); value();
						}
						break;
					case 2:
						{
						setState(189); match(ID);
						}
						break;
					}
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(197); match(RPAREN);
				setState(198); match(SEMI);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(199); match(ID);
				setState(200); match(LPAREN);
				setState(201); match(RPAREN);
				setState(202); match(SEMI);
				}
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public TerminalNode RBRACE() { return getToken(ListLanguageParser.RBRACE, 0); }
		public TerminalNode VAR() { return getToken(ListLanguageParser.VAR, 0); }
		public TerminalNode FOREACH() { return getToken(ListLanguageParser.FOREACH, 0); }
		public TerminalNode LPAREN() { return getToken(ListLanguageParser.LPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ListLanguageParser.LBRACE, 0); }
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ListLanguageParser.RPAREN, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public TerminalNode IN() { return getToken(ListLanguageParser.IN, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(FOREACH);
			setState(206); match(LPAREN);
			setState(207); match(VAR);
			setState(208); match(IN);
			setState(209); match(ID);
			setState(210); match(RPAREN);
			setState(211); match(LBRACE);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << ID))) != 0)) {
				{
				{
				setState(212); operation();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218); match(RBRACE);
			setState(219); match(SEMI);
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ListLanguageParser.ID, 0); }
		public TerminalNode PRINT() { return getToken(ListLanguageParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(ListLanguageParser.LPAREN, 0); }
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
		public TerminalNode RPAREN() { return getToken(ListLanguageParser.RPAREN, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ListLanguageListener ) ((ListLanguageListener)listener).exitWrite(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); match(PRINT);
			setState(222); match(LPAREN);
			setState(223); match(ID);
			setState(224); match(RPAREN);
			setState(225); match(SEMI);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36\u00e6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6?\n\6\f\6\16\6B\13\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\bN\n\b\3\t\3\t\3\t\3\t\3\t\7\tU\n\t\f"+
		"\t\16\tX\13\t\3\t\3\t\3\t\3\t\3\t\7\t_\n\t\f\t\16\tb\13\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\7\nk\n\n\f\n\16\nn\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u0088\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0091"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u0098\n\f\7\f\u009a\n\f\f\f\16\f\u009d\13"+
		"\f\3\f\3\f\3\f\7\f\u00a2\n\f\f\f\16\f\u00a5\13\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\f\u00af\n\f\f\f\16\f\u00b2\13\f\3\f\3\f\5\f\u00b6\n\f\3\r"+
		"\3\r\3\r\3\r\5\r\u00bc\n\r\3\r\3\r\3\r\5\r\u00c1\n\r\7\r\u00c3\n\r\f\r"+
		"\16\r\u00c6\13\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ce\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u00d8\n\16\f\16\16\16\u00db\13\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\2\3\3\2\34\35\u00f2\2!\3\2\2\2\4,\3\2\2\2\6.\3\2\2"+
		"\2\b\64\3\2\2\2\n:\3\2\2\2\fE\3\2\2\2\16M\3\2\2\2\20O\3\2\2\2\22f\3\2"+
		"\2\2\24\u0087\3\2\2\2\26\u00b5\3\2\2\2\30\u00cd\3\2\2\2\32\u00cf\3\2\2"+
		"\2\34\u00df\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\""+
		"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\3\2\2%\3\3\2\2\2&-\5\6\4\2\'-\5\b\5"+
		"\2(-\5\30\r\2)-\5\26\f\2*-\5\20\t\2+-\5\32\16\2,&\3\2\2\2,\'\3\2\2\2,"+
		"(\3\2\2\2,)\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\5\3\2\2\2./\7\f\2\2/\60\7\17"+
		"\2\2\60\61\7\23\2\2\61\62\7\20\2\2\62\63\7\31\2\2\63\7\3\2\2\2\64\65\7"+
		"\16\2\2\65\66\7\17\2\2\66\67\7\23\2\2\678\5\n\6\289\7\31\2\29\t\3\2\2"+
		"\2:;\7\26\2\2;@\7\20\2\2<=\7\30\2\2=?\7\20\2\2><\3\2\2\2?B\3\2\2\2@>\3"+
		"\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\27\2\2D\13\3\2\2\2EF\7\17\2\2"+
		"FG\7\32\2\2GH\7\20\2\2HI\7\33\2\2IJ\7\31\2\2J\r\3\2\2\2KN\7\20\2\2LN\5"+
		"\f\7\2MK\3\2\2\2ML\3\2\2\2N\17\3\2\2\2OP\7\4\2\2PQ\5\22\n\2QR\7\5\2\2"+
		"RV\7\26\2\2SU\5\4\3\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2"+
		"\2XV\3\2\2\2YZ\7\27\2\2Z[\7\31\2\2[\\\7\6\2\2\\`\7\26\2\2]_\5\4\3\2^]"+
		"\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7\27\2\2"+
		"de\7\31\2\2e\21\3\2\2\2fg\7\24\2\2gl\5\24\13\2hi\t\2\2\2ik\5\24\13\2j"+
		"h\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\25\2\2"+
		"p\23\3\2\2\2qr\5\16\b\2rs\7\22\2\2st\5\16\b\2t\u0088\3\2\2\2uv\5\30\r"+
		"\2vw\7\22\2\2wx\5\16\b\2x\u0088\3\2\2\2yz\5\16\b\2z{\7\22\2\2{|\5\30\r"+
		"\2|\u0088\3\2\2\2}~\5\16\b\2~\177\7\22\2\2\177\u0080\7\20\2\2\u0080\u0088"+
		"\3\2\2\2\u0081\u0082\7\17\2\2\u0082\u0083\7\22\2\2\u0083\u0088\7\20\2"+
		"\2\u0084\u0085\7\17\2\2\u0085\u0086\7\22\2\2\u0086\u0088\5\16\b\2\u0087"+
		"q\3\2\2\2\u0087u\3\2\2\2\u0087y\3\2\2\2\u0087}\3\2\2\2\u0087\u0081\3\2"+
		"\2\2\u0087\u0084\3\2\2\2\u0088\25\3\2\2\2\u0089\u008a\7\n\2\2\u008a\u008b"+
		"\7\17\2\2\u008b\u0090\7\24\2\2\u008c\u008d\7\f\2\2\u008d\u0091\7\17\2"+
		"\2\u008e\u008f\7\16\2\2\u008f\u0091\7\17\2\2\u0090\u008c\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u009b\3\2\2\2\u0092\u0097\7\30\2\2\u0093\u0094\7"+
		"\f\2\2\u0094\u0098\7\17\2\2\u0095\u0096\7\16\2\2\u0096\u0098\7\17\2\2"+
		"\u0097\u0093\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0092"+
		"\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\25\2\2\u009f\u00a3\7"+
		"\26\2\2\u00a0\u00a2\5\4\3\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u00a7\7\27\2\2\u00a7\u00b6\7\31\2\2\u00a8\u00a9\7\n\2\2\u00a9"+
		"\u00aa\7\17\2\2\u00aa\u00ab\7\24\2\2\u00ab\u00ac\7\25\2\2\u00ac\u00b0"+
		"\7\26\2\2\u00ad\u00af\5\4\3\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2"+
		"\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b3\u00b4\7\27\2\2\u00b4\u00b6\7\31\2\2\u00b5\u0089\3\2\2\2"+
		"\u00b5\u00a8\3\2\2\2\u00b6\27\3\2\2\2\u00b7\u00b8\7\17\2\2\u00b8\u00bb"+
		"\7\24\2\2\u00b9\u00bc\5\16\b\2\u00ba\u00bc\7\17\2\2\u00bb\u00b9\3\2\2"+
		"\2\u00bb\u00ba\3\2\2\2\u00bc\u00c4\3\2\2\2\u00bd\u00c0\7\30\2\2\u00be"+
		"\u00c1\5\16\b\2\u00bf\u00c1\7\17\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3"+
		"\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00bd\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c7\u00c8\7\25\2\2\u00c8\u00ce\7\31\2\2\u00c9\u00ca\7\17\2\2\u00ca"+
		"\u00cb\7\24\2\2\u00cb\u00cc\7\25\2\2\u00cc\u00ce\7\31\2\2\u00cd\u00b7"+
		"\3\2\2\2\u00cd\u00c9\3\2\2\2\u00ce\31\3\2\2\2\u00cf\u00d0\7\b\2\2\u00d0"+
		"\u00d1\7\24\2\2\u00d1\u00d2\7\7\2\2\u00d2\u00d3\7\t\2\2\u00d3\u00d4\7"+
		"\17\2\2\u00d4\u00d5\7\25\2\2\u00d5\u00d9\7\26\2\2\u00d6\u00d8\5\4\3\2"+
		"\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\7\27\2\2"+
		"\u00dd\u00de\7\31\2\2\u00de\33\3\2\2\2\u00df\u00e0\7\13\2\2\u00e0\u00e1"+
		"\7\24\2\2\u00e1\u00e2\7\17\2\2\u00e2\u00e3\7\25\2\2\u00e3\u00e4\7\31\2"+
		"\2\u00e4\35\3\2\2\2\25!,@MV`l\u0087\u0090\u0097\u009b\u00a3\u00b0\u00b5"+
		"\u00bb\u00c0\u00c4\u00cd\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}