package ex02;

import java.util.LinkedList;

// wo
public class ListIntSet implements IntSet {

	public int data;
	public ListIntSet nextNode;

// constructor
	public ListIntSet(int data) {
		this.data = data;
		nextNode = null;
	}
	
	
	
	
	@Override
	public void add(int me) {
		// check to see if list contains x

		if(!contains(me)) {
			ListIntSet node = new ListIntSet(me);
			if(this.nextNode == null){
				this.nextNode = node;
				return;
			}
			ListIntSet currentNode = this.nextNode;
			while(currentNode.nextNode != null) {
				currentNode = currentNode.nextNode;
			}
			System.out.println(me);
			currentNode.nextNode = node;
		}
	}
		
		
		

	@Override
	public boolean contains(int x) {
		if(data == x)
		return true;	
		else
			if(this.nextNode != null) {
				return this.nextNode.contains(x);
			}
			 return false;
	}



	@Override
	public boolean containsVerbose(int x) {
		if(data == x) {
			System.out.println("data = " + x);
			return true;	
		}
			else
				if(this.nextNode != null) {
					System.out.println("List contains " + x);
					return this.nextNode.contains(x);
				}
				System.out.println("List does not contain " + x);
				 return false;	
	}
	

}






