package iod;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) throws IOException{
		File file = new File("data.txt");
		FileReader fr = new FileReader(file);
		
		
//		int x = fr.read();//single character 
//		System.out.println(x);
//		System.out.println((char)x);
//		fr.close();
//		
		while(true) {
			int x = fr.read();
			if(x == -1) {//EndOfFile
				break;
			}
			System.out.print((char)x);
		}

		fr.close();
	}
}
