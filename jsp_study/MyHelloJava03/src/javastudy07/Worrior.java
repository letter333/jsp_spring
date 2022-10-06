package javastudy07;

import javastudy06.Novice;

public class Worrior extends Novice {
	private int power;


	public Worrior() {
		super();
	}

	public Worrior(int power) {
		super();
		this.power = power;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
	public void punch() {
		System.out.println(power + " 데미지 냥냥펀치");
	}
}
