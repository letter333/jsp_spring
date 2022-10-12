package que4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		Student s1 = new Student();
		System.out.println("나이 ? ");
		try {
			s1.setAge(Integer.parseInt(sc.nextLine()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("이름 ? ");
		s1.setName(sc.nextLine());
		Student s2 = new Student();
		System.out.println("나이 ? ");
		try {
			s2.setAge(Integer.parseInt(sc.nextLine()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("이름 ? ");
		s2.setName(sc.nextLine());
		Student s3 = new Student();
		System.out.println("나이 ? ");
		try {
			s3.setAge(Integer.parseInt(sc.nextLine()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("이름 ? ");
		s3.setName(sc.nextLine());
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		for (Student student : students) {
			System.out.print("나이 : " + student.getAge());
			System.out.println();
			System.out.print("이름 : " + student.getName());
			System.out.println();
		}
		
	}
}
