package programming.practice.chapter9.javaio;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
		
		String desFile = "your_directory\\JavaProgrammingBookByAnmBazlurRahman\\docs\\io_file\\output1.txt";
		
		String data = "my data my data";
		
		Writer writer;
		
		try {
			writer = new FileWriter(desFile);
			writer.write(data);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
