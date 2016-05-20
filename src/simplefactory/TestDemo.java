package simplefactory;

public class TestDemo {

	public static void main(String[] args) {
		
		PizzaShop pizzaShop = new PizzaShop(new SimplePizzaFactory());
		
		Pizza pizza = pizzaShop.orderPizza("Cheese"); 
	
	}

}
