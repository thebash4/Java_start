package Files;

import java.io.File;

public class Fileinfo {

	

		public static void main(String[] args) {
		File f = new File("C:\\JavaFiles\\JavaFile.txt");
		if(f.exists()) {
		System.out.println(" File name "+f.getName());
		System.out.println(" File path "+f.getAbsolutePath());
		System.out.println(" File size "+f.length());
		System.out.println(" File readable "+f.canRead());
		System.out.println(" File writable "+f.canWrite());
		System.out.println(" File deleted "+f.delete());
		}else {
		System.out.println("File does not exist");
		}

		}

		
}
