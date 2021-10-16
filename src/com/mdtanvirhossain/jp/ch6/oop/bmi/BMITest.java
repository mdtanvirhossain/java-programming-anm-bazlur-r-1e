package com.mdtanvirhossain.jp.ch6.oop.bmi;

public class BMITest {

	public static void main(String[] args) {
		
		BMI bmi = new BMI("Md. Tanvir Hossain", 145, 70);
		
		System.out.println("The BMI for "+ bmi.getName() + " is " + bmi.getBMI() + " and status is "+ bmi.getBMIStatus());

	}

}
