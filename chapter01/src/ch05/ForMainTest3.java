package ch05;

public class ForMainTest3 {

	public static void main(String[] args) {
		// num 값이 반복 2 부터 9 까지
		for (int num = 2; num <= 9; num++) {
			// i 값이 반복 1 부터 9 까지
			for (int i = 1; i <= 9; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			} // end of for - i
			System.out.println("-----------------");
		} // end of for - num
	} 
} 
