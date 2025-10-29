package generic;

import java.util.Scanner;

public class GenericAddition2 {
	public static void main(String[] args) {
		ProfitLoss<Integer> p = new ProfitLoss<>();
		p.find(2500, 3000);

//		ProfitLossR<Scanner> s = new ProfitLossR<Scanner>();
//		ProfitLossR<String> s = new ProfitLossR<String>();

	}
}

class ProfitLoss<T> {
	void find(T b, T s) {
		// s-b
	}
}

class ProfitLossR<T extends Number> {
	T find(T b, T s) {
		// s-b
		return b;
	}

}
