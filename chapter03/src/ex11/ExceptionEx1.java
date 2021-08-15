package ex11;

public class ExceptionEx1 {

	public static void main(String[] args) {
	
		int[] arr = { 1,  2,  3, 4,  5 };

//		for (int i = 0; i < 10; i++) {
//			System.out.println(arr[i]);
//		}
		
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		System.out.println("비정상 종료되지 않았습니다.");

	}

}
