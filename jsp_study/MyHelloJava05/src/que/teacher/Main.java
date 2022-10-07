package que.teacher;

public class Main {
	public static void main(String[] args) {
		ProgramingTeacher pt = new ProgramingTeacher();
		MathTeacher mt = new MathTeacher();
		JavaProgramingTeacher jpt = new JavaProgramingTeacher();
		
		Teacher t = new Teacher() {

			@Override
			public void Teach() {
				// TODO Auto-generated method stub
				System.out.println("아무거나 가르친다!");
			}
			
		};
		
		pt.Teach();
		mt.Teach();
		jpt.Teach();
		t.Teach();
	}
}
