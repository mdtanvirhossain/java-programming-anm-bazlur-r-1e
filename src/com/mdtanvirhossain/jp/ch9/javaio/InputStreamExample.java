package com.mdtanvirhossain.jp.ch9.javaio;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamExample {

	public static void main(String[] args) {
		
		FileInputStream in      = null;
		
		try {
			in = new FileInputStream("you_directory\\JavaProgrammingBookByAnmBazlurRahman\\docs\\io_file\\input.txt");
			int c;
			
			while((c = in.read()) != -1) {
				System.out.print(c + " , ");
				//System.out.print((char)c);
			}
		} catch (IOException e) {
			System.err.println("Could not read file.");
		}
		finally {
			if(in != null) {
				try {
					in.close();
				}catch (IOException e1) {
					System.err.println("Could Close input stream");
				}
			}
		}

	}

}
