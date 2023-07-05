package Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import duck.Duck;

public class MainProgram {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Main/setting.xml");

		Duck duck = context.getBean("duck", Duck.class);

		duck.display();
		System.out.printf("Quack : %s\n", duck.performQuack());
		System.out.printf("Fly : %s", duck.performFly());
	}

}
