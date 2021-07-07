package ch05.domain.userinfo.dao;

import ch05.domain.userinfo.UserInfo;

public interface UserInfoDao {
	
	void insert(UserInfo userInfo);
	void update(UserInfo userInfo);
	void delete(UserInfo userInfo);
	
}
