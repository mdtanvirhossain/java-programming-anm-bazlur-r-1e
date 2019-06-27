package programming.practice.chapter4.controlflow_looping_branching;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("Enter the ghor of namta: ");
		System.out.println();
		
		int t = inputScanner.nextInt();
		
		int i = 0;
		
		while(i <=10) {
			System.out.println(t + " x " + i + " = " + (t*i));
			i++;
		}
		
		//infinite loop
		/*
		 * while(true) { System.out.println("I love java"); }
		 */

	}

}
