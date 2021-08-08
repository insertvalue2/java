package ch02;

public class MainTest {

	public static void main(String[] args) {

		Televison televison = new Televison();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot robot = new ToyRobot();

		televison.turnOn();
		televison.turnOff();
		System.out.println("-----------");
		refrigerator.turnOn();
		refrigerator.turnOff();
		System.out.println("-----------");
		robot.turnOn();
		robot.turnOff();
		System.out.println("-----------");
		// 다형성 - 배 (신체, 선박, 과일) 
		RemoteController[] remote = new RemoteController[3];
		remote[0] = televison; 
		remote[1] = refrigerator; 
		remote[2] = robot; 
		
		// remote 인스턴스 변수 이용 
		// 문제 1 확장 for문을 이용해서 turnOn() 메서드를 호출 
		for (RemoteController remoteController : remote) {
			remoteController.turnOn();
		}
		
		System.out.println("-----------");
		
		// 문제 2 확장 for문을 이용해서 turnOff() 메서드 호출 
		for (RemoteController remoteController : remote) {
			remoteController.turnOff();
		}
		
		System.out.println("-----------");
		
		// 문제 3 for문을 이용해서 클래스 타입이 ToyRobot 이면 name을 화면에 출력
		// instanceof 연산자, 다운 캐스팅
		for (int i = 0; i < remote.length; i++) {
			if(remote[i] instanceof ToyRobot) {
				String name = ((ToyRobot)remote[i]).name;
				System.out.println("name : " + name);
			}
		}
		
		
		
		// 요구 사항 추가 !! 인터페이스 추가 
		// 냉장고에 문이 열렸으면 멜로디 소리를 나게 하라.
		// 장난감 로봇에 건전지가 거의 없으면 멜로디 소리를 나게 하라.
		
		// 인터페이스 장점 
		// 표준화가 가능 하다. 
		// 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다. 
		// 클래스간에 결합도를 낮춰서 유연한 코드를 설계할 수 있다. 
		
		// 정리 
		// 객체지향 패러다임 핵심 
		// 객체와 객체간에 상호 협력해서 코드를 설계해 나간다 (버스, 지하철, 학생, 스타크래프트)
		// 객체와 객체간에 관계를 정의하여 코드를 설계해 나간다 (상속, 포함관계, 추상클래스, 인터페이스) 다형성(클래스를 다양한 형태로 ) !! 
		
		
	} // end of main 

}
