package programming.practice.chapter14.unit_testing;

@SuppressWarnings("serial")
public class NegativeAmountException extends RuntimeException {

	public NegativeAmountException() {

	}

	public NegativeAmountException(String message) {
		super(message);
	}
}
