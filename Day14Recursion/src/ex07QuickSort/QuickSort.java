package ex07QuickSort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Quicksort is another sorting algorithm that also employs a divide-and-conquer
 * strategy. It works well in most usual computers because of the low-level
 * interactions between registers and the main memory, which make it very
 * popular and widely used. You can implement a Mergesort for lists by following
 * the following steps: Initial action: If the list contains 0 or 1 element, it
 * is sorted and you can return it. Otherwise, choose one element as “pivot”
 * (usually the first one). Subproblem: Divide the list into two lists: the
 * first list contains the elements before the pivot (e.g. the integers lower
 * than the pivot) and the second one contains the elements after the pivot.
 * Then sort both lists (i.e. apply quicksort to each sublist, choosing a new
 * pivot, etc). Integration: When both sublists
 */

public class QuickSort {

	// declare a quicksort object

	QuickSort quick = new QuickSort();

	// declare an arraylist and populate it

	ArrayList<Integer> aRL = new ArrayList<Integer>();

	// create an iterator for later
	Iterator<Integer> it = aRL.iterator();

	// populate the array
	public void buildArray(ArrayList aRL, int size) {

		// create a ramdon object

		Random ran = new Random();
		Integer max = 10000;
		Integer min = 1;
		ran.nextInt();
		Integer add = ran.nextInt(max - min) + min;

		for (int a = 0; a < size; a++) {
			if (aRL.contains(add)) {
				continue;
			} else {
				aRL.add(a, add);
			}
		}
	}

	// build a quicksort method recursively

	public ArrayList quickSort(ArrayList aRL) {

		if (aRL.isEmpty()) {
			return aRL;
		}

		Integer pivot = (Integer) aRL.get(0);
		// create 2 new sublists

		ArrayList<Integer> subL = new ArrayList<Integer>();
		ArrayList<Integer> subR = new ArrayList<Integer>();

		// use an iterator to go through the list
		while (it.hasNext()) {
			Integer next = it.next();
			if (next <= pivot) {
				subL.add(next);
			} else {
				subR.add(next);
			}

		}
		// callthe method on the sub arrayLists
		quickSort(subL);
		quickSort(subR);

		ArrayList<Integer> mergedList = new ArrayList<Integer>();
		mergedList.addAll(subL);
		mergedList.add(pivot);
		mergedList.addAll(subR);
		
		return mergedList;

	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {

		ArrayList<Integer> aRL = new ArrayList<Integer>();

	}

}
