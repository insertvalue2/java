package ch01;

public class ThreadTest1 {
	
	// 메인 쓰레드 
	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
//			System.out.print(i +  "\t");
			System.out.print("-");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
