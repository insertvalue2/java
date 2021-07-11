package ex02;

public class Student {
	String name;
	int grade;
	
	// Builder 클래스 타입의 생성자를 만들어 준다.
	private Student(Builder builder) {
		this.name = builder.name;
		this.grade = builder.grade;
	}

	public static class Builder {
		String name;
		int grade;

		public Builder name(String name) {
			this.name = name;
			return this; // . 연사자를 사용할 수 있게 된다. (체이닝)
		}

		public Builder grade(int grade) {
			this.grade = grade;
			return this;
		}

		// 중요 (내부 static 클래스에서 외부 Student 클래스 생성)
		public Student build() {
			return new Student(this);
		}

	} // end of Builder class

	@Override
	public String toString() {
		return "name : " + name + " , " + "grade :" + grade;
	}

} // end of Student class