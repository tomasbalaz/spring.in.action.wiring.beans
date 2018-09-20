package spring.in.action.spring.in.action.wiring.beans.soundsystem;

public class SgtPepperss implements CompactDisc {
	
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	
	private String artist = "The Beatles";

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}
}
