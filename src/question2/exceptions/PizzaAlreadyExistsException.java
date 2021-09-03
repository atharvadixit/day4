package question2.exceptions;

public class PizzaAlreadyExistsException extends Exception{
	
	public PizzaAlreadyExistsException() {
		super("Pizza with this name already exists");
	}
}
