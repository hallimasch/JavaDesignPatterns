package factoryPattern;

public class FactoryTest {
	public static void main(String[] args){
		HumanFactory factory = new HumanFactory();
		Human male = factory.createHuman("male");
		male.eat();
		male.sleep();
		male.beat();
	}
}