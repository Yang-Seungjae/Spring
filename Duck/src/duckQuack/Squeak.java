package duckQuack;

public class Squeak implements QuackBehavior {

	@Override
	public String quack() {

		String message = "스퀵스퀵";

		return message;
	}

}
