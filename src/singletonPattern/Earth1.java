package singletonPattern;

// Eager mode
public class Earth1 {
	private static final Earth1 home = new Earth1();
	
	private Earth1() {};
	
	public static Earth1 getEarth() {
		return home;
	}
}
