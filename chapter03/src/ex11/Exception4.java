package ex11;

import java.util.logging.Logger;

class Student {
	String name; 
	int grade;
}

public class Exception4 {
	
	public static void main(String[] args) {
		// 로그 남기기
		Logger logger = Logger.getLogger("myLogger");
		
		Student student = null;
		student.name = "111";
		
		try {
			student.name = "111";
		} catch (Exception e) {
			//System.out.println("오류 발생 ");
			logger.warning("오류 발생 : " + e.toString());
		}
		
	}
}
