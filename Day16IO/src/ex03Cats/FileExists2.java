package ex03Cats;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/*
Write a program that takes a name from the user at the command line. If a file with that name exists, the program
must show its contents on screen. If it does not, the program must say so.*/

public class FileExists2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the file: ");

		String name = scan.nextLine();

		File file = new File("c:\\" + File.separator + name);

		if (file.exists()) {

			String line = "";

			try {
				BufferedReader read = new BufferedReader(new FileReader(file));
				line = read.readLine();
			} catch (IOException e) {
			}

			while ((line != null)) {
				System.out.println(line);

			}

		} else {
			System.out.println("The file does not exist");
		}
	}
}





