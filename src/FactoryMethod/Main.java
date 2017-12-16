package FactoryMethod;

import FactoryMethod.ToysFactory.ToysType;

public class Main {

	public static void main(String[] args) {
		//鋼鐵人玩具工廠
		ToysFactory ironManToyFacory = new IronManFactory();
		Toys ironManToy = ironManToyFacory.orderToys(ToysType.IronMan);
		
		//蜘蛛人玩具工廠
		ToysFactory spiderManToyFacory = new SpiderManFactory();
		Toys spiderManToy = spiderManToyFacory.orderToys(ToysType.SpiderMan);
		Toys spiderManDeluxeEdition = spiderManToyFacory.orderToys(ToysType.SpiderManDeluxeEdition);

	}

}
