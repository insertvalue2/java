package ch06;

public class HackerNewsMainTest {

	public static void main(String[] args) {
	
		// 해커 뉴스 객체 생성
		HackerNews hackerNews = new HackerNews();
		
		// 기사 작성 ( hackerNews 인스턴스 변수 전달 )
		MyArticle article = new MyArticle("오늘 날씨가 40도가 훌쩍 넘어가고 있습니다. ", hackerNews);
		article.complete();
	}

}
