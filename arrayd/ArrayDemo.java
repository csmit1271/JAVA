package arrayd;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int a[];
		a = new int[2]; 
		
		int []b[] = new int[3][3]; 
		
		int x[][] = new int[3][];
	
		
		x[0] = new int[3];
		x[1] = new int[5]; 
		x[2] = new int[2]; 
		
		//0: 1 2 3 
		//1: 1 2 3 4 5 
		//2: 1 2 
		
		
		System.out.println(x[0].length);//3 
	
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				
			}
		}
	
	
	}
	
}
