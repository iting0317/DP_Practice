package FactoryMethod;

public class Main {

	public static void main(String[] args) {
		//鋼鐵人玩具工廠
		ToysFactory ironManToyFacory = new IronManFactory();
		Toys ironManToy = ironManToyFacory.orderToys(ToyType.IronMan);
		Toys ironManToyDeluxeEdition = ironManToyFacory.orderToys(ToyType.IronManDeluxeEdition);
		
		//蜘蛛人玩具工廠
		ToysFactory spiderManToyFacory = new SpiderManFactory();
		Toys spiderManToy = spiderManToyFacory.orderToys(ToyType.SpiderMan);
		Toys spiderManDeluxeEdition = spiderManToyFacory.orderToys(ToyType.SpiderManDeluxeEdition);

	}

}
