package java.javalec.ex;

public class Studentinfo {
	
	private Student student;
	
	public Studentinfo(Student student) {
		this.student = student;
	}
	
	public void getStudentinfo() {
		
		if(student != null) {
			System.out.println("�̸� : " + student.getName());
			System.out.println("���� : " + student.getAge());
			System.out.println("�г� : " + student.getGradeNum());
			System.out.println("�� : " + student.getClassNum());
			System.out.println("===============================");
		}
		
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
