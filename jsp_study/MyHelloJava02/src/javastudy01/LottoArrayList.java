package javastudy01;

import java.util.*;

public class LottoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�ζ� �� �� ? ");
		int cnt = sc.nextInt();
		
		while (cnt < 1 || cnt > 5) {
			System.out.println("�߸��� ��, �ٽ� �Է� : ");
			cnt = sc.nextInt();
		}
		
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		for(int k = 0; k < cnt; k++) {
			while(lotto.size() < 6) {
				int random = (int)(Math.random() * 45 + 1);
				if(!lotto.contains(random)) {
					lotto.add(random);
				}
			}
			Collections.sort(lotto);
			System.out.print(lotto);
			lotto.clear();
			
			int bonus = (int)(Math.random() * 45 + 1);
			while(lotto.contains(bonus)) {
				bonus = (int)(Math.random() * 45 + 1);
			}
			System.out.println("���ʽ� : " + bonus);
		}
		
	}

}
