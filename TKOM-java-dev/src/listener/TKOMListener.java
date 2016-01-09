package listener;
import org.antlr.v4.runtime.tree.ParseTreeListener;

import parser.TKOMParser;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TKOMParser}.
 */
public interface TKOMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TKOMParser#t_list}.
	 * @param ctx the parse tree
	 */
	void enterT_list(TKOMParser.T_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TKOMParser#t_list}.
	 * @param ctx the parse tree
	 */
	void exitT_list( TKOMParser.T_listContext ctx);
}