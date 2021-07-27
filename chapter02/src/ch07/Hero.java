package ch07;

public class Hero {
	
	private String name;
	private int hp;
	private int power; 
	private double defense; 
	private int level;
	 
	// getter , setter 메서드를 만들어 주세요. 
	public String getName() {
		return this.name; 
	}
	
	public void setName(String name) {
		// 방어적 코드 작성 
		if(name == null || name == "" || name.length() < 2) {
			System.out.println("잘못된 입력 입니다. 이름을 다시 입력 하세요.");
		} else {
			this.name = name;
		}
	}
	
	// 메인 함수 
	public static void main(String[] args) {
		// Hero 객체 생성후 getter , setter 메서드를 사용해 보세요
		
		
	} // end of main 
	
	
} // end of class 
