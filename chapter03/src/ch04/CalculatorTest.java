package ch04;

public class CalculatorTest {
	
		public static void main(String[] args) {
			Calc calc = new CompletCalc();
			int num1 = 10;
			int num2 = 2; 
			
			System.out.println(num1 + " + " + num2 +  " = " + calc.add(num1, num2));
			System.out.println(num1 + " - " + num2 +  " = " + calc.substract(num1, num2));
			System.out.println(num1 + " * " + num2 +  " = " + calc.multiply(num1, num2));
			System.out.println(num1 + " / " + num2 +  " = " + calc.divide(num1, num2));
		}
}
