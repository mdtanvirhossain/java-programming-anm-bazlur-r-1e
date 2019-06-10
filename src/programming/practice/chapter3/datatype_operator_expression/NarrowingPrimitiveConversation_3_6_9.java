package programming.practice.chapter3.datatype_operator_expression;

public class NarrowingPrimitiveConversation_3_6_9 {
	public static void main(String[] args) {
		double aDouble = 97.04;
		long aLong = (long) aDouble;
		int anInt = (int) aLong;
		System.out.println(aDouble);
		System.out.println(aLong);
		System.out.println(anInt);
	}
}
