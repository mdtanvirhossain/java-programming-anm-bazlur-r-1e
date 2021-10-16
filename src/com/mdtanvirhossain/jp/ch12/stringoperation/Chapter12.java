package com.mdtanvirhossain.jp.ch12.stringoperation;

import java.util.Date;

public class Chapter12 {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);
		
		String loremIpsum = "Lorem ipsum dolor sit amet";
		System.out.println("Length of the string is: " + loremIpsum.length());
		
		System.out.println("10 no. character: " + loremIpsum.charAt(10));
		
		System.out.println("Substring of the string lorem-ipsum: " + loremIpsum.substring(5, 10));
		
		System.out.println("Convert all to upercase: " + loremIpsum.toUpperCase());
		System.out.println("Convert all to lowercase: " + loremIpsum.toLowerCase());
		
		System.out.println("Index of: " + loremIpsum.indexOf("dolor"));
		
		System.out.println("Equals: " + loremIpsum.equals("amet"));
		System.out.println("Equals Ignore Class: " + loremIpsum.equalsIgnoreCase("lorem"));
		
		System.out.println("Contains: " + loremIpsum.contains("amet"));
		
		System.out.println("Strat with: " + loremIpsum.startsWith("Lo"));
		
		System.out.println("Ends with: " + loremIpsum.endsWith("Lo"));

		System.out.println("Replace with: " + loremIpsum.replace("Borem", "Lorem"));
		
		System.out.println("Trim: " + loremIpsum.trim());
	}

}
