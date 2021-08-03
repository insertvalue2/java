package ch01;

public abstract class Animal {
	
	// 추상 클래스란 (abstract class) 
	// 하나 이상의 추상 메서드를 포함하는 클래스 입니다. (abstract method) 
	
	public String name; // 멤버 변수 
	
	// 일반 메서드 
	public void move() {
		System.out.println("이동합니다.");
	}
	
	// 추상 메서드 
	// 선언부 (signature) 
	public abstract void hunt(); 
	// 자바 규칙 - 하나의 추상 메서드가 존재 한다면 그것을 가지고 있는 
	// 클래스는 무조건 추상 클래스가 되어야 한다. 
	
	// 메인 함수 
	public static void main(String[] args) {
		// 추상 클래스는 일반적으로 사용했던  new 키워드를 사용해서
		// 객체로 만들 수 없다.
		//new Animal();
		
		
		// 단 익명 클래스로 추상 메서드를 재 정의해서 사용할 수 있다.   
		new Animal() {
			@Override
			public void hunt() {
				// TODO Auto-generated method stub
			}
		};
	} // end of main 
} // end of class 
