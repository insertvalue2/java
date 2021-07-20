package ch01;

public class DataType2 {

	public static void main(String[] args) {
		
		// 기본 자료형 
		// 문자 타자형 
		char name;  // 2바이트 공간에 문자를 담을 수 있는 변수 입니다. (name)
		char a; 
		char initial;
		
		// 값을 초기화 하는 방법 (넣는 방법) 
		name = 'A'; // 혿따옴표를 사용하고 단 한글자만 변수에 저장할 수 있다. 
		//name = 'AB'; <- 하나 이상에 문자는 저장할 수 없다 (문자열 String을 사용한다.) 
		a = 'B';
		initial = 'C';
		System.out.println(name);
		System.out.println(a);
		System.out.println(initial);
		System.out.println("====================");
		
		System.out.println('a');
		System.out.println('b');
		System.out.println('c');
		
		name = 'K';
		System.out.println(name);

	} // end of main 

} // end of class
