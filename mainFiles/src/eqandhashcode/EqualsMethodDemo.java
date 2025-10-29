package eqandhashcode;

public class EqualsMethodDemo {

	public static void main(String[] args) {

		Dog d1 = new Dog("Boi"); // d1 -> 1234
		Dog d2 = new Dog("Tyri");// d2 -> 3456

		System.out.print((d1 == d2) + " "); // FALSE

		System.out.print((d1.equals(d2)) + " "); // equals d1 == d2

		Dog d3 = new Dog("Boi");// d3 -> 8596

		d2 = d1;

		System.out.print((d1 == d2) + " ");// TRUE
		System.out.print((d1 == d3) + " ");// FALSE

		// --------------------------------------------------

		String s1 = new String("royal");//123
		String s2 = new String("royal");//456

		System.out.println(s1 == s2);//false 
		System.out.println(s1.equals(s2));//true 
		
	}
}

//equlas->Dog class -> Object class -> == -> reference 
class Dog {
	String name;

	Dog(String s) {
		name = s;
	}
}
