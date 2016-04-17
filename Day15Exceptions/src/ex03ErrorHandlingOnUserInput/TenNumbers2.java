package ex03ErrorHandlingOnUserInput;

import java.util.InputMismatchException;
import java.util.Scanner;



/*Modify the program so that it first asks how many numbers the user wants to enter, and then asks for the numbers.
The computer should complain if the user enters something that is not a number in both cases. Use methods to
prevent code repetitions.*/

public class TenNumbers2 {
	Scanner scan = new Scanner(System.in);
	
	public static void main (String [] args) {
		
		TenNumbers2 ten = new TenNumbers2();
		
		ten.average();
		
	}
	
	public int average() {
		int total = 0;
		int counter = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter?");
		int limit = scan.nextInt();

		while (counter < limit) {
			System.out.println("Enter a number");
			
			try {	
					total += scan.nextInt();
					counter++;
			} catch (InputMismatchException ex) {
				System.out.println("You did not enter an integer, try again");
				scan.next();
			}
			
		}
		
		int average = total / counter;
		System.out.println("The average is " + average);
		return average;

	}
}



	
