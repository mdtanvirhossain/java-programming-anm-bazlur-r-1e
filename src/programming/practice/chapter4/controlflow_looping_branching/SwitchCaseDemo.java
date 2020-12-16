package programming.practice.chapter4.controlflow_looping_branching;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String monthString;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your reply: ");
		int month = input.nextInt();
		
		switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
			break;
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
		default:
			monthString = "Wrong_Choise";
		}
		
		System.err.println("Your Reply: "+monthString);
		
		//nested switch case
		
		
		input.close();
		
	}

}
