package ch05;

public class ContinueTest1 {

	public static void main(String[] args) {
		
		// 예약어 continue
		// 무시하고 진행하는 continue
//		final int MULTIPLE = 3; 
//		final int MAX = 10; 
		
		int num; 
//		int count = 0; 
		for (num = 1; num <= 10; num ++) {
			
			// 3에 배수이면 출력 하지 마시오. 
			if (num % 3 == 0) {
//				count++; 
				continue;
			}
			System.out.println("출력값 : " + num);
			
		}
		
//		System.out.println("3의 배수 개수는 : " + count);

	}

}
