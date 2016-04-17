package ex06;

import java.util.HashMap;
import java.util.Scanner;

/*Create a generic simple map (with methods for putting a key–value pair, getting the value for a key, and removing
a key). The key and the value may be any type, and they may be different. Each key can only be linked to one
value.
For simplicity, assume that your map can hold a maximum of 1000 pairs. This way, you can use the hashing
method you developed in past weeks and base your map on an array.*/

public class SimpleMap<K, V> {
	
	private int size;
	HashMap<Integer,String> hash = new HashMap<>();

	 
	// method to add values
	public void addValue(int noOfValuesToAdd) {
		int counter = 0;
		Scanner scan = new Scanner(System.in);

		while (counter <= noOfValuesToAdd) {
			System.out.println("Enter the next word:");
			String input = scan.nextLine();
			hash.put(hash.size(), input);
			counter++;
		}
		for(int i = 0; i < hash.size(); i++){
		System.out.println(hash.get(i));	
		}
		
		System.out.println("The size of the map is " + hash.size());
	}
	
	
	public String getValue(Integer key) {
		System.out.println("The value paired with key no" + key + "is " + hash.get(key));
		return hash.get(key);
	}
	
	
	public String remove(Integer key) {
		System.out.println("Removing key no " + key + " and value " + hash.get(key));
		return hash.remove(key);	
	}
	
	
	public static void main (String[]arg ) {
		
		SimpleMap<Integer,String> mash = new SimpleMap<>();
		
		//can't run the methods
		mash.addValue(4);
		mash.remove(2);
		
	}
	
}
