package ex01;

/*Complete the example given in the notes with a class called Spy. Your class must have:
• one and only one static variable, and int called spyCount.
• an instance variable of type int for the spy’s ID.
• a constructor method that receives the ID of the spy as an argument, increases spyCount(int) by one, and
prints on the screen the ID of this spy plus the total number of spies so far.
• a die() method that prints on the screen “Spy XX has been detected and eliminated” (where XX is the spy’s
ID), decrements the spy counter and prints on the screen the total number of spies so far.
• a main method in which several objects of class Spy are created and some of them killed (their method die()
is called).
Observe how the static variable is accessed by different objects both to increment and to decrement it.*/

public class Spy {
	
	private static int spyCount = 0;
	public int iD;
	
	public Spy(int iD) {
		this.iD = iD;
		spyCount++;
		System.out.println("This spy's ID is " + iD);
		System.out.println("The totalnumber of spies so far is " + spyCount);
	}
	
	
	public void die (int iD) {
		System.out.println("Spy " + iD + " has been detected and eliminated");
		spyCount--;
		System.out.println("The total number of spies so far is " + spyCount);
	}
	
	public static void main (String[] arg) {
		
		
		Spy no1 = new Spy(spyCount);
		Spy no2 = new Spy(spyCount);
		Spy no3 = new Spy(spyCount);
		Spy no4 = new Spy(spyCount);
		Spy no5 = new Spy(spyCount);
		Spy no6 = new Spy(spyCount);
		
		System.out.println(no1.iD);
		
		no1.die(no1.iD);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
