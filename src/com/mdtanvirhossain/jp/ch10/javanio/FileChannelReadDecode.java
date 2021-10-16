package com.mdtanvirhossain.jp.ch10.javanio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class FileChannelReadDecode {

	public static void main(String[] args) {
		
		File inputFile = new File("your_directory\\JavaProgrammingBookByAnmBazlurRahman\\docs\\nio\\hello.txt");
		
		if(!inputFile.exists()) {
			System.out.println("File doesn't exist");
			return;
		}
		try(FileChannel fileChannel = new FileInputStream(inputFile).getChannel()) {
			
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			Charset cs = Charset.forName("UTF-8");
			
			while(fileChannel.read(buffer) > 0) {
				buffer.flip();
				
				CharBuffer charBuffer = cs.decode(buffer);
				
				while(charBuffer.hasRemaining()) {
					char  aChar = charBuffer.get();
					System.out.print((char) aChar);
					
				}
				
				buffer.clear();
			}
			
			fileChannel.close();
			
			} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
