package collectiond;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSorting {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(100);
		ts.add(-10);
		ts.add(1);
		ts.add(12);
		ts.add(102);

		System.out.println(ts);// sorted asc

		Stock2 s1 = new Stock2("RIL", 1400);
		Stock2 s2 = new Stock2("RVNL", 400);
		Stock2 s3 = new Stock2("MRF", 89000);
		Stock2 s4 = new Stock2("HUL", 5000);

		TreeSet<Stock2> stocks = new TreeSet<Stock2>();
		stocks.add(s1);
		stocks.add(s2);
		stocks.add(s3);
		stocks.add(s4);

		System.out.println(stocks);
		System.out.println("The End");

		Iterator<Stock2> it = stocks.iterator();

		while (it.hasNext()) { // true
			Stock2 x = it.next(); // eject
			System.out.println(x.name + ":" + x.price);
		}

	}
}

class Stock2 implements Comparable<Stock2> {
	String name;
	int price;

	public Stock2(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Stock2 o) {
		return o.price - this.price;
	}

	@Override
	public String toString() {
		return name+":"+price;
	}
}