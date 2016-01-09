package app;

import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import lexer.TKOMLexer;
import parser.TKOMParser;

public class Main {

	public static void main (String []args)
	{
		try {
			ANTLRFileStream ais = new ANTLRFileStream("text.txt","UTF-8");

			TKOMLexer lexer = new TKOMLexer(ais);
			
			  CommonTokenStream tokens = new CommonTokenStream(lexer);
			  TKOMParser parser = new TKOMParser(tokens);
			if(ais != null || parser != null)
			{
				int a = 2;
			}
			
//			List<Token> ls = (List<Token>) s.getAllTokens();
//			String [] tokens = s.getTokenNames();
//			String [] rules = s.getRuleNames();
//			s.
//			if(s != null)
//			{
//				int a=2;
//			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
