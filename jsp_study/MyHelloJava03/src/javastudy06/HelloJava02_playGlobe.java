package javastudy06;

public class HelloJava02_playGlobe {
	public static void main(String[] args) {
		Globe g1 = new Globe(10);
		g1.rollTheGlobe("파란색");
		g1.setColor("녹색");
		System.out.println(g1.getColor());
		
	}
}
