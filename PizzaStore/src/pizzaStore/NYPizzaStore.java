package pizzaStore;

import pizza.NYStyleCheesePizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	public void createPizza() {

		NYStyleCheesePizza nycp = new NYStyleCheesePizza();

		nycp.prepare();
		nycp.bake();
		nycp.cut();
		nycp.box();

	}

	@Override
	public void display() {

		System.out.println("뉴욕피자전문점");
	}

}
