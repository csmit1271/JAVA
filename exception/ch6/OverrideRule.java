package exception.ch6;

public class OverrideRule {

	public static void main(String[] args) {

	}

}

class Q extends RuntimeException {

}

class P extends Q {

}

class C extends P {

}
//try catch 
//throws 

class Laptop {
	void add() throws P {

	}

}

class Legion extends Laptop {
	void add() throws RuntimeException{

	}
}
