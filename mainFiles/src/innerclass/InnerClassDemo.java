package innerclass;

public class InnerClassDemo {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.add();

		Outer.Inner oi = new Outer().new Inner();
		oi.seeOuter();

		Outer1.Inner1 oi1 = new Outer1.Inner1();
		oi1.seeOuter();

	}
}

class Outer {

	private int p = 10;

	class Inner {
		void seeOuter() {
			System.out.println(p);
		}
	}

	void add() {
		Inner i = new Inner();
		i.seeOuter();
	}
}

class Outer1 {
	private static int p = 10;

	static class Inner1 {
		void seeOuter() {
			System.out.println(p);
		}
	}
}
