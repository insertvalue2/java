package ch04;

public class UserInfo {

	public String userId;
	public String userPassWord;
	public String userName;
	public String userAddress;
	public String phoneNumber;

	
	// 생성자 오버로딩 연습 
	
	// 기본 생성자 
	public UserInfo() {
		
	}

	public UserInfo(String userId) {
		this.userId = userId;
	}

	public UserInfo(String userId, String userPassWord) {
		this.userId = userId;
		this.userPassWord = userPassWord;
	}
     
	// 1. 
	public UserInfo(String userId, String userPassWord, String userName) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	
	// 2.
	public UserInfo(String userId, String userPassWord, String userName, String userAddress) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
	}

	// 3.
	public UserInfo(String userId, String userPassWord, String userName, String userAddress, String phoneNumber) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phoneNumber = phoneNumber;
	}
	
	
}
