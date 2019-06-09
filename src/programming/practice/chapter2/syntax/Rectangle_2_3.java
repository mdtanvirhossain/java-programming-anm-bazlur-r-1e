package programming.practice.chapter2.syntax;

import java.awt.Point;

import com.sun.management.VMOption.Origin;

public class Rectangle_2_3 {
	
	private int width = 0;
	private int height = 0;
	private static Point origin;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Rectangle_2_3(int w, int h) {
		origin =  new Point(0, 0);
		width = width;
		height = height;
	}
	
	public static void move(int x, int y) {
		origin.x = x;
		origin.y = y;
	}
	
	public int getArea() {
		return width * height;
	}
	
	
	
	

}
