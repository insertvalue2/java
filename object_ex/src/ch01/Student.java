package ch01;

public class Student {

	private int studentId;
	private String studentName;

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	// 문제1. toString 메서드를 재정의 해보세요. 
	@Override
	public String toString() {
		return "학번 : " + studentId + ", 이름 : " + studentName; 
	}
	
	// 문제2. equals 메서드를 재정의 해보세요
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student) obj;
			if (this.studentId == std.studentId 
					&& studentName == std.studentName) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}
