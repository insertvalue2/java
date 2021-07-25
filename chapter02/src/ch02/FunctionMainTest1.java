package ch02;

public class FunctionMainTest1 {

	// main 함수 (코드의 시작점)
	public static void main(String[] args) {

		int addResult1 = add(77, 33);
		System.out.println(addResult1);
		int addResult2 = add(10, 30);
		System.out.println(addResult2);

	}

	// add 함수 생성
	public static int add(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result; // 리턴 키워드를 만났을 때 제어권을 반환 
//		int a = 10 + 100; 
	}

}
