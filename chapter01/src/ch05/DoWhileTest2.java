package ch05;

import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input;
		int sum = 0;
		System.out.println("덧셈값 정수를 입력하세요 :");
		do {
			input = sc.nextInt();
			sum += input;
		} while (input != 0);

		System.out.println("결과값은 : " + sum);

	} // end of main

} // end of class
