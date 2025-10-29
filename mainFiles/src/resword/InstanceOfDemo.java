package resword;

public class InstanceOfDemo {

	public static void main(String[] args) {

		int a = 10_000;
		
		int b = 10_00;
		
		
		
		
		Car c = new Car();
		String s = new String();
		Dzire d = new Dzire();
		DzireX dx = new DzireX();
		Punch p = new Punch();

		// c -> ? instance object ?

		System.out.println(c instanceof Car);// true false

		System.out.println(d instanceof Car);
		System.out.println(d instanceof Dzire);
		System.out.println(d instanceof DzireX);

//		System.out.println(p instanceof Dzire);
//		System.out.println(s instanceof Car);

		System.out.println(null instanceof Object);
		System.out.println("ram" instanceof String);

//		System.out.println(false instanceof Boolean);

	}
}

class Car {

}

class Dzire extends Car {

}

class DzireX extends Dzire {

}

class Punch extends Car {

}