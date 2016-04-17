package ex08;

public class ArcTest {

	public static void main(String[] args) {
		
		String seaName = "fish";
		String seaLandType = "Aquatic";
		String wingedName = "bird";
		String wingedLandType = "Winged";
		String landName = "lion";
		String landLandType = "Land";
		
		
		AquaticAnimal fish = new AquaticAnimal( seaName, seaLandType);
		WingedAnimal bird = new WingedAnimal(wingedName, wingedLandType);
		LandAnimal lion = new LandAnimal(landName, landLandType);
		
		fish.call(seaLandType);
		fish.makeSound();
		fish.reproduce(seaName);
		System.out.println("-");
		
		bird.call(wingedLandType);
		bird.makeSound();
		bird.reproduce(wingedName);
		System.out.println("-");
		
		lion.call(landLandType);
		lion.makeSound();
		lion.reproduce(landName);
		System.out.println("-");
		
		
		

	}

}
