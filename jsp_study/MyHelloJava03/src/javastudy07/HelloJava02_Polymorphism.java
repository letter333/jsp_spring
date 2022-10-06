package javastudy07;

import java.util.ArrayList;

import javastudy03.GameCharacter;

public class HelloJava02_Polymorphism {
	public static void main(String[] args) {

		//다형성
		//다양한 형태를 띌 가능성
		//공식
		//왼쪽부분은 조상 클래스 = 오른쪽 부분은 자손 클래스
		//오른쪽 부분 is 왼쪽 부분
		//Ex)
		GameCharacter g = new Novice();
		//g는 조상
		//오른쪽 자송
		
		//Novice is GameCharacter (O)
		//GameCharacter is Novice
		
		
		//다형성을 활용하면
		//조상클래스로 하나의 ArrayList를 만들고 나서
		ArrayList<GameCharacter> players = 
				new ArrayList<GameCharacter>();
		
		//아래와 같이 그 조상클래스를 상속받은 모든 클래스를
		//하나의 배열에 (혹은 리스트에) 집어넣을 수 있게 되었다.
//		players.add(new Novice());
//		players.add(new Magician());
//		players.add(new GameCharacter());
//		
//		
//		//players를 활용하기 위해 알아야 하는 내용들
//		GameCharacter gg = new Magician();
//		gg.set_class("대마법사");
//		gg.setId("djlee");
//		gg.setLevel(250);
//		//주목해야할 것
//		//gg는 Magician으로 instance를 만들었다.
//		//하지만 어쨌든 GameCharacter타입이다.
//		//그래서 gg를 magician으로써 활용하기 위해선
//		//타입 변환해야 함
//		((Magician)gg).setMp(0);
//		gg.attack();
//		gg.printInfo();
//		((Magician)gg).magicArrow();
//		
//		//무턱대로 형변환을 하면 안 된다.
//		//javastudy07.Magician cannot be cast to javastudy07.Novice
//		//gg는 GameCharacter타입이고
//		//Magician으로 인스턴스를 만들었지만
//		//Novice로 만든 건 아니다. 따라서 이렇게 함부로
//		//형변환 잘못하면 안 된다.
//		
//		//if(gg instanceof Novice)의 의미
//		//gg는 Novice로 인스턴스를 만들었는가?
//		if(gg instanceof Novice) //이 조건문 없으면 에러남
//		{
//			//그래서 조건문으로 체크를 꼭 해줘야 함
//			((Novice)gg).setHp(100);		
//			((Novice)gg).sleep();		
//		}
//		
		GameCharacter worrior = new Worrior();
		worrior.set_class("전사");
		worrior.setId("고양이전사");
		worrior.setLevel(333);
		((Worrior)worrior).setPower(555);
		players.add(worrior);
		
		GameCharacter magician = new Magician();
		magician.set_class("물속성마법사");
		magician.setId("불싫어");
		magician.setLevel(320);
		((Magician)magician).setMp(3450);
		players.add(magician);
		
		GameCharacter novice = new Novice();
		novice.set_class("백수");
		novice.setId("백수최고");
		novice.setLevel(22);
		((Novice)novice).setHp(200);

		GameCharacter worrior2 = new Worrior();
		worrior2.set_class("전사");
		worrior2.setId("물주먹전사");
		worrior2.setLevel(333);
		((Worrior)worrior2).setPower(555);
		players.add(worrior2);
		
		for (GameCharacter gameCharacter : players) {
			System.out.println("캐릭터 출력");
			gameCharacter.attack();
			gameCharacter.printInfo();
			if(gameCharacter instanceof Magician) {
				((Magician)gameCharacter).magicArrow();
			} else if(gameCharacter instanceof Novice) {
				((Novice)gameCharacter).sleep();
			} else if(gameCharacter instanceof Worrior) {
				((Worrior)gameCharacter).sleep();
				((Worrior)gameCharacter).punch();
			}
		}
	}
}










