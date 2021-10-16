package com.mdtanvirhossain.jp.ch10.javanio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileCopier {

	public static void main(String[] args) {
		
		File sourceFile = new File("your_directory\\JavaProgrammingBookByAnmBazlurRahman\\docs\\nio\\hello.txt");
		File desFile = new File("your_directory\\JavaProgrammingBookByAnmBazlurRahman\\docs\\nio\\hello1.txt");
		
		copy(sourceFile, desFile);

	}
	
	public static void copy(File sourceFile, File desFile) {
		if(!sourceFile.exists() || !desFile.exists()) {
			System.out.println("FIle not exists");
			
			return;
		}
		try (FileChannel srcChannel = new FileInputStream(sourceFile).getChannel();
			FileChannel sinkChannel = new FileOutputStream(desFile).getChannel();){
			srcChannel.transferTo(0, srcChannel.size(), sinkChannel);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
