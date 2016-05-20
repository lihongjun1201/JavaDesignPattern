package decoratepattern;

/**
 * 具体咖啡装饰器 奶泡
 * 
 * @author AllenLee
 *
 */
public class Whip extends CondimentDecorator {

	protected Whip(Beverage cofffee) {
		super(cofffee);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 奶泡的计价方法
	 * 加一份奶泡8.2元
	 */
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return 8.2f + coffeeBeverage.cost();
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffeeBeverage.getDescription() + " +奶泡（8.2） ";
	}
	
}