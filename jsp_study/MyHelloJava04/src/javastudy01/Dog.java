package javastudy01;

public class Dog extends Animal {
	private String hairColor;

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	
	
	public void bark() {
		System.out.println(hairColor+"를 흩날리며 멍멍멍");
	}
}
