package ch13;

import java.util.Random;

public class MainTest2 {

	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("질럿1");
		Marine marine1 = new Marine("마린1");
		Zergling zergling1 = new Zergling("저글링1");
		
//		zealot1.attack(marine1);
//		zealot1.attack(zergling1);
//		zealot1.attack(zealot1);
		
		final int ZEALOT = 1; 
		final int MARINE = 2; 
		final int ZERGLING = 3;
		
		Random random = new Random(); 
		int number = random.nextInt(3) + 1; 
		
		if(ZEALOT == number) {
			zealot1.attack(marine1);
			zealot1.attack(zergling1);
		} else if (MARINE == number ) {
			marine1.attack(zealot1);
			marine1.attack(zergling1);
		} else if (ZERGLING == number){
			zergling1.attack(marine1);
			zergling1.attack(zealot1);
		}
		
		zealot1.showInfo();
		marine1.showInfo();
		zergling1.showInfo();

	}

}
