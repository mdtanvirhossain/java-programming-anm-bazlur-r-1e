package programming.practice.chapter2.syntax;

import java.util.Scanner;

public class Calculator_2_5_MethodOverloading {
	
	static int performAddition(int a, int b) {
		int result = a+b;
		return result;
	}
	
	static int performAddition(int a, int b, int c, int d) {
		int result = a+b+c+d;
		return result;
	}
	
	static float performAddition(float a, float b) {
		float result = a+b;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		
		int x = inputScanner.nextInt();
		int y = inputScanner.nextInt();
		
		System.out.println("Answer: "+performAddition(x, y));
	}

}
