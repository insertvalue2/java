package ch00;

public class MainTest2 {

	public static void main(String[] args) {
		
		Fruit fruit1 = new Banana();
		Fruit fruit2 = new Peach();
		
		fruit1.showInfo();
		System.out.println("--------");
		fruit2.showInfo();
		
		// 자바에서 다형성이란 
		// 부모 타입 인스턴스 변수에 자식 객체를 생성할 수 있다.  (업 캐스팅)
		// !! 부모 자식 관계 에서 사용 가능 !! 
		
		// 그 역은 성립하지 않는다. 
		// 즉 자식 인스턴스 변수에 부모 인스턴스를 생성 시킬 수 없다. 
		//Banana banana = new Fruit();

	}

}
