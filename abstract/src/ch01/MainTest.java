package ch01;

public class MainTest {
	
	public static void main(String[] args) {
		
		Animal tiger = new Tiger(); 
		Animal eagle = new Eagle(); 
		Animal person = new Person(); 
		
		//1. Animal 타입으로 배열을 선언해 보세요. 배열에 크기는 3 
		Animal[] animals = new Animal[3];
		animals[0] = tiger; 
		animals[1] = eagle;
		animals[2] = person;
		// 오류 확인 
//		animals[3] = new Person(); 
				
		//2. (tiger, eagle, person) move, hunt 메서드를 호출해 봅시다. 
		// !! 메서드는 다운 캐스팅을 사용할 필요가 없다. 
		// 멤버 변수(다운캐스팅) - 컴파일 시점 
		// 메서드는 런타임시에 메서드를 호출  
		for (int i = 0; i < animals.length; i++) {
			// 런타입시에 객체에 해당하는 실제 메서드를 호출 한다. 
			animals[i].move();
		}
		
		// 확장 for문 , foreach 
		for (Animal object : animals) {
			object.move();
		}
	}
}
