package ch07;

class OutClass {

	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;

	public OutClass() {
		inClass = new InClass(); // 내부 클래스 생성
	}

	private class InClass {
		
		int inNum = 100;
		// static int sInNum = 200; //에러 남

		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
		}

		// static void sTest(){ //에러 남

		// }

	} // end of InClass (블록에 유요한 범위 확인)

	public void usingClass() {
		inClass.inTest(); // 내부 클래스 변수를 사용하여 메서드 호출하기
	}

} // end of OutClass (블록에 유요한 범위 확인)


// 실행해보는 InnerTest 클래스 
public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass(); // 내부 클래스 기능 호출
		System.out.println();

//     내부 클래스에 private 선언하면 사용 불가  	    
//		OutClass.InClass inClass = outClass.new InClass();   // 외부 클래스를 이용하여 내부 클래스 생성
//		System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
//		inClass.inTest();
	}

} //  end of InnerTest 


