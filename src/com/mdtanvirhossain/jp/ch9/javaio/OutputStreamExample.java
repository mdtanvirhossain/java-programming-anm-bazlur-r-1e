package com.mdtanvirhossain.jp.ch9.javaio;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {

	public static void main(String[] args) {
		
		String desFile = "your_directory\\JavaProgrammingBookByAnmBazlurRahman\\docs\\io_file\\output.txt";
		
		String data = "my data my data";
		
		try {
			FileOutputStream fos = new FileOutputStream(desFile);
			fos.write(data.getBytes());
			fos.flush();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
