package collectiond;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {

		// array ->
		// 4
		// 5
		ArrayList list = new ArrayList();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add("royal");

		Student s = new Student();
		list.add(s);

		System.out.println(list);// 10 20 30 40 50

		ArrayList<Integer> list1 = new ArrayList<>();// 7 diamond

		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
//			list1.add("royal");

		System.out.println(list1);

		// single element
		System.out.println(list1.get(2));

//			System.out.println(list1.get(10));
//			System.out.println(list1.get(-1));

		//iterate print 
		System.out.println("Iteration : ");
		for(int i=0; i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("Iteration : ");
		for(Integer x:list1) {
			System.out.println(x);
		}
		
		//take 5 numbers from user and store in ArrayList 
			//find out sum and min from it 
			//sort it 
		//0	 1  2  3  4  5  6
		//10 100 20 30 40 50 60
		
		list.add(60);//add at the end 
		list.add(1,70);//index -> add , shift 
		list.set(1, 100);//index -> add , overwrite 
		
		
		//20 10 50 30 40 --bubble 
		for(int i=0;i<list1.size() -1 ;i++) {
			for(int j=0;j<list1.size()-1;j++) {
				if(list1.get(j) > list1.get(j+1)) {
					Integer tmp = list1.get(j);//j 
					list1.set(j, list1.get(j+1));
					list1.set(j+1, tmp);
				}
			}
		}
		System.out.println(list1);
		
		Collections.sort(list1);//sort 
		//bubble
		//selection
		//insertion->
		//merge {} 
		//quick {}pivot 
		
		


	}
}

class Student {

}
