package collectiond;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();

		v.add(10);
		v.add(100);
		v.add(20);
		v.add(10);
		v.add(30);

		// duplicate?yes
		// ordered?yes
		// sorted?no
		// unique?no
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.get(0));
		System.out.println(v.contains(10));
		System.out.println(v.indexOf(10));
		System.out.println(v.remove(0));

		v.clear();
		System.out.println(v.size());
	}
}
