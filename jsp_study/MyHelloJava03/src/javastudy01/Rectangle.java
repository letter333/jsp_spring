package javastudy01;

public class Rectangle {
	private int w;
	private int h;
	
	public Rectangle() {
		
	}
	
	//  w나 h 하나만 알아서 하나만 입력받는 경우를 정사각형으로 간주.
	public Rectangle(int wh) {
//		this.w = wh;
//		this.h = wh;
		setW(wh);
		setH(wh);
	}
	
	public Rectangle(int w, int h) {
//		this.w = w;
//		this.h = h;
		setW(w);
		setH(h);
	}
	
	public int getW() {
		return this.w;
	}
	public void setW(int w) {
		if(w <= 0) {
			this.w = 0;
			System.out.println("오류");
			return;
		}
		this.w = w;
	}
	public int getH() {
		return this.h;
	}
	public void setH(int h) {
		if(h <= 0) {
			this.h = 0;
			System.out.println("오류");
			return;
		}
		this.h = h;
	}
	
	public int getArea() {
		if(w <= 0 || h <= 0) {
			System.out.println("Error");
			return -1;
		}
		if(w == h) {
			System.out.println("정사각형");
		}
		return w * h;
	}
}
