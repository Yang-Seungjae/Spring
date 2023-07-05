package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pizzaStore.PizzaStore;

public class MainProgram {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("main/setting.xml");

		PizzaStore pizzaStore = context.getBean("pizzaStore", PizzaStore.class);

		pizzaStore.display();
		pizzaStore.createPizza();

	}

}
