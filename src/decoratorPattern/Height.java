package decoratorPattern;

public class Height extends GirlDecorator {
	private Girl girl;
	
	public Height(Girl g) {
		girl = g;
	}
	
	@Override
	public String getDescription() {
		return girl.getDescription()+" is very tall";
	}
}
