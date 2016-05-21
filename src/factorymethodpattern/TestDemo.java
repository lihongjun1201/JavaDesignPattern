		package factorymethodpattern;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractPizzaShop pizzaShop = new NYPizzaShop();
		AbstractPizza pizza = pizzaShop.orderPizza("NYVeggie");
		
		pizzaShop = new LAPizzaShop();
		pizza = pizzaShop.orderPizza("LACheese");
		
	}

}
