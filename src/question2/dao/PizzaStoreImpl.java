package question2.dao;

import java.util.ArrayList;

import question2.bean.Pizza;
import question2.exceptions.NoPizzaFoundException;
import question2.exceptions.PizzaAlreadyExistsException;

public class PizzaStoreImpl implements PizzaStore{
	
	ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	
	@Override
	public void addNewPizza(Pizza p) throws PizzaAlreadyExistsException{
		for(Pizza pizza: pizzas)
		{
			if((pizza.getPizzaName()).equals(p.getPizzaName())) {
				throw new PizzaAlreadyExistsException();
			}
		}
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
