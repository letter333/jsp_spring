package javastudy03;

import java.util.ArrayList;
import java.util.Scanner;

public class Q {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		GameCharacter[] gameArr = new GameCharacter[n];
		ArrayList<GameCharacter> gameList = new ArrayList<GameCharacter>();
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println(i + 1 + "번째 캐릭터배열");
			GameCharacter temp = new GameCharacter();
			System.out.print("id : ");
			temp.setId(sc.next());
			System.out.print("직업 : ");
			temp.set_class(sc.next());
			System.out.print("레벨 : ");
			int level = sc.nextInt();
			if(level < 0) {
				i--;
				System.out.println("레벨 잘못입력. 다시 입력하기.");
				continue;
			}
			temp.setLevel(level);
			gameArr[i] = temp;
		}
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println(i + 1 + "번째 캐릭터리스트");
			GameCharacter temp = new GameCharacter();
			System.out.print("id : ");
			temp.setId(sc.next());
			System.out.print("직업 : ");
			temp.set_class(sc.next());
			System.out.print("레벨 : ");
			int level = sc.nextInt();
			if(level < 0) {
				i--;
				System.out.println("레벨 잘못입력. 다시 입력하기.");
				continue;
			}
			temp.setLevel(level);
			gameList.add(temp);
		}

		for(int i = 0; i < n; i++) {
			System.out.println(i + 1 + "번째 캐릭터 배열 정보");
			System.out.println("id : " + gameArr[i].getId());
			System.out.println("직업 : " + gameArr[i].get_class());
			System.out.println("레벨 : " + gameArr[i].getLevel());
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(i + 1 + "번째 캐릭터 리스트 정보");
			System.out.println("id : " + gameList.get(i).getId());
			System.out.println("직업 : " + gameList.get(i).get_class());
			System.out.println("레벨 : " + gameList.get(i).getLevel());			
		}
	}
}
