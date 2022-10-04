package my.hello.javastudy03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaStudy01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.println("추가할 숫자 입력 : ");
		for(int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
		}
		
		System.out.println("삭제 전 : " + list);
		
		list.removeIf(item -> item < n);

		System.out.println("삭제 후 : " + list);			
	}

}