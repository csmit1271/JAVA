package threadd;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ProcessSumCall p = new ProcessSumCall();

		ExecutorService ex = Executors.newCachedThreadPool();

		Future<Integer> ft = ex.submit(p);//
		Future<Integer> ft2 = ex.submit(p);//

		int ans = ft.get();
		int ans2 = ft2.get();

		System.out.println(ans+ans2);
	
		ex.shutdown();
	}
}
