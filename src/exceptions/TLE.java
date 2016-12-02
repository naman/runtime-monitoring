package exceptions;

@SuppressWarnings("serial")
public class TLE extends RuntimeException {
	public TLE() {
		System.err
				.println("TLE: More than 3 seconds b/w a pair of start and stop.");
	}
}
