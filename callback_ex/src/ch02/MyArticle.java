package ch02;

public class MyArticle {

	String article;
	WriteArticle writeArticle; 
	
	// 주소값 연결 
	public MyArticle(String article, WriteArticle writeArticle) {
		this.article = article;
		this.writeArticle = writeArticle; 
	}

	public void complete() {
		writeArticle.printArticle(article);
	}

}
