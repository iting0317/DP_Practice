package FactoryMethod;

public abstract class ToysFactory {
	
	public Toys orderToys(ToyType toysType) {
		System.out.println(getClass()+"正在生產玩具");
		Toys toys = produceToys(toysType); 
		toys.action();
		toys.showSpecification();
		return toys;
	}
	
	protected abstract Toys produceToys(ToyType toysType);
}
