package my.hello.javastudy02;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaStudy02_List_class {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student();
		students[1] = new Student("������", 25, 1);
		Student s = new Student("����ȣ", 29, 2);
		students[2] = s;
		
		ArrayList<Student> mystudents = new ArrayList<Student>();
		mystudents.add(new Student("�̵���", 34, 5));
		mystudents.add(new Student());
		Student ss = new Student("������", 25, 4);
		mystudents.add(ss);
		
		// Student Ŭ���� �迭��  List�� ���
		Scanner sc = new Scanner(System.in);
		//String name = sc.next();
		
		// ���ఴ Ŭ���� �迭�� ����Ʈ �� ���
		Traveler[] travelers = new Traveler[3];
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("���� : ");
		String nation = sc.next();
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print("�ֹι�ȣ : ");
		String joomin = sc.next();
		
		travelers[0] = new Traveler(name, nation, age, joomin);
		System.out.println("�̸� : " + travelers[0].getName() + " ���� : " + travelers[0].getNation() + " ���� : " + travelers[0].getAge() + " �ֹι�ȣ : " + travelers[0].getJoomin());
	}

}
