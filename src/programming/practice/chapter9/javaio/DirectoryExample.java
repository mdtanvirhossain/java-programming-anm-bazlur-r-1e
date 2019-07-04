package programming.practice.chapter9.javaio;

import java.io.File;
import java.io.IOException;

public class DirectoryExample {
	public static void main(String[] args) throws IOException {
		
		File dir = new File("your_directory\\JavaProgrammingBookByAnmBazlurRahman\\docs\\io_file\\mydir");
		
		dir.mkdir();
		
		String dirPath = dir.getPath();
		
		System.out.println("Directory Path: " + dirPath);
		
		//lets create a new file
		String fileName = "mynewfile.txt";
		File file = new File(dirPath + File.separator + fileName);
		
		file.createNewFile();
		
		System.out.println("File Path: "+file.getPath());
	}
}
