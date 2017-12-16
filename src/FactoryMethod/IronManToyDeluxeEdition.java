package FactoryMethod;

public class IronManToyDeluxeEdition implements Toys{

	@Override
	public void action() {
		System.out.println("IronManDeluxeEdition can fly.");
	}

	@Override
	public void showSpecification() {
		System.out.println("This is a IronManDeluxeEdition.");
	}

	
}
