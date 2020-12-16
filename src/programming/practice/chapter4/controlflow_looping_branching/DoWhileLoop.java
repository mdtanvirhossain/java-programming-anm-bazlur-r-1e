package programming.practice.chapter4.controlflow_looping_branching;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		Scanner  inputScanner =  new Scanner(System.in);
		
		System.out.println("Enter a Boolean Value: ");
		boolean okay = inputScanner.nextBoolean();
		
		do {
			System.out.println("DO LOOP...");
		}while(okay);
		
		inputScanner.close();

	}

}
