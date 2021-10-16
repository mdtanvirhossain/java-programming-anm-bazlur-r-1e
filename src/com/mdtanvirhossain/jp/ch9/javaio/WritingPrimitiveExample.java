package com.mdtanvirhossain.jp.ch9.javaio;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingPrimitiveExample {

	public static void main(String[] args) {
		
		String desFileName = "your_directory\\JavaProgrammingBookByAnmBazlurRahman\\docs\\io_file\\primitivs.data";
		
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(desFileName));
			
			//writing the file
			dos.writeInt(152);
			dos.writeDouble(4.56);
			dos.writeBoolean(true);
			dos.writeLong(Long.MAX_VALUE);
			
			dos.flush();
			dos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
