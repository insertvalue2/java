package ch02;

public class Refrigerator extends HomeAppliances implements RemoteController, SoundEffect {

	@Override
	public void turnOn() {
		System.out.println("냉장고를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("냉자고를 끕니다.");
	}
    
	
	// 문제 3번까지 완성 후 추가 
	@Override
	public void notification() {
		System.out.println("따리리 리리리 ~!@#");
	}
}
