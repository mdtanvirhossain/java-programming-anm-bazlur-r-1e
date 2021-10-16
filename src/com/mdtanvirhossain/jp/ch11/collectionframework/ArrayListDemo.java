package com.mdtanvirhossain.jp.ch11.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List <String> emperors = new ArrayList<>();
		
		emperors.add("Tanvir");
		emperors.add("Hossain");
		emperors.add("rasel");
		
		System.out.println("Name of emperors: " + emperors);
		System.out.println("Emperors size: " + emperors.size());
		
		//getting second emperors name
		String secondEmperor = emperors.get(1);
		System.out.println("2nd Emperors: " + secondEmperor);
		
		emperors.set(0, "Tanvir the lazy");
		System.out.println("Name of emperors: " + emperors);
		
		emperors.remove("rasel");
		System.out.println("Afer removing, Name of emperors: " + emperors);
		
		emperors.add("ribon");
		System.out.println("After adding, Name of emperors: " + emperors);

		//add duplicate
		emperors.add("ribon");
		System.out.println("after: Name of emperors: " + emperors);
		
		int indexOfHossain = emperors.indexOf("Hossain");
        System.out.println("Index of Hossain :" + indexOfHossain);
        
        int lastIndexOfRibon = emperors.lastIndexOf("ribon");
        System.out.println("Last index of ribon: "+ lastIndexOfRibon);
	}

}
