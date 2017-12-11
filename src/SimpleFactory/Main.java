package SimpleFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ToysFactory toyFac = new ToysFactory();
		
		toyFac.produce("IronMan").showSpecification();
		toyFac.produce("SpiderMan").showSpecification();
	}

}
