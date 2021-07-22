package ch05;

public class BreakTest1 {

	public static void main(String[] args) {
		
		// 예약어  break  
		// 중간에 멈추는 break 
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i);

			if (i % 7 == 0) {
				break;
			} // end of if
		} // end of for

	} // end of main
} // end of class
