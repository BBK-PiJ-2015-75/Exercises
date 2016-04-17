package ex01;

/**
 * Add the following field, constructor, and method to OldPhone: private String
 * brand = null; public OldPhone(String brand) { this.brand = brand; } public
 * String getBrand() { return brand; } // ... there is no setter for brand Add
 * the appropriate constructors to MobilePhone and SmartPhone in order to be
 * able to call the method getBrand() from an object of class SmartPhone and
 * obtain the right answer, i.e. the brand provided in the con- structor.
 */

public class OldPhone implements Phone {

	public String number;
	public String brand = null;
	int numOfCalls;
	String[] lastCalls;

	public OldPhone(String number) {
		this.number = number;
		numOfCalls = 0;
		lastCalls = new String[10];
	}

	public OldPhone(String brand, boolean value) {
		this.brand = brand;
		value = false;
	}

	public String getBrand() {
		return brand;
	}

	@Override
	public void call(String number) {
		lastCalls[numOfCalls % 10] = number;
		numOfCalls++;
		System.out.println("Calling " + number);

	}

}
