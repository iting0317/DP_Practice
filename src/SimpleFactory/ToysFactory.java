package SimpleFactory;

public class ToysFactory {

	public Toys produce(String type) {

		try {
			switch (type) {
			case "IronMan":
				return new IronMan();
			case "SpiderMan":
				return new SpiderMan();
			}
		} catch (Exception e) {
			System.out.print("沒有這種類型的玩具!");
			return null;
		}
		return null;
	}

}
