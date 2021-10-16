package com.mdtanvirhossain.jp.ch7.javaexceptionhandling;


public class Chapter7_Main {
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		int result = 0;
		
		try {
			result = a/b;
		} catch (ArithmeticException e) {
			System.out.println("You can't devide" +a + " by " + b);
		}
		
		System.err.println("Result: "+result);
	}

}
