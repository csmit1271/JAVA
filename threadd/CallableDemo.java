package threadd;

import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ProcessSumCall p = new ProcessSumCall();

		ExecutorService ex = Executors.newCachedThreadPool();

		Future<Integer> ft = ex.submit(p);//

		int ans = ft.get();

		System.out.println(ans);

		if (ans % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}

class ProcessSumCall implements Callable<Integer> {

	public Integer call() throws Exception {
		Integer sum = 0;
		
		System.out.println("started " + LocalDateTime.now());
		
		int wait = (int)(Math.random()*5000);//
		System.out.println("wait => "+wait);//
		Thread.sleep(wait);
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("end " + LocalDateTime.now());
		return sum;
	}

}
