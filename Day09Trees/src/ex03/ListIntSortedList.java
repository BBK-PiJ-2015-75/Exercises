package ex03;

public class ListIntSortedList implements IntSortedList {

	public int data;
	public ListIntSortedList nextNode; 
	
	public ListIntSortedList (int data) {
		this.data = data;
		nextNode = null;
	}
	
	
	
	@Override
	public void add(int x) {
	// see if it's already in the list
		if(contains(x)) {
			return;
		}
	// create the node
		ListIntSortedList newOne = new ListIntSortedList(x);
		ListIntSortedList currentNode = this;
		int temp = 0;
		
		if((currentNode.data > x) && (currentNode.nextNode == null)){ // insert at front of list
			temp = currentNode.data;
			currentNode.data = newOne.data; //assign new value to first node
			newOne.data = temp;
			newOne.nextNode = currentNode.nextNode;
			currentNode.nextNode = newOne;		
		}
		
		while (currentNode.nextNode !=null) {
	// go through the list to see where it fits
			if( newOne.data < currentNode.nextNode.data) {
				newOne.nextNode = currentNode.nextNode;
				currentNode.nextNode = newOne;
				return;
			}
			else { // currentNode.nextNode is null;
				if(x < currentNode.data) {
					temp = currentNode.data;
					currentNode.data = newOne.data;
					newOne.data = temp;
					currentNode.nextNode = newOne;
					newOne.nextNode = null;
				}
				// insert at the end
				currentNode.nextNode = newOne;
				newOne.nextNode = null;
				return;
			}
		}
	}
	
	

	@Override
	public boolean contains(int x) {
		if(x == data) {
			return true;
		}
		if(this.nextNode !=null){
			return nextNode.contains(x);
		}
		return false;
	}
	
	

}

















