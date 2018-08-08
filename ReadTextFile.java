package programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File("F:\\Binayak.txt");
		
		try (FileInputStream fis = new FileInputStream(file)) {
			
			System.out.println("Total file size to read (in bytes) : "+ fis.available());
			int content;
			while ((content = fis.read()) != -1) {
				// convert to char and display it
				System.out.print((char) content);
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
