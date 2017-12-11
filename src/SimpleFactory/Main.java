package SimpleFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//宣告一個玩具工廠實例
		ToysFactory toyFac = new ToysFactory();
		
		//由工廠生產玩具的實例
		Toys pIronMan1 = toyFac.produce("IronMan");
		Toys pSpiderMan1 =toyFac.produce("SpiderMan");
		
		//兩種玩具各自執行同一個動作
		pIronMan1.showSpecification();
		pIronMan1.showColor();
		pIronMan1.run();
		
		pSpiderMan1.showSpecification();
		pSpiderMan1.showColor();
		pSpiderMan1.run();
	}

}
