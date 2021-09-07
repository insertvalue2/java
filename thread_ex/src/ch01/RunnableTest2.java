package ch01;

import javax.swing.JFrame;

class MyRunable2 extends JFrame {
	
	int grade = 10; 
	
	public MyRunable2() {
		// 객체 생성시 바로 동작 하는 방법 
//		runable.run();
	}
	
	// 자바 문법 
	// 내부 익명 객체를 변수에 담기 
	Runnable runable = new Runnable() {
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.print("--");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	};
}

public class RunnableTest2 {

	public static void main(String[] args) {
		MyRunable2 myRunable = new MyRunable2();
		// 외부에서 동작 시키는 방법 
		myRunable.runable.run();
	}

}
