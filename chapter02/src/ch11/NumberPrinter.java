package ch11;

public class NumberPrinter {
	
	private int id;
	//	private static int waitNumber;
	private int waitNumber;
	public NumberPrinter(int id) {
		this.id = id;
		waitNumber = 1;
	}

	// 번호표를 찍어 주세요.
	public void printWaitNumber() {
		System.out.println(id + " 기기의 대기 순번 :" + waitNumber);
		waitNumber++;
	}

}
