package threadd;

public class ThreadDemo2 {

	public static void main(String[] args) {

		PrintI p = new PrintI();

		Thread t = new Thread(p);
		t.start();

	}
}

class PrintI implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("print" + i);
		}
	}
}
