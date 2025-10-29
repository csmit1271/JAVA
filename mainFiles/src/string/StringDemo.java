package string;

public class StringDemo {

	public static void main(String[] args) {

		String str = "royal";
		String str2 = new String();
		String str3 = new String("royal");

//		str = scr.next();//royal edu -> royal -> single word 
//		str = scr.nextLine(); //-> royal edu -> royal edu -> multi word

		// how many characters we have in string?
		System.out.println(str.length());

		System.out.println(str.toUpperCase());// uppercase
		System.out.println(str.toLowerCase());// lowercase

		String str4 = "Royal";
		System.out.println(str.equals(str4)); // royal Royal => false
		System.out.println(str.equalsIgnoreCase(str4));// royal Royal => true

		System.out.println(str.equals(str4.toLowerCase()));// royal royal => true

		System.out.println(str.equals(str4)); // royal Royal
		// userPassword

//		str.toUpperCase(); // upper case

		// Royal -> R
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		// System.out.println(str.charAt(10));//runtime error -> exception

		// royal
		String str5 = "jony jony yes papa";
		// character p -> index
		System.out.println(str5.indexOf('p'));// left : beginning
		System.out.println(str5.lastIndexOf('p'));// right : end
		System.out.println(str5.indexOf('z'));// -1

		System.out.println(str5.substring(14));// 14th character -> end of the string

		String str6 = "abcdefghijkl";
		System.out.println(str6.substring(3, 8));// [inc,excl]

		String str7 = "ram,sita,laxman,ravan";

		String str8[] = str7.split(" ");// 0:ram,sita,laxman,ravan

		for (int i = 0; i < str8.length; i++) {
			System.out.println(str8[i]);
		}

		String str9[] = str7.split(",");// 0:ram 1:sita 2:laxman 3:ravan

		for (int i = 0; i < str9.length; i++) {
			System.out.println(str9[i]);
		}

	}
}
