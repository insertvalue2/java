package ch01;

public class StudentMainTest2 {
	
	// 메인 함수 
	public static void main(String[] args) {
		
		Student student1 = new Student(); 
		student1.name = "홍길동";
		student1.height = 175; 
		student1.weight = 70; 
		
		System.out.println(student1);
		System.out.println(student1.name);
		System.out.println(student1.height);
		System.out.println(student1.weight);
		
		System.out.println("--------------------");
		
		Student student2 = new Student();
		student2.name = "이순신";
		student2.height = 180; 
		student2.weight = 80;
		
		
	} // end of main 

} // end of class 
