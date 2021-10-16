package com.mdtanvirhossain.jp.ch11.collectionframework;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> cities = new HashSet<>();
		
		cities.add("Dhaka");
		cities.add("Khulna");
		cities.add("Jashore");
		cities.add("Jashore");
		
		System.out.println("Size: "+ cities.size());
		System.out.println("Element "+ cities);
	}
}
