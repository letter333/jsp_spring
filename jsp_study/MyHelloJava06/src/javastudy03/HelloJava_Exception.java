package javastudy03;

import java.util.Scanner;

public class HelloJava_Exception {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자 입력 : ");
		int num = s.nextInt();
		
		String name = s.nextLine();
		System.out.println("num = " + num + ", name = " + name);
		
		try {
			System.out.println("다시 숫자입력 : ");
			int age = Integer.parseInt(s.nextLine());
			System.out.println("문자열 입력 : ");
			String alias = s.nextLine();
			System.out.println("age = " + age + ", alias = " + alias);
			
			System.out.println("문자열을 숫자로 변환");
			age = Integer.parseInt("");	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("age값이 잘못됨.");
			e.printStackTrace();
		}
		
		System.out.println("끝");
	}
}
