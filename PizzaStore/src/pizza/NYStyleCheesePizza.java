package pizza;

public class NYStyleCheesePizza extends Pizza {

	@Override
	public void prepare() {

		System.out.println("얇은 도우 위에 다양한 토핑을 올린다");

	}

	@Override
	public void bake() {

		System.out.println("타지 않게 30분만 굽는다");

	}

	@Override
	public void cut() {

		System.out.println("먹기좋게 8등분으로 컷팅한다");

	}

	@Override
	public void box() {

		System.out.println("얇은 박스로 포장한다");

	}

}
