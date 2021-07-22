package ch03;

public class MainTest7 {

	public static void main(String[] args) {

		// 복합 대입 연산자
		// 대입 연산자와 다른연사자가 함께 사용

		int num1 = 1;
		num1 = num1 + 10;
		System.out.println(num1);
		// 조금더 간편하게 사용할 수 있다.
		num1 = 1;

		num1 += 10;
		// num1 = num1 + 10; 같음
		System.out.println(num1);

		System.out.println("===========");

		int num2 = 1;
		num2 = num2 - 10;

		System.out.println(num2);
		num2 = 1;

		num2 -= 10;
		// num2 = num2 - 10;
		System.out.println(num2);

		System.out.println("===========");
		num1 *= 2;
		System.out.println(num1);
		System.out.println("===========");
		num2 /= 2;
		System.out.println(num2);
		System.out.println("===========");
		num2 %= 2;
		System.out.println(num2);
	}

}
