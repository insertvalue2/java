package ch02;

public class ToyRobot implements RemoteController, SoundEffect {

	String name; 
	
	public ToyRobot() {
		this.name = "건담로봇";
	}
	
	@Override
	public void turnOn() {
		System.out.println("장난감 로봇을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("장난감 로봇을 끕니다.");
	}

	// 문제 3번까지 완성 후 추가
	@Override
	public void notification() {
		System.out.println("두두두 쾅 ~~ #@");
	}
	
}
