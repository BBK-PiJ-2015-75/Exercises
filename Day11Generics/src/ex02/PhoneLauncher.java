package ex02;



public class PhoneLauncher {
	
	
	
	
	public static void main(String[] args) {
		
		String number = "00110";
		String type = "Motorola";
		String model = "M10";
		
		SmartPhone moto = new SmartPhone(number);
	
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch(moto);
	}
	
	
	
	public void launch(SmartPhone moto) {
		moto.call("00330");
		moto.ringAlarm("Ring!!!");
		// moto.playGame("Connect 4"); // not possible to call a private method outside the class
		moto.printLastNumbers();
		moto.browseWeb("Ebay");
		moto.findPosition("over here");
		
	}

	
	
	
	
	
	
	
	
	
	
}