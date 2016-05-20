package simplefactory;

public class PizzaShop {

	SimplePizzaFactory pizzaFactory ;
	
	/**
	 * �̵�Ĺ��캯���д���򵥹���
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
