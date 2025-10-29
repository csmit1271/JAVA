package iod;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	
	public static void main(String[] args) throws IOException{
		
		
		PrintWriter pw = new PrintWriter("data2.txt");
		
		pw.write("royal");//byte 
		pw.print("edu");//char 
		pw.println("Ahmedabad");
		pw.println("GNR");
		
		pw.close();
	}
}
