package ex08;

public class LandAnimal extends Animal{

	public String name;
	public String landType;
	
	public LandAnimal(String name, String landType) {
		super(name, landType);	
	}

	@Override
	public void makeSound() {
		System.out.println("Roar Roar I am king of the jungle.");
	}

	
	
}
