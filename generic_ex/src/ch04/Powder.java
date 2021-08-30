package ch04;

// test code 에서 오류 확인후 Material 상속 하기 
public class Powder extends Material {

	@Override
	public String toString() {
		return "재료는 powder 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다");
	}
}
