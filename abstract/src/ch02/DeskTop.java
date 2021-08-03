package ch02;

public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("DekTop display");

	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing");

	}

	@Override
	public void turnOff() {
		System.out.println("Desktop turnOff (none abstract override)");
	}

}
