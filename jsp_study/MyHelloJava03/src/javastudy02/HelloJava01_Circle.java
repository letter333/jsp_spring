package javastudy02;

public class HelloJava01_Circle {
	public static void main(String[] args) {
		Circle c1 = new Circle(2);
		Circle c2 = new Circle(3);
		
		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		
		c1.setPI(3.1415);
		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		                       
		
	}
}
