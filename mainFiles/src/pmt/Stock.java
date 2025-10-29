package pmt;

public class Stock {

	private String name;//RIL
	private Float currentPrice;//1450
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(Float currentPrice) {
		this.currentPrice = currentPrice;
	}

	public void display() {
		System.out.printf("\n%-10s %-5f",name,currentPrice);
	}

}
