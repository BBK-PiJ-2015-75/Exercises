package ex03;

import java.util.*;

import org.omg.CORBA.Current;

/*Modify the doubly-linked list that you have created in past weeks to make it generic, i.e. to allow it to have values
of its elements of any type.
Once you have it ready, create a class Company that keeps two linked lists, one with the names of the employees
and one with their National Insurance Number.*/

// not sure if temp is an element of employee or a list in itself.

public class GenericDoubleList<T extends Comparable<T>> {

	Node<T> first;

	public int counter;

	public GenericDoubleList() {
		first = null;
		counter++;
	}

	public void add(T newItem) {
		Node<T> current = first;
		while (current.next != null) {
			current = current.next;
		}
		counter++;
		current.data = newItem;
	}

	/**
	 * check to see if the list contains the element in the parameter field
	 */

	
	public T getValue(int index) {
		Node<T> current = first;
		
		for(int i=0; i < index; i++) {
			current = current.next;
		}
		return current.data;
	}

	
	public boolean contains(T x) {
		Node<T> current =first;
		
		for(int y = 0; y < counter; y++ ) {
			if(current.data.equals(x)) {
				return true;
			}
			current =current.next;
		}
		return false;
	}

	
	
	public boolean containsVerbose(T x) {
			Node<T> current =first;
			
			for(int y = 0; y < counter; y++ ) {
				if(current.data.equals(x)) {
					System.out.println("Node " + current.data.toString() + "equals " + x);
					return true;
				}
				current = current.next;
			}
			System.out.println(x + " is not in the set of data");
			return false;
		}

	
	
	public void deleteElement(T x) {
		Node<T> current = first;
		Node<T> temp = null;

		for (int y = 0; y < counter; y++) {
			if (current.data.equals(x)) {
				temp.data = current.data;
				temp.previous = current.previous;
				temp.next = current.next;
			}
			current = current.next;
		}
		
	}

	

	public Node<T> getNext() {
		Node<T>current = first;
		Node<T> answer = null;
		answer = current.next;
		return answer;
	}

}



