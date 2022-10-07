package javastudy01;

public class HelloJava02_GimChun {
	public static void main(String[] args) {
		Food f1 = new Food("쫄면", 5000);
		Food f2 = new PorkCutlet("생선까스", 8000);
		PorkCutlet f3 = new PorkCutlet("돈까쓰", 9000);

		f1.eat();
		f2.eat();
		f3.eat();
		
		if(f2 instanceof PorkCutlet) {
			((PorkCutlet) f2).eat(5);
		}
		
		if(f2 instanceof PorkCutlet) {
			((PorkCutlet) f2).eat("초고추장");
		}
		
		f3.eat(10);
		f3.eat("초콜릿");
	}
	
	
}
