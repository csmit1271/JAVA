package assertdemo;

public class AssertDemo {

	public static void main(String[] args) {

		// assert
		// test cases
		
		System.out.println(new AssertDemo().test1());
		
		System.out.println("hi");

	}

	static int add(int a, int b) {
		return a + b;
	}

	boolean test1() {
		int ans = add(5, 15);

		assert (ans == 10);//disable 
		return ans == 10;// true false
	}
}

//4 int assert ; error 

//java => 3 int assert ; 

//java -ea AssertDemo 

//test cases --> code 

//HDFC insurance -> 
//2005
//2025
