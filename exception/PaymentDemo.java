package exception;

import java.io.IOException;

public class PaymentDemo {

	public static void main(String[] args) {

		int amount = -100;

		Paypal p = new Paypal();
		try {
			p.chargeCreditCard("6574839094857658493", amount);// caller
		} catch (NegativeAmountException e) {
			e.printStackTrace();
		} catch (TooBigAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class Paypal {

	void chargeCreditCard(String ccNum, int amount) throws TooBigAmountException, IOException {

		if (amount > 0) {
			System.out.println("Amount debited...");
		} else if (amount > 10000) {
			TooBigAmountException t = new TooBigAmountException();// obj
			throw t;
//			throw new TooBigAmountException(); 
		} else {
			// exception
			NegativeAmountException ne = new NegativeAmountException();
			throw ne;
		}
	}
}
//class -> exception 
//1
//2

class NegativeAmountException extends RuntimeException {
	public NegativeAmountException() {
		super("Invalid Amount");
	}
}

//java ->
//exception 
//throw 
