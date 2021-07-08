package ex10;

//4. DB 쪽 연결 개발자는 UserInfoDao 인터페이스를 implement 합니다.
public class UserInfoOracleDao implements UserInfoDao {

	// 인터페이스 추상 메서드를 실제고 구현합니다.
	// 클래스 이름에 마우스를 올려 놓으면 해결 방안을 이클립스가 안내해 줍니다.
	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into ORACEL DB userId =' " + userInfo.getUserId() + " ' ");
		System.out.println(" and pwd = ' " + userInfo.getPassword() + " ' ");
		System.out.println(" and userName = ' " + userInfo.getUserName() + " ' ");
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update ORACEL DB userName =' " + userInfo.getUserName() + " ' ");
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete from ORACEL DB userId = ' " + userInfo.getUserId() + " ' ");
	}

}
