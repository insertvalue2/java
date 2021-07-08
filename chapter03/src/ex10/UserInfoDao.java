package ex10;

// 2. UserInfoDao 인터페이스를 선언 하고 추상 메서드 선언을 합니다.  
public interface UserInfoDao {
	
	// 클라이언트 쪽 개발자는 인터페이스만 보고 기능을 구현할 수 있습니다. 
	// DB 쪽 연결 기능을 구현하는 개발자도 인터페이스만 보고 기능을 구현할 수 있습니다. 
	// 둘다 매개 변수로 UserInfo 객체만 넘겨주면(인스턴스 변수) 프로그램이 실행할 수 있도록 처리 
	// 처리 하겠다는 의미 입니다. 
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
}
