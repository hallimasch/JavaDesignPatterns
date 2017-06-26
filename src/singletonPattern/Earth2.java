package singletonPattern;

// Lazy mode
public class Earth2 {
	private static Earth2 home;
	
	private Earth2() {};
	
	public static Earth2 getEarth() {
		if (home == null) {
			home = new Earth2();
		}
		return home;
	}
}
