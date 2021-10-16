package com.mdtanvirhossain.jp.ch2.syntax;

import java.util.Scanner;

public class MyClass_2_3 {

	public static void main(String[] args) {

		// extra ; not in book
		Scanner input = new Scanner(System.in);

		String text1 = input.next();
		String text2 = input.next();

		System.out.println("String concat: " + concat(text1, text2));

		// end of extra parts; not in book
		input.close();

	}

	public void printText(String text) {
		System.out.println(text);
	}

	public void writeText(String text1, String text2) {
		System.out.println(text1);
		System.out.println(text2);
	}

	public int sum(int value1, int value2) {
		return value1 + value2;
	}

	public static String concat(String value1, String value2) throws IllegalArgumentException {

		if (value1 == null) {
			throw new IllegalArgumentException("Value1 is null");
		} else if (value2 == null) {
			throw new IllegalArgumentException("Value1 is null");
		}
		return value1 + value2;
	}

}
