package arrayd;

public class Q4 {

	public static void main(String[] args) {
		int[][] a = {{1,2}, {3,4}};
		int[] b = (int[]) a[1];
		
		System.out.println(b.length);
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		Object o1 = a;
		
		int[][] a2 = (int[][]) o1;//a 
		
		System.out.println(a2.length);// a 
	
		int[] b2 = (int[]) o1;
		
	}
}
