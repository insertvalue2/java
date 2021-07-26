package ch03;

public class StudentMainTest1 {
   
	// 메인함수 (코드에 시작점)
	public static void main(String[] args) {
		
		Student studentKim = new Student(); 
		studentKim.studentID = 1; 
		studentKim.studentName = "김길동";
		studentKim.address = "부산시 진구";
		
		studentKim.study();
		studentKim.breakTime();
		studentKim.showStudentInfo();
		
		// 추가 : 메서드는 대체로 멤버 변수를 가지고 기능을 수행한다. 
		System.out.println("================");
		
		Student studentLee = new Student();
		studentLee.studentID = 2; 
		studentLee.studentName = "이순신";
		studentLee.address = "부산시 해운대구";
		
		studentLee.study();
		studentLee.breakTime();
		studentLee.showStudentInfo();
		
		System.out.println("================");
		// 인스턴스 변수에는 주소값이 저장 된다. 
		System.out.println(studentKim);
		System.out.println(studentLee);
		
		System.out.println("================");
		
		// 1. studentKim의 이름을 화면에 출력하세요 
		System.out.println(studentKim.getName());
		// 2. studentKim의 학생 id를 화면에 출력하세요 
		System.out.println(studentKim.getStudentID());
		// 3. studentLee의 학생의 이름을 화면에 출력 하세요 
		System.out.println(studentLee.getName());
		// 4. studentLee의 학생의 id를 화면에 출력 하세요
		System.out.println(studentLee.getStudentID());
		

	} // end of main 
	
	// 함수
	// 자바에서 함수란 객체와 상관없이 독립적으로 기능을 수행하는 일련에 코드 
	public static double addDouble(double n1, double n2) {
		return n1 + n2; 
	}

}
