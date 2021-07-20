package ch01;

public class Variable {

	// 메인 함수 (코드의 시작점)
	public static void main(String[] args) {
		
		// 변수를 사용하는 방법
		int age; 		// 변수를 선언 
		int count; 	// 변수를 선언  
		
		// 초기화 
		age = 10;
		count = 100; 
		// System.out.println 은 문자열도 화면에 출력하고 변수에 값도 화면에 출력 할 수 있다. 
		System.out.println(age);
		System.out.println(count);
		
		// 변수의 선언과 초기화를 동시에 할수도 있습니다. 
		int age2 = 20; 
		int count2 = 77; 
		
		// 변수의 이름을 만들 때 규칙
		// 1. 대소문자가 구별 되며 길이에 제한이 없다. 
		int name = 100; 
		int Name = 20;  // 단, 변수명을 처음부터 대문자로 표기 하지는 않습니다. 
		// 2. 자바에서 사용하는 예약어는 사용할 수 없다.
//		int while;  
//		int for; 
//		int if;
		// 3. 변수는 숫자로 시작할 수 없다. 
//		int 7name;  
//		int 55age;
		// 4. 특수 문자는 _ , $ 만 사용 가능하다. 
		int _age; 
		int $name; 
		int a_ge; 
		int nam$e; 
		int age_$; 
		
		// 핵심 : 변수는 값을 저장할 수 있는 메모리 공간을 의미 합니다. 
		// 이름에서 알 수 있듯이 변하는 수 입니다. 
		int id = 101; // 선언과 초기화를 동시에 처리 
		//1.  int   <-- 데이터 자료형 
		//2.  id    <-- 값을 저장할 수 있는 메모리 공간에 그 이름을 우리는 id 라고 선언 
		//3. 101  <-- 값  
		
		//1번 2번 3번 중에 변수는 몇 번 일까요? 답은 2번 입니다.  
		
		// id <-- 변수(값을 저장할 수 있는 공간) 
		
		System.out.println("===================");
		System.out.println(id);
		id = 500; // 값을 저장하는 공간(변수)에 값을 500으로 변경. 
		System.out.println(id);
		id = 0; 
		System.out.println(id);
		

	} // end of main 

} // end of class
