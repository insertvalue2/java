package ch00;

public class DownCastingTest {
	public static void main(String[] args) {
		
		// 1. 바나나에  origin 멤버 변수 추가 
		Fruit fruit = new Banana();
		// 컴파일러는 부모타입 인스턴스 변수를 바라보고 있는 상태 
		//fruit.origin  <-- 사용 불가 
		// 다운 캐스팅을 사용한다면 가능 (컴파일러에게 자식 객체 타입을 바라보라고 명시) 
		String orign = ((Banana)fruit).origin;
		System.out.println("바나나의 원산지 : " + orign);
		
		
		
	}
}
