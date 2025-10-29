package collectiond;

import java.util.Comparator;

public class IntegerSupport implements Comparator<Integer> {

	public int compare(Integer o1, Integer o2) {

		if (o1 > o2) {
			return -1;
		} else if (o2 > o1) {
			return 1;
		} else {
			return 0;
		}
	}
}
