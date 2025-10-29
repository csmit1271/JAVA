
public class InterfaceDemo {
	public static void main(String[] args) {
		JIO j = new JIO();
		System.out.println(j.callRate);
		System.out.println(JIO.callRate);

		// j.callRate++
		// j.callRate
		// JIO.callRate

		// compile
		// runtimer
		// 1
		// 0

	}
}
//bottom - up 

//class extends class 
//class implements interface 
//interface extends  interface 



//interface X  class 

interface TRAI extends DOT{
	int callRate = 1;
//	public static final int callRate; 

	void call();

	abstract void recharge();

	abstract void callForward();

}

abstract interface DOT {

	abstract void port();

	public void switchoff();
}

//interface -> method -> abstract and public 

class JIO implements TRAI, DOT {

	public void port() {
		System.out.println("port()");
	}

	public void switchoff() {

	}

	public void call() {

	}

	public void recharge() {

	}

	public void callForward() {

	}
}