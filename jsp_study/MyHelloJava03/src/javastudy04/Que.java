package javastudy04;

public class Que {
	public static void main(String[] args) {
		KBStudent kb = new KBStudent();
		kb.setName("오세룡");
		kb.setAge(25);
		kb.setGender("남");
		kb.setEducation("학력");
		kb.study();
		kb.attend();
		
		Sphere s = new Sphere(3);
		System.out.println(s.getVolume());
		
		Cuboid cu = new Cuboid();
		cu.setZ(8);
		cu.setW(3);
		cu.setH(5);
		System.out.println(cu.getCuboidVolumn());
	}
}
