
package lesson27_Singleton;

public class Logger {

	private static Logger instance = null;
	
	private boolean isUpperCase = false;
	
	private Logger() {
		
	}
	
	public static Logger getInstance() {
		
		if (instance == null) {
			instance = new Logger();
		}
		
		return instance;
	}
	
	public void log(String message) {
		
		String messageToLog = message;
		if (isUpperCase) {
			messageToLog = message.toUpperCase();
		}
		
		System.out.println(messageToLog);
	}
	
	public void setUpperCase(boolean enabled) {
		isUpperCase = enabled;
	}
}
