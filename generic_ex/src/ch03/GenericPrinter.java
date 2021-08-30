package ch03;

public class GenericPrinter<T> {

	// T 라는 대체 문자를 사용, E - element, K - key, V - value  (사실 아무 문자나 사용 가능)  
	// 자료형 매개변수(type parameter)  : 
	// 이 클래스를 사용하는 시점에서 실제 사용할 자료형을 지정
	
	// 자료형 매개변수를 사용한 클래스를 --> 제네릭 자료형이다라고 표현 
	
	private T material;   // T 자료형으로 선언한 변수

	public T getMaterial() { // T 자료형을 반환하는 제네릭 메서드 
		return material;
	}
	// T (자료형 매개변수가 사용되는 메서드를 제네릭 메서드 라고 합니다.) 
	public void setMaterial(T material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return material.toString();
	}
	
	
}
