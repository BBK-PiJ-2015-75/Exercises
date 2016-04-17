package ex02MemorisedFibinacci;



/**Memoization is not always necessary, but in some cases it can really speed up computation, as in this exercise.
Write a Java class with a with a method that calculates the nth element of the Fibonacci sequence as seen in
the notes. Note: Remember that when a method is a pure function without side-effects, it is good practice to make
it static. Does any or both versions of this method qualify?
Do it with and without memoization. Compare the time that is needed in each case to find F(40) or F(45).
What is the maximum Fibonacci number you can calculate in Java using int? And using long? Hint: Remember
that both types have a maximum value as they are only 32 and 64 bits long. Look at the Java documentation to
find the maximum value in each case.*/


public class Fibinacci {

	public Fibinacci(){	
	}
	
	int[] precalc = null;
	
	
	public int fib(int n) {
		
		if(precalc == null) {
			precalc = new int[n];
			
			for(int i = 0; i < precalc.length; i++) {
				precalc[i] = -1;
			}
		}
		
		if(n <=2) {
			return 1;
		}
		else
			if(precalc[n-1] != -1) { // ie has been calculated as yet
			return precalc[n-1];
			}
		
		else {
			int result = fib(n-1) + fib(n-2);
			precalc[n-1] = result;
			return result;
		}
	}
	
	
	public int nonMemoFib(int n) {
		
		
		if(n <=2) {
			return 1;
		}
		
		else {
			int result = fib(n-1) + fib(n-2);
			return result;
		}
	}
	
	
	
	
	
	public static void main (String[] args) {
		Fibinacci nacci = new Fibinacci();
		int test = 9000;
		
		System.out.println(nacci.fib(test));
		System.out.println(nacci.nonMemoFib(test));
		
	}
	
	
	
	
	
	
}
