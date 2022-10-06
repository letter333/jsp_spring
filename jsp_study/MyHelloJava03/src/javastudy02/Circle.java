package javastudy02;

public class Circle {
	private int r;
	private static double PI;

	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public static double getPI() {
		return PI;
	}
	public static void setPI(double pI) {
		PI = pI;
	}
	public Circle(int r) {
		super();
		this.r = r;
		PI = 3.14;
	}
	
	
	public double getArea() {
		return r * r * PI;
	}
	
	
}
