package ex11;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class MyException {

	String fileName; 
	
	public MyException(String fileName) {
		this.fileName = fileName; 
	}

	// throws 란 던지기 (사용하는 녀셕이 직접 에러를 처리 해라)
	public String readFile() throws IOException {
		FileInputStream fis = new FileInputStream(fileName);
		Properties prop = new Properties();
		prop.load(fis);
		String dbType = prop.getProperty("DBTYPE");
		return dbType;
	}

}

public class ExceptionEx3 {

	public static void main(String[] args) {
		
		// 객체 생성 
		MyException exception = new MyException("a.txt");
		try {
			exception.readFile();
		} catch (IOException e) {
			System.out.println("파일이 없나요? " + e.toString());
		}
	}
}
