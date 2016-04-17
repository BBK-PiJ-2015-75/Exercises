package BigJavaExample;

import java.security.Timestamp;
import java.util.Date;

public class GreetingRunnable implements Runnable {

	private static final int REPITITIONS = 10;
	private static final int PAUSE = 1000;
	private String greeting;
	
	public GreetingRunnable(String aGreeting) {
		greeting = aGreeting;
	}
	
	
	@Override
	public void run() {
		try {
			Date today;
			
			for (int x = 0; x < REPITITIONS; x++) {
				System.out.print(today = new Date());
				System.out.println(" Hello, World!");
				Thread.sleep(PAUSE);
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		
	}
	
	// Ana: is the string parameter ever used in the program?
	
	public static void main (String[] args) {
		Runnable run = new GreetingRunnable("Hellx World!");
		Thread thread = new Thread(run);
		thread.start();
		
	}
	
	

}



















