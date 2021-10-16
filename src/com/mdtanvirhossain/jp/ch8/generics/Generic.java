package com.mdtanvirhossain.jp.ch8.generics;

public class Generic<T> {

	private T obj;

	public Generic(T obj) {
		//super();
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public void showType() {
		System.out.println("Type of T is: " +obj.getClass().getName());
	}
	
	
}
