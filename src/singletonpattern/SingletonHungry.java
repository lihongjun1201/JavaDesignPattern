package singletonpattern;



/**
 * 饿汉模式
 * 类加载器加载到该类时 即刻创建对象
 * 
 * 缺点： 如果单例类过于庞大，则程序的初始化时间会较长
 * @author AllenLee
 *
 */
public class SingletonHungry {

	int data;
	private static SingletonHungry instance = new SingletonHungry();
	
	private SingletonHungry() {
		data = 617;
	}
	
	public static SingletonHungry getInstance() {
		return instance;
	}
	
}
