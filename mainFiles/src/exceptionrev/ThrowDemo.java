package exceptionrev;

import java.util.InputMismatchException;

public class ThrowDemo {
	public static void main(String[] args) {
		int a = 12;
		int b = -12;

		if (b < 0) {
//			InputMismatchException e = new InputMismatchException();
//			throw e;
			NegNumException e = new NegNumException();
			throw e;
		}
		System.out.println("done");
	}
}
