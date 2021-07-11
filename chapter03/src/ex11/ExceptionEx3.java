package ex11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class MyException {

	FileInputStream fis;

	public MyException(String fileName) throws IOException {
		readFile(fileName);
	}

	// throws 란 던지기 (사용하는 녀셕이 직접 에러를 처리 해라)
	private String readFile(String fileName) throws IOException {
		fis = new FileInputStream(fileName);
		Properties prop = new Properties();
		prop.load(fis);
		String dbType = prop.getProperty("DBTYPE");
		return dbType;
	}
}

public class ExceptionEx3 {

	public static void main(String[] args) {

		try {
			MyException exception = new MyException("b.txt");
		} catch (IOException e) {
			System.out.println(e.toString());
		}

	}
}
