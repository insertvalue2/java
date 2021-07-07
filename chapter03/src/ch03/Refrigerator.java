package ch03;

public class Refrigerator implements RemoteControl, SoundEffect {

	@Override
	public void turnOn() {
		System.out.println("냉장고 ON");
	}

	@Override
	public void turnOff() {
		System.out.println("냉장고 OFF (음식 상함)");
		notification();
	}

	@Override
	public void notification() {
		System.out.println("띠링 띠링 ~~~~ ");
		
	}

}
