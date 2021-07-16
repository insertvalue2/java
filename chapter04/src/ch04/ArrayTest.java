package ch04;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
		System.out.println(list.contains(1)); //list에 1이 있는지 검색 : true
		System.out.println(list.indexOf(1)); //1이 있는 index반환 없으면 -1
	
	}

}
