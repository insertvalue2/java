package ch13;

public class Zergling {

	private String name;
	private int power;
	private int hp;

	public Zergling(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 100;
	}

	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public int getHp() {
		return hp;
	}

	public void showInfo() {
		System.out.println("=====정보창(" + name + ")======");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("==============");
	}

	// 공격 합니다. 다른객체와 상호 작용 - 메서드로 참조 변수 전달 방법
	public void attackZealot(Zealot zealot) {
		System.out.println(this.name + " 이 질럿을 공격합니다.");
		zealot.beAttacked(this.power);
	}

	public void attackMarine(Marine marine) {
		System.out.println(this.name + " 이 마린을 공격합니다.");
		marine.beAttacked(this.power);
	}

	// 메서드 오버로딩을 이용해 봅시다.
	public void attack(Zealot zealot) {
		System.out.println(this.name + "이 " + zealot.getName() + "을 공격합니다.");
		zealot.beAttacked(this.power);
	}

	public void attack(Zergling zergling) {
		System.out.println("자기 자신 또는 같은 편은 공격할 수 없습니다.");
	}

	public void attack(Marine marine) {
		System.out.println(this.name + "이 " + marine.getName() + "을 공격합니다.");
		marine.beAttacked(this.power);
	}

	// 공격 당합니다.
	public void beAttacked(int power) {
		this.hp -= power;
		if (this.hp <= 0) {
			System.out.println(this.name + "은 사망하였습니다.");
			this.hp = 0;
		}
	}

}
