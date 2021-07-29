package ch13;

public class GateWayMainTest {

	public static void main(String[] args) {

//		System.out.println(GateWay.zealotCount);

		GateWay gateWay = new GateWay(1);
		Zealot zealot1 = gateWay.createZealot();
		Zealot zealot2 = gateWay.createZealot();
		Zealot zealot3 = gateWay.createZealot();

		zealot1.showInfo();
		zealot2.showInfo();
		zealot3.showInfo();

		// static 변수는 인스턴스들이 공유할 수 있는 변수이다. (NumberPrinter 예제)
		// --> 객체를 생성하지 않고도 클래스 이름으로 접근이 가능하다.
		// 메모리 위치 - 태양 ( 객체가 생성되기전에 먼저 메모리에 올라가 있다)
		System.out.println("현재 생성된 질럿 수 : " + GateWay.zealotCount);

	}

}
