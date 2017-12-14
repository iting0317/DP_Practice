package FactoryMethod;

public class IronManToy implements Toys{

	@Override
	public void action() {
		System.out.println("IronMan can fly.");
	}

	@Override
	public void showSpecification() {
		System.out.println("This is a IronMan.");
	}

	
}
