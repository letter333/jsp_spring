package que2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 3; i <= 8; i++) {
			if(i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println("-----------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력");
		String str = sc.nextLine();
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("-----------------------");
		
		System.out.println("몇 바이트?");
		int byteV = Integer.parseInt(sc.nextLine());
		System.out.println("bit : " + byteV * 8);
	}
}
