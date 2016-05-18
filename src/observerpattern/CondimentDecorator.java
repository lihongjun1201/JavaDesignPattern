package observerpattern;

/**
 * 调料装饰器类
 * 同样继承自 Beverage类
 * 
 * @author AllenLee
 *
 */
public class CondimentDecorator extends Beverage {

	//持有父类饮料（被装饰），实现多态性
	Beverage coffeeBeverage;
	
	/**
	 * 装饰器构造函数
	 * 传入被装饰组件
	 * @param cofffee 
	 */
	protected CondimentDecorator(Beverage cofffee){
		this.coffeeBeverage = cofffee;
	}
	
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return 0.0f;
	}


}
