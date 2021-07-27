package ch07;

public class BankMainTest {

	public static void main(String[] args) {
		
		Bank bank = new Bank(); 
		// 멤버 변수에 성질 확인
		//System.out.println(bank.balance);
		// int : 0
		// double : 0.0
		// String : null 
			
		// 입금을 합니다. 
		bank.deposit(10_000);
		bank.showInfo();
		
		// 출금을 합니다. 
		bank.withdraw(5_000);
		bank.showInfo();
		
		// 신입이 실수로 멤버 변수에 바로 접근해서 잔액을 수정함. 
		// bank.balance = 100_000;
		// set 메서드는 개발자가 필요에 따라 만들어 줄 수 있다.
		// 로직으로 입력값에 대한 검증이 가능하다.  
		bank.setBalance(-1000);
		bank.showInfo();
		
		// 접근제어지시자로 막을 수 있다. 
		// 4가지 :
		// public - 누구나 접근을 허용하게 한다. 
		// default - 같은 패키지 내에서 접근을 허용한다. 
		// protected - 상속관계에서 접근을 허용한다. 
		// private - 같은 클래스 내에서만 접근을 허용한다. 
	}

}
