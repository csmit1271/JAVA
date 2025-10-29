package basicprac;

public class SwapValue {

	int k=10; 


	public static void main(String[] args) {

		int i = 10;
		Swap s = new Swap();
		s.change(i);//pass by value 
		System.out.println(i);
		
		SwapValue ss = new SwapValue();
		ss.k = 100; 
		
		s.swap2(ss);//pass by ref 
		System.out.println(ss.k);
	
	
	}
}

class Swap {
	
	void change(int i) {
		i = i * 10;
	}
	
	void swap2(SwapValue s) {
		s.k = s.k * 10 ; 
	}
}
