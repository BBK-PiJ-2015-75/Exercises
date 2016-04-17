package ex02;

import java.util.ArrayList;
import java.util.Scanner;

/*Make a class that implements a method that reads a list of marks between 0 and 100 from the user, one per line,
and stops when the user introduces a -1. The program should output at the end (and only at the end) how many
marks there were in total, how many were distinctions (70–100), how many were passes (50–69), how many failed
(0–49), and how many were invalid (e.g. 150 or -3). Use readLine() exactly once. The output may look similar
to this example:
Input a mark: 13
Input a mark: 45
Input a mark: 63
Input a mark: 73
Input a mark: 101
Input a mark: 45
Input a mark: 18
Input a mark: 92
Input a mark: -1
There are 7 students: 2 distinctions, 1 pass, 4 fails (plus 1 invalid).*/

public class doWhile {
	
	public static void main(String[] arg) {

		int distinction = 0;
		int pass = 0;
		int failed = 0;
		int invalid = 0;
		int counter = 0;
		int mark;

		ArrayList<Integer> marks = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		
	
		
		do {
		System.out.println("Input a mark ");
			mark = scan.nextInt();
		
			
			if (mark >= 70 && mark < 100) {
				distinction++;
			} else if (mark >= 50 && mark < 70) {
				pass++;
			} else if (mark >= 0 && mark < 50) {
				failed++;
			} else {
				invalid++;
			}
			marks.add(mark);
			counter++;
			System.out.println("the mark is " + mark);
			
		}while (mark != -1);
		
		
		System.out.println("There are " + counter + " students: " + distinction + " distinctions, " + 
		pass + " passes, " + failed + " fails, and "+ invalid + " invalid");
	}
	

}
