package ex05;


/**Create a generic stack (with methods for pushing, poping, and checking emptiness) that only works with classes
that extend Number (e.g. Integer and Double, but not String).

a list cn be a stack LIFO nodes needed: Top, maybe first. Methods: size, isempty, push, top, pop and peek 
*/


public class GenericStack <N extends Number>{
	
	public class Node {
		Node next;
		Node previous;
		public N data;
		
		public Node(N data){
			next = null;
			this.data = data;
		}
	}	
	
	GenericStack<N> stack = new GenericStack<N>();
		Node current;
		Node next;
		Node previous;
		public int size;
	
	
	public GenericStack() {
		size = 0;
		current = null;
		previous = null;
		next = null;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		if (size < 1) {
			return true;
		}
		else
			return false;
	}
	
	
	
	public Node findTopOfStack () {
		Node temp = stack.next;
		if(size == 0)
			return stack.current;
		else {
			while (temp != null) {
				temp = stack.next.next;
			}
		}
		return temp;
	}
		
		
	
	public void push(N value) {
		Node push = findTopOfStack();
		 Node add = push.next;
		 add.data = value;
			size++;
	}
		
	
	public void pop () {
		Node pop = findTopOfStack();
		Node delete = pop;
		delete.data = pop.data;
		current = current.previous;
		current.next = null;
		size--;
		System.out.println(delete.data);
		}
	
	
	public void peek () {
		Node peek = findTopOfStack();
		System.out.println(peek.data);
		}

	
}
