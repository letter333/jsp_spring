package javastudy01;

public class HelloJava01_With_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pikachu p = new Pikachu("레옹");
		Bulbasaur b = new Bulbasaur();
		Squirtle s = new Squirtle();
		
		Animalable d = new Animalable() {
			
			@Override
			public void charming() {
				// TODO Auto-generated method stub
				System.out.println("개처럼 짖는다.");
			}
		};
		
		Plantable myp = new Plantable() {
			
			@Override
			public void grow() {
				// TODO Auto-generated method stub
				System.out.println("LG 틔운기계에서 자라는 내 꽃");
			}
		};
		
		Pokemonable g = new Pokemonable() {
			
			@Override
			public void grow() {
				// TODO Auto-generated method stub
				System.out.println("바다속에서 자란다");
			}
			
			@Override
			public void charming() {
				// TODO Auto-generated method stub
				System.out.println("구워워어어웍");
			}
			
			@Override
			public void fight() {
				// TODO Auto-generated method stub
				System.out.println("거북손데스");
			}
		};
		
		try {
			Pikachu pipi = (Pikachu) p.clone();
			pipi.setName("노란뚱땡이");
			
			//pipi와 p가 같은 위치를 참조하기 때문에 p의 이름도 바뀜
			System.out.println(p.getName());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Plantable myFlower = () -> {
			System.out.println("자라나라 머리머리");
		};
		
		myFlower.grow();
	}

}
