package ch03;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// UserInfo Client 쪽 개발자도 UserInfoDao 인터페이스만 보고 코드를 구현할 수 있습니다. 
public class UserInfoClient {

	// DBTYPE 설정 
//	public static String DBTYPE = "MYSQL";
	public static String DBTYPE = "ORACLE";
	
	// 문제 1 DBTYPE = MSSQL로 변경 
	
	// 메인함수 (코드의 시작점) 
	public static void main(String[] args)  {
		// 사용자한테 userInfo 정보를 받습니다.
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("myUserId");
		userInfo.setPassword("123456!#");
		userInfo.setUserName("홍길동");
		
		// 인터페이스 활용 
		// UserInfoDao 타입으로 userDao 인스턴스 변수 선언
		UserInfoDao userDao = null;

		// 문제 1.  if else 문 추가 
		if (DBTYPE.equals("MYSQL")) {
			// dbType 변수에 담기 값이 MYSQL과 같다면 실행.
			userDao = new UserInfoMySqlDao(); // UserInfoMySqlDao 객체 생성(변수에 주소값 입력)
		} else if (DBTYPE.equals("ORACLE")) {
			userDao = new UserInfoOracleDao(); // UserInfoOracleDao 객체 생성(변수에 주소값 입력)
		} else {
			System.out.println("error support db");
			return;
		}

		// 인터페이스 UserInfoDao 선언된 메서드를 가지고 실행 시켜 봅시다.
		userDao.insertUserInfo(userInfo);
		userDao.updateUserInfo(userInfo);
		userDao.deleteUserInfo(userInfo);

		// 문제 1 인터페이스 만들기 
		// UserInfoMssqlDao

	} // end of main 

} // end of class 
