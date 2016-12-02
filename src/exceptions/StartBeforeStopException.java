package exceptions;

@SuppressWarnings("serial")
public class StartBeforeStopException extends RuntimeException {
	public StartBeforeStopException() {
		System.err.println("start must come before stop.");
	}
}