package collectiond;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(101);
		hs.add(100);
		hs.add(200);
		hs.add(150);
		hs.add(1000);

		Iterator<Integer> it = hs.iterator();

		while (it.hasNext()) {
			int x = it.next();// element eject
			System.out.println(x);
		} // check => true

	 
	}
}
