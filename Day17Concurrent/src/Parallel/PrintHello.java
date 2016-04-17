package Parallel;

public class PrintHello implements Runnable {

	private static final int helloLimit = 500;
	private static final int helloSleep = 200;
	
	public PrintHello(){
		
	}
	
	
	@Override
	public void run() {
		
		for(int i = 0; i < helloLimit;i++ ) {
			System.out.println("Printing hello " + i + " times");
			try {
				Thread.sleep(helloSleep);
			} catch (InterruptedException e) {
			}
		}
	
		
	}

}
