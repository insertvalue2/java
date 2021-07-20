package ch01;

public class DataType3 {

	public static void main(String[] args) {
		// 기본 자료형 
		// 실수형 (1.0, 0.123, 0.00123) 
		
		// float , double 
		float name = 0.5f; // 4 바이트 
		float name2 = 0.5F ; // 가능한 대문자로 표기 
		
		double name3 = 0.123; 
		double name4 = 1.123456; // 8 바이트  -> 소수점을 많이 표시할 수 있기 때문에 더 정확성을 보장한다. 
		
		System.out.println(name);
		System.out.println(name2);
		System.out.println("==============");
		System.out.println(name3);
		System.out.println(name4);
		System.out.println("==============");
		System.out.println(0.5F);
		System.out.println(0.5);
			

	}

}
