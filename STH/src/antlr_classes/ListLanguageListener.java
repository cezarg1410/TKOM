// Generated from ListLanguage.g4 by ANTLR 4.4

    package antlr_classes;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ListLanguageParser}.
 */
public interface ListLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ListLanguageParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(@NotNull ListLanguageParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListLanguageParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(@NotNull ListLanguageParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ListLanguageParser#list_element}.
	 * @param ctx the parse tree
	 */
	void enterList_element(@NotNull ListLanguageParser.List_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListLanguageParser#list_element}.
	 * @param ctx the parse tree
	 */
	void exitList_element(@NotNull ListLanguageParser.List_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ListLanguageParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull ListLanguageParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListLanguageParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull ListLanguageParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ListLanguageParser#list_var_dec}.
	 * @param ctx the parse tree
	 */
	void enterList_var_dec(@NotNull ListLanguageParser.List_var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListLanguageParser#list_var_dec}.
	 * @param ctx the parse tree
	 */
	void exitList_var_dec(@NotNull ListLanguageParser.List_var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link ListLanguageParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(@NotNull ListLanguageParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListLanguageParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(@NotNull ListLanguageParser.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link ListLanguageParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(@NotNull ListLanguageParser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListLanguageParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(@NotNull ListLanguageParser.Compilation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ListLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull ListLanguageParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull ListLanguageParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ListLanguageParser#numerical_var_dec}.
	 * @param ctx the parse tree
	 */
	void enterNumerical_var_dec(@NotNull ListLanguageParser.Numerical_var_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListLanguageParser#numerical_var_dec}.
	 * @param ctx the parse tree
	 */
	void exitNumerical_var_dec(@NotNull ListLanguageParser.Numerical_var_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link ListLanguageParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull ListLanguageParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListLanguageParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull ListLanguageParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ListLanguageParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(@NotNull ListLanguageParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListLanguageParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(@NotNull ListLanguageParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ListLanguageParser#elementary_condition}.
	 * @param ctx the parse tree
	 */
	void enterElementary_condition(@NotNull ListLanguageParser.Elementary_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListLanguageParser#elementary_condition}.
	 * @param ctx the parse tree
	 */
	void exitElementary_condition(@NotNull ListLanguageParser.Elementary_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ListLanguageParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(@NotNull ListLanguageParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListLanguageParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(@NotNull ListLanguageParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ListLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull ListLanguageParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull ListLanguageParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ListLanguageParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(@NotNull ListLanguageParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListLanguageParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(@NotNull ListLanguageParser.WriteContext ctx);
}