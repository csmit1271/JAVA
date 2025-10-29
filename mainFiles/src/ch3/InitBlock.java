package ch3;

public class InitBlock {

	{
		System.out.println("init master");
	}

	static {
		System.out.println("static master");
	}

	public static void main(String[] args) {
		A obj = new A();
		System.out.println("A");

		// static block -> class load
		// use
		// load , main , instance
		// java A
		// Class.forName("");
		// instance-use-

	}
}
//java InitBlock --> class loader ->load -> main 

class A {
	{
		System.out.println("instance 1");
	}
	static {
		System.out.println("static 1");
	}
	{
		System.out.println("instance 2");
	}
	static {
		System.out.println("static 2");
	}

	A() {
		System.out.println("A()");
	}

}
