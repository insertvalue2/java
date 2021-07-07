package ch05.domain.userinfo.dao.oracle;

import ch05.domain.userinfo.UserInfo;
import ch05.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

	@Override
	public void insert(UserInfo userInfo) {
		System.out.println("Insert into ORACLE DB userID = " + userInfo.getUserId());
	}

	@Override
	public void update(UserInfo userInfo) {
		System.out.println("Update into ORACLE DB userID = " + userInfo.getUserId());
	}

	@Override
	public void delete(UserInfo userInfo) {
		System.out.println("Delete from ORACLE DB  UserID = " + userInfo.getUserId());
	}

}
