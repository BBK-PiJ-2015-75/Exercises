package ex02;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIntSetTester {

	public static void main (String[] args) {
		
		int x = 9;
		String list = "";
		
		
		ListIntSet lisx = new ListIntSet(x);
		
		// call the objects
		
		lisx.add(3);
		lisx.add(33);
		lisx.add(22);
		lisx.add(15);
		lisx.add(9);
		lisx.add(69);
		
		//lisx.contains(x);
		lisx.containsVerbose(5);
	}
}
