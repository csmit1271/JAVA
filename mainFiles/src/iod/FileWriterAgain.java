package iod;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAgain {

	public static void main(String[] args) throws IOException{
		
		
		//step1 : 
		File file = new File("data.txt");
	
		//step2: 
		FileWriter fw = new FileWriter(file);
		
		fw.write("India\n");
		fw.write("Pakistan\n");
		fw.write("China\n");
		fw.write("Bangladesh");
		
		//end step 
		fw.close();
		
		
	}
}
