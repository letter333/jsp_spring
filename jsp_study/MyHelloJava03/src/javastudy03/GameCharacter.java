package javastudy03;

/**
 * @author KB
 *
 */
public class GameCharacter {
	private String id;
	private String _class;
	private int level;
	private static int count;
	
	public GameCharacter(String id, String _class) {
		count++;
		this.id = id;
		this._class = _class;
	}
	
	public GameCharacter() {
		count++;
	}

	
	public static int getCount() {
		return count;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String get_class() {
		return _class;
	}

	public void set_class(String _class) {
		this._class = _class;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public static void sayHello() {
		System.out.println("안녕~~");
	}
	
	public void attack() {
		if(_class.contains("전사")) {
			System.out.println("물리어택");
		} else if(_class.contains("마법")) {
			System.out.println("마법 공격");
		}else {
			System.out.println(level + "lv " + _class + "의 줘팸");
		}
	}
	
	public void printInfo() {
		System.out.println(this.id+"의 직업은 " + this._class);
		System.out.println("Lv : " + this.level);
	}
}
