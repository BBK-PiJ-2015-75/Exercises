package ex08;

public abstract class Animal {

	public String name;
	public String reproduceType;
	public String landType;

	public Animal(String name, String landType) {
		this.name = name;
		this.landType = landType;
	}

	public abstract void makeSound(); // all animals make a sound

	
	public void reproduce(String name) {
		String insect = "insect";
		String fish = "fish";
		String amphibian = "amphibian";
		String reptile = "reptile";
		String bird = "bird";
		if((name.equals(insect)) || (name.equals(fish)) || (name.equals(amphibian)) ||
				(name.equals(reptile)) || (name.equals(bird))) {
			System.out.println("Laying some eggs now...");
				}
		else {
			System.out.println("Giving birth");
		}
		
		
		
		
	}

	
	public void call(String landType) {
		String sea = "Aquatic";
		String land = "Land";
		String air = "Winged";
		
		switch (landType) {
		case "Aquatic":
			System.out.println(this.name + " will not come...");
			break;
		case "Land":
			System.out.println(this.name + " coming...");
			break;
		case "Winged":
			System.out.println(this.name + " now flying, will come later when tired...");	
		}
	}

}
