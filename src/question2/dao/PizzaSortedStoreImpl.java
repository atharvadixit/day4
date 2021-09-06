package question2.dao;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import question2.bean.Pizza;
import question2.exceptions.NoPizzaFoundException;
import question2.exceptions.PizzaAlreadyExistsException;

public class PizzaSortedStoreImpl implements PizzaStore{

	private Set<Pizza> pizzas = new TreeSet<Pizza>();
	
	@Override
	public void addNewPizza(Pizza p) throws PizzaAlreadyExistsException{
		pizzas.add(p);
	}
	
	@Override
	public Pizza getPizzaByName(String pizzaName) throws NoPizzaFoundException{
		
		Pizza p = null;
		for(Pizza pizza: pizzas) {
			if(pizzaName.contentEquals(pizza.getPizzaName()))
			{
				p = pizza;
				break;
			}
		}
		if(p == null)
		{
			throw new NoPizzaFoundException(pizzaName);
		}
		return p;
	}
	
	@Override
	public ArrayList<Pizza> getPizzaNamesBySize(int size) throws NoPizzaFoundException{
		ArrayList<Pizza> p = new ArrayList<Pizza>();
		
		for(Pizza pizza: pizzas)
		{
			if(pizza.getSizeInCms() == size)
			{
				p.add(pizza);
			}
		}
		
		if(p.size() == 0)
		{
			throw new NoPizzaFoundException(size);
		}
		
		return p;
	}
	
}
