package ch10;

public class Person {
	// this 란
	// 1. 인스턴스(객체) 자신의 메로리를 가리킨다.
	// 2. 생성자에서 또 다른 생성자를 호출할때 사용할 수 있다.
	// 3. 자신의 주소(참조값, 주소값)을 반환 시킬 수 있다.
	
	String name;
	int age;

	public Person(String name, int age) {
		// 1. 자기 자신을 가리키는 this
		this.name = name;
		this.age = age; 
	}
	
	// 다른 개발자의 요청에 의해서 기본 생성자로 객체를 만들수 있게 허용함. 
	public Person() {
		// 즉 사용하는 입장에서 ->  new Person();
		// 2. 생성자에 또 다른 생성자를 호출할때 사용할 수 있다. 
		this("이름없음", 1);
	}
	
	public void showInfo() {
		System.out.println("이름 : "  + name + " 나이 :" + age);
	}
	
	// 3. 자신의 주소(참조값)을 반환 시킬 수 있다. 
	// 빌더 패턴을 만들어 낼 수 있음.. 
	public Person getPersion() {
		return this; 
	}
	
	
	// 사용하는 입장 main 함수 
	public static void main(String[] args) {
		Person person = new Person(); 
		person.showInfo();
		
		// 참조값을 받아서 다른 인스턴스 변수에 주소를 할당해 보자. 
		Person person2 =  person.getPersion();
		person2.showInfo();
		
	} // end of main 
}
