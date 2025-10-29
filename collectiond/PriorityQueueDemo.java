package collectiond;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		pq.add(10);
		pq.add(100);
		pq.add(10);
		pq.add(101);
		pq.add(20);
		pq.add(15);
		
		pq.offer(100);
		// duplicate - yes
		// unique - no
		// sorted - no[*]
		// ordered - no
		System.out.println(pq);
		// asc
//		System.out.println(pq.get(0));
		System.out.println("---------------------------");
		System.out.println(pq.size());
		System.out.println(pq.peek());// highest priority element return

		System.out.println(pq.poll());// highest priority element return -and remove it from queue
		System.out.println(pq.size());

		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());

		System.out.println(pq.size());

		System.out.println(pq.poll());

	}
}
