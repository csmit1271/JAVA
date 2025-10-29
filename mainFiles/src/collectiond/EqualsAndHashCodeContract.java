package collectiond;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class EqualsAndHashCodeContract {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);// true
		hs.add(20);// true
		hs.add(10);// false

		System.out.println(hs);// 10,20
		System.out.println(hs.size());// 2

		HashSet<StudentData> hs2 = new HashSet<>();
		StudentData s1 = new StudentData("ram", 1, "Ayodhya");
		StudentData s2 = new StudentData("sita", 2, "Janakpur");
		StudentData s3 = new StudentData("ravan", 3, "Lanka");
		StudentData s4 = new StudentData("Hanuman", 4, "kishkinda");
		StudentData s5 = new StudentData("ravan", 3, "Lanka");

		hs2.add(s1);// ram ->
		hs2.add(s2);// sita ->
		hs2.add(s3);// ravan ->
		hs2.add(s4);// hm
		hs2.add(s5);// ravan

		System.out.println(hs2.size());// 5

		StudentData s6 = s5;//
		hs2.add(s6);// hahscode equals

		System.out.println(hs2.size());// 5

		//

		List<Integer> l = new ArrayList<Integer>(); 
		
		List<List<Integer>> l2 = new ArrayList<List<Integer>>(); 
		
	 
		
	}

}

class StudentData {
	String name;
	Integer studentId;
	String city;

	public StudentData(String n, Integer sId, String c) {
		this.name = n;
		this.studentId = sId;
		this.city = c;
	}

	public int hashCode() {
		System.out.println("calling for " + this.name);
		return 0;
	}

	public boolean equals(Object obj) {
		StudentData s = (StudentData) obj;

		return this.studentId == s.studentId;
	}

}
