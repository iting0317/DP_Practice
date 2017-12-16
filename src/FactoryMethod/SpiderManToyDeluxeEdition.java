package FactoryMethod;

public class SpiderManToyDeluxeEdition implements Toys{

	@Override
	public void action() {
		System.out.println("SpiderManDeluxeEdition can't fly.");
	}

	@Override
	public void showSpecification() {
		System.out.println("This is a SpiderManDeluxeEdition.");
	}

}
