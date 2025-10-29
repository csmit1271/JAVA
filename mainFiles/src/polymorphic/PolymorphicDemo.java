package polymorphic;

class DOT {

}

class Jio extends DOT {

}

class Airtel extends DOT {

}

public class PolymorphicDemo {
	public static void main(String[] args) {

		DOT jio = new Jio();// call ct recharge
		jio = new Airtel();//

//		Parent p = new Parent();
//		p.add(); //parent :: add
//		
//		
//		Child c = new Child();
//		c.add();// child :: add 
//		
//		
		Parent pc = new Child();// parent p = new child =>
		pc.add(); // compile time -> ParentClass : yes
					// runtime --> ChildClass : yes

		// memory -> runtime

		pc.sub(); // compile -> yes
					// run -> yes ->

//		pc.div(); //child => 
		// compile -> error

		// Why?

	}
}

//Missile 
//Rafel ->  {Hammer hammer = new XXXXX }
//Hammer {8cr} -> 80cr  
//	    -> Prithvi {1cr} -> 8cr

//Su-35 {Missile misile = new XXXXX}

class Parent {
	void add() {
		System.out.println("add::Parent ");
	}

	void sub() {
		System.out.println("sub::Parent");
	}
}

class Child extends Parent {
	void add() {
		System.out.println("add::Child ");
	}

	void div() {
		System.out.println("div:child");
	}
}
