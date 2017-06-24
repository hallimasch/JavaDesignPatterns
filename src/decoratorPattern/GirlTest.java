package decoratorPattern;

public class GirlTest {
	public static void main(String[] args) {
		Girl ga1 = new AmericanGirl();
		System.out.println(ga1.getDescription());
		
		GoldenHair ga2 = new GoldenHair(ga1);
		System.out.println(ga2.getDescription());
		
		Height ga3 = new Height(ga2);
		System.out.println(ga3.getDescription());
		
		System.out.println("");
		
		Girl gc1 = new ChineseGirl();
		System.out.println(gc1.getDescription());
		
		BlackHair gc2 = new BlackHair(gc1);
		System.out.println(gc2.getDescription());
		
		Weight gc3 = new Weight(gc2);
		System.out.println(gc3.getDescription());
	}
}
