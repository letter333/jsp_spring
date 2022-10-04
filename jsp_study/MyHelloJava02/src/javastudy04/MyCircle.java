package javastudy04;

public class MyCircle {
	private int r;
	private final double pi = 3.14;
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		if(r <= 0) {
			this.r = 0;
		}else {
			this.r = r;	
		}
	}
	
	public double getArea() {
		if(r <= 0) {
			System.out.println("반지름 값 확인바람.");
			return 0;
		}
		return r * r * pi;
	}
	
	public double getRound() {
		if(r <= 0) {
			System.out.println("반지름 값 확인바람.");
			return 0;
		}
		return 2 * r * pi;		
	}
	
	public MyCircle() {}
	
	public MyCircle(int r) {
		setR(r);
	}
}
