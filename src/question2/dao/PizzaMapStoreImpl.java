package question2.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import question2.bean.Pizza;
import question2.exceptions.NoPizzaFoundException;
import question2.exceptions.PizzaAlreadyExistsException;

public class PizzaMapStoreImpl implements PizzaStore{

	private Map<String, Pizza> pizzas = new HashMap<String, Pizza>();
	
	@Override
	public void addNewPizza(Pizza p) throws PizzaAlreadyExistsException{
		
		if(pizzas.containsKey(p.getPizzaName())) {
			throw new PizzaAlreadyExistsException();
		}
		pizzas.put(p.getPizzaName(), p);
	}
	
	@Override
	public Pizza getPizzaByName(String pizzaName) throws NoPizzaFoundException{
		
		Pizza p = null;
		if(pizzas.containsKey(p.getPizzaName())) {
			p = pizzas.get(pizzaName);
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
		
		for(Map.Entry<String, Pizza> pizza : pizzas.entrySet())
		{
			if(pizza.getValue().getSizeInCms() == size)
			{
				p.add(pizza.getValue());
			}
		}
		
		if(p.size() == 0)
		{
			throw new NoPizzaFoundException(size);
		}
		
		return p;
	}
	
}
