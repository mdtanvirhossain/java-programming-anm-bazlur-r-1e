package programming.practice.chapter2.syntax.method;

public class Circle_2_7_nonStaticTest {

	public static void main(String[] args) {
		Circle_2_7_nonStatic circle = new Circle_2_7_nonStatic(5);
		double area = circle.getArea();
		
		System.out.println(area);

	}

}
