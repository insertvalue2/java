package ch01;

class MyThreadEx2 extends Thread{
	String name; 
	public MyThreadEx2(String name) {
		this.name  = name; 
	}

	@Override
	public void run() {
		int i;
		for(i = 0; i<50; i++) {
			System.out.println(name + " : " + i + "\t");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread());
		System.out.println("메인쓰레드시작");
		MyThreadEx2 th1 = new MyThreadEx2("워커1");
		th1.start();
		
		MyThreadEx2 th2 = new MyThreadEx2("워커2");
		th2.start();
		MyThreadEx2 th3 = new MyThreadEx2("워커3");
		th3.start();
		System.out.println("메인쓰레드종료");
	}

}
