package exceptions;

@SuppressWarnings("serial")
public class StopBeforeProcessException extends RuntimeException {
	public StopBeforeProcessException() {
		System.err
				.println("process must come before stop or processing b/w two stops or processing after a stop is unacceptable");
	}
}
