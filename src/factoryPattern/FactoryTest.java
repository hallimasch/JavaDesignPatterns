package factoryPattern;

public class FactoryTest {
	public static void main(String[] args){
		HumanFactory factory = new HumanFactory();
		Human boy = factory.createHuman("male");
		boy.eat();
		boy.sleep();
		boy.beat();
		System.out.println("");
		Human girl = factory.createHuman("female");
		girl.eat();
		girl.sleep();
		girl.beat();
	}
}