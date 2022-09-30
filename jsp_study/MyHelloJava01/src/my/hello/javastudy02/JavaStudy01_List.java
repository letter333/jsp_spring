package my.hello.javastudy02;

import java.util.ArrayList;

public class JavaStudy01_List {
	public static void main(String[] args) {
		// �迭
		// ����� ���ÿ� ũ�Ⱑ ������
		int[] numbers = new int[5];
		
		//ArrayList(= List��� �θ�)
		// �迭���� �ٸ��� ���� ��ÿ� ũ�Ⱑ 0
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		// ���� �Ҵ��� ���� ��(�迭)
		numbers[0] = 10;
		numbers[1] = 30;
		// ���� �о���̴� ��(�迭)
		System.out.println("ù ��° �� : " + numbers[0]);
		
		// ���� �߰��ϴ� ��
		nums.add(10);
		// �迭 ������ ��ġ�� ���� �߰����� �� ��
		nums.add(30);
		// Ư�� ��°�� ���� ����
		nums.set(0,  20); // ù ��° ���� 20���� ����
		System.out.println(nums.get(0)); // ù ��° ���� ����
		
		//foreach �ڵ��ϼ� �ϸ� ����� �ڵ�
		// �迭�� ���̸�ŭ �ݺ����� �����ϰ�
		// �ݷ�( : ) �տ� �ִ� �� �迭 �ȿ� �ִ� ������ҵ�.
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		
		// ArrayList = ���� ������ �� �ִ�.
		// �迭�� �� ������ �ȵȴ�.4
		
		//����
		nums.remove(0); // ù ��° �� ����
		nums.add(100);
		nums.add(30);
		nums.add(30);
		nums.remove((Integer)30); // ���� 30�ΰ� �� �� ����
		System.out.println("-----------------");
		for (Integer integer : nums) {
			System.out.println(integer);
		}
	}
}
