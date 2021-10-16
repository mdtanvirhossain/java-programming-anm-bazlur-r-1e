package com.mdtanvirhossain.jp.ch9.javaio;

public class CurrentWorkingDirectory {

	public static void main(String[] args) {
		String workingDir = System.getProperty("user.dir");
		System.out.println(workingDir);
		
		//String workingDir1 = "your_directory\\JavaProgrammingBookByAnmBazlurRahman\\docs\\io_file";
		//String newFile = workingDir1+ File.separator + "helloworld.txt";
		//File file = new File(newFile);
		
		//print the file separator of own os
		//System.out.println(File.separator);

	}

}
