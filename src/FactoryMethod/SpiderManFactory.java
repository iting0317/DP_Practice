package FactoryMethod;

public class SpiderManFactory extends ToysFactory {

	@Override
	protected Toys produceToys(ToyType toysType) {
		
		switch (toysType) {
		case SpiderMan:
			return new SpiderManToy();
		case SpiderManDeluxeEdition:
			return new SpiderManToyDeluxeEdition();
		default:
			break;
		}
		return null;
	}

}
