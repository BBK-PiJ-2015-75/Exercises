package ex04BinarySearch;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

/**
 * Implement a binary search algorithm for a list of integer numbers. The method
 * returns true if the list contains the element and false otherwise. You can
 * use the classes in the Java Collection Library. Search for numbers in lists
 * with 10, 100, and 1000 elements; how many comparisons do you need in each
 * case? (Hint: instead on entering manually 1000 elements in order, maybe you
 * can implement one of the sorting algorithms in the following exercises and
 * then use them to order a list of random numbers. Remember that you can create
 * a random integer between 0 and N-1 with Math.abs(N * Math.random())).
 */

public class BinarySearch {

	public static void main(String[] args) {

		int[] arrayI = new int[] { 2, 4, 5, 7, 9, 12, 13, 14, 15, 16, 17 };

		int value = 5;
		int start = 0;
		int end = arrayI.length - 1;

		int result = binarySearch(arrayI, value, 0, end);

		System.out.println(result);

	}

	public static int binarySearch(int[] array, int value, int start, int end) {

		int result = 0;
		boolean answer = false;
		// base case array has less than 3 values
		if ((end - start) == 1) {
			if (array[start] == value) {
				return value;
			}
			if (array[end] == value) {
				return value;
			}
		} else {
			// int midpoint and if statement
			int midpoint = (start + end) / 2;
			// int result = 0;
			if (array[midpoint] > value) {
				return binarySearch(array, value, start, midpoint);
			} else {
				return binarySearch(array, value, midpoint, end);
			}

		}
		return -1;

	}
}