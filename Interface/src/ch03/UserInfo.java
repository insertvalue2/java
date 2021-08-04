package ch03;

// 1 UserInfo 클래스를 만들어 줍니다. 
public class UserInfo {
	private String userId;
	private String password;
	private String userName;

	// 멤버 변수가 접근 지시 제어자가
	// private 이기 때문에 getter, setter 메서드를 만들어 줍니다.

	// 단축키 Alt + Shift + s --> Generate getter and setter 클릭 
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
