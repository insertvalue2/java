package ch01;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");

		int i;
		try {
			// 한 바이트씩 키보드에 입력값을 읽어라 
			i = System.in.read();
			// 출력 
			System.out.println(i);
			System.out.println((char) i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
