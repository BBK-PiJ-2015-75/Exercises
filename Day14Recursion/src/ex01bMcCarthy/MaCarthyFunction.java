package ex01bMcCarthy;

/*Calculate the result of calling this method with arguments 50, 73, and 95. Note that the recursion on line 5 is
double.*/

public class MaCarthyFunction {

	
	public static void main(String[] args) {
		
		int n = 1;
		
		System.out.println(mcCarthy91(n));
		
	}
	
	
	
	
	
	
	static int mcCarthy91(int n) {
		if (n > 100) {
			return n - 10;
		} else {
			return mcCarthy91(mcCarthy91(n + 11));
		}
	}

}
