package ch02;

// 작업자들이 자원(데이터)을 공유하는 상황일 때 처리 방법 
class BankAccount {

	int money = 100_000;

	// getter
	public int getMoney() {
		return this.money;
	}

	// setter
	public void setMoney(int money) {
		if (money <= 0) {
			System.out.println("잘못된 입력 입니다.");
		} else {
			this.money = money;
		}
	}

	// 입금 기능
	public synchronized void saveMoney(int money) {
		// 10만원 상태
		int currnetMoney = getMoney();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		setMoney(currnetMoney + money);
		System.out.println("입금 후 계좌 잔액 : " + getMoney());
	}

	// 출금 기능
	public synchronized void withdrawMoney(int money) {
		// 10만원 상태
		int currnetMoney = getMoney();
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (currnetMoney >= money) {
			setMoney(currnetMoney - money);
			System.out.println("출금후 계좌 잔액 : " + getMoney());
		} else {
			System.out.println("잘못된 입력 입니다.");
		}
	}
}

// 아빠 (경기도 편의점 앞에서 입금을 합니다. 네트워크가 느려서 시간이 걸림) 
class Father extends Thread {

	BankAccount account;

	public Father(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		// 임금 하기
		account.saveMoney(10_000);
	}
}

// 엄마 (장을 보기 위해 은행에 가서 직접 출금 합니다) 
class Mother extends Thread {
	BankAccount account;

	public Mother(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		// 출금하기
		account.withdrawMoney(5_000);
	}
}

public class SharedResource {

	public static void main(String[] args) {
		// 현재 10만원이 저금 되어 있는 상태로 객체 생성
		BankAccount account = new BankAccount();

		Father father = new Father(account);
		Mother mother = new Mother(account);
		// 아빠 입금하는 동작 시작
		father.start();
		// 엄바 출금하는 동작 시작
		mother.start();
		// 정상 처리 금액 : 10만원 + 1만원 - 5천원 = 10만 5천원
		// 결과값은 : 11000 ???
		// 임계 영역이 발생 될때는 (작업자간에 자원을 공유하는 상태)
		// 현재 자원(데이터)를 사용하고 있기 때문에 보호 처리를 해주어야 한다.
		// 다른 작업자가 사용하지 못하도록 lock을 걸어 준다.
		// 하는 방법 - 동기화 처리를 한다. (synchronization)
		// 1. synchronized 메서드
		// 2. synchronized 블록
	}

}
