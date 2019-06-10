package programming.practice.chapter3.datatype_operator_expression;

public class OverflowUnderflow_3_6_8 {

	public static void main(String[] args) {
		
		int a = Integer.MAX_VALUE;
		int b = a+5;
		int c = a*b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
