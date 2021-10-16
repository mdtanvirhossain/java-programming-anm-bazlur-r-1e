package com.mdtanvirhossain.jp.ch2.syntax.method;

public class Circle_2_7_nonStatic {
	private int radius;
	
	public Circle_2_7_nonStatic (int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
