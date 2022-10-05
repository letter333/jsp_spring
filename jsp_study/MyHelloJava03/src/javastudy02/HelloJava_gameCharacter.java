package javastudy02;

public class HelloJava_gameCharacter {
	public static void main(String[] args) {
		GameCharacter gc1 = new GameCharacter();
		GameCharacter gc2 = new GameCharacter("letter333", "마법사");
		GameCharacter gc3 = new GameCharacter("id22222", "도적");
		
		gc1.setId("id1111");
		gc1.setJob("전사");

		gc1.attack();
		System.out.println("1번 캐릭터 인사");
		gc1.sayHello();
		gc2.attack();
		System.out.println("2번 캐릭터 인사");
		gc1.sayHello();
		gc3.attack();
		System.out.println("3번 캐릭터 인사");
		gc1.sayHello();
		
		System.out.println(GameCharacter.getCount());
	}
}
