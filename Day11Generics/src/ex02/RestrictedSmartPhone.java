package ex02;

public class RestrictedSmartPhone extends SmartPhone {

	
	public RestrictedSmartPhone(String number) {
		super(number);
		
	}

	public RestrictedSmartPhone(String brand, boolean value) {
		super(brand);
		value = false;
	}

	/**
	 * cannot make an inherited method more restrictive than the parent version
	public void playGame(String game){
		System.out.println("Let's play " + game);
	}
	*/
	
	
	
}