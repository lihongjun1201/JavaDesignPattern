package observerpattern;

/**
 * 具体咖啡装饰器 摩卡
 * 
 * @author AllenLee
 *
 */
public class Soy extends CondimentDecorator {

	protected Soy(Beverage cofffee) {
		super(cofffee);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 豆浆的计价方法
	 * 加一份豆浆4.5元
	 */
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return 4.5f + coffeeBeverage.cost() ;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffeeBeverage.getDescription() + " +豆浆(4.5 元） ";
	}
	
}