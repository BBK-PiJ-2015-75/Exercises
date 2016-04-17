package Parallel;

import java.util.Date;

public class PrintTime implements Runnable {
	
	private static final int timeLimit = 100;
	private static final long sleepTime = 300;

	public PrintTime() {
		
	}
	
	
	// print the time 100 times
	@Override
	public void run() {
		
		Date today = new Date();
		
		for(int i = 0; i < timeLimit; i++) {
			System.out.println("Time is " + today.getTime());
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
			}
		}
		
	}

}
