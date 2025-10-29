package collectiond;

import java.util.ArrayList;
import java.util.Collections;

public class StockApp {

	public static void main(String[] args) {

		ArrayList<Integer> intList = new ArrayList<Integer>();

		intList.add(10);
		intList.add(110);
		intList.add(100);
		intList.add(-10);

		System.out.println(intList);// 10 s
		Collections.sort(intList);
		System.out.println(intList);// 10 s

		System.out.println("----------------------");

		Stock s1 = new Stock("RIL", 1400F);
		Stock s2 = new Stock("RVNL", 400F);
		Stock s3 = new Stock("MRF", 89000F);
		Stock s4 = new Stock("HUL", 5000F);

		ArrayList<Stock> list = new ArrayList<Stock>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		System.out.println("before sort => " + list);//
		Collections.sort(list);
		System.out.println("after sort => " + list);//

		System.out.println(s1.compareTo(s2));

	}
}

//Comparable vs Comparator

class Stock implements Comparable<Stock> {

	public Stock(String name, Float price) {
		this.name = name;
		this.price = price;
	}

	String name;
	Float price;

	public String toString() {
		return name + "-" + price;
	}

	//1 first > 
	//0 both are same 
	//-1 second > 
	public int compareTo(Stock o) {
		if (this.price > o.price) {
			return -1;
		} else if (this.price < o.price) {
			return 1;
		} else {
			return 0;
		}
	}
}
