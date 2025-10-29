package ch3;

class User {

	int age;
}

class X {
	void user() {

		final User u = new User();
		final int x = 10;

		u.age = x; 
		
		User p = new User();
//		u = p;
	}

	Y obj = new Y();
}

class Y {

}

public class Literallss {

	public Literallss() {
		s = "royal";
	}

	String s;

	void add() {
		sub();
	}

	void sub() {

	}

	public static void main(String[] args) {

		int a = 101; // binary octal decimal hexadecimal

		int b = 0b101;// binary
		int bb = 0B101;// binary

		int o = 0101;// octal {0-7}
//		int oo = 0789;
		int ooo = 0456;

		// 0x 0X [0-9ABCDEF]
		int h = 0xABC;
		int hh = 0X12545;

		int sep = 1_000;
		int sep2 = 1_00;

		System.out.println(sep);
		System.out.println(sep2);

	}
}
