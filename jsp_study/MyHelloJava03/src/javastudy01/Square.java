package javastudy01;

public class Square {
	private int wh;

	public Square() {
		
	}
	
	public Square(int wh) {
		setWh(wh);
	}
	
	public int getWh() {
		return wh;
	}

	public void setWh(int wh) {
		if(wh <= 0) {
			System.out.println("잘못된 값");
			this.wh = 0;
			return;
		}
		this.wh = wh;
	}
}
