package programming.practice.chapter9.javaio;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {
		File file = new File("your_directory\\JavaProgrammingBookByAnmBazlurRahman\\docs\\io_file\\hello.txt");
		
		if(file.exists()) {
			System.out.println("File Exist.");
		}
		else {
			System.out.println("File doesn't exist, Lets Create one.");
			
			//creating new file
			try {
				file.createNewFile();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
