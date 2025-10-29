package exception;

public class ExpHirInh {

	public static void main(String[] args) {

		try {
			int a = 10;
			int b = 10;
			int c = a / b;// Arithmetic
			System.out.println(c);
		} catch (ArithmeticException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		} catch (Throwable e) {
			// TODO: handle exception
		} finally {
			System.out.println("I am here....");
		}
	}
}
