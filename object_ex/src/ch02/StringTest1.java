package ch02;

public class StringTest1 {

	public static void main(String[] args) {
		
		// String 선언 방식
		// heap 메모리에 인스턴스로 생성되는 경우 
		String str1 = new String("abc");
		// constant pool (Data, static )에 있는 주소를 참조하는 방식 
		String str2 = "abc";
		
		// 결론 : 힙 메로리는 생성될때마다 다른 주소 값을 가지지만 , 상수 풀의 문자열은 
		// 모두 같은 주소 값을 가짐 
		
		System.out.println(str1 == str2);
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4);
		
		
		
		
		
		
		
	}

}
