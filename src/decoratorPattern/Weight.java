package decoratorPattern;

public class Weight extends GirlDecorator {
	private Girl girl;
	
	public Weight(Girl g) {
		girl = g;
	}
	
	@Override
	public String getDescription() {
		return girl.getDescription()+" is very skinny";
	}
}