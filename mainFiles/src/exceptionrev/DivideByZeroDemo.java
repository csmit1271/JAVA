package exceptionrev;

import java.io.IOException;
import java.util.Scanner;

public class DivideByZeroDemo {

	public static void main(String[] args)throws IOException {
		Scanner scr = new Scanner(System.in);
		
		try {
			System.out.println("Enter two numbers");
			int a = scr.nextInt();
			int b = scr.nextInt();
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Please do not enter zero...");
		} catch (Exception e) {
			System.out.println("Something Went Wrong...PTA");
		}finally {
			//gc
			//resource 
			//memory db 
			System.out.println("I am always Execute....");
			scr.close();
		}

	}
}
