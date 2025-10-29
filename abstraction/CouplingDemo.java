package abstraction;

import javax.swing.plaf.basic.BasicTextUI.BasicCaret;

public class CouplingDemo {

	public static void main(String[] args) {

		Calc calc = new Calc();
		calc.add();
	}
}

//class -> method + variable 

//coupling --> tight 
class Calc {

	//Calc has a basicCalc 
	//containership
	BasicCalc basicCalc = new BasicCalc();

	void add() {
		basicCalc.add();
	}

}
//CalcX is a BasicCacl 
class CalcX extends BasicCalc{
	//inheritance 
}


class BasicCalc {

	void add() {
		System.out.println("add");
	}

	void sub() {
		System.out.println("sub");
	}
}

class SciCalc {
	void sin() {
		System.out.println("sin");
	}

	void sqrt() {
		System.out.println("sqrt");
	}
}