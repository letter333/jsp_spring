package javastudy01;

import java.util.*;

public class HelloJava02_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		List<Integer> nums = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println(i + 1 + "번째 숫자 입력 : ");
			nums.add(sc.nextInt());			
		}
		
		for(Integer integer : nums ) {
			System.out.println(integer);
		}
		
		System.out.println("몇 미만의 숫자를 지울까요 ? ");
		int cutline = sc.nextInt();
		for(int i = nums.size() - 1; i >= 0; i--) {
			if(cutline > nums.get(i)) {
				nums.remove(i);
			}
		}
		
		for(Integer integer : nums ) {
			System.out.println(integer);
		}
	}

}
 