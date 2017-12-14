package FactoryMethod;

public class SpiderManToy implements Toys{

	@Override
	public void action() {
		System.out.println("SpiderMan can't fly.");
	}

	@Override
	public void showSpecification() {
		System.out.println("This is a SpiderMan.");
	}

}
