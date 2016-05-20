package simplefactory;


/**
 * 简单工厂模式
 * 
 * 可以定义（静态）工厂方法，在该方法里 new 不同的具体产品对象。
 * 用户可以不用直接操作new，而是输入想要的对象类型即可，不必关心具体构造函数。
 * 
 * 优点：比直接在逻辑代码中new对象，再写业务逻辑要好。
 * 
 * 缺点：
 * 1.由一个对象复杂各种具体产品子类实例的创建，耦合性过高
 * 2.添加新产品时，仍然需要更改工厂方法中的逻辑代码。
 * 
 * @author AllenLee
 *
 */
public class SimplePizzaFactory {
	
	/**
	 * 创建pizza，生成订单
	 * 
	 * 用静态工厂方法，可以方便调用
	 * 
	 * @param comsumerType
	 * @return 准备快递给客户的具体pizza
	 */
	public /*static*/ Pizza createPizza(String comsumerType) {

		Pizza pizza = null;
		
		switch (comsumerType) {	
		case "Cheese":
			pizza = new CheesePizza();
			break;
		case "Greek":
			pizza = new GreekPizza();
			break;
		case "Pepperoni":
			pizza = new PepperoniPizza();
			break;
			
			//有新产品类时需要更改此处
		}

		return pizza;
	}

	
	
}
