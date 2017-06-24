package observerPattern;

public class ObserverTest {
	public static void main(String[] args) {
		VideoSite vs = new VideoSite();
		vs.registerObserver(new VideoFans("Alice"));
		vs.registerObserver(new VideoFans("Bob"));
		vs.registerObserver(new VideoFans("Charlie"));
		
		vs.addVideos("Cosmos");
		vs.addVideos("The X");
	}
}
