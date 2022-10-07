package javastudy01;

public class HelloJava03_Heathorw {
	public static void main(String[] args) {
		Food f = new Food("민트초코케잌", 15000);
		Food f2 = new FishAndChips("고든램지표피칩", 50000);
		FishAndChips f3 = new FishAndChips("멸치앤칩스", 7500);
		
		f.eat();
		f2.eat();
		f3.eat();
	}
}
