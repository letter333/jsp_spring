package myspring.di.xml.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import myspring.di.xml.Hello;
import myspring.di.xml.Printer;

public class HelloBeanTest {

	public static void main(String[] args) {
		//IoC �����̳ʸ� ����
		//1.ApplicationContext ��ü ����
		ApplicationContext context = new GenericXmlApplicationContext("classpath:config/beans.xml");
		//2. getBean() ȣ��
		Hello hello = (Hello)context.getBean("hello");
		//3. Hello �� sayHello() ȣ��.
		System.out.println(hello.sayHello());
		//3. Hello�� printer() ȣ��
		hello.print();
		
		//StringPrinter  getBean()
		Printer printer = context.getBean("printer",Printer.class);
		System.out.println(printer.toString());
	}

}
