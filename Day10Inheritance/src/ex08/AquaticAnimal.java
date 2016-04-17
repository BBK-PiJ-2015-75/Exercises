package ex08;

public class AquaticAnimal extends Animal{

	public String name;
	public String landType;
	
	public AquaticAnimal(String name, String landType) {
		super(name, landType);	
	}

	
	
	@Override
	public void makeSound() {	
		System.out.println("Glug Glug, I love water.");
	}

	
	
	
}
