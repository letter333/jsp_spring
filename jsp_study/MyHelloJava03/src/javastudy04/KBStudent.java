package javastudy04;

public class KBStudent extends Student {
	private String gender;
	private String education;
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	
	public void attend() {
		System.out.println("이름 : " + this.getName());
		System.out.println("나이 : " + this.getAge());
		System.out.println("성별 : " + this.gender);
		System.out.println("학력 : " + this.education);
		System.out.println("입실/퇴실");
	}
}
