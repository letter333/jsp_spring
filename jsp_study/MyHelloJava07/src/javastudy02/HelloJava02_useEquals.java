package javastudy02;

public class HelloJava02_useEquals {
	public static void main(String[] args) {
		String a = "이동준";
		String b = "이동준";
		String c = new String("김보규");
		String d = new String("김보규");
		
		Student s1 = new Student("이동준", 340);
		Student s2 = new Student("이동준", 340);
		
		System.out.println(a == b);
		System.out.println(c == d);
		System.out.println(s1 == s2);
		
		System.out.println(a.equals(b));
		System.out.println(c.equals(d));
		System.out.println(s1.equals(s2));
		
		Worker w1 = new Worker("박지호", "001");
		Worker w2 = new Worker("박지호", "001");
		Worker w3 = new Worker("박지호", "002");
		
		System.out.println(w1.equals(w2));
		System.out.println(w2.equals(w3));
	}
}
