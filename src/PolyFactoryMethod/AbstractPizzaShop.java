package PolyFactoryMethod;


/**
 * 工厂方法设计模式
 * 
 * 通过抽象出工厂，提供一个抽象的“工厂方法”
 * 在该工厂方法内利用多态性，让不同的子类工厂创建各种独立的产品。
 * 
 * 关键就是：   [abstract] product p = [abstract] factoryMethodcreateProduct（Type)
 * 
 * 抽象的基类
 * 
 * 不同地区的加盟店继承该抽象pizza店
 * @author AllenLee
 *
 */
public abstract class AbstractPizzaShop {
	
	/**
	 * 抽象的创建pizza方法
	 * 留给不同区域的子类pizzashop override该抽象方法，产生多态性
	 * 
	 * @param Type
	 * @return
	 */
	protected abstract AbstractPizza createPizza(String Type);
	
	
	
	/**
	 * 生成pizza订单方法
	 * 
	 * 调用了具有多态性的抽象的creatPizza方法
	 * 到底生成的是什么风味的pizza ，由不同地区的pizza店决定。
	 * 
	 * @param Type
	 * @return
	 */
	public final AbstractPizza orderPizza(String Type){
		AbstractPizza pizza = createPizza(Type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
}
