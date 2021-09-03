package question2.view;

import java.util.ArrayList;
import java.util.Scanner;

import question2.bean.Pizza;
import question2.dao.PizzaStore;
import question2.exceptions.NoPizzaFoundException;
import question2.exceptions.PizzaAlreadyExistsException;
import question2.factory.PizzaStoreFactory;

public class CustomerView {
	
	Scanner sc = new Scanner(System.in);
	
	PizzaStore factory = PizzaStoreFactory.getPizzaStore();
	
	void addPizzaDetailsAndStore() {
		sc.nextLine();
		System.out.println("Enter Pizza Name: ");
		String pizzaName = sc.nextLine();
		
		System.out.println("Enter Pizza Size: ");
		int pizzaSize = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter First Major Ingredient: ");
		String majorIngredientOne = sc.nextLine();
		
		System.out.println("Enter Second Major Ingredient: ");
		String majorIngredientTwo = sc.nextLine();
		
		System.out.println("Enter Third Major Ingredient: ");
		String majorIngredientThree = sc.nextLine();
		
		System.out.println("Enter Weight of Pizza: ");
		float weight = sc.nextFloat();
		
		System.out.println("Enter Price of Pizza: ");
		float price = sc.nextFloat();
		
		try
		{
			factory.addNewPizza(new Pizza(pizzaName, pizzaSize, majorIngredientOne, majorIngredientTwo, majorIngredientThree, weight, price));
		}
		catch(PizzaAlreadyExistsException p)
		{
			System.out.println(p);
		}
	}
	
	void displayPizzaDetailsByName() {
		sc.nextLine();
		System.out.println("Enter the name of Pizza: ");
		String pizzaName = sc.nextLine();
		try{
			Pizza pizza = factory.getPizzaByName(pizzaName);
			System.out.println("Name: " + pizza.getPizzaName() + "\nSize: " + pizza.getSizeInCms()
			+"\nFirst Major Ingredient: " + pizza.getMajorIngredientOne() + "\nSecond Major Ingredient: " + pizza.getMajorIngredientTwo()
			+"\nThird Major Ingredient: " + pizza.getMajorIngredientThree() + "\nWeight: " + pizza.getWeight() + "\nPrice: " + pizza.getPrice()
					);
		}
		catch(NoPizzaFoundException p)
		{
			System.out.println(p);
		}
	}
	
	void printPizzaNamesBySize() {
		System.out.println("Enter the size of Pizza: ");
		int size = sc.nextInt();
		ArrayList<Pizza> p = new ArrayList<Pizza>();
		try {
			p = factory.getPizzaNamesBySize(size);
			for(Pizza pizza: p)
			{
				System.out.println("Name: " + pizza.getPizzaName() + "\nSize: " + pizza.getSizeInCms()
				+"\nFirst Major Ingredient: " + pizza.getMajorIngredientOne() + "\nSecond Major Ingredient: " + pizza.getMajorIngredientTwo()
				+"\nThird Major Ingredient: " + pizza.getMajorIngredientThree() + "\nWeight: " + pizza.getWeight() + "\nPrice: " + pizza.getPrice()
						);
			}
		}
		catch(NoPizzaFoundException ex)
		{
			System.out.println(ex);
		}
	}
	
	public void callMethod() {
		int x;
		do {
		System.out.println("Enter the operation you want to perform:\n"
				+ "1. Add Pizza details & Store\n"
				+ "2. Display Pizza Details by Name\n"
				+ "3. Print Pizza Names by Size\n"
				+ "4. Exit");
		x = sc.nextInt();
		switch(x) {
		case 1: addPizzaDetailsAndStore();
				break;
		case 2: displayPizzaDetailsByName();
				break;
		case 3: printPizzaNamesBySize();
				break;
		}
		System.out.println("-----------------------");
		}while(x!=4);
		System.out.println("-----------------------");
		sc.close();
	}
}
