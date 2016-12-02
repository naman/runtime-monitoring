package exceptions;

@SuppressWarnings("serial")
public class StartBeforeStartException extends RuntimeException {
	public StartBeforeStartException() {
		System.err.println("Two consecutive starts are not acceptable. OR\n"
				+ "start-process-start is not acceptable");
	}
}
