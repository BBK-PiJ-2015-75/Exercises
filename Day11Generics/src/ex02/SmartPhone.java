package ex02;

public class SmartPhone extends MobilePhone {

	public SmartPhone(String number) {
		super(number);
	}

	/**
	 * public SmartPhone(String brand, boolean value) { super(brand); value =
	 * false; }
	 */

	public String browseWeb(String www) {
		System.out.println("The web address is " + www);
		return www;
	}

	public String findPosition(String gridRef) {
		String location = "00 " + gridRef + " 77";
		System.out.println(location);
		return location;
	}

	@Override
	public void call(String number) {

		String intCode = "00";
		if (number.substring(0, 2).equals(intCode)) {
			System.out.println("Calling " + number + " through the internet to save money.");

		} else {
			super.call(number);
		}
	}
	
//2.3
	public void testPhone(Phone type) {
		String number = "009988";
		this.call(number);
		this.call(number);
		String game = "Fix";
		this.playGame(game);
		String sound = "Runner";
		this.ringAlarm(sound);
		
	}

}
