package com.mdtanvirhossain.jp.ch6.oop.atm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your usrname: ");
		String user = input.next();
		System.out.println("Enter your password: ");
		String pass = input.next();

		ATM atm = new ATM();

		atm.setUsername(user);
		atm.setPassword(pass);

		if (atm.checkAuthentication() == true) {
			System.out.println("Login Successfull.\n\n");

			System.out.println("Main Menu: \n1. Check Balance.\n2. Withdraw.\n3. Deposit.\n4. Exit.\n\nEnter Choice:");
		} else {
			System.out.println("Invalid username or password");
		}

		input.close();

	}

}
