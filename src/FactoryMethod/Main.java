package FactoryMethod;

import FactoryMethod.ToysFactory.ToysType;

public class Main {

	public static void main(String[] args) {
		// 宣告一個玩具工廠實例
		ToysFactory ironManToyFacory = new IronManFactory();

		// 由工廠生產玩具的實例
		Toys ironManToy = ironManToyFacory.orderToys(ToysType.IronMan);
		
		ToysFactory spiderManToyFacory = new SpiderManFactory();
		Toys spiderManToy = spiderManToyFacory.orderToys(ToysType.SpiderMan);


	}

}
