package ch04;

public class Book {
	String title;
	String author;
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println("title :  " + title);
		System.out.println("author :  " + author);
	}

}
