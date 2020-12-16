package programming.practice.chapter10.javanio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class CharsetEncode {

	public static void main(String[] args) {
		
		File outputFile = new File("your_directory\\JavaProgrammingBookByAnmBazlurRahman\\docs\\nio\\hello.txt");
		
		String text = "Write quote in Bangla";
		
		Charset cs = Charset.forName("UTF-8");
		
		try {
			FileOutputStream fos = new FileOutputStream(outputFile);
			FileChannel fileChannel = fos.getChannel();
			
			CharBuffer charBuffer = CharBuffer.wrap(text);
			ByteBuffer encodedBuffer = cs.encode(charBuffer);
			
			fileChannel.write(encodedBuffer);
			fileChannel.close();
			fos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
