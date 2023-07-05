package duckQuack;

public class MuteQuack implements QuackBehavior {

	@Override
	public String quack() {

		String message = "이 오리는 소리를 안냄";

		return message;

	}

}
