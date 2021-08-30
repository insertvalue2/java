package ch03;

import ch02.Plastic;
import ch02.Powder;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		// 재료 
		Powder powder = new Powder(); 
		Plastic plastic = new Plastic(); 
		
		// 사용할 때 자료형을 넣어 주면 된다.
		//사용방법 :  T 대신에 사용할 때 어떤 자료형을 사용할지 지정해 주면 된다. 
		GenericPrinter<Powder> genericPrinter1 = new GenericPrinter<>();
		
		// 재료 셋팅 
		genericPrinter1.setMaterial(powder);
		
		// 재료 꺼내기 (형 변환할 필요가 없다) 
		Powder p1 = genericPrinter1.getMaterial(); 
		System.out.println(genericPrinter1.toString());
		
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
		// 재료 셋팅
		genericPrinter2.setMaterial(plastic);
		// 재료 꺼내기 
		Plastic p2 = genericPrinter2.getMaterial(); 
		System.out.println(genericPrinter2.toString());

		// 자바에서는 < > 다이아몬드 연산자라 함 
		

	}

}
