package threadd;

public class SendMail2 {

	public static void main(String[] args) throws InterruptedException {

		PrintMail2 p = new PrintMail2();

		Thread t1 = new Thread(p);
		t1.setName("t1");
		t1.setPriority(1);
		Thread t2 = new Thread(p, "t2");
		Thread t3 = new Thread(p, "t3");
		t2.setPriority(10);// HIGH ---> NORM 5
		t1.start();// 1-100
		t1.join();
		t2.start();// 101-200
//		t2.sleep(1000);
		t2.join();
		t3.start();// 201-300
//		t3.sleep(1000);
	}
}

class PrintMail2 extends Thread {

	public void run() {
		print();
	}

	void print() {

		for (int i = 1; i <= 30; i++) {
			System.out.println("print => " + currentThread().getName() + " => " + i);
		}
	}
}
