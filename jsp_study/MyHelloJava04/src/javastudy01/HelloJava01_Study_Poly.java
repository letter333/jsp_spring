package javastudy01;

import java.util.ArrayList;

public class HelloJava01_Study_Poly {
	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		
		Animal a1 = new Dog();
		Animal c2 = new Cat();
		
		ArrayList<Animal> zoo = new ArrayList<Animal>();
		zoo.add(a);
		zoo.add(d);
		zoo.add(c);
		zoo.add(a1);
		zoo.add(c2);
		zoo.add(new Animal());
		zoo.add(new Dog());
		zoo.add(new Cat());
		
		ArrayList<Animal> animalHospital = new ArrayList<Animal>();
		animalHospital.add(new Animal());
		animalHospital.get(animalHospital.size()-1).setName("동물1");
		animalHospital.get(animalHospital.size()-1).setAge(2);
		
		Cat cat1 = new Cat();
		cat1.setName("말랑이");
		cat1.setAge(2);
		cat1.setEyeColor("갈색");
		animalHospital.add(cat1);
		
		Animal dog1 = new Dog();
		((Dog)dog1).setName("개개개개개");
		((Dog)dog1).setAge(3);
		((Dog)dog1).setHairColor("하얀색");
		animalHospital.add(dog1);
		
		for (Animal animal : animalHospital) {
			animal.sleep();
			if(animal instanceof Dog) {
				((Dog)animal).bark();
			} else if(animal instanceof Cat) {
				((Cat)animal).meow();
			}
		}
		
	}
}
