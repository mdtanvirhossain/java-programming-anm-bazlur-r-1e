package com.mdtanvirhossain.jp.ch12.stringoperation;

public class StringBuilderDemo {
	public static void main(String[] args) {
		int a = 300;
		double b = 3.14;
		short c = 5;
		char d = 'A';

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(a)
		.append("\n")
		.append(b)
		.append("\n")
		.append(c)
		.append("\n")
		.append(d);

		System.out.println(stringBuilder.toString());
	}
}
