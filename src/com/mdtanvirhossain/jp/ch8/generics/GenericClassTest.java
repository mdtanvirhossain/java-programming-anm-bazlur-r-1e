package com.mdtanvirhossain.jp.ch8.generics;

public class GenericClassTest {

	public static void main(String[] args) {
		Generic<Integer> obj;
		obj = new Generic<Integer>(88);
		obj.showType();
		int v = obj.getObj();
		
		System.out.println("value: " +v);
	}
}
