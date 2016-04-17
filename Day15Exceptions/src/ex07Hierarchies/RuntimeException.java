package ex07Hierarchies;



public class RuntimeException extends Exception {
	
	public RuntimeException () {
	}

	public RuntimeException (String message) {
		super(message);
		System.out.println("Runtime exception thrown");
	}
	
	
}
