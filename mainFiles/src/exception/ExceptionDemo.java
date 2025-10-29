package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a = 0, b = 0, ans = 0;

		Scanner scr = new Scanner(System.in);

		try {
			System.out.println("Enter two numbers");
			a = scr.nextInt();
			b = scr.nextInt();
			ans = a / b;// divide by zero -> ArithmeticException

			System.out.println(ans);
		} catch (ArithmeticException r) {
			System.out.println("Please do not enter zero in second number....");
		} catch (InputMismatchException e) {
			System.out.println("Please Enter only whole number");
		} catch (Exception e) {
			System.out.println("Something went wrong please try aftersometime.........");
//			sendMailToDeveloper(email,e);
			e.printStackTrace();
		}finally {
			System.out.println("I am always execute....");
		}
		
		//try->catch 
		//try->finally 
		//try->catch->finally 
		
		
		
	}
}
