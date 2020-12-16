package programming.practice.chapter14.unit_testing;

@SuppressWarnings("serial")
public class NotSufficientBalanceException extends RuntimeException {
	public NotSufficientBalanceException(String message) {
		super(message);
	}
}
