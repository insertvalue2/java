package ch05;

import java.util.ArrayList;
import java.util.Scanner;

public class InputPhoneNumber {
	
	private ArrayList<String> userName = new ArrayList<>();
	private ArrayList<String> telNumber = new ArrayList<>();
	
	public ArrayList<String> getUserName() {
		return userName;
	}
	
	public ArrayList<String> getTelNumber() {
		return telNumber;
	}
	
	private void inputName(String name) {
		userName.add(name);
	}
	
	private void inputTelNumber(String number) {
		telNumber.add(number);
	}
	
	public void savePhoneNumber() {
		Scanner scanner = new Scanner(System.in);
		String name = "";
		String number = ""; 
		do {
			System.out.println("중지 하려면 -1을 입력 하세요");
			System.out.println("*** 이름을 입력하세요 ***\n");
			name = scanner.nextLine();
			if(!name.equals("-1")) {
				System.out.println("*** 전화번호를 입력하세요 ***\n");
				number = scanner.nextLine();
				inputName(name);
				inputTelNumber(number);
			}
		} while (!name.equals("-1") );
		
//		System.out.println("중지 하려면 -1을 입력 하세요");
//		System.out.println("*** 이름을 입력하세요 ***\n");
//		String name = scanner.nextLine(); 
//		System.out.println("*** 전화번호를 입력하세요 ***\n");
//		String number = scanner.nextLine();
//		inputName(name);
//		inputTelNumber(number);
		scanner.close();
		// name으로 들어 오는 값에 -1이면 입력 정지 
	}
	
	public void showInfo() {
		System.out.println("--------------------------------");
		for (int i = 0; i < userName.size(); i++) {
			System.out.print("[ " + userName.get(i) + " ] :\t  ");
			System.out.println("[ " + telNumber.get(i) + " ]");
		}
		System.out.println("--------------------------------");
	}
	
}
