package javastudy02;

public class HelloJava_gameCharacter {
	public static void main(String[] args) {
		GameCharacter gc1 = new GameCharacter();
		GameCharacter gc2 = new GameCharacter("letter333", "������");
		GameCharacter gc3 = new GameCharacter("id22222", "����");
		
		gc1.setId("id1111");
		gc1.setJob("����");

		gc1.attack();
		System.out.println("1�� ĳ���� �λ�");
		gc1.sayHello();
		gc2.attack();
		System.out.println("2�� ĳ���� �λ�");
		gc1.sayHello();
		gc3.attack();
		System.out.println("3�� ĳ���� �λ�");
		gc1.sayHello();
		
		System.out.println(GameCharacter.getCount());
	}
}
