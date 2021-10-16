package com.mdtanvirhossain.jp.ch2.syntax;

/**
 * documentation comment
 * @author MD. TANVIR HOSSAIN
 * @since 01/01/2017
 *
 */
public class Comment_2_12 {
	
	//comment
	
	/*comment*/
	
	public static void main(String[] args) {
		System.out.println("1 to 100\n"+"---------------------");
		
		//printing 1 to 100
		for(int i = 1; i <= 100 ; i++) {
			System.out.print(i+" ");
			
			if(i % 10 == 0) {
				System.out.println();
			}
		}
	}
	 

}
