package ch05;

public class ForMainTest1 {

	public static void main(String[] args) {
		
		/*
		for(초기화식; 조건식; 증감식) {
			
			수행문 
		}
		*/

		// for 문을 이용해서 1부터 10까지 덧셈 연산
		// 연산에 결과를 담을 변수가 필요 함. 
		int sum = 0; 
		for(int i =1; i <= 10; i++) {
			sum = sum + i;
//         문제 : 복합 대입 연산자를 사용해서 표기 해보세요. 			
//			--> sum += i;
			System.out.println("i의 현재값 : " + i);
			
		} // end of for 
		
		System.out.println("최종 결과값 : " + sum);
		
	} // end of main 

} // end of class  
