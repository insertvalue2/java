package ch05;

public class Warrior {
	
	String name;
	int hp;

	public Warrior(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public void attack() {
		System.out.println(" 기본 공격 ");
	}
	
}
