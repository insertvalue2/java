package ch02;


public class CarMainTest1 {

	public static void main(String[] args) {
		
		Car car = new Car("제네시스", 5000);
		car.showInfo();
		System.out.println(car.engine.name);
		System.out.println(car.engine.price);
		car.engine.showInfo();
	}

}
