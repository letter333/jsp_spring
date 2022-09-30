package my.hello.javastudy02;

public class Tourist {
	private String name;
	private int age;
	private int beonho;
	private String sNum;
	
	
	
	public Tourist() {
		super();
	}



	public Tourist(String name, int age, int beonho, String sNum) {
		super();
		this.name = name;
		this.age = age;
		this.beonho = beonho;
		this.sNum = sNum;
	}



	public Tourist(String name) {
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getBeonho() {
		return beonho;
	}



	public void setBeonho(int beonho) {
		this.beonho = beonho;
	}



	public String getsNum() {
		return sNum;
	}



	public void setsNum(String sNum) {
		this.sNum = sNum;
	}
	
	 
}
