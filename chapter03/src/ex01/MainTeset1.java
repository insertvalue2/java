package ex01;

public class MainTeset1 {

	public static void main(String[] args) {

		Hero[] heros = new Hero[3];

		heros[0] = new Warrior("전사", 300);
		heros[1] = new Archer("궁수", 200);
		heros[2] = new Wizard("마법사", 100);

		for (int i = 0; i < heros.length; i++) {
			heros[i].attack();

			if (heros[i] instanceof Warrior) {
				Warrior warrior = (Warrior) heros[i];
				warrior.comboAttack();
			} else if (heros[i] instanceof Archer) {
				Archer archer = (Archer) heros[i];
				archer.fireArrow();
			} else if (heros[i] instanceof Wizard) {
				Wizard wizard = (Wizard) heros[i];
				wizard.freezing();
			}

		}

	}

}
