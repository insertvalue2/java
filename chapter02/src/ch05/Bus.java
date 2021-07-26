package ch05;

public class Bus {
	
 
	// 버스 번호 
	// 승객 수 
	// 수입금 
	
	// 생성자 : 객체 생성시 - 버스 번호를 초기화
	
	// take 메서드를 만들어 보세요   
	// 리턴값 void 
	// 매개변수는 int money 
	
	// 버스에 정보를 보여주는 showInfo 메서드를 만들어 봅시다. 
	int busNumber;
	int passengerCount;
	int money;

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println(busNumber + "번 의 승객은 ");
		System.out.println(passengerCount + " 명 이고 ");
		System.out.println("수입은 " + money + "입니다. ");
	}

	
}
