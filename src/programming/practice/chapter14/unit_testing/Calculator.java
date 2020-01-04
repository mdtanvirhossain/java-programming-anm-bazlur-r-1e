package programming.practice.chapter14.unit_testing;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int[] values) {
		int result = 0;
		for (int value : values) {
			result += value;
		}

		return result;
	}

}
