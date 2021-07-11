//package ex02;
//
//class UserInfo {
//	private String userId;
//	private String password;
//	private String userName;
//	private String phone;
//	private String address;
//
////	public UserInfo(String userName, String password, String userId, String phone) {
////		this.userName = userName;
////		this.password = password;
////		this.userId = userId;
////		this.phone = phone;
////	}
//
//	// 내부 정적(static) 클래스 (이름을 Builder)
//	public static class Builder {
//		// 필수 값
//		private String userId;
//		private String password;
//
//		// 옵션값
//		private String userName;
//		private String phone;
//		private String address;
//
//		public Builder(String userId, String password) {
//			this.userId = userId;
//			this.password = password;
//		}
//
////		public Builder userId(String id) {
////			userId = id; 
////			return this; // . 으로 체이닝을 할 수 있다. 
////		}
////		
////		public Builder password(String pwd) {
////			password = pwd; 
////			return this;
////		}
//
//		public Builder userName(String name) {
//			userName = name;
//			return this;
//		}
//
//		public Builder phone(String ph) {
//			phone = ph;
//			return this;
//		}
//
//		public Builder address(String addr) {
//			address = addr;
//			return this;
//		}
//
//		public UserInfo build() {
//			return new UserInfo(this);
//		}
//	}
//
//	// 생성자 내부 정적 클래스 Builder 클래스 타입을 받음.
//	private UserInfo(Builder builder) {
//		userId = builder.userId;
//		password = builder.password;
//		userName = builder.userName;
//		phone = builder.phone;
//		address = builder.address;
//	}
//
//}
//
//public class BuilderPattenEx {
//	public static void main(String[] args) {
//		// UserInfo info = new UserInfo("홍길동", "123!!", "MyId", "010-xxx-xxxx");
//		UserInfo userInfo = new UserInfo.Builder("MyId", "asd123!")
////				.userId("MyId")
////				.password("123!@")
//				.userName("홍길동")
//				.phone("010-5211-1231")
//				.address("부산시 해운대구")
//				.build();
//	}
//}
