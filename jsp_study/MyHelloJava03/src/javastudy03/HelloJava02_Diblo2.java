package javastudy03;

import java.util.ArrayList;
import java.util.Scanner;

public class HelloJava02_Diblo2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�� ĳ���� �� ��?");
		int count = s.nextInt();
		
		GameCharacter[] players = new GameCharacter[count];
		
		for(int i = 0; i < players.length; i++) {
			System.out.println(i + 1 + "��° ĳ���� ������ ? ");
			int lv = s.nextInt();
			if(lv < 0) {
				 i--;
				 continue;
			}
			System.out.println("�� ĳ���� ������?");
			s.nextLine();
			String _class = s.nextLine();
			System.out.println("�� ĳ���� ID��?");
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
			System.out.println("ĳ���� ���� ? ");
			int level = s.nextInt();
			if(level < 0) {
				continue;
			}
			System.out.println("ĳ���� ���� ? ");
			s.nextLine();
			String _class = s.nextLine();
			System.out.println("ĳ���� ID ? ");
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
