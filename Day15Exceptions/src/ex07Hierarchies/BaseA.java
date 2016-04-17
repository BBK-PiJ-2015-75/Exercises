package ex07Hierarchies;

import java.util.Scanner;

/*(Borrowed from Bruce Eckel.) Create a three-level hierarchy of exceptions (i.e. an exception extends some exceptions
that extends some exception). Now create a base-class A with a method that throws an exception at the base of
your hierarchy. Inherit B from A and override the method so it throws an exception at level two of your hierarchy.
Repeat by inheriting class C from B. In the launch() method of another class, create a C and upcast it to A, then
call the method.
*/
public class BaseA {

	public BaseA() {

	}

	public double setArea() throws RuntimeException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number");
		Integer x = scan.nextInt();
		if (!(x instanceof Integer)) {
			throw new RuntimeException();
		}
		System.out.println("You entered " + (x * x));
		return (x * x);
	}

	public static void main(String[] args) throws RuntimeException {

		BaseA a = new BaseA();

		try {
			a.setArea();
		} catch (RuntimeException e) {

		}

	}
	
	
	
}
