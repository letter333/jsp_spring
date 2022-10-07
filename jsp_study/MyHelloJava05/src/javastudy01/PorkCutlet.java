package javastudy01;

public class PorkCutlet extends Food {

	public PorkCutlet(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "은 최고의 돈까쓰");
		System.out.println(getPrice() + "원의 가격이 아깝지 않네");
	}
	
	public void eat(int count) {
		System.out.println(count + "번 돈까스 먹음");
	}
	
	public void eat(String source) {
		System.out.println(source + "에 찍어먹음");
	}
}
