package ex02;

public class PhoneTester {

	public static void main(String[] args) {

		String number = "00191991";
		
		/** down casting. you have to declare the parent object to be an instance of a  child
		 * object [MobilePhone myPhone = new SmartPhone(number);], then re-declare the smart phone 
		 * object to assign it to memory space suitable for a smart phone
		 * [SmartPhone smarts = (SmartPhone) myPhone;]
		 * then run the methods off the smart phone object, smarts.
		 * 
		 */
		
		//2.2
		MobilePhone myPhone = new SmartPhone(number);
		SmartPhone smarts = (SmartPhone) myPhone;
		
		String webAddy = "www.TheBigChill.com";
		String position = "87655";
		String call = "0029292";
				
		smarts.browseWeb(webAddy);
		smarts.findPosition(position);
		smarts.call(call);
		
		testPhone(myPhone);

	}

	/** can only use the call method in this method because the object 
	is the parent (Phone)*/
	public static void testPhone(Phone newP){
		newP = new SmartPhone("5555");
		SmartPhone newS = (SmartPhone) newP;
		
	/** when the object is downcasted to smartphone, all methods can
	 * be called*/
	
		newP.call("3889");
		newS.browseWeb("bookFace");

	/** when a mobile phone object was passed to the testPhone method it
	 * ran, is this correct?
	 */
		
	}
	
	
	
	
	
}
