package exception;

public class TooBigAmountException extends Exception{
	public TooBigAmountException() {
		super("Amount is greater than expected amount");
	}
}

//TooBigAmountException obj = new TooBigAmountException();
//throw obj; 