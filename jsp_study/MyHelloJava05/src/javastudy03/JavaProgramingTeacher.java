package javastudy03;

public class JavaProgramingTeacher extends ProgramingTeacher {
	
	public JavaProgramingTeacher(String name, String major) {
		setName(name);
		setMajor(major);
	}
	
	@Override
	public void Teach() {
		// TODO Auto-generated method stub
		System.out.println("이클립스냐 인텔리제이냐..");
		System.out.println(getName() + "쌤의 " + getMajor() + "강의");
	}
}
