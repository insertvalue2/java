package ch01;

public class MainTest1 {

	// 메인함수
	public static void main(String[] args) {
		Book book1 = new Book(1, "데미안", "헤르만 헤세");
		Book book2 = new Book(2, "데미안", "헤르만 헤세");

		//최상위 object 클래스의 toString 메서드 재정의 이후
		System.out.println(book1);
		System.out.println(book1.hashCode());
		System.out.println("-------------------------");
		
		// == 주소 값만을 비교 한다.
		// 물리적 객체 비교 
		if (book1 == book2) {
			System.out.println("같은 객체 입니다.");
		} else {
			System.out.println("book1과 book2는 다른 객체 입니다.");
		}
		
		System.out.println("-------------------------");
		
		// 최상위 object 클래스의 equals 메서드 재정의 이후
		// 논리적으로 객체를 비교할 수 있다. 
		if (book1.equals(book2)) {
			System.out.println("같은 객체 입니다.");
		} else {
			System.out.println("book1과 book2는 다른 객체 입니다.");
		}

	} // end of main
}
