package ex08;

public class WingedAnimal extends Animal{

	public String name;
	public String landType;
	
	public WingedAnimal(String name, String landType) {
		super(name, landType);
		
	}

	@Override
	public void makeSound() {
		System.out.println("Flap Flap watch me fly.");
	}

	
	
}
