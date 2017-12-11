package SimpleFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 宣告一個玩具工廠實例
		ToysFactory toyFac = new ToysFactory();

		// 由工廠生產玩具的實例
		try {
			Toys pIronMan1 = toyFac.produce("IronMan");
			Toys pSpiderMan1 = toyFac.produce("SpiderMan");

			//加入一個不在工廠邏輯中的玩具類型
			Toys pWonderWoman1 = toyFac.produce("WonderWoman");
			pWonderWoman1.run();
			
			// 兩種玩具各自執行同一個動作
			pIronMan1.showSpecification();
			pIronMan1.showColor();
			pIronMan1.run();

			pSpiderMan1.showSpecification();
			pSpiderMan1.showColor();
			pSpiderMan1.run();
		} catch (Exception e) {
			System.out.print("發生例外事件：");
			System.out.print(e+"：包含沒有生產的玩具類型");
		}

	}

}
