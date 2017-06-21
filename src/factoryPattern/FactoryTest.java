package factoryPattern;

public class FactoryTest {
	public static void main(String[] args){
		System.out.println("normal factory");
		HumanFactory factory = new HumanFactory();
		Human boy = factory.createHuman("male");
		boy.eat();
		boy.sleep();
		boy.beat();
		Human girl = factory.createHuman("female");
		girl.eat();
		girl.sleep();
		girl.beat();
		
		System.out.println("\n");
		
		System.out.println("multi factory");
		MultiHumanFactory multiFactory = new MultiHumanFactory();
		Human man = multiFactory.createMale();
		man.eat();
		man.sleep();
		man.beat();
		Human woman = multiFactory.createFemale();
		woman.eat();
		woman.sleep();
		woman.beat();
		
		System.out.println("\n");

		System.out.println("static factory");
		Human male = StaticHumanFactory.createMale(); // <-- no need to create a factory instance 
		male.eat();
		male.sleep();
		male.beat();
		Human female = StaticHumanFactory.createFemale();
		female.eat();
		female.sleep();
		female.beat();
	}
}