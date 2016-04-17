package ex06YourFirstExceptions;

import java.io.IOException;
import java.lang.reflect.Method;

import com.sun.xml.internal.ws.api.model.CheckedException;

//Create two exceptions, one checked exception and one runtime exception. Then create a simple class that will throw
//each of them in two different situations, according to user input:
//1. inside a try block.
//2. outside a try block.
//Note: Two exceptions times two situations means four different inputs from users. Create the new exceptions
//with four different messages (using the appropriate constructor), e.g. ”I am a checked exception and I have been
//thown out of a try block”.
//Assuming you do all of the above inside the launch() method of your class, did you have to make any changes
//to the method’s declaration?

public class OwnExceptions {

	public static void main(String[] args) throws NoSuchMethodException, IOException {

		IOException e1 = new IOException("I am a checked exception and I have been thown out of a try block") ;
		IOException e2 = new IOException("I am a checked exception and I have been thown inside a try block") ;
		RuntimeException e3 = new RuntimeException("I am a runtime exception and I have been thown out of a try block");
		RuntimeException e4 = new RuntimeException("I am a runtime exception and I have been thown inside a try block");
		
		//throw e1;
		

		try {

			throw e2;
			
		} catch (IOException o) {
			o.printStackTrace();
		}

	}

	// method to check whether the first and last characters are the same

	public boolean checkFirstLast(String input) {

		boolean ok = false;
		int start = 0;
		int end = input.length() - 1;
		if (input.charAt(start) == (input.charAt(end))) {
			ok = true;
		} else {
			ok = false;
		}
		return ok;
	}

}
