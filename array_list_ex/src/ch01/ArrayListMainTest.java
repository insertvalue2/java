package ch01;

import java.util.ArrayList;

public class ArrayListMainTest {
	
	public static void main(String[] args) {
		
		Book book1 = new Book(1, "흐르는강물처럼", "파울로코엘료");
		Book book2 = new Book(2, "플러터UI실전", "김근호");
		Book book3 = new Book(3, "무궁화꽃이피었습니다", "김진명");
		Book book4 = new Book(4, "리딩으로리드하라", "이지성");
		Book book5 = new Book(5, "사피엔스", "유발하라리");
		
		
		// ArrayList 선언 
		// 사용방법 
		
		// 선언방법 
		ArrayList<Book> shoppingCart = new ArrayList<Book>(); 
		
		// 값 넣기 3개만 넣어 봅시다. 
		shoppingCart.add(book1); 
		shoppingCart.add(book2); 
		shoppingCart.add(book3);
		
		//  화면에 출력 
		for (int i = 0; i < shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}
		
		// shoppingCart 에 데이터를 추가 단. 엘리먼트를 제일 먼저 출력할 수 있도록 
		shoppingCart.add(0, book5);
		
		System.out.println("----------------------");
		for (Book book : shoppingCart) {
			book.showInfo();
		}
		
		// 삭제하기 
//		shoppingCart.remove(3);
		// size() 메서드 응용     // ArrayList 크기는 4, 마지막 인덱스의 번호는 3 
		shoppingCart.remove(shoppingCart.size() - 1);
		
		System.out.println("----------------------");
		for (Book book : shoppingCart) {
			book.showInfo();
		}
		
		// 수정하기 
		shoppingCart.set(0, book4);
		
		System.out.println("----------------------");
		for (Book book : shoppingCart) {
			book.showInfo();
		}
		
		// C R U D 
		// create read update delete 
	}
}
