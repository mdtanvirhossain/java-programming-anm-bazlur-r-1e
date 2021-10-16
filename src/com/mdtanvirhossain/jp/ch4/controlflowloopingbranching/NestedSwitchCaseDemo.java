package com.mdtanvirhossain.jp.ch4.controlflowloopingbranching;

public class NestedSwitchCaseDemo {

	public static void main(String[] args) {
		
		int count = 1;
		String statuString = "Active";
		
		switch (count) {
		case 1:
			//nested
			switch (statuString) {
			case "Active":
				System.out.println("Active");
				break;
			case "Closed":
				System.out.println("Closed");
				break;
			default:
				break;
			}//end of nested switch case
			
			break;

		case 2:
			break;
		default:
			break;
		}

	}

}
