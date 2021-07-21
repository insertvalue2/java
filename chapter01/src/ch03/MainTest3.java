package ch03;

public class MainTest3 {

	public static void main(String[] args) {
		// 증감, 감소 연산자 
		// ++, -- 
		
		int num1 = 1; 
		num1++;
		System.out.println(num1);
		
		int num2 = 1; 
		num2--;
		System.out.println(num2);
		
		// ******* 중요 !!  *******
		// 1. 증감 연산자가 뒤에 올 경우 
		int num3 = 10; 
		int num4; 

		num4 = num3++; 
		System.out.println(num4);
		// num3(10) num4에 값을 대입하고 난 뒤 num3값을 1 증가
		// 현재 num3 값을 화면에 출력해 봅시다. 
		System.out.println("num3에 현재 값 " + num3);
		System.out.println("num4에 현재 값 " + num4);
		
		// 2. 증감 연사자가 앞에 올 경우 
		int num5 = 10; 
		int num6 = ++num5;
		// num5에 값이 먼저 1 증가 되고 num6에 대입 연산이 발생된다. 
		System.out.println("num5에 현재 값 " + num5);
		System.out.println("num6에 현재 값 " + num6);
		
		// 결론 : 증감 연산자는 변수(공간)에 있는 값을 1 증가 시킨다. 
		// 단 앞에 있을 때와 뒤에 있을 때 연산에 순서가 다르다
		
		

	} // end of main 

} // end of class 
