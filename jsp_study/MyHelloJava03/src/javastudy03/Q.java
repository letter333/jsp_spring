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
			System.out.println(i + 1 + "��° ĳ���͹迭");
			GameCharacter temp = new GameCharacter();
			System.out.print("id : ");
			temp.setId(sc.next());
			System.out.print("���� : ");
			temp.set_class(sc.next());
			System.out.print("���� : ");
			int level = sc.nextInt();
			if(level < 0) {
				i--;
				System.out.println("���� �߸��Է�. �ٽ� �Է��ϱ�.");
				continue;
			}
			temp.setLevel(level);
			gameArr[i] = temp;
		}
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println(i + 1 + "��° ĳ���͸���Ʈ");
			GameCharacter temp = new GameCharacter();
			System.out.print("id : ");
			temp.setId(sc.next());
			System.out.print("���� : ");
			temp.set_class(sc.next());
			System.out.print("���� : ");
			int level = sc.nextInt();
			if(level < 0) {
				i--;
				System.out.println("���� �߸��Է�. �ٽ� �Է��ϱ�.");
				continue;
			}
			temp.setLevel(level);
			gameList.add(temp);
		}

		for(int i = 0; i < n; i++) {
			System.out.println(i + 1 + "��° ĳ���� �迭 ����");
			System.out.println("id : " + gameArr[i].getId());
			System.out.println("���� : " + gameArr[i].get_class());
			System.out.println("���� : " + gameArr[i].getLevel());
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(i + 1 + "��° ĳ���� ����Ʈ ����");
			System.out.println("id : " + gameList.get(i).getId());
			System.out.println("���� : " + gameList.get(i).get_class());
			System.out.println("���� : " + gameList.get(i).getLevel());			
		}
	}
}
