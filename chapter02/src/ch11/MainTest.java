package ch11;

public class MainTest {

	public static void main(String[] args) {

		NumberPrinter nuberPrinter1 = new NumberPrinter(1);
		NumberPrinter nuberPrinter2 = new NumberPrinter(2);
		
		// NumberPrinter nuberPrinter3 = new NumberPrinter(3);

		
		// 왼쪽 프린터기에 사람이 대기표를 뽑았다.
		nuberPrinter1.printWaitNumber();
		nuberPrinter1.printWaitNumber();
		nuberPrinter1.printWaitNumber();
		nuberPrinter1.printWaitNumber();

		// 오른쪽
		nuberPrinter2.printWaitNumber();
		nuberPrinter2.printWaitNumber();
		nuberPrinter2.printWaitNumber();

		// 가운데 
//		nuberPrinter3.printWaitNumber();
	}

}
