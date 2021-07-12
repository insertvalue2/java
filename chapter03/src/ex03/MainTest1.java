package ex03;

class Company {
	
	// 1. 생성자를 private 로 만든다. 
	private Company() {
		
	}
	// 2. private 멤버 변수를 선언하고 클래스 내부에서 객체 생성
	private static Company instance = new Company();
	
	// 3. 외부에서 유일한 인스턴스르를 참조할 수 있는 public 메서드 제공
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company(); 
		}
		return instance; 
	}
}

public class MainTest1 {

	public static void main(String[] args) {
		Company company1 = Company.getInstance();
		System.out.println(company1);
		
		Company company2 = Company.getInstance();
		System.out.println(company2);

	}

}
