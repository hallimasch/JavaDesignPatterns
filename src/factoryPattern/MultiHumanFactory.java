package factoryPattern;

public class MultiHumanFactory {
	public Male createMale() {
		return new Male();
	}
	
	public Female createFemale(){
		return new Female();
	}
}
