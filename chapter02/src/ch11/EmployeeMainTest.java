package ch11;

public class EmployeeMainTest {

	public static void main(String[] args) {
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		// 생성자 추가 후 주석 처리 해야 함 !! 
		employeeLee.serialNum++;
		System.out.println(employeeLee.serialNum);
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
		// 생성자 추가 후 주석 처리 해야 함 !!
		employeeKim.serialNum++;
		
		System.out.println(employeeKim.serialNum);
		System.out.println("----------------------");
		
		// 현재 설계된 객체의 형태로는 직원에 사원 번호를 알수 없다. 
		System.out.println(employeeLee.serialNum);
		System.out.println(employeeKim.serialNum);
		
		System.out.println("----------------------");
		// 객체를 수정해 봅시다. 
		System.out.println(employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeId());
		
		
		// static 변수, 멤버 변수, 지역변수 메모리 위치 확인 
	}

}
