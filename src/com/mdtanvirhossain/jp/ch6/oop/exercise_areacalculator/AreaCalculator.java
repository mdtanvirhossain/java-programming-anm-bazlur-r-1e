package com.mdtanvirhossain.jp.ch6.oop.exercise_areacalculator;

public class AreaCalculator {
	
	public double getArea(double radius) {
		return (Math.PI*(Math.pow(radius, 2)));
	}
	
	public double getArea(int length, int width) {
		return (length * width);
	}
	
	public double getArea(double base, double height) {
		return (base * height)/2;
	}
	public double getArea(float radius, float height) {
		return (Math.PI*(Math.pow(radius, 2)))*height;
	}

}
