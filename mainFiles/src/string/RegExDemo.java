package string;

public class RegExDemo {

	public static void main(String[] args) {
		// data --> format --> regex

		String name = "royal"; // alpha -> az AZ

		String alphaRegEx = "[a-zA-Z]+";// + -> min : 1 max : n
		String digitRegEx = "[0-9]+";
		String digitRegEx2 = "[\\d]+";

		// ??
		String alphaRegEx2 = "[\\w]+";// + -> min : 1 max : n

		String alNum = "[0-9A-Za-z]+";

		System.out.println(name.matches(alphaRegEx));// true

		name = "royal edu";
		System.out.println(name.matches(alphaRegEx));// false

		name = "royal1";
		System.out.println(name.matches(alphaRegEx));// false

		String emailRegex = "[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]{2,5}";// in edu com

		// + => 1 or more
		// * => 0 or more
		// . => any single character

		// \d

		System.out.println("\\n");

		// Pattern Matcher ->

		// royal =>
		// number =>

	}
}
