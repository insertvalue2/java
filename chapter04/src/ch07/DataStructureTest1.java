package ch07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Student {
	String name; 
	int grade; 
}

public class DataStructureTest1 {

	public static void main(String[] args) {
		
		List list0; 
		// 중간의 데이터를 추가하거나 삭제가 용이하나 인덱스가 없기 때문에 특정 요소에 
		// 접근할때 순차 탐색이 필요해서 탐색 속도가 떨어진다. 
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		// 순서가 있고(인텍스) 중복이 가능
		ArrayList<Integer> list = new ArrayList();
		ArrayList<Student> members = new ArrayList<Student>();
		ArrayList<Integer> num = new ArrayList<Integer>();
		ArrayList<Integer> num2 = new ArrayList<>();
		// 선언과 동시에 초기화 
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));
		
		// 값 추가 방법 
		list.add(3); // index 0 
		list.add(null); // index 1 
		list.add(1, 10); // index 1에 10을 삽입 (null은 인덱스 2번으로 밀려 남)
		System.out.println("값 추가 확인 : " + list);
		
		// ArrayList 값 삭제 방법 
		list.remove(2);
		System.out.println("값 삭제 확인 remove : " +list);
//		list.clear();
		System.out.println("전체 삭제 확인 : " + list);
		
		// ArrayList 사이즈 확인 
		System.out.println("list 사이즈 확인 : " +  list.size());
		
		// 값 출력 방법 
		System.out.println("값 출력 방법 : " + list.get(1));
		
		// for문 사용방법 
		for (Integer i : list) {
			System.out.println("for 사용벙법 : " + i);
		}
		
		// while 사용방법 
		// 요소 순회 (반복자) 컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는것
		Iterator<Integer>  iter = list.iterator(); 
		// true , false 
		while(iter.hasNext()) {
			System.out.println("while 사용방법 : " + iter.next());
		}
		
		// ArrayList 값 검색 
		// 리스트 안에 값이 있는지 확인 리턴값은 true , false 
		System.out.println(list.contains(1));
		System.out.println(list.contains(10));
		// 값이 있으면 인덱스 값을 반환 없으면 -1을 반환합니다.  
		System.out.println(list.indexOf(3));
		System.out.println(list.indexOf(10));
		System.out.println(list.indexOf(100));
		
		
	}

}
