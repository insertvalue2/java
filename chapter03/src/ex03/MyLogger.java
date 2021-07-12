package ex03;

import java.io.IOException;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class MyLogger {
	
	Logger logger = Logger.getLogger("mylogger");
	private static MyLogger instance = new MyLogger();
	
	public static final String warningLog = "warning.txt";
	private FileHandler warningFile = null;
	
	private MyLogger(){
			try {
				warningFile = new FileHandler(warningLog, true);
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			warningFile.setFormatter(new SimpleFormatter());
			
			logger.setLevel(Level.WARNING);
			
			warningFile.setLevel(Level.WARNING);
			
			logger.addHandler(warningFile);
	}	
	
	public static MyLogger getLogger(){
		return instance;
	}

//	
//	public void log(String msg){
//		
//		logger.finest(msg);
//		logger.finer(msg);
//		logger.fine(msg);
//		logger.config(msg);
//		logger.info(msg);
//		logger.warning(msg);
//		logger.severe(msg);
//	}

	public void warning(String msg){
		logger.warning(msg);
	}
}




