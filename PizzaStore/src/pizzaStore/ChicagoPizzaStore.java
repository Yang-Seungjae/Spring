package pizzaStore;

import pizza.ChicagoStyleCheesePizza;
import pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public void createPizza() {

		ChicagoStyleCheesePizza chcp = new ChicagoStyleCheesePizza();

		chcp.prepare();
		chcp.bake();
		chcp.cut();
		chcp.box();

	}

	@Override
	public void display() {

		System.out.println("시카고피자 전문점");
	}

	

}
