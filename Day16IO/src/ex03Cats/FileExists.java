package ex03Cats;

import java.io.File;
import java.util.Scanner;


/*
Write a program that takes a name from the user at the command line. If a file with that name exists, the program
must show its contents on screen. If it does not, the program must say so.*/

public class FileExists {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the file: ");
		
		String name = scan.nextLine();
		
		File file = new File("c:\\" + File.separator + name);
		
		String[] path;
		
		if
		(file.exists()) {
			path = file.list();
			
			for(String e : path) {
				System.out.println(e);
			}
			System.out.println("The directory exists");
		}
		else {
			file.mkdir();
			System.out.println("Directory is created");
		}

	}
}