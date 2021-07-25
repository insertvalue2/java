package ch01;

public class WarriorMainTest {

	// 설계된 클래스를 사용하는 쪽 코딩 
	public static void main(String[] args) {

		Warrior w1 = new Warrior();
		w1.height = 200;
		w1.power = 100;
		w1.name = "전사1";
		w1.color = "빨간색";

		Warrior w2 = new Warrior();
		w2.height = 100;
		w2.power = 50;
		w2.name = "작은전사1";
		w2.color = "초록색";

	} // end of main

}
