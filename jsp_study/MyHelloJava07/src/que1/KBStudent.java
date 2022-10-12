package que1;

public class KBStudent {
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
		return "KBStudent [name=" + name + ", gender=" + gender + ", age=" + age + ", Number=" + number + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		KBStudent k = (KBStudent)obj;
		return k.getNumber() == number;
	}
}
