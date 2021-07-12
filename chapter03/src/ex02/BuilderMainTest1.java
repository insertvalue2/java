package ex02;



public class BuilderMainTest1 {

	public static void main(String[] args) {
//		Student student1 = new Student("김학생", 3);
		Student student = new Student.Builder().name("홍길동").grade(1).build();
		System.out.println(student.toString());
	}
}
