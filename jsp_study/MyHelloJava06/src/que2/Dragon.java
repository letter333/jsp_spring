package que2;

public class Dragon extends Animal implements Fliable{
	
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("내 날개 겁나 큼");
	}

	@Override
	public void flapWing() {
		// TODO Auto-generated method stub
		System.out.println("그래서 날개짓하면 다 날아감");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("코고는 소리도 엄청 큼");
	}

}
