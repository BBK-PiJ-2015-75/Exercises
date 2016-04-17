package ex05PrimeDivisors;

import java.util.ArrayList;
import java.util.InputMismatchException;

/*Create a class PrimeDivisorList. Integers (as in class Integer) can be added to / removed from the list. If a
null number is passed to the add(Integer) method, a NullPointerException must be thrown. If a non-prime
number is added, an IllegalArgumentException must be thrown.
Override the method toString() so that it returns something like:
[ 2 * 3^2 * 7 = 126 ]
for a list containing one 2, two 3, and one 7.
Use the TDD methodology to create the class (interface, tests,implementation). You can base your class on
classes and interfaces from the Java Collections Library.*/

public class PrimeDivisorsList {

	// create an arraylist
	ArrayList<Integer> prime = new ArrayList<Integer>();

	public int index = 0;

	// constructor
	public PrimeDivisorsList() {

	}

	public static void main(String[] args) {

		ArrayList<Integer> prime = new ArrayList<Integer>();

		int index = 0;
		Integer a = 2, b = 3, c = 88, d = 8;
		Integer l = 0;
		Integer m = 1;
		Integer n = 2;
		Integer o = 3;

		PrimeDivisorsList list = new PrimeDivisorsList();

		list.addToList(a);
		list.addToList(b);
		list.addToList(c);
		list.addToList(d);

		System.out.println("list is size " + list.prime.size());
		System.out.println("element 3 is " + list.prime.get(3));

		list.forumla(l, m, n, o);

	}

	// how do you calculate the power of in java?
	public Integer forumla(Integer l, Integer m, Integer n, Integer o) {
		l = 0;
		m = 1;
		n = 2;
		o = 3;
		Integer w = prime.get(l);
		Integer x = prime.get(m)^prime.get(n);
		Integer y = prime.get(o);
		Integer formula = w * x * y;

		System.out.print("[ " + w + " * " + prime.get(m) + "^" + prime.get(n) + " * " + prime.get(o) + " ] = ");
		System.out.println(formula);
		return formula;
	}

	
	// method to add to the list
	public void addToList(Integer a) {
		
		if (!primeCheck(a)) {
			
			System.out.println("A nonprime number was added");
			throw new IllegalArgumentException();
		}

		if (a == null) {
			System.out.println("Null value added");
			throw new NullPointerException();
		}

		prime.add(index, a);
		index++;
	}

	
	// method to sub from the list
	public void subFromList(Integer b) {
		prime.remove(b);
		index--;
	}

	// method to check if the number is a prime number
	public boolean primeCheck(int b) {

		for (int x = b - 1; x > 1; x--) {
			if (b % x == 0) {
				return false;
			}
		}
		return true;
	}

}
	
















