package javastudy02;

public class Unicorn extends Cryptid implements Fliable, Runsable {
	private String color;
	
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void cry() {
		System.out.println(color + "빛 털을 휘날리며");
		System.out.println("영롱한 목소리로 운다.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("멋지게 달립니다.");
	}

	@Override
	public void jog() {
		// TODO Auto-generated method stub
		System.out.println("촣ㅇ총");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("우아하게 날아요");
	}

	@Override
	public void flapWing() {
		// TODO Auto-generated method stub
		System.out.println("우아하게 퍼덕거려요");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("영물은 잠을 안자요");
	}

}
