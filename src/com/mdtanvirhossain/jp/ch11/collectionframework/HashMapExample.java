package com.mdtanvirhossain.jp.ch11.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
	Map<Person, String> phonrBook = new HashMap<>();
	Person rafi = new Person("Rafi");
	Person rahman = new Person("Rahman");
	Person rahim1 = new Person("Rahim");
	Person rahim2 = new Person("Rahim");
	
	phonrBook.put(rafi, "123456789");
	phonrBook.put(rahman, "344543543");
	phonrBook.put(rahim1, "07674645");
	phonrBook.put(rahim2, "3124235054");
	
	int size = phonrBook.size();
	System.out.println("Size of phonebook: "+ size);
	
	for(Map.Entry<Person, String> entry : phonrBook.entrySet()) {
		System.out.println(entry.getKey().toString() + " - " + entry.getValue());
	}

	}

}
