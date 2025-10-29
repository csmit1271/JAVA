package generic;

public class Addition {

	static void add(int a, int b) {
		System.out.println(a+b);
	}

	static void add(double a, double b) {
		System.out.println(a+b);
	}
 
	public static void main(String[] args) {
		// add -> int,int
		Addition.add(10,20);
		Addition.add(20.5,20.6);//double 
		Addition.add(20.5F, 20.20F);
		Addition.add(20.5F, 20.20F);
		Addition.add(20.5F, 20.20F);
		//generic 
		
		
//		ArrayList 
		
	}
}
