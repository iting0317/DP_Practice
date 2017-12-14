package SimpleFactory;

public class IronMan implements IHeroToys{

	@Override
	public void showSpecification() {
		System.out.println("This is a IronMan.");
	}

	@Override
	public void run() {
		System.out.println("IronMan can fly.");
	}
	
	@Override
	public void showPublisher() {
		System.out.println("IronMan belongs to Marvel.");
	}

}
