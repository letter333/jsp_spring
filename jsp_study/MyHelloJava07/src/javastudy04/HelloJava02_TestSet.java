package javastudy04;

import java.util.*;

public class HelloJava02_TestSet {
	public static void main(String[] args) {
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(new Employee("안서준", "001"));
		employees.add(new Employee("안서준", "001"));
		employees.add(new Employee("이현민", "002"));
		
		for(Employee employee : employees) {
			System.out.println(employee.getName());
			System.out.println(employee.getSabeon());
		}
		
	}
}
