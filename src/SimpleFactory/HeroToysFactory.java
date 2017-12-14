package SimpleFactory;

public class HeroToysFactory {

	public enum HeroToysType {
		IronMan, SpiderMan;
	}

	public HeroToys produce(HeroToysType ironman) {

		switch (ironman) {
		case IronMan:
			return new IronMan();
		case SpiderMan:
			return new SpiderMan();
		}
		return null;
	}

}
