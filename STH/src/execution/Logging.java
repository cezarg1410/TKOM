package execution;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;

import antlr_classes.ListLanguageParser;

public class Logging {

	private static Logger logger;
	private static ConsoleHandler consoleHandler;
	private static FileHandler fileHandler;
	private static String LOG_DIR = "./txt/";
	private static String LOG_EXT = ".txt";

	static 
	{
		logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		logger.setLevel(Level.ALL);
		consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.ALL);
		try {
			fileHandler = new FileHandler(createFileName());
		
		} catch (SecurityException | IOException e) {
			
			
			e.printStackTrace();
		}
		consoleHandler.setFormatter(new SimpleFormatter());
		fileHandler.setFormatter(new SimpleFormatter());
		logger.addHandler(consoleHandler);
		logger.addHandler(fileHandler);
	
	}
	
	public static String createFileName()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		Date now = new Date();
		String strDate = sdf.format(now);
		return LOG_DIR + strDate + LOG_EXT;
	}
	public static void logAll(String msg,ListLanguageParser.List_var_decContext ctx)
	{
		logger.log(Level.ALL, msg + " LINIA: "+ctx.getStart().getLine() + System.lineSeparator());
	}
}
