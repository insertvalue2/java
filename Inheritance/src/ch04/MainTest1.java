package ch04;

public class MainTest1 {

	public static void main(String[] args) {

		Student student = new Student();
		Teacher teacher = new Teacher();
		student.showInfo();
		System.out.println("--------------------");
		teacher.showInfo();
		
		// 문제 1 
		
		// Person 타입으로 배열을 선언하고 배열에 크기를 2로 만들어 주세요.
		// 0 번째 인덱스에 학생 
		// 1 번째 인덱스에 선생님 
		Person[] persons = new Person[2];
//		persons[0] = student;
//		persons[1] = teacher;
		
		// 문제 2 
		// for 문을 활용해서 Person 타입 배열에 타입을 출력 하시오. 
//		for (int i = 0; i < persons.length; i++) {
//			if (persons[i] instanceof Student) {
//				System.out.println("클래스 타입 : 학생 " );
//			} else {
//				System.out.println("클래스 타입 : 선생님 " );
//			}
//		}
		

	}

}
