package polymorphic;

public class IsAHasA {

	public static void main(String[] args) {

		Car c = new Dzire();
		c.carStart();// compile time runtime dzire
//		c.dzireStart();//compilation error 

		((Dzire)c).dzireStart();//parent->child 
		
	
	}
}

//car has a gear 
class Car {
	int gear; // has

	void carStart() {
		System.out.println("car");
	}
}

//dzire is a car 
//dzire has a foggLamp
class Dzire extends Car {
	int foggLamp;

	void dzireStart() {
		System.out.println("car");
	}
}

//swift is a car 
class Swift extends Car {

}