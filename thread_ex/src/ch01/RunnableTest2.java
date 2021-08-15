package ch01;

import javax.swing.JFrame;

class MyRunable2 extends JFrame {
	
	int grade = 10; 
	
	public MyRunable2() {
		runable.run();
	}
	
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
	}

}
