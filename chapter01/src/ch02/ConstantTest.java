package ch02;

public class ConstantTest {

	public static void main(String[] args) {
		// 상수(constant)  
		
		final int  MAX_NUM = 12;// 상수를 선언과 초기화를 동시에  
		final int MIN_NUM; // 상수 선언 
		// 메모리에 int형 크기의 공간에 이름을 MIN_NUM라고 선언 
		
		MIN_NUM = 0; // 상수에 값을 초기화 (값을 넣다)
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 20; // 오류 확인 
		// 상수에 한번 초기화 된 공간에 값을 변경할 수 없다. 
		
		final int MY_COUNT = 100; 
		// 1. 위에서 상수는 어디를 말하는걸 까요?
		// 답. MY_COUNT
		// 2. 예약어는 어디를 말하는 걸 까요? 
		// 답. final (상수를 의미하는 예약어) 
		// 3. (중요) 리터럴은 어디를 말하는 걸까요? 
		// 답. 100 <-- 현실 세계에서 사용하는 숫자나  'A'와 같은 문자의 값들을 말합니다. 
		
		
		
	}

}
