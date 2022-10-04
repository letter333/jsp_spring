package javastudy01;

import java.util.*;

public class LottoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("로또 몇 번 ? ");
		int cnt = sc.nextInt();
		
		while (cnt < 1 || cnt > 5) {
			System.out.println("잘못된 값, 다시 입력 : ");
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
			System.out.println("보너스 : " + bonus);
		}
		
	}

}
