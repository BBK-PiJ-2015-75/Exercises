package ex05;

public class MusicalInstrument {
	
	public String instrumentName;
	
public MusicalInstrument(String instrumentName) {
	this.instrumentName = instrumentName;
}

public void play(String instrumentName) {
	System.out.println("playing " + instrumentName);
}

}
