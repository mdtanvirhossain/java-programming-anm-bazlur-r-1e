package programming.practice.chapter11.collection_framework;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		Set<String> cities = new LinkedHashSet<>();
		
		cities.add("Dhaka");
		cities.add("Khulna");
		cities.add("Jashore");
		cities.add("Jashore");
		
		System.out.println("Size: "+ cities.size());
		System.out.println("Element "+ cities);
	}
}
