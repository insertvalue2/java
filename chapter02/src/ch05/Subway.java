package ch05;

public class Subway {

	// 호선 번호
	// 승객수
	// 수입금

	// 생성자 - 객체생성시 호선번호를 받을 수 있게 만들어 주세요

	// take 메서를 정의해 봅시다
	// 리턴값 void
	// 매개 변수 int money

	// showInfo 메서드를 만들어 봅시다.

	int lineNumber;
	int passengerCount;
	int money;

	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println(lineNumber + "호선 의 승객은 ");
		System.out.println(passengerCount + " 명 이고 ");
		System.out.println("수입은 " + money + "입니다. ");
	}

}
