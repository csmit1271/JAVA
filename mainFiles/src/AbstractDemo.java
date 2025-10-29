
public class AbstractDemo {
	public static void main(String[] args) {
//		XY obj = new XY();
	}
}

abstract class Faculty {
	String name;
	int salary;

	abstract void countSalary();// declare -> abstract

}

//class -> abstract 
//class -> non abstract 
class PT {
	// non abstract
	void add() {

	}
}

abstract class XY {
	abstract void add();

	void sub() {
		System.out.println("sub");
	}
}

class XYChild extends XY {
	// override
	void add() {

	}
}

abstract class PQR {
	void pqr() {

	}
}

abstract class GOI{
	
}

abstract class RBI extends GOI{
	abstract public void wid();
	abstract public void dep();

	//6.50
	
	final public void roi(){
		//6.50+3
		//6.50+3+5
	}
}


abstract class Yash extends RBI{
  abstract void checkBal();
}

class IDBI extends Yash{

	//15%
	public void wid() {
	}
	public void dep() {
	}
	void checkBal() {
	}
	
}


class ICICI extends RBI{
	public void wid() {
		
	}
	public void dep() {
		
	}
}




















