package pizza;

public class ChicagoStyleCheesePizza extends Pizza {

	@Override
	public void prepare() {

		System.out.println("높이가 있는 도우에 치즈를 듬뿍넣는다");

	}

	@Override
	public void bake() {

		System.out.println("치즈가 전부 녹을 수 있게 1시간 30분 굽는다");
	}

	@Override
	public void cut() {

		System.out.println("치즈가 흐르지 않게 컷팅하지 않는다");

	}

	@Override
	public void box() {

		System.out.println("높이가 있는 박스로 포장한다");

	}

}
