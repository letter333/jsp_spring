package javastudy01;

import java.util.Scanner;

public class HelloJava01_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[5];
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(i + 1 + "번째 값 입력 : ");
			numbers[i] = s.nextInt();
		}
		
		int max = numbers[0];
		int min = numbers[0];
		
		for (int i : numbers) {
			if(i > max) {
				max = i;
			}
			
			if(i < min) {
				min = i;
			}
		}
		
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
			
			if(numbers[i] < min) {
				min = numbers[i];
			}
		}
		
		System.out.println("최대값 : " +  max);
		System.out.println(String.format("최솟값 : %d\n",  min));
	}

}
