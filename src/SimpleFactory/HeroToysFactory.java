package SimpleFactory;

public class HeroToysFactory {

	public IHeroToys produce(String type){

		try {
			switch (type) {
			case "IronMan":
				return new IronMan();
			case "SpiderMan":
				return new SpiderMan();
			}
		} catch (NullPointerException e) {
			throw e;
		}
		return null;
	}

}
