package threadd;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleDemo {

	public static void main(String[] args) {

		PrintTime p1 = new PrintTime();
		
		ScheduledExecutorService ex = Executors.newScheduledThreadPool(5);
		ex.scheduleAtFixedRate(p1, 0, 10, TimeUnit.SECONDS);
		ex.scheduleWithFixedDelay(p1, 0, 10, TimeUnit.SECONDS);
		

	}
}

class PrintTime extends Thread {
	@Override
	public void run() {
		System.out.println(LocalDateTime.now());
	}
}
