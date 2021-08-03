package ch01;

public class Tiger extends Animal {

	// Tiger 형식은 상속된 추상 메서드 Animal.hunt()를 구현해야 합니다.
	// 해결책
	// 1. 추상 메서드를 직접 구현한다. 
	// 2. Tiger 클래스도 추상 클래스로 만들어 준다. 

	// 1번째 방법 사용 
	@Override
	public void hunt() {
		System.out.println("호랑이가 앞발로 사냥을  합니다.");
	}
	
	// 오버라이드 - 메서드 재정의 
	@Override
	public void move() {
		System.out.println("살금살금 조용히 이동합니다.");
	}
	

	// 즉 추상클래스 만드는 이유는
	// 다형성 기법을 적용하게 할 수 있다.
	// 코드에 양을 줄여서 가독성을 높일 수 있다.
	// 구현하는 사람에게(개발자에게) 직접 구현해서 사용하라고
	// 강제성을 부여 할 수 있다.

}
