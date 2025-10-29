package string;

public class StringBufferDemo {

	public static void main(String[] args) {

		// mutable
//		StringBuffer sb = new StringBuffer("royal");//sync 

		StringBuilder sb = new StringBuilder("royal");// non sync
		sb.append("edu");// royaledu
		System.out.println(sb);// royaledu

		char c = 'a';
		sb.replace(0, 5, c + "");

		String x = sb.toString();

		sb.reverse();

		String rev = sb.toString();

		//

		// fb -> e , p [ submit]

		System.out.println("===============================");
		StringBuffer sbb = new StringBuffer("royal");
		System.out.println(sbb.length());// 5
		System.out.println(sbb.capacity());// 16
		sbb.append("edu");// royaledu
		sbb.delete(0, 5);// 0:inclusive,5:exclusive
		System.out.println(sbb);
		sbb.insert(0, "royal");
		System.out.println(sbb);
		sbb.replace(0, 5, "india");
		System.out.println(sbb);
		String rev2 = sbb.reverse().toString();
		sbb.charAt(0); // 0th index character
		sbb.indexOf("e");// royaleduroylaedu => 5
		sbb.indexOf("edu");// royaleduroylaedu => 5
		sbb.indexOf("ravan");// royal => -1

	}
}
