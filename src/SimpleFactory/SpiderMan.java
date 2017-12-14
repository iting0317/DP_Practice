package SimpleFactory;

public class SpiderMan implements IHeroToys{

	@Override
	public void showSpecification() {
		System.out.println("This is a SpiderMan.");
	}

	@Override
	public void run() {
		System.out.println("SpiderMan can't fiy.");
	}

	@Override
	public void showPublisher() {
		System.out.println("SpiderMan belongs to Sony by 2015.");
	}

}
