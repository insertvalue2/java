package ch02;

import java.util.Random;

public class FunctionTest2 {

	
	public static int addNum(int n1, int n2) {
		// 함수 안에서 사용되는 변수를 지역변수라고 합니다. 
		int result; 
		result = n1 + n2;
		return result;
	} // end of addNum 
	
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	} // end of sayHello 
	
	
	public static int calcSum() {
		
		int sum = 0;
		int i;
		
		for(i = 0; i<=100; i++) {
			sum += i;
		}
		
		return sum;
	} // end of calcSum
	
	//함수를 만들어 봅시다. 
	//1.  리턴값 int,  매개변수 n1, n2, n3, 이름은 intAdd 
	
	// 2. 리턴값 double 매개변수 d1, d2, 이름은 doubleAdd
	
	// 3. 리턴값 void 매개변수 String article 이름은 printArticle
	
	// 4. 
//	public static void randomNumber() {
//		int myRandomValue; 
//		Random random = new Random();
//		myRandomValue = random.nextInt(45) + 1;
//		System.out.println(myRandomValue);
//	}
	
	

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int total = addNum(num1, num2);
		
		sayHello("안녕하세요");
		int sum = calcSum();
		
		System.out.println(total);
		System.out.println(sum);
		
//		System.out.println("==========");
//		randomNumber();
//		randomNumber();
		
	} // end of main 


}
