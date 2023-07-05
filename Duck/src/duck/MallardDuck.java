package duck;

import duckFly.FlyBehavior;
import duckQuack.QuackBehavior;

public class MallardDuck extends Duck {

	private String quack;
	private String fly;

	@Override
	public void display() {
		System.out.println("I am MallardDuck");

	}

	@Override
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	@Override
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

}
