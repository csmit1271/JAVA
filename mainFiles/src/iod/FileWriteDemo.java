package iod;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException{
		
		
		File file =new File("data.txt");
		//when u write -> if file does not exists then file will be created 
		FileWriter fw = new FileWriter(file);
		fw.write("royalGnr\n");
		fw.write("javaBatch");
		fw.close();
		System.out.println("done");
	
	
	
	}
}
