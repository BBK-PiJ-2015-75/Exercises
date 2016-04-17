package ex01;



public class PhoneLauncher {
	
	
	
	
	public static void main(String[] args) {
		
		String number = "00110";
		String type = "Motorola";
		String model = "M10";
		
		SmartPhone moto = new SmartPhone(number);
	
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch(moto);
	}
	
	
	/** a launch method uses the object as a parameter, and runs all the methods
	 * of the class
	 * 
	 * @param moto
	 */
	public void launch(SmartPhone moto) {
		moto.call("00330");
		moto.ringAlarm("Ring!!!");
		// moto.playGame("Connect 4"); // not possible to call a private method outside the class
		moto.printLastNumbers();
		moto.browseWeb("Ebay");
		moto.findPosition("over here");
		
	}

	
	
	
	
	
	
	
	
	
	
}