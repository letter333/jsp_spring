package javastudy03;

import java.util.ArrayList;
import java.util.Scanner;

public class HelloJava02_Diblo2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("총 캐릭터 몇 개?");
		int count = s.nextInt();
		
		GameCharacter[] players = new GameCharacter[count];
		
		for(int i = 0; i < players.length; i++) {
			System.out.println(i + 1 + "번째 캐릭터 레벨은 ? ");
			int lv = s.nextInt();
			if(lv < 0) {
				 i--;
				 continue;
			}
			System.out.println("그 캐릭터 직업은?");
			s.nextLine();
			String _class = s.nextLine();
			System.out.println("그 캐릭터 ID는?");
			String id = s.nextLine();
			players[i] = new GameCharacter(id, _class);
			players[i].setLevel(lv);
		}
		
		for (GameCharacter gameCharacter : players) {
			gameCharacter.printInfo();
		}
		
		ArrayList<GameCharacter> gamers = new ArrayList<GameCharacter>();
		
//		for(int i = 0; gamers.size() < count; i++) {
		while(gamers.size() != count) {
			System.out.println("캐릭터 레벨 ? ");
			int level = s.nextInt();
			if(level < 0) {
				continue;
			}
			System.out.println("캐릭터 직업 ? ");
			s.nextLine();
			String _class = s.nextLine();
			System.out.println("캐릭터 ID ? ");
			String id = s.nextLine();
			GameCharacter g = new GameCharacter(id, _class);
			g.setLevel(level);
			gamers.add(g);
		}
		
		for (GameCharacter gameCharacter : gamers) {
			gameCharacter.printInfo();
		}
	}
}
