package ch02;

public class TypeConversion {

	public static void main(String[] args) {
		// 데이터의 형 변환 
		// int 자료형을 double로 변경하거나 
		// double 자료형을 int로 자료형으로 변경하는 것을 말합니다. 
		
		int iNum1 = 100; 
		System.out.println(iNum1);
		
		// 자동 형변환 
		double dNum1 = iNum1; 
		System.out.println(dNum1);

		// 강제 형변환 
		double dNumber = 1.12341;
		// 컴파일러가 작은 상자에 큰 상자(값을) 넣을 수 없다 
		//int iNumber = dNumber;
		
		// 개발자가 컴파일러야 괜찮으니깐 그냥 강제로 넣어 
		int iNumber =  (int)dNumber;
		System.out.println(iNumber);
		// 소수점을 그냥 버리고 값을 저장 
		
		// 연습 
		double aValue; 
		int bValue; 
		
		aValue = 0.5;
		bValue = (int)10.1;
		// bValue 에 자료형은 int 이다. 
		//문제 :  bValue 출력값은 얼마 일까요? 
		// 답 : 10
		System.out.println(bValue);
		
		
		
	} // end of main 

} // end of class 
