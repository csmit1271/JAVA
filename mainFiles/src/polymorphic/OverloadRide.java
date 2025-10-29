package polymorphic;

public class OverloadRide {

	public static void main(String[] args) {

	}
}

class P {

	//method overloading 
	void add() {
		
	}
	
	void add(int x) {
		
	}
	
	Number sub() {
		return null;
	}
	
	Integer div()
	{
		return null;
	}
	
//	Double max() {
//		return 0.0; 
//	}
}
//inh 
class C extends P {

	//override 
	void add() {
		
	}
	
	//co-v
	Integer sub() {
		return null;
	}
	
//	Number div()
//	{
//		return null;
//	}
	
//	Float max() {
//		return 0.0f; 
//	}
}
