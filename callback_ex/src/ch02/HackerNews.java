package ch02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HackerNews implements WriteArticle {
	
	private String printDate() {
		// 날짜 형식을 String으로 혹은 String을 날짜 형식으로 변환하기 위한 포맷형식이다.
		DateFormat formater = new SimpleDateFormat("yyyy.MM.dd");
		return formater.format(Calendar.getInstance().getTime());
	}
	
	@Override
	public void printArticle(String article) {
		System.out.println(" *** HackerNews ***");
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("기사 작성일 : " + printDate());
	}
}

