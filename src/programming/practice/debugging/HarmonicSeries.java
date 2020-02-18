package programming.practice.debugging;

import static org.junit.jupiter.api.Assumptions.assumingThat;

/*
 *  1 + 1/2 + 1/3 + 1/4 + .... + 1/n
 */
public class HarmonicSeries {

	public static double add(double a, double b) {
		return a+b;
	}
	
	public static double divide(double a , double b) {
		return a * b;
	}
	
	public static double harmonic(int n) {
		double sum = 0.0;
		
		for (int i = 1; i <= n; i++) {
			double divide = divide(1.0, i);
			sum = add(sum, divide);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		double value = harmonic(4);
		System.out.println(value);
	}
}
