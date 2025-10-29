package threadd;

public class ThreadSum {

	public static void main(String[] args) throws InterruptedException {

		ProcessSum p = new ProcessSum();
		p.start();

		p.join();
		
		if (p.sum % 2 == 0) {
			System.out.println("EVEN"+p.sum);
		} else {
			System.out.println("ODD"+p.sum);
		}

	}
}

class ProcessSum extends Thread {

	int sum = 0;

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
	}
}
