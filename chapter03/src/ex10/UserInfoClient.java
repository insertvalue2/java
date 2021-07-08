package ex10;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// 5. UserInfo Client 쪽 개발자도 UserInfoDao 인터페이스만 보고 코드를 구현할 수 있습니다. 
public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		// 파일에 값에 따라서 
		// UserInfoMySqlDao 객체를 생성 또는 
		// UserInfoOracleDao 객체를 생성 할수 있도록 만들예정입니다. 
		
		// 1. 파일 만들기 chapter03 프로젝트 계층에서 파일을 만들어 줍니다. 
		// chapter03 클릭 오른쪽 마우스 New --> File 선택 
		// 2. 파일명 db.propertise10 이라고 입력합시다. 
		// 3. 생성된 파일에 DBTYPE=MYSQL 입력해 봅시다. 
		
		// 4 FileInputStream 객체 선언과 동시에 초기화를 합시다. 
		FileInputStream fis = new FileInputStream("db.properties10");
		// 오류표시가 보이면 예외 처리를 해주면 됩니다. (파일이 없을 경우 에러 방지)
		// main 메서드 괄호 옆에 throws IOException 라고 입력 또는 자동완성해 주세요. 
		
		// 5. 파일과 연결된 상태이기 때문에 파일안에 글자를 읽을수 있는 객체를 생성 합니다.
		Properties prop = new Properties(); // key 와 value 타입으로 글자를 읽어주는 객체 입니다. 
		prop.load(fis); // FileInputStream 인스턴스 변수 fis와 Properties 객체를 연결(로드) 합니다. 
		
		// 글자를 가지고 오는 메서드를 실행하고 값을 변수에 담습니다. 
		String dbType = prop.getProperty("DBTYPE");  // MYSQL, ORACLE 값이 담김
		
		// 6. 사용자한테 userInfo 정보를 받습니다. 
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("myUserId");
		userInfo.setPassword("123456!#");
		userInfo.setUserName("홍길동");
		
		
		// UserInfoDao 타입으로 userDao 인스턴스 변수 선언 
		UserInfoDao userDao = null;
		
		if(dbType.equals("MYSQL")) {
			// dbType 변수에 담기 값이 MYSQL과 같다면 실행. 
			userDao = new UserInfoMySqlDao(); // UserInfoMySqlDao 객체 생성(변수에 주소값 입력) 
		} else if(dbType.equals("ORACLE")) {
			userDao = new UserInfoOracleDao(); // UserInfoOracleDao 객체 생성(변수에 주소값 입력)
		} else {
			System.out.println("error support db");
			return; 
		}
		
		// 인터페이스 UserInfoDao 선언된 메서드를 가지고 실행 시켜 봅시다.  
		userDao.insertUserInfo(userInfo);
		userDao.updateUserInfo(userInfo);
		userDao.deleteUserInfo(userInfo);
		
		// DBTYPE=ORACLE 변경해서 실행해 봅시다. 
//		userDao.insertUserInfo(userInfo);
//		userDao.updateUserInfo(userInfo);
//		userDao.deleteUserInfo(userInfo);
		
	}

}
