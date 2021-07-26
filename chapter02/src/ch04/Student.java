package ch04;

public class Student {
	
	// 생성자 - constructor
	// 객체를 생성할때 다음과 같은 모양으로 만들어라고 지시하는 것 
	// 객체를 생성할 때 강제성을 부여 하는것. 
	int number; 
	String name;
	int grade; 
	
	// 생성자 정의 (개발자가 직접 정의) 
	public Student(int number, String name, int grade) {
		this.number = number;
		this.name = name; 
		this.grade = grade; 
		//System.out.println("생성자가 호출 되었습니다.");
		
		// 중요! 
		// 생성자는 객체가 처음 만들어 질 때 제일 먼저 수행하는 코드 
	}
	
	// 기본 생성자 
//	public Student() {
//		
//	}
	
	// 메서드 정의 
	public String showInfo() {
		return name + "학생의 학번은 " + number + "이고 , " + grade + " 입니다";
	}
	
}
