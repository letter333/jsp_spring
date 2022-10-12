package javastudy01;

public class Pikachu implements Animalable, Cloneable {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	private String name;
	
	
	
	public Pikachu(String name) {
		super();
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void charming() {
		// TODO Auto-generated method stub
		System.out.println("피카 피카");
	}

}
