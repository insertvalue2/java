package ch06;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 객체지향 프로그래밍이란  객체와 객체 사이에 상호 협력 또는 객체와의 
		// 관계에 의해서 프로그래밍이 구현된다. 
		
		Student student1 = new Student("홍길동", 10000);
		Bus bus200 = new Bus(200);
		Subway subway1 = new Subway(1);
		
		// 학생이 버스를 탄다. 
		student1.takeBus(bus200);
		// 학생 정보창 확인 
		student1.showInfo();
		// 버스 상태창 확인 
		bus200.showInfo();
		
		// 학교를 마치고 지하철을 탑니다. 
		student1.takeSubway(subway1);
		// 학생의 상태창 확인 
		student1.showInfo();
		// 지하철 상태창 확인 
		subway1.showInfo();
		
		System.out.println("---------------------");
		
		// 1. 학생 객체를 생성 해보세요 
		Student student2 = new Student("김길동", 50000);
		// 2. 지하철 객체를 생성 해보세요
		Subway subway2 = new Subway(2);
		// 3. 버스 객체를 생성해보세요 
		Bus bus100 = new Bus(100);
		// 4. 학생이 지하철을 타는 코딩을 해보세요 
		student2.takeSubway(subway2);
		// 5. 학생이 버스를 타는 코딩을 해보세요 
		student2.takeBus(bus100);
		// 6. 새로만든 객체들에 정보를 확인해 봅시다. 
		student2.showInfo();
		subway2.showInfo();
		bus100.showInfo();

	} // end of main 

}
