package ch13;

import java.util.Random;

public class MainTest1 {

	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("질럿1");
//		zealot1.showInfo();
		
		Marine marine1 = new Marine("마린1");
//		marine1.showInfo();
		
		Zergling zergling1 = new Zergling("저글링1");
//		zealot1.showInfo();
		
		
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		marine1.showInfo();
		
		marine1.attackZealot(zealot1);
		marine1.attackZealot(zealot1);
		zealot1.showInfo();
		
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);

		marine1.showInfo();
		
	}

}
