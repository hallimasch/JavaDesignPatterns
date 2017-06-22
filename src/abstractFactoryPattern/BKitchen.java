package abstractFactoryPattern;

class BKitchen implements KitchenFactory{
	public Food getFood() {
		return new Milk();
	}
	public TableWare getTableWare() {
		return new Cup();
	}
}
