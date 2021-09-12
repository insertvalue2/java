package ch01;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			// 바이트를 문자로 변경해주는 녀석 
			// 바이트 단위로 읽는 녀셕을 문자 단위로 읽어 들이게 하는 녀셕 --> 보조 스트림 
			//InputStreamReader irs = new InputStreamReader(System.in);
//			while( (i = irs.read()) != '\n' ) {
			while( (i = System.in.read()) != '\n' ) {
				// 화면에 출력 
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
