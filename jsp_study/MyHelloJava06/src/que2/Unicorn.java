package que2;

public class Unicorn extends Animal implements Fliable, Runsable {

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("유니콘이 잠을 잔다.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("날개는 없지만 일단 날아다님.");
	}

	@Override
	public void flapWing() {
		// TODO Auto-generated method stub
		System.out.println("날개가 없다.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("날지 않을땐 뛰어다님");
	}

	@Override
	public void jog() {
		// TODO Auto-generated method stub
		System.out.println("조깅도 가능함");
	}

}
