package polymorphic;

public class PolymorphicDemoAgain {

	public static void main(String[] args) {

		Laptop lp = new Laptop();
		Legion lg = new Legion();

		lp.boost();
		lg.boost();

		// Polymorphic

		// Parent p = new Child();

		Laptop l = new Legion();
		l.boost();// compiletime -> parent runtime->child

		System.out.println(l.core);//parent 10 
		
		// Parent p =new Parent();
		// Child c = new Child();
		// Parent pc = new Child();

		// Child cp = new Parent();

//		Legion lpc =(Legion) new Laptop();

		// down casT
//		Laptop l1 = new Laptop();
//		((Legion)l1).boost(); 

		// upcast
		Legion l1 = new Legion();
		((Laptop) l1).boost();

	}
}

class Laptop {
	int core = 10;

	void boost() {
		System.out.println("boost from Laptop");
	}
}

class Legion extends Laptop {
	int core = 20;

	void boost() {
		System.out.println("boost from Legion");
	}
}
