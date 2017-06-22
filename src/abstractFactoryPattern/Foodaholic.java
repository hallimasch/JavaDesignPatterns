package abstractFactoryPattern;

public class Foodaholic {
	public void eat(KitchenFactory k) {
		System.out.println("A foodaholic is having "+k.getFood().getFoodName()+" with "+k.getTableWare().getToolName());
	}
	
	public static void main(String[] args) {
		Foodaholic you = new Foodaholic();
		KitchenFactory kfa = new AKitchen();
		you.eat(kfa);
		System.out.println("");
		Foodaholic me = new Foodaholic();
		KitchenFactory kfb = new BKitchen();
		me.eat(kfb);
	}
}
