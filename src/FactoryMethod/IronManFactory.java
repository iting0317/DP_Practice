package FactoryMethod;

public class IronManFactory extends ToysFactory {

	@Override
	protected Toys produceToys(ToysType toysType) {
		
		switch (toysType) {
		case IronMan:
			return new IronManToy();
		default:
			break;
		}
		return null;
	}

}
