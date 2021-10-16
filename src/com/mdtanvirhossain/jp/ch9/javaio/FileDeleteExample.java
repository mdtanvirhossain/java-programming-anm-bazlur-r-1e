package com.mdtanvirhossain.jp.ch9.javaio;

import java.io.File;

public class FileDeleteExample {

	public static void main(String[] args) {
		
		File file1 = new File("Your_directory\\JavaProgrammingBookByAnmBazlurRahman\\docs\\io_file\\mydir\\mynewfileRename.txt");
		
		file1.delete();
		
		//when jvm terminate delete
		//file1.deleteOnExit();

	}

}
