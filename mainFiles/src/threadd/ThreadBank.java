package threadd;

public class ThreadBank {

	public static void main(String[] args) {

		Account rock = new Account();
		Account thomas = new Account();

		Thread t1 = new Thread(rock, "Rock");
		Thread t2 = new Thread(rock, "Sakira");
		Thread t3 = new Thread(rock, "Stone");

		Thread t4 = new Thread(thomas, "thomas");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

//locks 
//common resource -> n thread 
//balance -> t1 t2 t3 

//object level lock -> thread 

//class level lock -> object 

class Account extends Thread {

	// static
	int balance = 50000;

	synchronized void wid(int amt) {
		System.out.println("wid process start....." + currentThread().getName());
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		if (balance - amt >= 0) {
			balance = balance - amt;
			System.out.println("balance deducted...." + currentThread().getName());
		} else {
			System.out.println("Low Balance..." + currentThread().getName());
		}
		System.out.println("wid => THE END" + currentThread().getName());
		System.out.println("final balance = > " + balance);
	}

	void wid2(int amt) {
		System.out.println("wid process start....." + currentThread().getName());
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (this) {

			if (balance - amt >= 0) {
				balance = balance - amt;
				System.out.println("balance deducted...." + currentThread().getName());
			} else {
				System.out.println("Low Balance..." + currentThread().getName());
			}
		}
		System.out.println("wid => THE END" + currentThread().getName());
		System.out.println("final balance = > " + balance);
	}

	public void run() {
		wid(50000);
	}

}
