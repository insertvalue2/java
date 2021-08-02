package ch02;

public class MainTeset1 {

	public static void main(String[] args) {

		
		Warrior warrior1 = new Warrior("광전사", 200);
		warrior1.attack();
		warrior1.comboAttack();
		
		Archer archer = new Archer("궁수", 80);
		archer.attack();
		archer.fireArrow();
		
		Wizard wizard = new Wizard("마법사", 100);
		wizard.attack();
		wizard.freezing();

	}

}
