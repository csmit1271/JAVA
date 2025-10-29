package collectiond;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();

		ts.add(10);
		ts.add(30);
		ts.add(20);
		ts.add(10);
		ts.add(100);
		ts.add(1000);
		ts.add(1200);
		ts.add(750);

		System.out.println(ts);// 10 20 30
		// TreeSet -> duplicate? No
		// order? -> no
		// sorted? -> Yes
		// unique? -> Yes

		System.out.println("headset => " + ts.headSet(750));
		System.out.println("tailset => " + ts.tailSet(750));

		System.out.println("higher =>" + ts.higher(750));
		System.out.println("lower =>" + ts.lower(750));

		System.out.println("floor => " + ts.floor(800));
		System.out.println("ceil => " + ts.ceiling(800));

		System.out.println("floor => " + ts.floor(750));
		System.out.println("ceil => " + ts.ceiling(750));

		System.out.println("===============================");
		System.out.println(ts.size());
		ts.remove(20);
		System.out.println(ts);
		System.out.println(ts.contains(30));
		ts.clear();

	}
}
