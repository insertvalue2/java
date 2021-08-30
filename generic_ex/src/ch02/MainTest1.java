package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		
		Powder powder = new Powder();
		ThreeDPrinter3 printer3 = new ThreeDPrinter3();
		
		// 재료셋팅
		printer3.setMaterial(powder);
		
		// 자료를 꺼내보기 
		Powder p = (Powder)printer3.getMaterial();
		// --> 형 변환해야 해서 번거로움이 있다. 
		
		
		
		

	}

}
