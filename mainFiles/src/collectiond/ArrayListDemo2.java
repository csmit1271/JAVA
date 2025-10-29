package collectiond;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println(list.size());

		list.remove(new Integer(20));// index
		System.out.println(list);// 1 3 4 5

		ArrayList<String> strList = new ArrayList<String>();
		strList.add("ram1");
		strList.add("ram2");
		strList.add("ram3");
		strList.add("ram4");

		strList.remove("ram1");
		strList.remove(0);

		System.out.println(strList);

		System.out.println(strList.contains("ram4"));// true
		System.out.println(strList.contains("ram1"));// false

		strList.clear();
		// add get set remove size clear contains 
		
		
		ArrayList<Integer> listA = new ArrayList<Integer>();//size ? 
		System.out.println(listA.size());//0 , capacity -> 10 
		listA.add(10); 
		listA.add(20); 
		
		

	}
}
