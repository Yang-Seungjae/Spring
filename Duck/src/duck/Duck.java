package duck;

import duckFly.FlyBehavior;
import duckQuack.QuackBehavior;

public abstract class Duck {

	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;

	public String performQuack() {

		return flyBehavior.fly();

	};

	public String performFly() {

		return quackBehavior.quack();

	};

	public abstract void display();

	public abstract void setFlyBehavior(FlyBehavior flyBehavior);

	public abstract void setQuackBehavior(QuackBehavior quackBehavior);

}
