package ch05.domain.userinfo.dao.mysql;

import ch05.domain.userinfo.UserInfo;
import ch05.domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {

	@Override
	public void insert(UserInfo userInfo) {
		System.out.println("Insert into MySQL DB userId = " + userInfo.getUserId());
	}

	@Override
	public void update(UserInfo userInfo) {
		System.out.println("Update into MySQL DB userId = " + userInfo.getUserId());
	}

	@Override
	public void delete(UserInfo userInfo) {
		System.out.println("Delete From MySQL DB userId = " + userInfo.getUserId());
	}
	
}
