package ch07;

public class Bank {
	
	// 정보은닉 
	private int balance;

	// 입금
	public void deposit(int money) {
		this.balance += money;
		// this.balance = this.balance + money; 
	}

	// 출금
	public void withdraw(int money) {
		this.balance -= money;
	}

	public void showInfo() {
		System.out.println("현재 잔액은 : " + this.balance + "입니다.");
	}
	
	// private로 선언한 멤버 변수는 외부에서 바로 접근해서 확인할수 없기 때문에 
	// 일반적으로 get() 메서드를 만들어서 외부에서 확인할 수 있도록 구현 한다. 
	public int getBalance() {
		return this.balance; 
	}
	
	// 반대로 멤버 변수에 값을 넣을수 있는 기능을 만들고 싶다면 
	// 일반적으로 set() 메서드를 제공해서 외부에서 접근할 수 있도록 한다. 
	public void setBalance(int balance) {
		if(balance < 0) {
			System.out.println("잘못된 입력 입니다.");
		} else {
			this.balance = balance; 
		}
//		this.balance = balance;
	}
	

}
