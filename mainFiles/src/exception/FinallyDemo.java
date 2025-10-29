package exception;

public class FinallyDemo {

	public static void main(String[] args) {

		try {
			int a = 10;
			int b = 10;
			int c = a / b;// Arithmetic
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("divide by 0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array invalid index");
		} finally {
			System.out.println("I am here....");
		}
	}

}
