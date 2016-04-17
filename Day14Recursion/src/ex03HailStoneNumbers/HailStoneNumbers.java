package ex03HailStoneNumbers;

import java.util.ArrayList;

import ex04BinarySearch.BinarySearch;

/**The sequence hailstone numbers is defined as follows:
	• If the number n is even, the next number is n/2
	• If the number is odd, the next number is 3n + 1
	It is thought that this sequence always converges to 1 (this is the Collatz conjecture, not demonstrated yet).
	Write a method that returns a list of integers (hint: you can use List<Integer> and ArrayList<Integer>)
	with the sequence of hailstone numbers that starts at some given natural number provided by the user.*/

public class HailStoneNumbers {

	int result = 0;
	static ArrayList<Integer> array = new ArrayList<Integer>();

	public HailStoneNumbers() {
	}

	/*
	 * • If the number n is even, the next number is n/2 • If the number is odd,
	 * the next number is 3n + 1
	 */

	public static int sequence(int n) {

		if (n == 0) {
			return 0;
		}

		else {

			if (n % 2 == 0) {
				array.add(n);
				return sequence(n - 1) / 2;

			} else {
				array.add(n);
				return sequence(3 * (n - 1)) + 1;
			}
		}
	}

	public static void main(String[] args) {

		HailStoneNumbers halle = new HailStoneNumbers();

		// create a new array and populate it using the populateArray method (in
		// BinarySearch class)

		int n = 25;

		sequence(n);

		for (Integer element : array) {
			System.out.println(element);
			System.out.println(", ");
		}

	}

}











