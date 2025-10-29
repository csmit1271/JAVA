package collectiond;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>(); 
		
		hs.add(10);
		hs.add(30);
		hs.add(20);
		hs.add(10);
		
		System.out.println(hs);//20 10 30 
		//HashSet -> duplicate? no 
		//			 order? no 
		//			 sorted? no 
		//			 unique? yes 
		System.out.println(hs.size());
		hs.remove(20);
		System.out.println(hs);
		System.out.println(hs.contains(30));
		hs.clear();

		
		
		
	}
}
