package abstraction;

public class InterfaceDemo {
	public static void main(String[] args) {
//		RBI obj = new RBI();
	}
}

//pure oops 
//encapsulation -> 

class ICICI {

	int bal;// instance variable

	static int branchCode;

	void wid() {

		int amount;// local variable
	}

}

//pure abstract class 
interface RBI {

	static final int bal = 10;// static final

	public void add(int a);// a local

	abstract void sub();
	 

}

class A{
	
}
class B extends A{
	
}

interface AA{
	
}

class BB implements AA{
	
}

interface DD extends AA {
	
}























