package ch02;

public class Car {

	String name;
	int price;
	Engine engine; 
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
		this.engine = new Engine("GDI", 500);
	}

	public void showInfo() {
		System.out.println("name : " + name);
		System.out.println("price : " + price);

	}

}
