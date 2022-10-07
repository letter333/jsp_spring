package javastudy02;

import java.util.ArrayList;

public class HelloJava01__Sikdang {
	public static void main(String[] args) {
		//Food f  new Food(); // 추상클래스로는 인스턴스 못만든다.
		Food f = new Taco();
		Food r = new Ramen();
		Bibimbab b = new Bibimbab();
		
		f.eat();
		r.eat();
		b.eat();
		
		ArrayList<Food> foods = new ArrayList<Food>();
		foods.add(f);
		foods.add(r);
		foods.add(b);
		for (Food food : foods) {
			food.eat();
		}
		
	}
}
