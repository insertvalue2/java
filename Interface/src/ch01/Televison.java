package ch01;

public class Televison extends HomeAppliances{


//	int width; 
//	int height; 
//	String color; 
//	
//	public void turnOn() {
//		System.out.println("TV를 켭니다.");
//	}
//	
//	public void turnOff() {
//		System.out.println("TV를 끕니다.");
//	}
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
}
