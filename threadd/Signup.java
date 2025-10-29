package threadd;

import java.util.concurrent.Callable;

public class Signup {

	public static void main(String[] args) {

		Callable<Integer> c = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for (int i = 1; i <= 100; i++) {
					sum = sum + i;
				}
				return sum;
			}
		};

	}
}
