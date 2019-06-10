package programming.practice.chapter3.datatype_operator_expression;

public class WideningPrimitiveConversation_3_6_9 {

	public static void main(String[] args) {
		int anInt = 100;
		long aLong = anInt;
		float aFloat = aLong;
		
		System.out.println(anInt);
		System.out.println(aLong);
		System.out.println(aFloat);
	}

}
