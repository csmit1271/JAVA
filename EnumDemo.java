
public class EnumDemo {

	public static void main(String[] args) {

		System.out.println(SodaShop.SMALL);
		System.out.println(SodaShop.SMALL.discount);
		System.out.println(SodaShop.SMALL.size);
		
	}
}

class Soda {

	final int SMALL = 1;
	final int LARGE = 2;
	final int XLARGE = 3;
	final int XXLARGE = 4;

}

//when u have multiple constant then u have to create enum 

enum SodaShop {
	SMALL(1, 10), LARGE(2,15), XLARGE(3,20), XXLARGE(4,15);

	int size;// 1
	int discount;// 10

	private SodaShop(int size, int discount) {
		this.size = size;
		this.discount = discount;
	}
}



