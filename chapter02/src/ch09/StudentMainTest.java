package ch09;

import java.util.Scanner;

public class StudentMainTest {

	public static void main(String[] args) {

		// 설계된 클래스를 가지고 사용하는 입장에서 요구사항에 맞게
		// 또는 여러분의 만들고 싶은 로직을 코드를 구현할 수 있다.

		// Student 객체 생성
		Student studentKim = new Student(200, "홍길동");
		Scanner scanner = new Scanner(System.in);

		System.out.println("홍길동 학생의 과목을 입력하세요");
		String subject1 = scanner.next();
		System.out.println("과목에 시험 점수를 입력하세요");
		int score1 = scanner.nextInt();

		// 설계된 객체를 사용
		// (자료구조 또는 다형성을 및 여러 기법들을 이용해서 객체를 유연하게 설계할 수 있다)

		// 첫번째 국어 과목이라고 생각하고 코딩을해봅시다.
		studentKim.setKoreaSubject(subject1, score1);

		System.out.println("홍길동 학생의 과목을 입력하세요");
		String subject2 = scanner.next();
		System.out.println("과목에 시험 점수를 입력하세요");
		int score2 = scanner.nextInt();

		// 두번째 수학 과목이라고 생각하고 코딩을해봅시다.
		studentKim.setMathSubject(subject2, score2);

		System.out.println("-------------------");
		studentKim.showStudentScore();
		System.out.println("-------------------");

	} // end of main

}
