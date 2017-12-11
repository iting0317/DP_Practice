package SimpleFactory;

public class ToysFactory {

	public Toys produce(String type){

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
