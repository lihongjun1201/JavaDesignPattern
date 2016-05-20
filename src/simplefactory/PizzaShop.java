package simplefactory;

public class PizzaShop {

	SimplePizzaFactory pizzaFactory ;
	
	/**
	 * 商店的构造函数中传入简单工厂
	 * @param factory
	 */
	public PizzaShop(SimplePizzaFactory factory) {
		pizzaFactory = factory;
	}
	
	public Pizza orderPizza(String Type) {
		
		Pizza pizza = null;
		pizza = pizzaFactory.createPizza(Type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	
	
}
