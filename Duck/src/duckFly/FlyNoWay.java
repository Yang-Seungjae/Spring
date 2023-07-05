package duckFly;

public class FlyNoWay implements FlyBehavior {

	@Override
	public String fly() {

		String message = "이 오리는 날수 없음";
		return message;

	}

}
