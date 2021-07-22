package ch05;

public class WhileMainTest1 {

	public static void main(String[] args) throws InterruptedException {

		int num = 1; 
		
		while(num < 10) {
			System.out.println(" 현재 값 : " + num);
			num++;  // <--  num = num + 1; (같음)  
			Thread.sleep(1000);
		}
		
		
	} // end of main
	
} // end of class
