package lesson27_Singleton;

public enum EnumLogger {
	INSTANCE(false);
	
	private boolean isUpperCase;
	
	private EnumLogger(boolean enabled) {
		isUpperCase = enabled;
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
