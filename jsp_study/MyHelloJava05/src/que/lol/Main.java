package que.lol;

public class Main {
	public static void main(String[] args) {
		Riven rv = new Riven();
		System.out.println("리븐");
		rv.Q();
		rv.W();
		rv.E();
		rv.R();
		
		Neeko nk = new Neeko();
		System.out.println("니코");
		nk.Q();
		nk.W();
		nk.E();
		nk.R();
		
		LeagueOfLegends lol = new LeagueOfLegends() {
			
			@Override
			public void W() {
				// TODO Auto-generated method stub
				
				
			}
			
			@Override
			public void R() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void Q() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void E() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
