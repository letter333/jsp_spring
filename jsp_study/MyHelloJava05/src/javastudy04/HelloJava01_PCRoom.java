package javastudy04;

public class HelloJava01_PCRoom {
	public static void main(String[] args) {
		Drmundo d = new Drmundo();
		d.Q();
		d.W();
		d.E();
		d.R();
		
		Cogmo c = new Cogmo();
		c.Q();
		c.W();
		c.E();
		c.R();
		
		Lol chogas = new Lol() {

			@Override
			public void W() {
				// TODO Auto-generated method stub
				System.out.println("흉포한 울부짖음");
			}
			
			@Override
			public void R() {
				// TODO Auto-generated method stub
				System.out.println("포식");
			}
			
			@Override
			public void Q() {
				// TODO Auto-generated method stub
				System.out.println("파열");
			}
			
			@Override
			public void E() {
				// TODO Auto-generated method stub
				System.out.println("날카로운 가시");
			}
		};
		chogas.Q();
		chogas.W();
		chogas.E();
		chogas.R();
	}
}
