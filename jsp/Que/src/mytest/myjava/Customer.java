package mytest.myjava;

public class Customer {
	private String name;
	private int age;
	private String id;
	
	public Customer(String name, int age, String id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	@Override
	public String toString() {
		return "[이름 = " + name + ", 나이 = " + age + ", id = " + id + "]";
	}
	
	public boolean isAdult(int limit) {
		if(limit > age) {
			return false;
		} else {
			return true;
		}
	}
}
