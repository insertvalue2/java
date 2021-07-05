package ch00;

public class MainTest4 {

	public static void main(String[] args) {
		// 다형성 : 배열(자료구조) 관계에서도 사용 가능
		// 하나의 변수에 연관된 데이터를 여러개 저장 하기 위해 사용.

		// 1.
		Banana banana1 = new Banana();
		Banana banana2 = new Banana();

		Banana[] bananaBuket = new Banana[2];
		bananaBuket[0] = banana1;
		bananaBuket[1] = banana2;

		for (Banana ba : bananaBuket) {
			ba.showInfo();
			System.out.println("=======");
		}

		// 2
		Peach peach1 = new Peach();
		Peach peach2 = new Peach();
		Peach[] peachBuket = new Peach[2];
		peachBuket[0] = peach1;
		peachBuket[1] = peach2;

		for (Peach pb : peachBuket) {
			pb.showInfo();
			System.out.println("=======");
		}

		// 3 다형성을 사용한다면
		Fruit[] fruitBuket = new Fruit[4];
		fruitBuket[0] = banana1;
		fruitBuket[1] = peach1;
		fruitBuket[2] = banana2;
		fruitBuket[3] = peach2;

		System.out.println("//////////////");
		for (Fruit fb : fruitBuket) {
			fb.showInfo();
			System.out.println("=======");
		}

	}

}
