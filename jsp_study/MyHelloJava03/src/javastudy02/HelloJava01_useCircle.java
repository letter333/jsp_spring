package javastudy02;

public class HelloJava01_useCircle {
	public static void sayHello() {
		System.out.println("Hello");
	}
	
	public void toSay(String name) {
		System.out.println(name + "��, �ȳ�");
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle(2);
		Circle c2 = new Circle(3);
		
		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		
		Circle.setPI(3.0); // ��� Circle�� ������ ��ħ.
		
		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		sayHello();
//		sayHello("����ȣ");
		
		// ��üȭ : �ڱ� �ڽ��� �̿��� �ν��Ͻ� ����
		new HelloJava01_useCircle().toSay("�̵���");
		HelloJava01_useCircle temp = new HelloJava01_useCircle();
		temp.toSay("������");
	}
}
