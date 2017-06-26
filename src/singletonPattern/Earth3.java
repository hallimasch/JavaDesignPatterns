package singletonPattern;

// thread-safe lazy mode
public class Earth3 {
	private static Earth3 home;
	
	private Earth3() {};
	
	public static synchronized Earth3 getEarth() {
		if (home == null) {
			home = new Earth3();
		}
		return home;
	}
}
