package javastudy06;

import javastudy05_answer.Person;

public class HelloJava01_defaultTest2 {
	public static void main(String[] args) {
		// default는 패키지가 다르면 private로 봄
		// public이 붙은 건 import만 하면 사용 가능
		Person p = new Person();
//		p.name="김보규";
		p.alias="귀염둥이";
	}
}
 