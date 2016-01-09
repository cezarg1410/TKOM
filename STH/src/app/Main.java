package app;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import antlr_classes.ListLanguageLexer;
import antlr_classes.ListLanguageParser;
import execution.Executor;
import execution.Logging;
import execution.MyListener;

public class Main {

	public static void main(String[] args) {
		try {
			Logging.setup();
			ANTLRFileStream input = new ANTLRFileStream("txt/sample.txt", "UTF-8");
			ListLanguageLexer lexer = new ListLanguageLexer(input);
			
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ListLanguageParser parser = new ListLanguageParser(tokens);
			ListLanguageParser.Compilation_unitContext tree = parser.compilation_unit();
			//ListLanguageParser.Help_ifContext tree = parser.help_if();
			MyListener extractor = new MyListener(parser, new Executor());
			ParseTreeWalker.DEFAULT.walk(extractor, tree);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
