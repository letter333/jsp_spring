package javastudy04;

public class Circle {
	private double r;
	private final double pi = 3.14;
	
	public double getR() {
		return r;
	}
	public void setR(double r) {
		if(r <= 0) {
			System.out.println("0보다 작거나 같은 값 입니다.");
			this.r = 0;
		} else {
			this.r = r;
		}
	}
	
	public double getRound() {
		return Math.round((2 * this.r * this.pi) * 100) / 100.0;
	}
	
	public double getArea() {
		return Math.round((pi * this.r * this.r) * 100) / 100.0;
	}
	
}
