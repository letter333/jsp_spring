package javastudy03;

import java.util.Scanner;

public class HelloJava02_InputNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째?");
		String num1 = s.nextLine();
		System.out.println("두번째?");
		String num2 = s.nextLine();
		
		int n1 = 0;
		int n2 = 0;
		
		try {
			n1 = Integer.parseInt(num1);
			n2 = Integer.parseInt(num2);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("잘못된 값 들어감.");
			n1 = 0;
		}
		
		if(n1 != 0) {
			System.out.println(n1 * (n2 % 10));
			System.out.println(n1 * ((n2 / 10) % 10));
			System.out.println(n1 * (n2 / 100));
			System.out.println(n1 * n2);
		}
	}
}
