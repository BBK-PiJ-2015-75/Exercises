package ex06;

public class Lecturer extends Teacher {

	public String name;

	public Lecturer(String name) {
		super(name);
	
	}

	public String getName(String name){
		System.out.println(name);
		return name;
	}
	
	
	public void doResearch(String topic) {
		System.out.println("Doing research on: " + topic);
	}

}
