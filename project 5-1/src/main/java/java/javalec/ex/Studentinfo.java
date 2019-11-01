package java.javalec.ex;

public class Studentinfo {
	
	private Student student;
	
	public Studentinfo(Student student) {
		this.student = student;
	}
	
	public void getStudentinfo() {
		
		if(student != null) {
			System.out.println("이름 : " + student.getName());
			System.out.println("나이 : " + student.getAge());
			System.out.println("학년 : " + student.getGradeNum());
			System.out.println("반 : " + student.getClassNum());
			System.out.println("===============================");
		}
		
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
