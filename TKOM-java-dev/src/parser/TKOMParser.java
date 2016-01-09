package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import listener.TKOMListener;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TKOMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1;
	public static final String[] tokenNames = {
		"<INVALID>", "'list a={2}'"
	};
	public static final int
		RULE_t_list = 0;
	public static final String[] ruleNames = {
		"t_list"
	};

	@Override
	public String getGrammarFileName() { return "TKOM.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TKOMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class T_listContext extends ParserRuleContext {
		public T_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TKOMListener ) ((TKOMListener)listener).enterT_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TKOMListener ) ((TKOMListener)listener).exitT_list(this);
		}
	}

	public final T_listContext t_list() throws RecognitionException {
		T_listContext _localctx = new T_listContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_t_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2); match(T__0);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\3\7\4\2\t\2\3\2\3"+
		"\2\3\2\2\2\3\2\2\2\5\2\4\3\2\2\2\4\5\7\3\2\2\5\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}