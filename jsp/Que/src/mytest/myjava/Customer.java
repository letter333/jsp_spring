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
		return "[�̸� = " + name + ", ���� = " + age + ", id = " + id + "]";
	}
	
	public boolean isAdult(int limit) {
		if(limit > age) {
			return false;
		} else {
			return true;
		}
	}
}
