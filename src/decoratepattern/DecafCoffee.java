package decoratepattern;

/**
 * 去咖啡因咖啡
 * @author AllenLee
 *
 */
public class DecafCoffee extends Beverage {

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return 14.4f;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "无咖啡因咖啡，味道更特别!(14.4 元）";
	}
	
}
