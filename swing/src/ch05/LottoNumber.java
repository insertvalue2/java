package ch05;

import java.util.Arrays;
import java.util.Random;

public class LottoNumber {

	static final int LOTTO_NUM_SIZE = 6;

	public int[] getLottoNumber() {
		// 번호를 담을 공간 만들기
		int[] numbers = new int[LOTTO_NUM_SIZE];  
		Random random = new Random(); 
		
		for (int i = 0; i < numbers.length; i++) {
			int selectedNumber = random.nextInt(45) + 1;
			numbers[i] = selectedNumber;
			// i -> 0 (동작 x) 
			// i -> 1(번호가 두개 담겨진 상태)  ( J : 0 번째 동작 )
			// i값의 1번째 인덱스와 0번째 인덱스가 같은 값인지 확인
			// i값이 2번째 인덱스와 0, 1, 인덱스가 같은 값인지 확인 
			for(int j = 0; j < i; j++) {
				if(numbers[i] == numbers[j]) {
					i = i - 1;
					break; 
				}
			}
		}
		// 배열 정렬 
		Arrays.sort(numbers);
		return numbers; 
	}
	
	// 테스트 코드 
	public static void main(String[] args) {
		LottoNumber lottoNumber = new LottoNumber(); 
		int[] nums = lottoNumber.getLottoNumber();
		for (int i : nums) {
			System.out.print(i + "\t");
		}
	}
}
