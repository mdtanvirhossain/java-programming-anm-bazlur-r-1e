package programming.practice.chapter10.javanio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelRead {

	public static void main(String[] args) {

		File inputFile = new File("your_directory\\JavaProgrammingBookByAnmBazlurRahman\\docs\\nio\\hello.txt");

		if (!inputFile.exists()) {
			System.out.println("File doesn't exist");
			return;
		}
		try {
			FileInputStream fis = new FileInputStream(inputFile);
			FileChannel fileChannel = fis.getChannel();

			ByteBuffer buffer = ByteBuffer.allocate(1024);

			while (fileChannel.read(buffer) > 0) {
				buffer.flip();

				while (buffer.hasRemaining()) {
					byte b = buffer.get();
					System.out.print((char) b);

				}

				buffer.clear();
			}

			fileChannel.close();

			fis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
