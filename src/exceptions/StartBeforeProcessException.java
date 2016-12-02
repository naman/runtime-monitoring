package exceptions;

@SuppressWarnings("serial")
public class StartBeforeProcessException extends RuntimeException {
	public StartBeforeProcessException() {
		System.err.println("start must come before process.");
	}
}
