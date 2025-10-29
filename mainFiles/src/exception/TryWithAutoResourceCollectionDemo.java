package exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryWithAutoResourceCollectionDemo {

	
//	void type0() {
//		try(String sr = new String("dd");){
//			
//		}//close 
//	}
//	
	void type1() {
		try (Scanner scr = new Scanner(System.in);) {

		} // finally
	}

	void type2() throws IOException {
		try (FileWriter fw = new FileWriter(new File("a.txt"));) {//5 -- 7 

		} // finally

//		AutoCloseable
	}

	public static void main(String[] args) throws Exception {
		File file = new File("java_demo.txt");

		try (

				FileWriter fw = new FileWriter(file);

		) {
			// close()

			//
			fw.write("hi");//
		}

	}

	void till6() {
		FileWriter fw = null;
		try {

			File file = new File("java_demo.txt");
			file.createNewFile();//

			fw = new FileWriter(file);
			fw.write("hi");//

			fw.close();

		} catch (Exception e) {

		} finally {

			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // scope
		}
	}
}
