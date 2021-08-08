//package ch04;
//
//import java.util.ArrayList;
//
//public class ArrayListTest {
//
//	public static void main(String[] args) {
//
//		ArrayList<Book> library = new ArrayList<Book>();
//		library.add(new Book("태백산맥1", "조정래"));
//		library.add(new Book("태백산맥2", "조정래"));
//		library.add(new Book("태백산맥3", "조정래"));
//		library.add(new Book("태백산맥4", "조정래"));
//		library.add(new Book("태백산맥5", "조정래"));
//		
//		System.out.println(library.get(0).title);
//		System.out.println(library.size());
//		System.out.println(library.isEmpty());
//		
//		Book removeBook = library.remove(4);
//		System.out.println(removeBook.title);
//		System.out.println("===========");
//		
//		
//		for(int i = 0; i < library.size(); i++) {
//			library.get(i).showInfo();
//		}
//		
//		library.set(1, new Book("웹툰", "가나다"));
//		library.add(1, new Book("1111", "asdasdas"));
//
//		
//	}
//
//}
