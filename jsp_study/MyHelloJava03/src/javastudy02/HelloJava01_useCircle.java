package javastudy02;

public class HelloJava01_useCircle {
	public static void sayHello() {
		System.out.println("Hello");
	}
	
	public void toSay(String name) {
		System.out.println(name + "님, 안녕");
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle(2);
		Circle c2 = new Circle(3);
		
		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		
		Circle.setPI(3.0); // 모든 Circle에 영향을 끼침.
		
		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		sayHello();
//		sayHello("박지호");
		
		// 객체화 : 자기 자신을 이용해 인스턴스 생성
		new HelloJava01_useCircle().toSay("이동준");
		HelloJava01_useCircle temp = new HelloJava01_useCircle();
		temp.toSay("오세룡");
	}
}
