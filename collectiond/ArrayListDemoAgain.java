package collectiond;

import java.util.ArrayList;

public class ArrayListDemoAgain {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();// Object
		list.add(10);
		list.add("royal");

		// ArrayList<Integer> i = new ArrayList<>();
		// i.add(10);
		// i.add("royal");

		ArrayList<Integer> i = new ArrayList<>();
		// duplicate? yes
		// sorted? no
		// ordered? yes
		// unique?no
		i.add(10);// 0
		i.add(20);// 1
		i.add(10);// 2

		System.out.println(i);
		System.out.println(i.get(0));// 0th index -> 10

		// add()
		// get()
		// remove()
		// contains()
		// clear()
		// size()
		// set()
		// indexOf()
		// iterator()

	
	}
}
