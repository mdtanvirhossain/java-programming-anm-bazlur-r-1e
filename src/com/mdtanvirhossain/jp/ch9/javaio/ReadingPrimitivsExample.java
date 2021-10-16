package com.mdtanvirhossain.jp.ch9.javaio;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingPrimitivsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sourceFile = "your_directory\\JavaProgrammingBookByAnmBazlurRahman\\docs\\io_file\\primitivs.data";

		try {
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));

			int intValue = dis.readInt();
			double doubleValue = dis.readDouble();
			boolean booleanValue = dis.readBoolean();
			long longValue = dis.readLong();

			System.out.println(intValue);
			System.out.println(doubleValue);
			System.out.println(booleanValue);
			System.out.println(longValue);

			dis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
