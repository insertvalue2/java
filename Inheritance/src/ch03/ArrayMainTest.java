package ch03;

public class ArrayMainTest {

	public static void main(String[] args) {

		
		// 배열이란 연관된 데이터를 모아서 통으로 관리하기 위해서 사용하는 데이터 타입이다. 
		// 변수가 하나의 데이터를 저장하기 위한 것이라면 배열은 여러개의 
		// 데이터를 하나의 변수에 저장하기 위한 것 이라고 할 수 있다. 
		
		// 선언 방법 
		int[] arr1 = new int[3];
		int arr2[] = new int[10];
		
		// 초기화 방법 
		arr1[0] = 33;
		arr1[1] = 10; 
		arr2[2] = 11; 
				
		
		// 배열 선언과 초기화 동시에 하기 
		int[] numbers1 = new int[] {10, 20, 30}; // 개수를 생략해야 함.
		int[] numbers2 = {10, 20, 30}; // new int[] 생략 가능 
		int[] ids; 
		ids =  new int[] {10, 20, 30};
		
		
		String[] strArr = new String[10];
		System.out.println(strArr.length);
		
		strArr[0] = "야스오";
		strArr[1] = "티모";
		strArr[2] = "애쉬";
		strArr[3] = "다리우스";

		// 배열에 크기와 원소의(Element) 개수는 다를 수 있다.
		for (int i = 0; i < strArr.length; i++) {
//			System.out.println(strArr[i]);
			if (strArr[i] != null) {
				System.out.println(strArr[i]);
			} // end of if
		} // end of for
		
		// 모든 프로그래밍 언어에 index는 0부터 시작한다. 
		// index 의 크기 n - 1 개 

	}

}
