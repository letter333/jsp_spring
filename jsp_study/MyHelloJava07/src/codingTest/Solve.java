package codingTest;

import java.util.Scanner;

public class Solve {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 3; i <= 8; i++) {
			if(i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println("-----------------------");
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("문자열 입력");
		String sentense = s.nextLine();
		
		for(int i = sentense.length() - 1; i >= 0; i--) {
			System.out.print(sentense.charAt(i));
		}
		System.out.println("-----------------------");
		   
		System.out.println("\n몇 바이트?");
		try {
			int num = s.nextInt();
			System.out.println(num + "바이트 = " + num * 8 +"bit");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("값 잘못 입력함.");
		}
	}
}
