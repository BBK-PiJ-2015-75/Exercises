package ex04;

import java.util.*;

import ex03.GenericDoubleList;
import ex03.Node;


public class GenericSortedList<T extends Comparable<T>> extends GenericDoubleList<T> implements Comparable<T> {

	Node<T> first;
	
	// add method has to take account of sorted aspect
	public void add(T newItem) {
		Node<T> current = first;

		Node<T> newNode = new Node<T>(null, null, newItem);

		/*
		 * options: list is empty, insert at beginning newItem is biggest value,
		 * insert at the end newItem should be inserted into the, iterate and
		 * find the right place
		 * 
		 * 
		 */
		// list is empty
		if (counter == 0) {
			current.data = newItem;
			current.next = null;
			counter++;
		}

		while (!(current.next == null)) {

			if (current.data.compareTo(newItem) == -1)
				if ((current.next.data).compareTo(newItem) == -1) {
					current = current.next;
				}
			// found the position in the list
			if ((current.data).compareTo(newItem) == -1)
				if ((current.next.data).compareTo(newItem) == 1) {
					current.next = newNode;
					newNode.next = current.next.next;
				}

			if ((current.data).compareTo(newItem) == 0) {

				current.next = newNode;
				newNode.next = current.next.next;
				newNode.data = newItem;
			}
		}

		if (current.data.compareTo(newItem) == -1)
			if (current.next == null) {
				current.next = newNode;
				newNode.next = current.next.next;
			}
		current.data = newItem;
		counter++;
	}
	




	@Override
	public int compareTo(T arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
}






