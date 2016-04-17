package ex07;

// A class the extends the String class will not compile as String is a final class.

public class StringExtend {

	public String word;
	
	public StringExtend(String word) {
		this.word = word;
	}


	public void printEven() {

		for(int i=0; i< word.length(); i++) {
			System.out.println("Character at position " + i + " is " + this.word.charAt(i));
			i++;
		}
	}
		
		
	
		
		
	
		
	

}
