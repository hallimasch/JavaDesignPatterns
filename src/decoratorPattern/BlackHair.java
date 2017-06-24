package decoratorPattern;

public class BlackHair extends GirlDecorator{
	private Girl girl;
	
	public BlackHair(Girl g) {
		girl = g;
	}
	
	@Override
	public String getDescription() {
		return girl.getDescription()+" with black hair";
	}
}
