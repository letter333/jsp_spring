package javastudy04;

public abstract class Lol {
	private String name;
	private String runeterra;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRuneterra() {
		return runeterra;
	}
	public void setRuneterra(String runeterra) {
		this.runeterra = runeterra;
	}
	
	public abstract void Q();
	public abstract void W();
	public abstract void E();
	public abstract void R();
	
}
