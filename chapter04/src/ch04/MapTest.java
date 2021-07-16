package ch04;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		
		HashMap<String,String> map1 = new HashMap<String,String>();//HashMap생성
		HashMap<String,String> map2 = new HashMap<>();//new에서 타입 파라미터 생략가능
		HashMap<String,String> map3 = new HashMap<>(map1);//map1의 모든 값을 가진 HashMap생성
		HashMap<String,String> map4 = new HashMap<String,String>(){{//초기값 지정
		    put("A","에이");
		    put("B","비");
		    put("C","씨");
		}};
	}
}
