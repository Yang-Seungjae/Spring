package pizzaStore;

import pizza.Pizza;

public abstract class PizzaStore {

	protected Pizza pizza;

	public abstract void createPizza();

	public abstract void display();

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

}
