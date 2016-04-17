package ex03;

public class Node<T extends Comparable> implements Comparable<T> {
	
	public T data;
	public Node next;
	public Node previous;

	public Node(Node next, Node previous, T data) {

		this.next = next;
		this.previous = previous;
		this.data = data;
	}

	public int compareTo(T newItem) {
		return (this.data.compareTo(newItem));

	}

}
	

