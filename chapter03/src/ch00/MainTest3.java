package ch00;

import java.util.Scanner;

public class MainTest3 {
	
	public static void main(String[] args) {
		
		final int BANANA = 1; 
		final int PEACH = 2; 
		
		System.out.print("바나나 : 1 , 복숭아 : 2 ");
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt(); 
		
		Fruit fruit;
		
		if(userInput == BANANA) {
			 fruit = new Banana(); 
			 fruit.showInfo();
		} else if (userInput == PEACH) {
			fruit = new Peach(); 
			fruit.showInfo();
		}
		
		// 사용자가 입력한 값에 따라서 인스턴스 변수를 쉽게 바꿔 줄 수 있다. 
		
		
	}
}
