package SimpleFactory;

public class IronMan implements IHeroToys{

	@Override
	public void showSpecification() {
		// TODO Auto-generated method stub
		System.out.println("This is a IronMan.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("IronMan can fly.");
	}

	@Override
	public void showPublisher() {
		// TODO Auto-generated method stub
		System.out.println("IronMan belongs to Marvel.");
	}

}
