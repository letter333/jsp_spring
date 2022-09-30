package my.hello.javastudy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HelloJava01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();

		while(cnt > 5 || cnt < 1) {
			System.out.println("숫자를 다시 입력해 주세요. (1~5)");
			cnt = sc.nextInt();
		}
		
		int numArr[][] = new int[cnt][6];
		
		for(int i = 0; i < numArr.length; i++) {
			for(int j = 0; j < numArr[0].length; j++) {
				int random = (int)(Math.random() * 45 + 1);
				numArr[i][j] = random;	
				for(int k = 0; k < j; k++) {
					if(numArr[i][j] == numArr[i][k]) {
						j--;
						break;
					}
				}
			}
		}
		
		for(int i = 0; i < numArr.length; i++) {
			Arrays.sort(numArr[i]);
		}
		
		
		for(int i = 0; i < numArr.length; i++) {
			int bonus = (int)(Math.random() * 45 + 1);
			for(int j = 0; j < numArr[0].length; j++) {
				/*
				 * if(numArr[i][j] == bonus) { bonus = (int)(Math.random() * 45 + 1); j = -1; }
				 */
				System.out.print(numArr[i][j] + " ");
			}
//			System.out.println(" 보너스 번호 : " + bonus);
			System.out.println();
		}
		
	}

}
