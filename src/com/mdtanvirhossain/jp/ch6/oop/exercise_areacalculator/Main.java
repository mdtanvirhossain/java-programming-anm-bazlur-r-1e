package com.mdtanvirhossain.jp.ch6.oop.exercise_areacalculator;


public class Main {

	public static void main(String[] args) {
		
		AreaCalculator areaCalculator = new AreaCalculator();
		
		System.out.println("Circle: "+areaCalculator.getArea(10.0));
		System.out.println("Triangle: "+areaCalculator.getArea(12, 10));
		System.out.println("Ayato Khetro: "+areaCalculator.getArea(100.0, 100.0));
		System.out.println("Cylinder : "+areaCalculator.getArea(100.0, 100.0));
	}

}
