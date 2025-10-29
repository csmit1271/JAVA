package string;

public class ConcatSysout {

	public static void main(String[] args) {

		System.out.println(10 + 10);// 20
		System.out.println("" + 10 + 10);
		System.out.println(10 + 10 + "");

		long x = 42L;
		long y = 44L;
		System.out.print(" " + 7 + 2 + " ");// " 72 "
		System.out.print(foo() + x + 5 + " ");// "foo425 "
		System.out.println(x + y + foo());
	}

	static String foo() {
		return "foo";
	}
}
