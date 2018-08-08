package programs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileHandling {

	public static void main(String[] args) {
			String data = "I can do Automation";
			writeUsingFileWriter(data);
			filecreate();
			System.out.println("DONE");
			
	}

	public static void writeUsingFileWriter(String data)
	{
		File file = new File("F:\\Binayak.txt");
		FileWriter fr = null;
		try{
			fr = new FileWriter(file);
			fr.write(data);
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			System.out.println("Last Modified date of the file is : "+ sdf.format(file.lastModified()));
			} catch (IOException e){
				e.printStackTrace();
			}finally{
				try{
					fr.close();
				} catch (IOException e){
					e.printStackTrace();
				}
				
			}
	}
	
	public static void filecreate(){
		File file1 = new File("F:\\Binayak1.txt");
		try {
			file1.createNewFile();
			
		} catch (IOException e) {
			System.out.println("File did not create Successfully");
			e.printStackTrace();
		}
		
	}
}

