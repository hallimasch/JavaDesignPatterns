package abstractFactoryPattern;

// abstract kitchen factory
interface KitchenFactory {
	public Food getFood();
	public TableWare getTableWare();
}
