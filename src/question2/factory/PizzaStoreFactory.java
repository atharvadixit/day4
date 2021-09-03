package question2.factory;

import question2.dao.PizzaStore;
import question2.dao.PizzaStoreImpl;

public class PizzaStoreFactory {
	public static PizzaStore getPizzaStore() {
		return new PizzaStoreImpl();
	}
}
