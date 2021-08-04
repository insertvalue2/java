package ch03;

// 최고 선임 개발자가 인터페이스를 설계해서 
// 여러분 한테 클라이언트 쪽 코딩을 맡김 
// 여러분의 동기, 동료한테 DB 쪽 연결 코딩을 맡김 
// 인터페이스 (규약, 약속) 을 만들어 놓지 않는다면 
// 한쪽 개발자가 작업이 끝날때까지 기다려하 한다 
// 즉 개발시간 증가 --> 개발 비용증가  
public interface UserInfoDao {
	
	// 클라이언트 쪽 개발자는 인터페이스만 보고 기능을 구현할 수 있습니다. 
	// DB 쪽 연결 기능을 구현하는 개발자도 인터페이스만 보고 기능을 구현할 수 있습니다. 
	// 둘다 매개 변수로 UserInfo 객체만 넘겨주면(인스턴스 변수) 프로그램이 실행할 수 있도록 처리 
	// 처리 하겠다는 의미 입니다. 
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
}
