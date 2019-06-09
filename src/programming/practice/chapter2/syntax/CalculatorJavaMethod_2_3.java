package programming.practice.chapter2.syntax;

import java.util.Scanner;

public class CalculatorJavaMethod_2_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two values: ");
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		int add = performAddition(x, y);
		int sub = performSubtraction(x, y);
		
		System.out.println(add);
		System.err.println(sub);
	}
	
	static int performAddition(int a, int b) {
		int result = a + b;
		
		return result;
	}
	
	static int performSubtraction(int a, int b) {
		int result = a - b;
		
		return result;
	}

}
