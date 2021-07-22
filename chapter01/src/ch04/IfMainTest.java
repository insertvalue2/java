package ch04;

import java.util.Scanner;

public class IfMainTest {

	public static void main(String[] args) {
		
		// 제어문 if 
		// 주어진 조건에 따라서 실행이 이루어 지도록 구현 
		// 만약 ... 이라면 
		
		boolean flag = true;

		// if 문 단독
		if (flag) {
			System.out.println("조건식이 true 이면 실행 됩니다.");
		}

		// if else 문
		if (flag) {
			System.out.println("true 실행");
		} else {
			System.out.println("false 실행 ");
		}

		// if else if else 문
//		System.out.println("성적을 입력하세요 : ");
//		Scanner sc = new Scanner(System.in);
//		int point = sc.nextInt(); // 정수 입력받기 
		int point = 70;
		
		if (point >= 90) {
			System.out.println("A 학점 입니다.");
		} else if (point >= 80) {
			System.out.println("B 학점 입니다.");
		} else if (point >= 70) {
			System.out.println("C 학점 입니다.");
		} else if (point >= 60) {
			System.out.println("D 학점 입니다.");
		} else {
			System.out.println("F 학점 입니다.");
		}

		

	} // end of main

} // end of class
