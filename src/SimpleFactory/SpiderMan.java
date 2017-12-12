package SimpleFactory;

public class SpiderMan implements IHeroToys{

	@Override
	public void showSpecification() {
		// TODO Auto-generated method stub
		System.out.println("This is a SpiderMan.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("SpiderMan can't fiy.");
	}

	@Override
	public void showPublisher() {
		// TODO Auto-generated method stub
		System.out.println("SpiderMan belongs to Sony by 2015.");
	}

}
