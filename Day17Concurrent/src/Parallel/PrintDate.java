package Parallel;

import java.util.Date;

public class PrintDate implements Runnable {

	
	private static final int dateLimit = 100;
	private static final long sleepLimit = 100;
	
	public PrintDate(){	
	}
	
	
	@Override
	public void run() {
		
		Date now = new Date();
		
		for(int i = 0; i < dateLimit; i++) {
			System.out.println("Date is " + now.getTime() );
			
			try {
				Thread.sleep(sleepLimit);
			} catch (InterruptedException e) {
			}
		}
		
	}

}
