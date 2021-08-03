package ch03;

public abstract class Car {

	public abstract void drive();

	public abstract void stop();

	// wiper 추후 추가
	//public abstract void wiper();

	public void startCar() {
		System.out.println("시동을 켭니다.");
	}

	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}

	// 후크(hook) 메서드란? (wiper 메서드 사용 이후 확인)
	// 필요하면 사용하는 클래스에서 직업 구현해서 사용 
//	public void washCar() {} 

	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
//		washCar(); 
	}

}
