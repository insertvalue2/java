package ch01;

// 설계된 학생 클래스를 사용해보는 입장 
public class StudentMainTest1 {
    // main 함수( 코드의 시작점)
	public static void main(String[] args) {
		
		int num1 = 10;  // int 타입의 선언과 초기화 
		int num2 = 20;  
		Student s1;  // Student 참조 타입 s1란 변수 이름으로 선언 
		Student s2;  // Student 참조 타입 s2란 변수 이름으로 선언 
		
		s1 = new Student(); 
		s2 = new Student(); 
		
		System.out.println(num1);
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
