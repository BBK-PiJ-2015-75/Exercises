package ex05;

public class Guitar extends MusicalInstrument implements WoodenObject {

	public String type;
	public String name;
	
	public Guitar (String type) {
		super(type);
	}
	

	public void play(String name) {
		System.out.println("My guitar is called " + name);
		
	}
	
	
	@Override
	public void burn() {
		System.out.println("This guitar is flammable");
	}
	
	
	
	

}
