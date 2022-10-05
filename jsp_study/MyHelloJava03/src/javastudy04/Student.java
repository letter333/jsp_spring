package javastudy04;

public class Student {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void study() {
		System.out.println("학생이면 공부를 해라 이말이야~!");
	}
}
