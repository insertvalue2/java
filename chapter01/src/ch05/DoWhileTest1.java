package ch05;

import java.util.Scanner;

public class DoWhileTest1 {

	public static void main(String[] args) {
		
		int input = 10; 
		int sum = 0;
		
		do {
			System.out.println("현재 값 : " + input);
			input = input - 1; 
		} while(input != 0); 
		
		
	} // end of main 

} // end of class 
