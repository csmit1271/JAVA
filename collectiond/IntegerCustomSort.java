package collectiond;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerCustomSort {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(110);
		list.add(-10);
		list.add(100);
		list.add(10000);
		list.add(1000);

		System.out.println(list);

		Collections.sort(list,new IntegerSupport());

		System.out.println(list);

	}
}
