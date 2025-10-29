package threadd;

public class ConcurrentManual {

	public static void main(String[] args) {

		
		//validation 
		
		
		//db insertion 
		Runnable r1 = new Runnable() {
			public void run() {
				//db insertion 
			}
		};
		
		
		//send mail 
		Runnable r2 = new Runnable() {
			public void run() {
				//send mail logic 
			}
		};
		
		//login 
	}
}
