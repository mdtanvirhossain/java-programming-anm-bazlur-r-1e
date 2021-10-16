package com.mdtanvirhossain.jp.ch1.prothomjavaprogram;

import java.util.Scanner;

public class InputDemo_1_6_2 {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int a = scr.nextInt();
		
		System.out.println("Enter another number: ");
		int b = scr.nextInt();
		
		int result = a + b;
		
		System.out.println("The result: "+result);
		
		scr.close();

	}

}
