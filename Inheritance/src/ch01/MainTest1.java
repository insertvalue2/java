package ch01;

class A {
	int number1; 
	int number2; 
	int number3; 
}

class B {
	int number1; 
	int number2; 
	int number3;
	int number4; 
	int number5;
}

class C extends A {
	int number4;
	int number5; 
}


public class MainTest1 {
	
	public static void main(String[] args) {
		
		C c = new C();
		c.number1 = 1; 
		c.number2 = 2;
		c.number5 = 5; 
		
	}
	
}



