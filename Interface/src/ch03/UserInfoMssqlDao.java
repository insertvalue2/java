package ch03;

public class UserInfoMssqlDao implements UserInfoDao {

	// 인터페이스 추상 메서드를 실제고 구현합니다.
	// 클래스 이름에 마우스를 올려 놓으면 해결 방안을 이클립스가 안내해 줍니다.
	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("MSSQL : 저장하기 " + userInfo.getUserName());
		System.out.println("MSSQL : 저장하기 " + userInfo.getUserId());
		System.out.println("MSSQL : 저장하기 " + userInfo.getPassword());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("MSSQL : 수정하기 " + userInfo.getUserName());
		System.out.println("MSSQL : 수정하기 " + userInfo.getUserId());
		System.out.println("MSSQL : 수정하기 " + userInfo.getPassword());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("MSSQL : 삭제하기 " + userInfo.getUserName());
		System.out.println("MSSQL : 삭제하기 " + userInfo.getUserId());
		System.out.println("MSSQL : 삭제하기 " + userInfo.getPassword());
	}

}
