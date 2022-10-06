package javastudy06;

import javastudy05_answer.Sphere;

public class Globe extends Sphere{
	public Globe(int r) {
		super(r);
	}
	
	public void rollTheGlobe(String color) {
		this.color = color;
		System.out.println("지구본 색깔 " + this.color);
		spin();
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
}
