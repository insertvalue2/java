package ch05;

public class WhileMainTest2 {

	public static void main(String[] args) {
		
		// 1 부터 10 까지 더해서 그 결과값을 출력 
		int num = 1; 
		int sum = 0;
	
		//final int LIMIT_VALUE = 100; 
		
		while(num <= 10) {
			sum = sum + num;
			num = num + 1; 
		}
		System.out.println("결과값 : " + sum);
		
	} // end of main 

} // end of class 
