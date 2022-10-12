package javastudy03;

public class KBStudent implements Comparable<KBStudent>{
	private String name;
	private String gender;
	private int age;
	private int number;
	
	public KBStudent(String name, String gender, int age, int number) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {	
		this.number = number;
	}
	
	@Override
	public String toString() {
		return String.format("이름 : %s, 성별:%s, 나이:%d, 번호:%d", name, gender, age, number);
	}
	
	@Override
	public boolean equals(Object obj) {
		return ((KBStudent)obj).getNumber() == number;
	}

	@Override
	public int compareTo(KBStudent o) {
		// TODO Auto-generated method stub
		return age - o.getAge();
	}
}
