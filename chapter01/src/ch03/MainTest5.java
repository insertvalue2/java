package ch03;

public class MainTest5 {

	public static void main(String[] args) {
		// 논리 연산자 (&& , || ) 엠퍼센트 , 버티컬 바 
		// 관계 연산자와 혼합하여 많이 사용 됨. 
		// 연산에 결과가 true , false  
		
		int num1 = 10; 
		int num2 = 20;
		
		// 1. 논리 곱 
								// true                 true		
		boolean flag1 = (num1 > 0) && (num2 > 0);
		System.out.println(flag1);
		System.out.println("============");
									// true 			    false  	
		boolean flag2 = (num1 > 0) && (num2 < 0);
		// 둘다 true (참) 일 때, true 반환 
		System.out.println(flag2);
		System.out.println("============");
		
		// 2. 논리 합 
		                           // true             true
		boolean flag3 = (num1 > 0) || (num2 > 0);
		System.out.println(flag3);
		
		System.out.println("============");
								  // false              true 	
		boolean flag4 = (num1 < 0)  || (num2 > 0);
		// 둘 중 하나라도 true , 연산에 결과는 true 반환 
		System.out.println(flag4);
		

	} // end of main 

} // end of class 
