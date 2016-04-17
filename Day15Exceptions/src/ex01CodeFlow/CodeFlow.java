package ex01CodeFlow;

import java.util.ArrayList;
import java.util.List;

// the user input tells you which index to start printing from

public class CodeFlow {
	
	public static void main (String [] args) {
		
		int input = 3;
		
		CodeFlow flow = new CodeFlow();
			
		flow.launch(input);
		
	}
	
	
	public void launch(int userInput) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		
		try{
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));		
		}
		catch 
			(IndexOutOfBoundsException ex) {
				ex.printStackTrace();
			}
	}
	
}
