package ex02MkDir;

import java.io.File;
import java.util.Scanner;

/*2 mkdir
Write a program that takes a name from the user at the command line and creates a directory with that name.
Remember that the only argument of method main is an array of Strings, each of them an argument written after
the name of the class. For example, if you*/

public class MkDir {

	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the file name: ");
		String directoryName = scan.nextLine();
		
		new File("C:" + File.separator + directoryName).mkdir();
		
	}
	
}
