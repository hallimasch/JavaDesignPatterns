package singletonPattern;

// static inner class
public class Earth5 {
	private static class Earth {
		private static final Earth5 home = new Earth5();
	}
	
	private Earth5() {};
	
	public static Earth5 getEarth() {
		return Earth.home;
	}
}
