package programming.practice.chapter9.javaio;

import java.io.File;

public class FileRenameExample {

	public static void main(String[] args) {
		File oldFile = new File("Your_drirectory\\JavaProgrammingBookByAnmBazlurRahman\\docs\\io_file\\mydir\\mynewfile.txt");
		File newFile = new File("your-directory\\JavaProgrammingBookByAnmBazlurRahman\\docs\\io_file\\mydir\\mynewfileRename.txt");
	
		boolean fileRenamed = oldFile.renameTo(newFile);
		
		if(fileRenamed) {
			System.out.println(oldFile +" renamed to "+newFile);
		}
		else {
			System.out.println("file renaming failed");
		}
	}

}
