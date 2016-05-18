package observerpattern;

/**
 * 混合咖啡
 * 
 * @author AllenLee
 *
 */
public class HouseBlendCoffee extends Beverage {

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return 12.5f;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "混合咖啡！混合不同的美味！(12.5 元）";
	}

}
