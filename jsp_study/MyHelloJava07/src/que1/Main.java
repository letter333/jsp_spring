package que1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 명 ? ");
		int cnt = Integer.parseInt(sc.nextLine());
		
		
		ArrayList<KBStudent> students = new ArrayList<KBStudent>();
		
		for(int i = 0; students.size() < cnt; i++) {
			System.out.println("이름?");
			String name = sc.nextLine();
			System.out.println("성별?");
			String gender = sc.nextLine();
			System.out.println("나이?");
			int age = Integer.parseInt(sc.nextLine());
			
			int number = 0;				
			try {
				System.out.println("번호?");
				number = Integer.parseInt(sc.nextLine());
				
				
				if(students.contains(new KBStudent(name, gender, age, number))) {
					throw new Exception("숫자 중복");
				} else {
					students.add(new KBStudent(name, gender, age, number));
				}
				
			} catch (NumberFormatException e) {
				System.out.println("숫자 아님");
				// TODO: handle exception
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
		System.out.println("정렬 전");
		
		for (KBStudent kbStudent : students) {
			System.out.println(kbStudent.toString());
		}
		
		Collections.sort(students, new KBStudentComparator());
		
		System.out.println("정렬 후");

		for (KBStudent kbStudent : students) {
			System.out.println(kbStudent.toString());
		}
	}
}
