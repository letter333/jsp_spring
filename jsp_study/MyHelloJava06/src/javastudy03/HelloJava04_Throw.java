package javastudy03;

public class HelloJava04_Throw {
	public static int sum(int start, int end) throws Exception {
		if(end < start) {
			throw new Exception("start와 end순서 잘못됨");
		} else {
			int sum = 0;
			for(int i = start; i <= end; i++) {
				sum += i;
			}
			return sum;
		}
	}
	public static void main(String[] args) {
		
		try {
			System.out.println("hi");
			throw new Exception("error");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			int num = sum(11, 10);
			System.out.println(num);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
