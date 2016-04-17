package ex01DividingIntegers;

/*Create a Java class called Calculator. The class should implement the following methods, each of them printing
the result on the screen.
• add(int, int)
• subtract(int, int)
• multiply(int, int)
• divide(int, int)
• modulus(int, int)
Note that you will will need to cast the parameters into double to perform exact division.
Write a small Groovy or Java Decaf program that uses all the methods of Calculator.*/

public class Calculator {

	public int a;
	public int b;
	
	public Calculator() {
		
	}
	
	public int add(int a, int b) {
		
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply (int a, int b) {
		return a * b;
	}
	
	public Integer divide (int a, int b) {
		
		Integer result = ((Integer) a / b);
		
		return result;
	}
	
	public int modulus (int a, int b) {
		return a % b;
	}
}







