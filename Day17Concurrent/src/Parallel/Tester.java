package Parallel;

import java.util.Scanner;

public class Tester {
	
	
	public static void main (String[] args){
		
		PrintTime printTime = new PrintTime();
		Thread time = new Thread(printTime);
		
		PrintDate printDate = new PrintDate();
		Thread date = new Thread(printDate);
		
		PrintHello printHello = new PrintHello();
		Thread hello = new Thread(printHello);
		
		time.start();
		date.start();
		hello.start();
		
	}
	


}
