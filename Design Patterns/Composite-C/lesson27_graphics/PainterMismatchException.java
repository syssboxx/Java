package lesson27_graphics;

public class PainterMismatchException extends RuntimeException {
	
	private static final String DEFAULT_MESSAGE = "The type of the painter must match the object it paints.";
	
	public PainterMismatchException() {
		super(DEFAULT_MESSAGE);
	}
	
	public PainterMismatchException(String message) {
		super(message);
	}
	
	public PainterMismatchException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public PainterMismatchException(Throwable cause) {
		super(cause);
	}
}
