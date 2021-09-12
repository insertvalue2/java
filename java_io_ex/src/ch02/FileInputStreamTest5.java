package ch02;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest5 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("assets/input2.txt")) {
			byte[] bs = new byte[10];

			fis.read(bs, 0, 5);
			for (byte b : bs) {
				System.out.print((char)b);
			}
			
//			int i;
//			while ( (i = fis.read(bs, 0, 5)) != -1){
//				for(int k= 0; k<i; k++){
//					System.out.print((char)bs[k]);
//				}
//				System.out.println(": " +i + "바이트 읽음" );
//			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
