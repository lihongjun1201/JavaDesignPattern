package PolyFactoryMethod;

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
