package factorymethodpattern;


/**
 * 洛杉矶加盟PIZZA店
 * 
 * 具体的工厂(可以创建多个）
 * 重写Override 工厂方法 createPizza（）.
 * 
 * @author AllenLee
 *
 */
public class LAPizzaShop extends AbstractPizzaShop {

	@Override
	public AbstractPizza createPizza(String Type) {
		// TODO Auto-generated method stub
		AbstractPizza pizza = null;
		
		switch (Type) {	
		case "LACheese":
			pizza = new LACheesePizza();
			break;
		case "LAGreek":
			pizza = new LAGreekPizza();
			break;
		case "LAPepperoni":
			pizza = new LAPepperoniPizza();
			break;
			
		case "LAClam":
			pizza = new LAClamPizza();
			break;
			
		case "LAVeggie":
			pizza = new LAVeggiePizza();
			break;
			
			//...
			//有新产品类时需要更改此处
		}

		return pizza;
	}

}
