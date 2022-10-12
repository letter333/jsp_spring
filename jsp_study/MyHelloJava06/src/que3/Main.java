package que3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		String num2;
		try {
			System.out.println("숫자1 입력 : ");
			num1 = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			// TODO: handle exception
			num1 = 0;
		}
		
		try {
			System.out.println("숫자2 입력 : ");
			num2 = sc.nextLine();
		} catch (Exception e) {
			// TODO: handle exception
			num2 = "0";
		}
		
		System.out.println(num1 * (num2.charAt(2) - '0'));
		System.out.println(num1 * (num2.charAt(1) - '0'));
		System.out.println(num1 * (num2.charAt(0) - '0'));
		System.out.println(num1 * Integer.parseInt(num2));
	}
}
