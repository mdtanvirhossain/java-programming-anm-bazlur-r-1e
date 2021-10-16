package com.mdtanvirhossain.jp.ch10.javanio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelWriteTryWithResource {

	public static void main(String[] args) {
		
		File outputFile = new File("your_directory\\JavaProgrammingBookByAnmBazlurRahman\\docs\\nio\\hello.txt");
		
		String text = "I love you bd";
		
		try(FileChannel fileChannel = new FileOutputStream(outputFile).getChannel()) {
			byte[] bytes = text.getBytes();
			
			ByteBuffer buffer    = ByteBuffer.wrap(bytes);
			
			fileChannel.write(buffer);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
