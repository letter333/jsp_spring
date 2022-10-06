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
		System.out.println(this.name+"학생이 ");
		System.out.println(this.age+"살 답게");
		System.out.println("공부합니다.");
		System.out.println("학생이면 공부를 해라 이말이야~!");
	}
}
