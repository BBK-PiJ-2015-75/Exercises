package ex07Hierarchies;

import java.util.Scanner;

/*(Borrowed from Bruce Eckel.) Create a three-level hierarchy of exceptions (i.e. an exception extends some exceptions
that extends some exception). Now create a base-class A with a method that throws an exception at the base of
your hierarchy. Inherit B from A and override the method so it throws an exception at level two of your hierarchy.
Repeat by inheriting class C from B. In the launch() method of another class, create a C and upcast it to A, then
call the method.*/

public class BaseB extends BaseA {

	double in = 50.0;

	public BaseB() {

	}

	public static void main(String[] args) throws NoSuchElementException {

		BaseB b = new BaseB();

		b.setArea();

	}

	public double setArea() throws NoSuchElementException {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number");
		Integer x = scan.nextInt();
		if (!(x instanceof Integer)) {
			throw new NoSuchElementException();
		}
		System.out.println("You entered " + (x * x + 5));
		return (x * x + 5);
	}

}


