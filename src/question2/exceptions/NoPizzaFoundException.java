package question2.exceptions;

public class NoPizzaFoundException extends Exception{

	public NoPizzaFoundException(String s) {
		super("Pizza with name " + s + " not found");
	}
	
	public NoPizzaFoundException(int size) {
		super("Pizza with size " + size + " not found");
	}
}
