package basicprac;

public class ForEachDemo {

	void lblLoop() {
		// lbl loop
		a: for (;;) {
			b: for (;;) {
				c: for (;;) {
					break a;
				}
			}
		}
	}

	public static void main(String[] args) {

		
		int a[] = {1,2,34,345,46,7,87,6765,4543,43,4}; 
			
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			a[i] = a[i] * 10;
		}
	
		//forEach -- read 
		for(int x:a) {
			System.out.println(x);
		}
	
		
	
	}
}
