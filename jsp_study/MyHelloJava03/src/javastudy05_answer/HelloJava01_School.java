package javastudy05_answer;

import javastudy04.Student;

public class HelloJava01_School {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setAge(25);
		s1.setName("김성환");
		s1.study();
		
		KBStudent kb1 = new KBStudent();
		kb1.setName("김혜민");
		kb1.setAge(40);
		kb1.setEducation("대졸");
		kb1.setGender("여성");
		kb1.study();
		kb1.attend("임실");
		kb1.attend("퇴실");
	}
}
