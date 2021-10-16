package com.mdtanvirhossain.jp.ch9.javaio;

import java.io.File;
import java.io.FileFilter;

public class FileFilterExample {

	public static void main(String[] args) {
		File home = new File("your_directory\\JavaProgrammingBookByAnmBazlurRahman\\docs\\io_file");
		
		FileFilter javaFilter = new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				String fileName = pathname.getName();
				if(fileName.endsWith(".txt")) {
					return true;
				}
				return false;
			}
		};
		
		File[] listRoots = home.listFiles(javaFilter);
		for(File file: listRoots) {
			System.out.println(file.getPath());
		}

	}

}
