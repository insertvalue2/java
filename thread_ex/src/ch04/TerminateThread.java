package ch04;

import java.util.Scanner;

class MyThread extends Thread {
//	boolean flag = true; 
	@Override
	public void run() {
		while (true) {
			System.out.print("-");
			try {
				Thread.sleep(300);
				// interrupt()
				// Thread가 join(), sleep(), wait() 함수에의해 not-runnable 상태일 때
				// interrupt() 메서드를 호출하면 다시 runnable 상태가 될 수 있음
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class TerminateThread {
	public static void main(String[] args) {

		System.out.println("작업자를 생성하겠습니다.");
		// 메인 쓰레가 작업자 생성
		MyThread thread1 = new MyThread();
		// 워커 1이 작업 시작 (run 메서드 호출)
		thread1.start();

		// 메인 쓰레드가 작업 함
		System.out.println("중지 0번을 입력 하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();

//		int userInput; 
		if (userInput == 0) {
			thread1.stop(); // deprecated (더이상 사용하지 마시오)
//			thread1.flag = false;
		}
		
//     do while 문 연습
		
//		do {
//			userInput = scanner.nextInt();
//			if(userInput == 0) {
//				thread1.flag = false; 
//			}
//		}while(userInput != 0);

	}
}
