package ch01;

public class MainTest2 {

	public static void main(String[] args) {

		Student student1 = new Student(1, "홍길동");
		Student student2 = new Student(2, "티모");

		Student student3 = new Student(2, "티모");
		Book book = new Book(1, "논어", "맹자");

		// toString 재정이 후 동작 확인
		System.out.println(student1);
		System.out.println(student2);

		System.out.println("--------------------");

		// 객체 주소값 확인 (물리적 위치)
		if (student2 == student3) {
			System.out.println("물리적 : 같은 객체 입니다.");
		} else {
			System.out.println("물리적 : 다른 객체 입니다.");
		}

		System.out.println("--------------------");

		// equals 메서드 재정이 이후 (논리적 확인)
		if (student2.equals(student3)) {
			System.out.println("논리적 : 같은 객체 입니다.");
		} else {
			System.out.println("논리적 : 다른 객체 입니다.");
		}

		System.out.println("--------------------");
		// equals 메서드 재정이 이후 다른 객체와 비교 
		if (student2.equals(book)) {
			System.out.println("논리적 : 같은 객체 입니다.");
		} else {
			System.out.println("논리적 : 다른 객체 입니다.");
		}

	}

}
