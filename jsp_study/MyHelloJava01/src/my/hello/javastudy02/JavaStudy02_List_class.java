package my.hello.javastudy02;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaStudy02_List_class {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student();
		students[1] = new Student("오세룡", 25, 1);
		Student s = new Student("박지호", 29, 2);
		students[2] = s;
		
		ArrayList<Student> mystudents = new ArrayList<Student>();
		mystudents.add(new Student("이동준", 34, 5));
		mystudents.add(new Student());
		Student ss = new Student("도광현", 25, 4);
		mystudents.add(ss);
		
		// Student 클래스 배열과  List값 출력
		Scanner sc = new Scanner(System.in);
		//String name = sc.next();
		
		// 여행객 클래스 배열과 리스트 값 출력
		Traveler[] travelers = new Traveler[3];
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("국적 : ");
		String nation = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("주민번호 : ");
		String joomin = sc.next();
		
		travelers[0] = new Traveler(name, nation, age, joomin);
		System.out.println("이름 : " + travelers[0].getName() + " 국적 : " + travelers[0].getNation() + " 나이 : " + travelers[0].getAge() + " 주민번호 : " + travelers[0].getJoomin());
	}

}
