package collectiond;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(1, "one-1");//
		hm.put(5, "one");
		hm.put(40, "four-0");
		hm.put(14, "1-four");

		// key -> unique
		// value-> duplicate

		// key
		System.out.println(hm);

		System.out.println(hm.get(2));
		System.out.println(hm.get(22));// null

		System.out.println(hm.remove(22));// null

		System.out.println(hm.size());
		
		System.out.println(hm.containsKey(2));
		System.out.println(hm.containsValue("three"));
		
		//spring -> rest api-> json -> key:value 
		//input json 
		//output json
		//json -> Map 
		
		//third party api -> 
		//{private,color,read}
		
	}
}
