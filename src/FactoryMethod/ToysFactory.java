package FactoryMethod;

public abstract class ToysFactory {
	
	public enum ToysType{
		IronMan, SpiderMan, SpiderManDeluxeEdition;
	} 
	
	public Toys orderToys(ToysType toysType) {
		System.out.println(getClass()+"正在生產玩具");
		Toys toys = produceToys(toysType); 
		toys.action();
		toys.showSpecification();
		return toys;
	}
	
	protected abstract Toys produceToys(ToysType toysType);
}
