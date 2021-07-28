package ch11;

public class Employee {

	public static int serialNum = 1000;

	private int employeeId;
	private String employeeName;
	private String department;

	public Employee() {
		serialNum++; 
		this.employeeId = serialNum; 
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	// employeeId setter 메서드는 만들지 않음
	

	// 연습 ...
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	// static 메서드 활용 
	public static int getSerialNum() {
		// 주위 static 메서드 안에서는 멤버 변수를 사용할 수 없다. 
		// why : 객체가 만들어지기 전에 접근해서 사용할 수 있는 static 이기 때문이다.
		//department = "객체가 생성되기 전에는 실행될 수 있는 메서드";
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Employee.serialNum = serialNum;
	}


}
