package programming.practice.chapter14.unit_testing;

public class NegativeAmountException extends RuntimeException {

	public NegativeAmountException() {
		
	}
	
	public NegativeAmountException(String message) {
		super(message);
	}
}
