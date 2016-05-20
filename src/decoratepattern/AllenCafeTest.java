package decoratepattern;

public class AllenCafeTest {

	public static void main(String[] args) {
		
		//深度烘焙咖啡 +　摩卡 + 奶泡 
		Beverage customCoffee1 = new Mocha(new Whip(new DarkRoastCoffee()));
		System.out.println("顾客1 点的咖啡 ： " + customCoffee1.getDescription());
		System.out.println("顾客点的咖啡价格 ： " + customCoffee1.cost() + "\n");
	
		//浓缩咖啡 + 双份摩卡 + 奶泡
		Beverage customCoffee2 = new Mocha(new Mocha(new Soy(new EspressoCoffee())));
		System.out.println("顾客2 点的咖啡 ： " + customCoffee2.getDescription());
		System.out.println("顾客点的咖啡价格 ： " + customCoffee2.cost());
		
	}

}
