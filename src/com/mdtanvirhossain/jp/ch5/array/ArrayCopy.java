package com.mdtanvirhossain.jp.ch5.array;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int myArray[] = new int[10];
		int[] copyTo = new int[10];
		
		for (int i = 0; i < myArray.length; i++) {
			copyTo[i] = myArray[i];
			
			//System.arraycopy(myArray, 5, copyTo, 7, 10);
		}
	}

}
