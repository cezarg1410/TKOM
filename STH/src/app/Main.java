package app;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import antlr_classes.ListLanguageLexer;
import antlr_classes.ListLanguageParser;
import execution.Executor;
import execution.MyListener;

public class Main {

	public static void main(String[] args) {
		try {
			ANTLRFileStream input = new ANTLRFileStream("txt/sample.txt", "UTF-8");
			ListLanguageLexer lexer = new ListLanguageLexer(input);
			
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ListLanguageParser parser = new ListLanguageParser(tokens);
			ListLanguageParser.Compilation_unitContext tree = parser.compilation_unit();
			MyListener extractor = new MyListener(parser, new Executor());
			ParseTreeWalker.DEFAULT.walk(extractor, tree);
			int c =2;
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
