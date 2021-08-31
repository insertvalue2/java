package ch01;

public class Wrapper_Ex1 {

	public static void main(String[] args) {
		Integer num = new Integer(17); // 박싱
		Number n1 = 10;
		int n = num.intValue(); // 언박싱
		System.out.println(n);
		 
	}
}
