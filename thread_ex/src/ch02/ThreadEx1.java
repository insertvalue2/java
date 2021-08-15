package ch02;

import java.util.Scanner;

class MyThread1 extends Thread {
	
//	boolean flag = true; 
	
	@Override
	public void run() {
		while (true) {
			System.out.print("-");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx1 {
	// 메인 쓰레드 
	public static void main(String[] args) {
		
		System.out.println("작업자를 생성하겠습니다.");
		// 메인 쓰레가 작업자 생성 
		MyThread1 thread1 = new MyThread1();
		// 워커 1이 작업 시작 (run 메서드 호출) 
		thread1.start();
		
		// 메인 쓰레드가 작업 함 
		System.out.println("중지 0번을 입력 하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		
//		int userInput; 
		if(userInput == 0) {
			thread1.stop(); // deprecated (더이상 사용하지 마시오)
//			thread1.flag = false;
		}
		
//		do {
//			userInput = scanner.nextInt();
//			if(userInput == 0) {
//				thread1.flag = false; 
//			}
//		}while(userInput != 0);
	}
}


