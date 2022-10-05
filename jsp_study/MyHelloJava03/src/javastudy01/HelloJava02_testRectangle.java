package javastudy01;

public class HelloJava02_testRectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(2);
		Rectangle r3 = new Rectangle(3, 2);
		System.out.println(r1.getArea());
		System.out.println(r2.getArea());
		System.out.println(r3.getArea());
		r1.setH(10);
		r1.setW(5);
		System.out.println(r1.getArea());
	}
}
