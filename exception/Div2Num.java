package exception;

import java.io.File;
import java.io.IOException;

public class Div2Num {

	public static void main1(String[] args) {
		int a = 10;
		int b = 0;

		int c = a / b;//ArithmeticException --unchecked
		System.out.println(c);
	}
	
	public static void main(String[] args)throws IOException {

			File file = new File("demo.txt");
			file.createNewFile(); //IOException --checked 
		
	}
}
