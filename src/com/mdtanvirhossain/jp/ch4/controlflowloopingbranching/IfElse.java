package com.mdtanvirhossain.jp.ch4.controlflowloopingbranching;

public class IfElse {
	
	public static void main(String[] args) {
		int x =10;
		int a = 1;
		
		if(x > 20) {
			System.out.println("this is a if statement");
		}
		else if(x >100) {
			System.out.println("This is else if statement");
		}
		else {
			System.out.println("this is else statement");
			
			//nested if else
			if(a == 1) {
				System.out.println("Nested if else");
			}
		}
		
		
	}

}
