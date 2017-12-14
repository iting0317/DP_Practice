package SimpleFactory;

import SimpleFactory.HeroToysFactory.HeroToysType;

public class Main {

	public static void main(String[] args) {

		HeroToysFactory toyFac = new HeroToysFactory();

		HeroToys pIronMan1 = toyFac.produce(HeroToysType.IronMan);
		HeroToys pSpiderMan1 = toyFac.produce(HeroToysType.SpiderMan);

		pIronMan1.showSpecification();
		pIronMan1.showPublisher();
		pIronMan1.run();

		pSpiderMan1.showSpecification();
		pSpiderMan1.showPublisher();
		pSpiderMan1.run();

	}

}
