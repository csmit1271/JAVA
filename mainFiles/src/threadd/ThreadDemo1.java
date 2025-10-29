package threadd;

public class ThreadDemo1 {

	public static void main(String[] args) {

		Print p = new Print();
		Copy c = new Copy();

		p.start();// thread -> run -> print -> 1-10
		c.start();

	}
}

//class -> extends Thread 

class Print extends Thread {

	public void run() {
		print();
	}

	void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("print" + i);
			if (i % 7 == 0) {
				stop();
			}
		}
	}
}

class Copy extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("copy" + i);
		}
	}
}