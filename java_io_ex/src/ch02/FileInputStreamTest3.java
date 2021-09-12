package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("input2.txt")) {
			int i;
			while ((i = fis.read()) != -1) {
				System.out.println((char) i);
			}
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println(e);
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("프로그램이 다운 되지 않았습니다. !!");

	}

}
