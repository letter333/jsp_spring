package javastudy02;

public class Worker {
	private String name;
	private String cNum;
	
	public Worker(String name, String cNum) {
		super();
		this.name = name;
		this.cNum = cNum;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getcNum() {
		return cNum;
	}



	public void setcNum(String cNum) {
		this.cNum = cNum;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름 : " + name + ", 사번 : " + cNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Worker w = (Worker)obj;
		return w.getcNum().equals(cNum) && w.getName().equals(name);
	}
}
