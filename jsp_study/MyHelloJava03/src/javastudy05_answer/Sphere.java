package javastudy05_answer;

import javastudy02.Circle;

public class Sphere extends Circle {

	public Sphere(int r) {
		super(r);
	}
	
	public double getVolumn() {
		return (4/3.0) * getPI() * getR() * getR() * getR();
	}

	// 폴더가 달라지면 상속받은 클래스에서만 사용가능
	protected String color;
	protected void spin() {
		System.out.println("빙글빙글");
	}
}
