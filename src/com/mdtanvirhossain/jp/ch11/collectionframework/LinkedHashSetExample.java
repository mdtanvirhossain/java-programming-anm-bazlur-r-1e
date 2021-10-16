package com.mdtanvirhossain.jp.ch11.collectionframework;

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
