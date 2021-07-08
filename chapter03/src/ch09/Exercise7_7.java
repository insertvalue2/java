package ch09;


class Parent {
	int x = 100;

	Parent() {
		this(200);
		System.out.println("1");
	}

	Parent(int x) {
		this.x = x;
		System.out.println("2");
	}

	int getX() {
		System.out.println("3");
		return x;
	}
}

class Child extends Parent {
	int x = 3000;

	Child() {
		this(1000);
		System.out.println("4");
	}

	Child(int x) {
		System.out.println("5");
		this.x = x;
		
	}
}

public class Exercise7_7 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x=" + c.getX());
	}
}