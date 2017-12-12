package SimpleFactory;

public class IronMan implements IHeroToys{

	public void showSpecification() {
		System.out.println("This is a IronMan.");
	}

	public void run() {
		System.out.println("IronMan can fly.");
	}

	public void showPublisher() {
		System.out.println("IronMan belongs to Marvel.");
	}

}
