package ch02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest4 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("assets/input2.txt")) {

			byte[] bs = new byte[10];
			int i;
			while ((i = fis.read(bs)) != -1) {
				
//				for (byte b : bs) {
//					System.out.print((char) b);
//				}
				
				for (int j = 0; j < i; j++) {
//					System.out.println(bs[j]);
					System.out.print((char) bs[j]);
				}
				System.out.println(": " + i + "바이트 읽음");
			}

			/*
			 * while ( (i = fis.read(bs, 1, 9)) != -1){ for(int k= 0; k<i; k++){
			 * System.out.print((char)bs[k]); } System.out.println(": " +i + "바이트 읽음" ); }
			 */
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
