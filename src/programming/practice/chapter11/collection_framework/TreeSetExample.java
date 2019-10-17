package programming.practice.chapter11.collection_framework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		Set<Integer> number = new TreeSet<Integer>();
		
		number.add(5);
		number.add(2);
		number.add(4);
		number.add(1);
		number.add(3);
		
		System.out.println(number);

	}

}
