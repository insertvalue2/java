package ch06.domain.userinfo.dao.mysql;

import ch06.domain.userinfo.UserInfo;
import ch06.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into MYSQL DB userId = " + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo uesrInfo) {
		System.out.println("update into MYSQL DB userId = " + uesrInfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete from MYSQL DB userId = " + userInfo.getUserId());
		
	}
	
	
}
