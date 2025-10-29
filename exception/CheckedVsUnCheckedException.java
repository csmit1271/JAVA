package exception;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CheckedVsUnCheckedException {

	public static void main(String[] args) {

		// unchecked
		int a = 10;
		int b = 0;
		int c = a / b;//

		Scanner scr = new Scanner(System.in);
		scr.nextInt();// Inputmiss -> unchecked
		// checked
		File file = new File("java_demo.txt");
		try {
			file.createNewFile(); // checked
		} catch (IOException e) {

		}
	}
}
