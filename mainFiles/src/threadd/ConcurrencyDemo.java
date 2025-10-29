package threadd;

import java.util.concurrent.Executors;

public class ConcurrencyDemo {

	public static void main(String[] args) {

		Copy1 c1 = new Copy1();

//		aws -> 500 unit -> 10second -> 50$ -> 5unit ->   
//		Jmeter -> 1500->	

//		Executors.newSingleThreadExecutor();
//		Executors.newFixedThreadPool(5);
		// 35 processing unit -> 15 thread
		// 35 - {30} 5

//		Executors.newCachedThreadPool(); 

		// 1 processing unit
		// p1 ---> t1
		// p2 ---> t2
		// queue [ t1,t2,t3,t4,......t15 ]

// Executors.newScheduledThreadPool(5);

		// t1 -> 10 min ->
		// every 10 min
		// t1 ->10min ->

	}
}

class Copy1 extends Thread {

	public void run() {
		//
	}
}
