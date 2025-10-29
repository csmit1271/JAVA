package threadd;

public class SendMail {

	public static void main(String[] args) {

		PrintMail p = new PrintMail();

		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(p);

		t1.start();// 1-100
		t2.start();// 101-200
		t3.start();// 201-300

	}
}

class PrintMail extends Thread {

	public void run() {
		print();
	}

	void print() {
		for (int i = 1; i <= 300; i++) {
			System.out.println("print" + i);
		}
	}
}
