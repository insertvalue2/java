package ch01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //입력받은 정수 N
		String result = ""; //출력할 값
		
		for(int i=n; i>0; i/=2) {
			result = String.valueOf(i%2) + result;
		}
		
		System.out.println(result);
		//System.out.println(Integer.toBinaryString(sc.nextInt()));
	}
		
}
