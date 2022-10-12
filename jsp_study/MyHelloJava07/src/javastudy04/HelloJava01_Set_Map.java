package javastudy04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

import javastudy03.KBStudent;

public class HelloJava01_Set_Map {
	public static void main(String[] args) {
		List<Integer> ex1 = new ArrayList<Integer>();
		List<Integer> ex2 = new LinkedList<Integer>();
		List<Integer> ex3 = new Stack<Integer>();
		List<Integer> ex4 = new Vector<Integer>();
		
		Map<Integer, String> students = new HashMap<Integer, String>();
		students.put(1, "안서준");
		students.put(2, "이동준");
		students.put(1, "박지호");
		
		for(int key : students.keySet()) {
			System.out.println(key);
			System.out.println(students.get(key));
		}
		
		Set<String> workers = new HashSet<String>();
		workers.add("김진규");
		workers.add("김보규");
		workers.add("김진규");
		workers.add("이동준");
		workers.add("이동준");
		System.out.println("---set Test---");
		for(String string : workers) {
			System.out.println(string);
		}
		
		javastudy03.KBStudent k1 = new KBStudent("이현민", "남성", 30, 3);
		javastudy03.KBStudent k2 = new KBStudent("이현민", "남성", 30, 3);
		
		Set<KBStudent> kbstudents = new HashSet<KBStudent>();
		kbstudents.add(k1);
		kbstudents.add(k2);
		
		for (KBStudent kbStudent : kbstudents) {
			System.out.println(kbStudent);
		}
	}
}
