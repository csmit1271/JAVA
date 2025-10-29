package exceptionrev;

public class NegNumException extends RuntimeException{
	public NegNumException() {
		super("negative num found");
	}
}
