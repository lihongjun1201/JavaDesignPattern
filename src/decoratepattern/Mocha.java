package decoratepattern;

/**
 * 具体咖啡装饰器 摩卡
 * 
 * @author AllenLee
 *
 */
public class Mocha extends CondimentDecorator {

	protected Mocha(Beverage cofffee) {
		super(cofffee);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 摩卡的计价方法
	 * 加一份摩卡5.4元
	 */
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return 5.4f + coffeeBeverage.cost();
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffeeBeverage.getDescription() + " +摩卡(5.4 元） ";
	}
}
