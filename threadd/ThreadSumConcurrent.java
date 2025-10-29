package threadd;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSumConcurrent {

	public static void main(String[] args) {

		ProcessSum2 t1 = new ProcessSum2();

		// pool
		ExecutorService ex = Executors.newFixedThreadPool(5);

		ex.submit(t1);// queue p1->t1
		//
		System.out.println(t1.sum);
		ex.shutdown();// thread pool -> 5

	}

}

class ProcessSum2 extends Thread {

	int sum = 0;

	@Override
	public void run() {
		System.out.println("process start ..........");
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("------Process end-----------");
	}
}
