package iod;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NumberFilter {

	public static void main(String[] args) throws IOException {

		// take 10 numbers from user and save into file.
		Scanner scr = new Scanner(System.in);

		// file open write

		FileWriter fw = new FileWriter("numbers.txt");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Enter number");
			int num = scr.nextInt();// num scan
			// file write
			fw.write(num + "\n");

		}
		fw.close();

		FileWriter fwOdd = new FileWriter("odd.txt");
		FileWriter fwEven = new FileWriter("even.txt");

		// read data from file
		BufferedReader br = new BufferedReader(new FileReader("numbers.txt"));
		while (true) {
			String str = br.readLine();
			if (str == null) {
				break;
			}
			System.out.println(str);
			int x = Integer.parseInt(str);

			if (x % 2 == 0) {
				// even file write
				fwEven.write(str+"\n");
			} else {
				// odd file write
				fwOdd.write(str+"\n");
			}
		}

		fwEven.close();
		fwOdd.close();

		//content read using Buffered Reader 
		
		
		
	}
}
