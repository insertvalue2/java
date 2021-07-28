package ch09;

public class Student {

	int studentID;
	String studentName;
	// 참조 타입 (컴포지션 관계 - 포함관계)
	Subject korea;
	Subject math;

	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;

		// NullPoint Exception
		korea = new Subject();
		math = new Subject();

	}

	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}

	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}

	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println("학생의 총점은 : " + total + " 이고 ");
		System.out.println("평균 점수는 : " + (total / 2) + " 입니다.");
	}

} // end of class - Student

class Subject {
	String subjectName;
	int score;
	int subjectID;
} // end of class - Subject