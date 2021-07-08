package ch06.domain.userinfo.dao.oracle;

import ch06.domain.userinfo.UserInfo;
import ch06.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.print("insert into ORACLE DB userId = " + userInfo.getUserId());
		System.out.print(" and userName = " + userInfo.getUserName());
		System.out.print(" and userPasswd = " + userInfo.getPasswd());
		System.out.println();
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.print("update into ORACLE DB userId = " + userInfo.getUserId());
		System.out.print(" and userName = " + userInfo.getUserName());
		System.out.print(" and userPasswd = " + userInfo.getPasswd());
		System.out.println();
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delte from ORACLE DB userId = " + userInfo.getUserId());
		System.out.println();
		
	}
	
	
	
}
