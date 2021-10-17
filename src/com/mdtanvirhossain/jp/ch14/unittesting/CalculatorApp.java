package com.mdtanvirhossain.jp.ch14.unittesting;

public class CalculatorApp {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int result = calculator.add(5, 5);
		System.out.println(result);
	}

}
