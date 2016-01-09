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
		public TerminalNode SEMI() { return getToken(ListLanguageParser.SEMI, 0); }
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
			setState(44);
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
				{
				setState(38); function_call();
				setState(39); match(SEMI);
				}
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 4);
				{
				setState(41); function_def();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(42); if_statement();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 6);
				{
				setState(43); loop();
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
			setState(46); match(NUMERICAL_VAR_OP);
			setState(47); match(ID);
			setState(48); match(ASSIGN);
			setState(49); match(NUMBER);
			setState(50); match(SEMI);
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
			setState(52); match(LIST_VAR_OP);
			setState(53); match(ID);
			setState(54); match(ASSIGN);
			setState(55); list();
			setState(56); match(SEMI);
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
			setState(58); match(LBRACE);
			setState(59); match(NUMBER);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(60); match(COMA);
				setState(61); match(NUMBER);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67); match(RBRACE);
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
			setState(69); match(ID);
			setState(70); match(LBRACK);
			setState(71); match(NUMBER);
			setState(72); match(RBRACK);
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
			setState(76);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); match(NUMBER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); list_element();
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
			setState(78); match(IF);
			setState(79); condition();
			setState(80); match(THEN);
			setState(81); match(LBRACE);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << ID))) != 0)) {
				{
				{
				setState(82); operation();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88); match(RBRACE);
			setState(89); match(SEMI);
			setState(90); match(ELSE);
			setState(91); match(LBRACE);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << ID))) != 0)) {
				{
				{
				setState(92); operation();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98); match(RBRACE);
			setState(99); match(SEMI);
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
			setState(101); match(LPAREN);
			setState(102); elementary_condition();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OPERATOR || _la==OR_OPERATOR) {
				{
				{
				setState(103);
				_la = _input.LA(1);
				if ( !(_la==AND_OPERATOR || _la==OR_OPERATOR) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(104); elementary_condition();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110); match(RPAREN);
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
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(ListLanguageParser.ID); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public TerminalNode ID(int i) {
			return getToken(ListLanguageParser.ID, i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
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
			setState(172);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(112); match(ID);
				setState(113); match(LOGICAL_OPERATOR);
				setState(114); match(ID);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(115); match(ID);
				setState(116); match(LOGICAL_OPERATOR);
				setState(117); value();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(118); value();
				setState(119); match(LOGICAL_OPERATOR);
				setState(120); match(ID);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(122); match(ID);
				setState(123); match(LOGICAL_OPERATOR);
				setState(124); list();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(125); list();
				setState(126); match(LOGICAL_OPERATOR);
				setState(127); match(ID);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(129); match(ID);
				setState(130); match(LOGICAL_OPERATOR);
				setState(131); function_call();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(132); function_call();
				setState(133); match(LOGICAL_OPERATOR);
				setState(134); match(ID);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(136); value();
				setState(137); match(LOGICAL_OPERATOR);
				setState(138); value();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(140); value();
				setState(141); match(LOGICAL_OPERATOR);
				setState(142); function_call();
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(144); function_call();
				setState(145); match(LOGICAL_OPERATOR);
				setState(146); value();
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(148); function_call();
				setState(149); match(LOGICAL_OPERATOR);
				setState(150); function_call();
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(152); value();
				setState(153); match(LOGICAL_OPERATOR);
				setState(154); list();
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(156); list();
				setState(157); match(LOGICAL_OPERATOR);
				setState(158); value();
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				{
				setState(160); function_call();
				setState(161); match(LOGICAL_OPERATOR);
				setState(162); list();
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				{
				setState(164); list();
				setState(165); match(LOGICAL_OPERATOR);
				setState(166); function_call();
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				{
				setState(168); list();
				setState(169); match(LOGICAL_OPERATOR);
				setState(170); list();
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
			setState(218);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(174); match(AT);
				setState(175); match(ID);
				setState(176); match(LPAREN);
				setState(181);
				switch (_input.LA(1)) {
				case NUMERICAL_VAR_OP:
					{
					{
					setState(177); match(NUMERICAL_VAR_OP);
					setState(178); match(ID);
					}
					}
					break;
				case LIST_VAR_OP:
					{
					{
					setState(179); match(LIST_VAR_OP);
					setState(180); match(ID);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(183); match(COMA);
					setState(188);
					switch (_input.LA(1)) {
					case NUMERICAL_VAR_OP:
						{
						{
						setState(184); match(NUMERICAL_VAR_OP);
						setState(185); match(ID);
						}
						}
						break;
					case LIST_VAR_OP:
						{
						{
						setState(186); match(LIST_VAR_OP);
						setState(187); match(ID);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195); match(RPAREN);
				setState(196); match(LBRACE);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << ID))) != 0)) {
					{
					{
					setState(197); operation();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203); match(RBRACE);
				setState(204); match(SEMI);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(205); match(AT);
				setState(206); match(ID);
				setState(207); match(LPAREN);
				setState(208); match(RPAREN);
				setState(209); match(LBRACE);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << ID))) != 0)) {
					{
					{
					setState(210); operation();
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(216); match(RBRACE);
				setState(217); match(SEMI);
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
			setState(240);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220); match(ID);
				{
				setState(221); match(LPAREN);
				setState(224);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(222); value();
					}
					break;
				case 2:
					{
					setState(223); match(ID);
					}
					break;
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(226); match(COMA);
					setState(229);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(227); value();
						}
						break;
					case 2:
						{
						setState(228); match(ID);
						}
						break;
					}
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236); match(RPAREN);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(237); match(ID);
				setState(238); match(LPAREN);
				setState(239); match(RPAREN);
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
			setState(242); match(FOREACH);
			setState(243); match(LPAREN);
			setState(244); match(VAR);
			setState(245); match(IN);
			setState(246); match(ID);
			setState(247); match(RPAREN);
			setState(248); match(LBRACE);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOREACH) | (1L << AT) | (1L << NUMERICAL_VAR_OP) | (1L << LIST_VAR_OP) | (1L << ID))) != 0)) {
				{
				{
				setState(249); operation();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255); match(RBRACE);
			setState(256); match(SEMI);
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
			setState(258); match(PRINT);
			setState(259); match(LPAREN);
			setState(260); match(ID);
			setState(261); match(RPAREN);
			setState(262); match(SEMI);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36\u010b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6A\n\6\f\6\16\6D\13\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\bO\n\b\3\t\3\t\3\t\3\t\3\t\7\tV\n"+
		"\t\f\t\16\tY\13\t\3\t\3\t\3\t\3\t\3\t\7\t`\n\t\f\t\16\tc\13\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\7\nl\n\n\f\n\16\no\13\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u00af\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b8\n\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u00bf\n\f\7\f\u00c1\n\f\f\f\16\f\u00c4\13\f\3\f\3\f\3"+
		"\f\7\f\u00c9\n\f\f\f\16\f\u00cc\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u00d6\n\f\f\f\16\f\u00d9\13\f\3\f\3\f\5\f\u00dd\n\f\3\r\3\r\3\r\3\r"+
		"\5\r\u00e3\n\r\3\r\3\r\3\r\5\r\u00e8\n\r\7\r\u00ea\n\r\f\r\16\r\u00ed"+
		"\13\r\3\r\3\r\3\r\3\r\5\r\u00f3\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00fd\n\16\f\16\16\16\u0100\13\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2"+
		"\3\3\2\34\35\u0121\2!\3\2\2\2\4.\3\2\2\2\6\60\3\2\2\2\b\66\3\2\2\2\n<"+
		"\3\2\2\2\fG\3\2\2\2\16N\3\2\2\2\20P\3\2\2\2\22g\3\2\2\2\24\u00ae\3\2\2"+
		"\2\26\u00dc\3\2\2\2\30\u00f2\3\2\2\2\32\u00f4\3\2\2\2\34\u0104\3\2\2\2"+
		"\36 \5\4\3\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2"+
		"#!\3\2\2\2$%\7\3\2\2%\3\3\2\2\2&/\5\6\4\2\'/\5\b\5\2()\5\30\r\2)*\7\31"+
		"\2\2*/\3\2\2\2+/\5\26\f\2,/\5\20\t\2-/\5\32\16\2.&\3\2\2\2.\'\3\2\2\2"+
		".(\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\5\3\2\2\2\60\61\7\f\2\2\61\62"+
		"\7\17\2\2\62\63\7\23\2\2\63\64\7\20\2\2\64\65\7\31\2\2\65\7\3\2\2\2\66"+
		"\67\7\16\2\2\678\7\17\2\289\7\23\2\29:\5\n\6\2:;\7\31\2\2;\t\3\2\2\2<"+
		"=\7\26\2\2=B\7\20\2\2>?\7\30\2\2?A\7\20\2\2@>\3\2\2\2AD\3\2\2\2B@\3\2"+
		"\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\27\2\2F\13\3\2\2\2GH\7\17\2\2H"+
		"I\7\32\2\2IJ\7\20\2\2JK\7\33\2\2K\r\3\2\2\2LO\7\20\2\2MO\5\f\7\2NL\3\2"+
		"\2\2NM\3\2\2\2O\17\3\2\2\2PQ\7\4\2\2QR\5\22\n\2RS\7\5\2\2SW\7\26\2\2T"+
		"V\5\4\3\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2"+
		"Z[\7\27\2\2[\\\7\31\2\2\\]\7\6\2\2]a\7\26\2\2^`\5\4\3\2_^\3\2\2\2`c\3"+
		"\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\27\2\2ef\7\31\2\2f"+
		"\21\3\2\2\2gh\7\24\2\2hm\5\24\13\2ij\t\2\2\2jl\5\24\13\2ki\3\2\2\2lo\3"+
		"\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7\25\2\2q\23\3\2\2\2"+
		"rs\7\17\2\2st\7\22\2\2t\u00af\7\17\2\2uv\7\17\2\2vw\7\22\2\2w\u00af\5"+
		"\16\b\2xy\5\16\b\2yz\7\22\2\2z{\7\17\2\2{\u00af\3\2\2\2|}\7\17\2\2}~\7"+
		"\22\2\2~\u00af\5\n\6\2\177\u0080\5\n\6\2\u0080\u0081\7\22\2\2\u0081\u0082"+
		"\7\17\2\2\u0082\u00af\3\2\2\2\u0083\u0084\7\17\2\2\u0084\u0085\7\22\2"+
		"\2\u0085\u00af\5\30\r\2\u0086\u0087\5\30\r\2\u0087\u0088\7\22\2\2\u0088"+
		"\u0089\7\17\2\2\u0089\u00af\3\2\2\2\u008a\u008b\5\16\b\2\u008b\u008c\7"+
		"\22\2\2\u008c\u008d\5\16\b\2\u008d\u00af\3\2\2\2\u008e\u008f\5\16\b\2"+
		"\u008f\u0090\7\22\2\2\u0090\u0091\5\30\r\2\u0091\u00af\3\2\2\2\u0092\u0093"+
		"\5\30\r\2\u0093\u0094\7\22\2\2\u0094\u0095\5\16\b\2\u0095\u00af\3\2\2"+
		"\2\u0096\u0097\5\30\r\2\u0097\u0098\7\22\2\2\u0098\u0099\5\30\r\2\u0099"+
		"\u00af\3\2\2\2\u009a\u009b\5\16\b\2\u009b\u009c\7\22\2\2\u009c\u009d\5"+
		"\n\6\2\u009d\u00af\3\2\2\2\u009e\u009f\5\n\6\2\u009f\u00a0\7\22\2\2\u00a0"+
		"\u00a1\5\16\b\2\u00a1\u00af\3\2\2\2\u00a2\u00a3\5\30\r\2\u00a3\u00a4\7"+
		"\22\2\2\u00a4\u00a5\5\n\6\2\u00a5\u00af\3\2\2\2\u00a6\u00a7\5\n\6\2\u00a7"+
		"\u00a8\7\22\2\2\u00a8\u00a9\5\30\r\2\u00a9\u00af\3\2\2\2\u00aa\u00ab\5"+
		"\n\6\2\u00ab\u00ac\7\22\2\2\u00ac\u00ad\5\n\6\2\u00ad\u00af\3\2\2\2\u00ae"+
		"r\3\2\2\2\u00aeu\3\2\2\2\u00aex\3\2\2\2\u00ae|\3\2\2\2\u00ae\177\3\2\2"+
		"\2\u00ae\u0083\3\2\2\2\u00ae\u0086\3\2\2\2\u00ae\u008a\3\2\2\2\u00ae\u008e"+
		"\3\2\2\2\u00ae\u0092\3\2\2\2\u00ae\u0096\3\2\2\2\u00ae\u009a\3\2\2\2\u00ae"+
		"\u009e\3\2\2\2\u00ae\u00a2\3\2\2\2\u00ae\u00a6\3\2\2\2\u00ae\u00aa\3\2"+
		"\2\2\u00af\25\3\2\2\2\u00b0\u00b1\7\n\2\2\u00b1\u00b2\7\17\2\2\u00b2\u00b7"+
		"\7\24\2\2\u00b3\u00b4\7\f\2\2\u00b4\u00b8\7\17\2\2\u00b5\u00b6\7\16\2"+
		"\2\u00b6\u00b8\7\17\2\2\u00b7\u00b3\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00c2\3\2\2\2\u00b9\u00be\7\30\2\2\u00ba\u00bb\7\f\2\2\u00bb\u00bf\7"+
		"\17\2\2\u00bc\u00bd\7\16\2\2\u00bd\u00bf\7\17\2\2\u00be\u00ba\3\2\2\2"+
		"\u00be\u00bc\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c1\u00c4"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c6\7\25\2\2\u00c6\u00ca\7\26\2\2\u00c7\u00c9\5"+
		"\4\3\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\27"+
		"\2\2\u00ce\u00dd\7\31\2\2\u00cf\u00d0\7\n\2\2\u00d0\u00d1\7\17\2\2\u00d1"+
		"\u00d2\7\24\2\2\u00d2\u00d3\7\25\2\2\u00d3\u00d7\7\26\2\2\u00d4\u00d6"+
		"\5\4\3\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7\27"+
		"\2\2\u00db\u00dd\7\31\2\2\u00dc\u00b0\3\2\2\2\u00dc\u00cf\3\2\2\2\u00dd"+
		"\27\3\2\2\2\u00de\u00df\7\17\2\2\u00df\u00e2\7\24\2\2\u00e0\u00e3\5\16"+
		"\b\2\u00e1\u00e3\7\17\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\u00eb\3\2\2\2\u00e4\u00e7\7\30\2\2\u00e5\u00e8\5\16\b\2\u00e6\u00e8\7"+
		"\17\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9"+
		"\u00e4\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f3\7\25\2\2\u00ef"+
		"\u00f0\7\17\2\2\u00f0\u00f1\7\24\2\2\u00f1\u00f3\7\25\2\2\u00f2\u00de"+
		"\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f3\31\3\2\2\2\u00f4\u00f5\7\b\2\2\u00f5"+
		"\u00f6\7\24\2\2\u00f6\u00f7\7\7\2\2\u00f7\u00f8\7\t\2\2\u00f8\u00f9\7"+
		"\17\2\2\u00f9\u00fa\7\25\2\2\u00fa\u00fe\7\26\2\2\u00fb\u00fd\5\4\3\2"+
		"\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7\27\2\2"+
		"\u0102\u0103\7\31\2\2\u0103\33\3\2\2\2\u0104\u0105\7\13\2\2\u0105\u0106"+
		"\7\24\2\2\u0106\u0107\7\17\2\2\u0107\u0108\7\25\2\2\u0108\u0109\7\31\2"+
		"\2\u0109\35\3\2\2\2\25!.BNWam\u00ae\u00b7\u00be\u00c2\u00ca\u00d7\u00dc"+
		"\u00e2\u00e7\u00eb\u00f2\u00fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}