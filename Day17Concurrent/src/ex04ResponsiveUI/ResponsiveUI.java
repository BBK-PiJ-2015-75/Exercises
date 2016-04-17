package ex04ResponsiveUI;

import java.util.Random;
import java.util.Scanner;

/*Write a program that asks from the user the length in milliseconds of ten tasks. As the user enters the length, the
tasks start running in the background while the user enters the length of the other tasks. When the tasks end, the
program must register it and say it unless it is waiting for the user to enter data. See this sample output:
Enter the duration (in ms) of task 0: 10
Enter the duration (in ms) of task 1: 3000
Finished tasks: 0*/

/* 
 * I can get it to do a single one but not concurrently :(
 * 
 */

public class ResponsiveUI implements Runnable {

	public int workLength;
	public int id;
	public static final int COUNT = 10;
	
	
	public ResponsiveUI(int worklength, int id) {
		this.workLength = workLength;
		this.id = id;	
	}
	
	public static void main(String[] args) {
		

Random ran = new Random(999);

		for (int i = 0; i < COUNT; i++) {
			int length = ran.nextInt();
			Thread t1 = new Thread(new ResponsiveUI(length, i ));
			t1.start();
			 
		}
		
	}
	
	@Override
	public void run() {
		
		
		 try {
			System.out.println(Thread.currentThread().getId() + " starting at " + System.currentTimeMillis());
			Thread.sleep(workLength);
			System.out.println(Thread.currentThread().getId() + " finishing at " + System.currentTimeMillis());
		} catch (InterruptedException e) {
		}
		
		
	}

}


