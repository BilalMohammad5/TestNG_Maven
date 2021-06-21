package Logs;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.logging.log4j.*;

public class LogFourJ {
	
	public static Logger log = LogManager.getLogger(LogFourJ.class.getName());
	
	public static void main(String args[]) {
		
		log.error("error");
		log.info("info");
		
	}
	

}
