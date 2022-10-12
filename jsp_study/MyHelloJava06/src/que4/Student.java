package que4;

public class Student {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if(age <= 0) {
			age = 0;
			throw new Exception("age가 0이하");
		} else {
			this.age = age;			
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
