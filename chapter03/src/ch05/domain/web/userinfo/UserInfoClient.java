package ch05.domain.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import ch05.domain.userinfo.UserInfo;
import ch05.domain.userinfo.dao.UserInfoDao;
import ch05.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import ch05.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setName("홍길동");
		userInfo.setUserId("abcde");
		userInfo.setPassword("123!!!");
		
		UserInfoDao userInfoDao  = null; 
		
		if (dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		} else if (dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMysqlDao();
		} else {
			System.out.println("db error");
			return; 
		}
		
		userInfoDao.insert(userInfo);
		userInfoDao.update(userInfo);
		userInfoDao.delete(userInfo);
		
	}
	
}
