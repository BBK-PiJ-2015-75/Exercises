package ex01;


public class MobilePhone extends OldPhone {

	
	
	public MobilePhone(String number) {
		super(number);	
	}

	public MobilePhone(String brand, boolean value) {
		super(brand);
		value = false;
	}

	public void ringAlarm(String sound) {
		System.out.println("Alarm sound " + sound);
	}
	
	
	public void playGame(String game){
		System.out.println("Let's play " + game);
	}
	
	
	public String[] printLastNumbers(){
			
		return lastCalls;
		
	}
			

}