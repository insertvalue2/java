package ch04;

public class TExtendsClass {

	public static void main(String[] args) {
		
		// <T extends 클래스> 사용하기 
		
		// 상위 클래스의 필요성 
		// T 자료형의 범위를 제한 할 수 있음 (제한 하지 않으면 자료형으로 아무 클래스나 올수 있다)
		// 상위 클래스에서 선언하거나 정의하는 메서드를 활용할 수 있음
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial(); // 형변환 하지 않음
		System.out.println(powderPrinter);
		
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial(); // 형변환 하지 않음
		System.out.println(plasticPrinter);

		//GenericPrinter<Water> printer = new GenericPrinter<Water>();	


	}

}
