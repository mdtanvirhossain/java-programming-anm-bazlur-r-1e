package programming.practice.chapter9.javaio;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) {
		
		Reader reader      = null;
		
		try {
			reader = new FileReader("your_direcctory\\JavaProgrammingBookByAnmBazlurRahman\\docs\\io_file\\input.txt");
			int c;
			
			while((c = reader.read()) != -1) {
				System.out.print(c + " , ");
				System.out.print((char)c);
			}
		} catch (IOException e) {
			System.err.println("Could not read file.");
		}
		finally {
			if(reader != null) {
				try {
					reader.close();
				}catch (IOException e1) {
					System.err.println("Could Close input stream");
				}
			}
		}

	}

}

