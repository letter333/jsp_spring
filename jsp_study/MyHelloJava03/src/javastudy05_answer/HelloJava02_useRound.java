package javastudy05_answer;

import javastudy02.Circle;

public class HelloJava02_useRound {
	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		System.out.println(c1.getArea());
		
		Sphere sp1 = new Sphere(2);
		System.out.println(sp1.getArea());
		System.out.println(sp1.getVolumn());
		
		Circle.setPI(1);
		System.out.println(sp1.getVolumn());
		
		Sphere.setPI(0);
		System.out.println(c1.getArea());
	}
}
