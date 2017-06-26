package singletonPattern;

// double check
public class Earth4 {
	private volatile static Earth4 home; // to avoid compiler optimization
	
	private Earth4() {};
	
	public static Earth4 getEarth() {
		if (home == null) {
			synchronized (Earth4.class) {
				if (home == null) {
					home = new Earth4();
				}
			}
		}
		return home;
	}
}
