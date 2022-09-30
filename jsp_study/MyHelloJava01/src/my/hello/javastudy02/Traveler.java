package my.hello.javastudy02;

public class Traveler {
	private String name;
	private String nation;
	private int age;
	private String joomin;
	
	public Traveler() {
		
	}
	
	public Traveler(String name) {
		this.name = name;
	}
	
	public Traveler(String name, String nation, int age, String joomin) {
		this.name = name;
		this.nation = nation;
		this.age = age;
		this.joomin = joomin;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getNation() {
		return this.nation;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getJoomin() {
		return this.joomin;
	}
}
