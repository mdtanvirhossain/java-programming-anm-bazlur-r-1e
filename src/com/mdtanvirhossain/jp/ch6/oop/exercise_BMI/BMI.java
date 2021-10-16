package com.mdtanvirhossain.jp.ch6.oop.exercise_BMI;

public class BMI {
	
	private String name;
	private double weight;
	private double height;
	
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double METERS_PER_INCH = 0.0254;
	
	//constructor
	public BMI(String name, double weight, double height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	//calculate bmi
	public double getBMI() {
		
		double bmi = (weight*0.45359237)/(Math.pow(height, 2) * 0.0254);
	
		return  bmi;
	}
	
	
	public String getBMIStatus() {
		double bmi = getBMI();
		
		if(bmi <= 18.5) {
			return "Underweight";
		}
		else if (bmi > 18.5 && bmi <= 24.9) {
			return "Normal";
		}
		else if (bmi >= 25 && bmi <= 29.9) {
			return "Overweight";
		}
		else if (bmi >= 30) {
			return "Obesity";
		}
		else {
			return "Something is wrong..!";
		}
	}

}
