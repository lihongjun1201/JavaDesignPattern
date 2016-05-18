package singletonpattern;


/**
 * 延迟加载模式
 * 
 * 将对象实例化延迟到用到的时候再实例化
 * 
 * 优点：提升程序的加载速度
 * 
 * @author AllenLee
 *
 */
public class SingletonLazyLoad {

	//数据域
	int data;
	
	//静态引用
	private static SingletonLazyLoad instance;
	
	/**
	 * 私有的构造函数
	 */
	private SingletonLazyLoad() {
		data = 617;
	}
	
	//静态getInstance（）获取唯一单例实例
	public static SingletonLazyLoad getInstance() {
		if (instance == null) {
			instance = new SingletonLazyLoad();
		}
		
		return instance;
	}

	//getter
	public int getData() {
		return data;
	}

	//setter
	public void setData(int data) {
		this.data = data;
	}
	
	
	//other member-methods...
	
	

}
