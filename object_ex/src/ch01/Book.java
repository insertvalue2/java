package ch01;

class Book {
	private int bookId;
	private String title;
	private String author;

	public Book(int id, String title, String author) {
		this.bookId = id;
		this.title = title;
		this.author = author;
	}

	// toString 메서드 재정의
	@Override
	public String toString() {
		return bookId + "," + title + "," + author;
	}

	// equals 메서드 재정의
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Book) { // --> true 이면 if 안에 로직 실행
			Book tempBook = (Book) obj;
			if (this.title == tempBook.title && this.author == tempBook.author) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

//	@Override
//	public int hashCode() {
//		return bookId; 
//	}

}
