package question2.dao;

import java.util.ArrayList;

import question2.bean.Pizza;
import question2.exceptions.NoPizzaFoundException;
import question2.exceptions.PizzaAlreadyExistsException;

public interface PizzaStore {
	void addNewPizza(Pizza e) throws PizzaAlreadyExistsException;
	
	Pizza getPizzaByName(String pizzaName) throws NoPizzaFoundException;
	
	ArrayList<Pizza> getPizzaNamesBySize(int size) throws NoPizzaFoundException;
}
