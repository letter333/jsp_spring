package javastudy01;

public class HelloJava04_Finally {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0;
		
		try {
			a = 10;
			c = a / b;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("잘못됨");
			return;
		} finally {
			System.out.println("이 부분 실행 안 될 수도 있다.");			
		}
		System.out.println("여긴 안 됨");
	}
}