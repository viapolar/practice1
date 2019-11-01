package java.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		Studentinfo studentinfo = ctx.getBean("studentinfo", Studentinfo.class);
		studentinfo.getStudentinfo();
		
		Student student2 = ctx.getBean("student2", Student.class);
		studentinfo.setStudent(student2);
		studentinfo.getStudentinfo();
		
		ctx.close();
		
	}

}
