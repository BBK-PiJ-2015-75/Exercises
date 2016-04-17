package ex03ErrorHandlingOnUserInput;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Write a program that reads 10 numbers from the user and then prints the mean average. If the user inputs
something that is not a number, the program should complain and ask for a number again until 10 numbers have
been introduced.*/

public class TenNumbers {
	
	Scanner scan = new Scanner(System.in);
	
	public static void main (String [] args) {
		
		TenNumbers ten = new TenNumbers();
		
		ten.average();
		
	}
	
	public int average() {
		int total = 0;
		int counter = 0;

		while (counter < 10) {
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








