package my.hello.javastudy02;

import java.util.ArrayList;

public class JavaStudy01_List {
	public static void main(String[] args) {
		// 배열
		// 선언과 동시에 크기가 정해짐
		int[] numbers = new int[5];
		
		//ArrayList(= List라고도 부름)
		// 배열과는 다르게 선언 당시엔 크기가 0
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		// 값을 할당해 보는 것(배열)
		numbers[0] = 10;
		numbers[1] = 30;
		// 값을 읽어들이는 것(배열)
		System.out.println("첫 번째 값 : " + numbers[0]);
		
		// 값을 추가하는 것
		nums.add(10);
		// 배열 임의의 위치에 값을 추가하진 못 함
		nums.add(30);
		// 특정 번째의 값을 수정
		nums.set(0,  20); // 첫 번째 값을 20으로 수정
		System.out.println(nums.get(0)); // 첫 번째 값을 읽음
		
		//foreach 자동완성 하면 생기는 코드
		// 배열의 길이만큼 반복문을 수행하고
		// 콜론( : ) 앞에 있는 건 배열 안에 있는 구성요소들.
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		
		// ArrayList = 값을 삭제할 수 있다.
		// 배열은 값 삭제가 안된다.4
		
		//삭제
		nums.remove(0); // 첫 번째 값 삭제
		nums.add(100);
		nums.add(30);
		nums.add(30);
		nums.remove((Integer)30); // 값이 30인거 한 개 삭제
		System.out.println("-----------------");
		for (Integer integer : nums) {
			System.out.println(integer);
		}
	}
}
