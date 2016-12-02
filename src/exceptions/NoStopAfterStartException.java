package exceptions;

@SuppressWarnings("serial")
public class NoStopAfterStartException extends RuntimeException {
	public NoStopAfterStartException() {
		System.err.println("stop must follow a server start.");
	}
}
