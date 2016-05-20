package PolyFactoryMethod;



public class NYPizzaShop extends AbstractPizzaShop {

	@Override
	public AbstractPizza createPizza(String Type) {
		// TODO Auto-generated method stub
		AbstractPizza pizza = null;
		
		switch (Type) {	
		case "NYCheese":
			pizza = new NYCheesePizza();
			break;
		case "NYGreek":
			pizza = new NYGreekPizza();
			break;
		case "NYPepperoni":
			pizza = new NYPepperoniPizza();
			break;
			
		case "NYClam":
			pizza = new NYClamPizza();
			break;
			
		case "NYVeggie":
			pizza = new NYVeggiePizza();
			break;
			
			//...
			//���²�Ʒ��ʱ��Ҫ���Ĵ˴�
		}

		return pizza;
	}

}
