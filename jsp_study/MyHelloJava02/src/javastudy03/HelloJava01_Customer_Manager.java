package javastudy03;

import javastudy04.Circle;

public class HelloJava01_Customer_Manager {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.name = "±Ë«˝πŒ";
		c1.age = 30;
		c1.cNum = "00001";
		
		Customer c2;
//		c2.name = "¿Ãµø¡ÿ";
//		c2.age = 34;
//		c2.cNum = "00000";
		
		KBCustomer kb1 = new KBCustomer();
//		kb1.
		
		kb1.setAge(34);
		kb1.setName("¿Ãµø¡ÿ");
		kb1.setcNum("00000");
		System.out.println(kb1.getAge());
		System.out.println(kb1.getName());
		System.out.println(kb1.getcNum());

	}
}
