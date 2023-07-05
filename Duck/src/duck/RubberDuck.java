package duck;

import duckFly.FlyBehavior;
import duckQuack.QuackBehavior;

public class RubberDuck extends Duck {

	@Override
	public void display() {

		System.out.println("I am RubberDuck");

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
