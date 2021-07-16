package ch03;

// Shared ReSource 상태가 되었을 때 
class Bank {

	int money = 10000;

	public int getMoney() {
		return money;

	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 1. synchronized 메서드 방법
	// 2. synchronized 블록 방법
	public void saveMoney(int money) {
		int m = getMoney();
		try {
			System.out.println(Thread.currentThread());
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(m + money);
		System.out.println("입금 후 계좌 잔고 : " + getMoney());
	}

	public void minusMoney(int money) {
		int m = getMoney();

		try {
			System.out.println(Thread.currentThread());
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setMoney(m - money);
		System.out.println("출금 후 계좌 잔고 : " + getMoney());
	}
}

class Father extends Thread {

	Bank bank;

	public Father(Bank bank) {
		this.bank = bank;
	}

	@Override
	public void run() {
		bank.saveMoney(5000);
	}
}

class Mother extends Thread {

	Bank bank;

	public Mother(Bank bank) {
		this.bank = bank;
	}

	@Override
	public void run() {
		bank.minusMoney(3000);
	}
}

////////////////////////////////////////////////////////////
public class MainTest1 {
	// 메인 쓰레드
	public static void main(String[] args) {
		Bank bank = new Bank();
		Father father = new Father(bank);
		Mother mother = new Mother(bank);

		father.start();
		mother.start();

		for (int i = 0; i < 100; i++) {

			System.out.print("-");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
