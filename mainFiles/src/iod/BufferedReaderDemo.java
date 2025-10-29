package iod;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {

		// step1:
		File file = new File("data.txt");

		// step2:
		// reader
		FileReader fr = new FileReader(file);

		// step3:
		BufferedReader br = new BufferedReader(fr);

		String s1 = "";
		while ((s1 = br.readLine()) != null) {
			System.out.println(s1);
		}

		//end step 
		br.close();
	}
}
