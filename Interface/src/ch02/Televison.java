package ch02;

public class Televison extends HomeAppliances implements RemoteController   {
	
	// HomeAppliances RemoteController 구현후 추가해서 설명 
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

}
