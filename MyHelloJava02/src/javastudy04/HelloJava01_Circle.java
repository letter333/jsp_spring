package javastudy04;

public class HelloJava01_Circle {

	public static void main(String[] args) {
		MyCircle c1 = new MyCircle();
		c1.setR(3);
		System.out.println(c1.getArea());
		System.out.println(c1.getRound());

		MyCircle c2 = new MyCircle();
		c2.setR(-3);
		System.out.println(c2.getArea());
		System.out.println(c2.getRound());
		if(c2.getArea() != 0) {
			System.out.println(c2.getArea());
		} else {
			System.out.println("c2 반지름 확인");
		}
		
		MyCircle m1 = new MyCircle(4);
		if(m1.getArea() != 0) {
			System.out.println(m1.getArea());
		}
		System.out.println(new MyCircle(5).getArea());
	}

}
