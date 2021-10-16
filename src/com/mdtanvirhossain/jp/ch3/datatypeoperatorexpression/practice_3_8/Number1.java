package com.mdtanvirhossain.jp.ch3.datatypeoperatorexpression.practice_3_8;

import java.util.Scanner;

public class Number1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of column an row: ");
		int n = input.nextInt();
		//filled square
		System.out.println("Patter-1");
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}//end of for loop
		
		//blank square
		System.out.println("Pattern-2");
		
		for(int i=0; i<n; i++) {
			
			//printing 1st line
			if(i >0 && i <n-1) {
				System.out.print("*  ");
				for(int k=0; k<n-2; k++) {
					System.out.print("   ");
				}
				System.out.print("*  \n");
			}else {//printing 2nd line
				for(int l=0; l<n; l++) {
					System.out.print("*  ");
				}
				System.out.println();
			}
			
			//System.out.println();
		}//end of for loop
		
		//pattern-3//triangle
		System.out.println("Pattern-3");
		
		for(int i=0; i<n; i++) {
			
			//printing 1st line
			if(i == 0) {
				System.out.println();
				for(int k=0; k<n; k++) {
					System.out.print("* ");
					
				}
				System.out.println();
			}//end of 1st line
			
			else if(i>0) {
				System.out.print(" *");
				for(int k=n-i; k>1; k--) {
					System.out.print(" ");
				}
				System.out.print(" *\n");
			}
			
			//System.out.println();
		}//end of for loop
		
		input.close();
	}
}
