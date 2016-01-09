package execution;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr_classes.ListLanguageBaseListener;
import antlr_classes.ListLanguageParser;

import java.util.logging.*;

public class MyListener extends ListLanguageBaseListener {

	public ListLanguageParser parser;
	public Executor exec;
	public int level = 0;
	
	public MyListener(ListLanguageParser parser, Executor exec)
	{
		this.exec = exec;
		this.parser = parser;
		
	}

	@Override 
	public void enterFunction_call(ListLanguageParser.Function_callContext ctx) 
	{
		////System.out.println(ctx.toStringTree());
	}

	@Override 
	public void exitFunction_call(ListLanguageParser.Function_callContext ctx) 
	{ 
		////System.out.println(ctx.toStringTree());
	}

	@Override 
	public void enterList_element(ListLanguageParser.List_elementContext ctx) 
	{ 
		////System.out.println(ctx.toStringTree());
	}

	@Override 
	public void exitList_element(ListLanguageParser.List_elementContext ctx) 
	{ 
		////System.out.println(ctx.toStringTree());
	}

	@Override 
	public void enterList(ListLanguageParser.ListContext ctx) 
	{
		
	}

	@Override 
	public void exitList(ListLanguageParser.ListContext ctx) 
	{
		////System.out.println(ctx.toStringTree());
	}

	@Override public void enterList_var_dec(ListLanguageParser.List_var_decContext ctx) 
	{
		if(exec.elementExists(ctx.ID().toString(),level))
			throw new RuntimeException("Element już istnieje");
		exec.addList(ctx.ID(), ctx.list().NUMBER(), level);
		Logging.logAll("Utworzono listę ",ctx);
	}

	@Override public void exitList_var_dec(ListLanguageParser.List_var_decContext ctx) 
	{ 
		////System.out.println(ctx.toStringTree());
	}

	@Override 
	public void enterFunction_def(ListLanguageParser.Function_defContext ctx) 
	{
		////System.out.println(ctx.toStringTree());
	}
	
	@Override public void exitFunction_def( ListLanguageParser.Function_defContext ctx) 
	{ 
		////System.out.println(ctx.toStringTree());
	}
	
	@Override public void enterCondition( ListLanguageParser.ConditionContext ctx) 
	{ 
		////System.out.println(ctx.toStringTree());
	}
	
	@Override public void exitCondition( ListLanguageParser.ConditionContext ctx) 
	{
		//System.out.println(ctx.toStringTree());
	}
	
	@Override public void enterNumerical_var_dec( ListLanguageParser.Numerical_var_decContext ctx) 
	{ 
		if(exec.elementExists(ctx.ID().toString(),level))
			throw new RuntimeException("Element już istnieje");
		exec.addNumericalVar(ctx.ID(), ctx.NUMBER(), level);
	}
	
	@Override public void exitNumerical_var_dec( ListLanguageParser.Numerical_var_decContext ctx) 
	{
		//System.out.println(ctx.toStringTree());
	}
	
	@Override public void enterLoop( ListLanguageParser.LoopContext ctx) 
	{
		//System.out.println(ctx.toStringTree());
	}
	
	@Override public void exitLoop( ListLanguageParser.LoopContext ctx) 
	{
		//System.out.println(ctx.toStringTree());
	}
	
	@Override public void enterIf_statement( ListLanguageParser.If_statementContext ctx) 
	{
		//System.out.println(ctx.toStringTree());
	}
	
	@Override public void exitIf_statement( ListLanguageParser.If_statementContext ctx) 
	{
		//System.out.println(ctx.toStringTree());
	}
	
	@Override public void enterElementary_condition( ListLanguageParser.Elementary_conditionContext ctx) 
	{
		//System.out.println(ctx.toStringTree());
	}
	
	@Override public void exitElementary_condition( ListLanguageParser.Elementary_conditionContext ctx) 
	{
		//System.out.println(ctx.toStringTree());
	}
	
	@Override public void enterValue( ListLanguageParser.ValueContext ctx) 
	{
		//System.out.println(ctx.toStringTree());
	}
	
	@Override public void exitValue( ListLanguageParser.ValueContext ctx) 
	{
		//System.out.println(ctx.toStringTree());
	}
	
	@Override public void enterOperation( ListLanguageParser.OperationContext ctx) 
	{
		//System.out.println(ctx.toString());
		//System.out.println(ctx.getClass() + "<KLASA");
		for(int i =0 ; i< ctx.getChildCount() ; i++)
		{
			//System.out.println("DZIECKO: "+i+" "+ctx.getChild(i).getText());
		}
		

		
		////System.out.println(ctx.toStringTree());
	}
	
	@Override public void exitOperation( ListLanguageParser.OperationContext ctx) 
	{
		////System.out.println(ctx.toStringTree());
	}
	
	@Override public void enterWrite( ListLanguageParser.WriteContext ctx) 
	{
		//System.out.println(ctx.toStringTree());
	}
	
	@Override public void exitWrite( ListLanguageParser.WriteContext ctx) 
	{
		//System.out.println(ctx.toStringTree());
	}

	
	@Override public void enterEveryRule( ParserRuleContext ctx) 
	{
		////System.out.println(ctx.toStringTree());
	}
	
	@Override public void exitEveryRule( ParserRuleContext ctx) 
	{ 
		////System.out.println(ctx.toStringTree());
	}
	
	@Override public void visitTerminal( TerminalNode node)
	{
		//System.out.println(node.toStringTree());
	}
	
	@Override public void visitErrorNode( ErrorNode node) {
		//System.out.println(node.toStringTree());
	}
	
	@Override
	public void enterCompilation_unit(ListLanguageParser.Compilation_unitContext ctx) 
	{
		//System.out.println(ctx.toStringTree());
	}
	
	@Override
	public void exitCompilation_unit(ListLanguageParser.Compilation_unitContext ctx) 
	{
		//System.out.println(ctx.toStringTree());
	}
}
