package javastudy03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HelloJava01_KBManager {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("몇 명?");
		int cnt = 0;
		try {
			cnt = Integer.parseInt(s.nextLine());
			if(cnt <= 0) {
				throw new Exception("길이가 0 이하일 수 없다.");
			}
		} catch (Exception e) {
			System.out.println("숫자 입력 잘못됨 " + e.getMessage());
			return;
			// TODO: handle exception
		} finally {
			if(cnt <= 0) {
				System.out.println("프로그램을 재시작해주세요.");	
			}
		}
		
		ArrayList<KBStudent> students = new ArrayList<KBStudent>(); 
		
		for(int i = 0; i < cnt; i++) {
			String name = "";
			String gender = "";
			int age = 0;
			int number = 0;
			
			System.out.println("이름?");
			name = s.nextLine();
			System.out.println("성별?");
			gender = s.nextLine();
			try {
				System.out.println("나이?");
				age = Integer.parseInt(s.nextLine());
				System.out.println("번호?");
				number = Integer.parseInt(s.nextLine());
				if(age <= 0) {
					System.out.println("나이 값이 잘못됨.");
					age = 0;
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			KBStudent k = new KBStudent(name, gender, age, number);
			if(students.contains(k)) {
				System.out.println("중복");
				i--;
				continue;
			} else {
				students.add(k);
			}
		}
		
		for (KBStudent kbStudent : students) {
			System.out.println(kbStudent);
		}
		
		
		Collections.sort(students);
		System.out.println("------나이 오름차순 출력-------");
		for (KBStudent kbStudent : students) {
			System.out.println(kbStudent);
		}
	}
	
}
