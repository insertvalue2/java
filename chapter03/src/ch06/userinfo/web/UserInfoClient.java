package ch06.userinfo.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch06.domain.userinfo.UserInfo;
import ch06.domain.userinfo.dao.UserInfoDao;
import ch06.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch06.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		// MYSQL, ORACLE
		String dbType = prop.getProperty("DBTYPE");
		
		// 값을 전달 받음 
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("myId");
		userInfo.setUserName("홍길동");
		userInfo.setPasswd("12345");
		
		
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		} else if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		} else {
			System.out.println("db support error");
			return; 
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
		
	}
}
