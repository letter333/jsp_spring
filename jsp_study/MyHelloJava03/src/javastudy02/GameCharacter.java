package javastudy02;

public class GameCharacter {
	private String id;
	private String job;
	private int level;
	private static int count;
	
	public GameCharacter() {
		increaseCnt();
	}
	
	public GameCharacter(String id, String job) {
		this.id = id;
		this.job = job;
		increaseCnt();
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		GameCharacter.count = count;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public void increaseCnt() {
		GameCharacter.count++;
	}
	
	public void attack() {
		if(this.job == "����") {
			System.out.println("��������");
		} else if(this.job == "������") {
			System.out.println("���� ����");
		} else {
			System.out.println("�ƹ�ư ����");
		}
	}
	
	public void sayHello() {
		System.out.println("�ȳ�~~");
	}
}
