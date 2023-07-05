package duck;

import duckFly.FlyBehavior;
import duckQuack.QuackBehavior;

public class DecoyDuck extends Duck {

	@Override
	public void display() {

		System.out.println("I'm a decoy duck.");

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
