package javastudy01;

public class Cat extends Animal {
	private String eyeColor;

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {	
		this.eyeColor = eyeColor;
	}
	
	public void meow() {
		System.out.println(eyeColor + "눈빛을 빛내며 야옹야옹");
	}
}
